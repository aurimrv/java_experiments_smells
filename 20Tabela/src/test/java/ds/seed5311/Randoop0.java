package ds.seed5311;

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
        // The following exception was thrown during execution in test generation
        try {
            int int2 = tabela0.pesquisa(item1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        java.lang.Class<?> wildcardClass3 = tabela0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        java.lang.Class<?> wildcardClass5 = itemArray3.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        java.lang.Class<?> wildcardClass5 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Tabela tabela0 = new ds.Tabela();
        java.lang.Class<?> wildcardClass1 = tabela0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        java.lang.Class<?> wildcardClass5 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = tabela0.pesquisa(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tabela0.pesquisa(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.binaria(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        java.lang.Class<?> wildcardClass7 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (byte) -1;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Item[] itemArray15 = tabela0.registros;
        java.lang.Class<?> wildcardClass16 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Item[] itemArray21 = tabela0.registros;
        java.lang.Class<?> wildcardClass22 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        tabela0.n = (-1);
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.pesquisa(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
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
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item[] itemArray25 = tabela0.registros;
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = tabela0.pesquisa(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        tabela0.n = (-1);
        int int18 = tabela0.n;
        tabela0.n = (byte) -1;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (-1);
        tabela0.n = (byte) 100;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.binaria(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = 0;
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela3.registros = itemArray6;
        ds.Item[] itemArray8 = tabela3.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela9.registros = itemArray12;
        tabela3.registros = itemArray12;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela3.registros = itemArray16;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela3.registros = itemArray19;
        tabela0.registros = itemArray19;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.pesquisa(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        tabela0.n = 1;
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Item item9 = null;
        tabela0.insere(item9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        tabela0.n = 100;
        java.lang.Class<?> wildcardClass17 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        tabela0.n = ' ';
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (-1);
        tabela0.n = (byte) 100;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = 0;
        ds.Item[] itemArray7 = new ds.Item[] {};
        tabela4.registros = itemArray7;
        ds.Item[] itemArray9 = tabela4.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = 0;
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela10.registros = itemArray13;
        tabela4.registros = itemArray13;
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela4.registros = itemArray17;
        tabela0.registros = itemArray17;
        int int20 = tabela0.n;
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.pesquisa(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        int int10 = tabela7.n;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item[] itemArray12 = tabela11.registros;
        ds.Item item13 = null;
        tabela11.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        ds.Item[] itemArray24 = tabela19.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        tabela19.registros = itemArray28;
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        tabela19.registros = itemArray32;
        tabela15.registros = itemArray32;
        tabela11.registros = itemArray32;
        tabela7.registros = itemArray32;
        tabela0.registros = itemArray32;
        java.lang.Class<?> wildcardClass38 = itemArray32.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
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
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        tabela0.n = 1;
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tabela0.pesquisa(item5);
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
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item item9 = null;
        tabela6.insere(item9);
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        tabela0.registros = itemArray12;
        java.lang.Class<?> wildcardClass14 = itemArray12.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item item9 = null;
        tabela6.insere(item9);
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        tabela0.registros = itemArray12;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela16.registros = itemArray19;
        ds.Item[] itemArray21 = tabela16.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela22.registros = itemArray25;
        tabela16.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = tabela0.pesquisa(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        int int3 = tabela0.n;
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        tabela0.registros = itemArray13;
        java.lang.Class<?> wildcardClass15 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (byte) -1;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tabela0.binaria(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        tabela0.n = (-1);
        int int18 = tabela0.n;
        java.lang.Class<?> wildcardClass19 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        java.lang.Class<?> wildcardClass14 = itemArray13.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (-1);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela16.registros = itemArray19;
        ds.Item[] itemArray21 = tabela16.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela22.registros = itemArray25;
        tabela16.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = tabela0.binaria(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Item[] itemArray16 = tabela0.registros;
        java.lang.Class<?> wildcardClass17 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = 0;
        ds.Item[] itemArray23 = new ds.Item[] {};
        tabela20.registros = itemArray23;
        ds.Item[] itemArray25 = tabela20.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        tabela26.n = 0;
        ds.Item[] itemArray29 = new ds.Item[] {};
        tabela26.registros = itemArray29;
        tabela20.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Item item33 = null;
        int int34 = tabela0.binaria(item33);
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = 0;
        ds.Item item38 = null;
        tabela35.insere(item38);
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        tabela0.registros = itemArray41;
        java.lang.Class<?> wildcardClass43 = itemArray41.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item item19 = null;
        tabela17.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = 0;
        ds.Item[] itemArray34 = new ds.Item[] {};
        tabela31.registros = itemArray34;
        tabela25.registros = itemArray34;
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela25.registros = itemArray38;
        tabela21.registros = itemArray38;
        tabela17.registros = itemArray38;
        tabela0.registros = itemArray38;
        java.lang.Class<?> wildcardClass43 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        int int18 = tabela0.binaria(item17);
        java.lang.Class<?> wildcardClass19 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = 0;
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela18.registros = itemArray21;
        tabela12.registros = itemArray21;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela12.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Tabela tabela28 = new ds.Tabela();
        tabela28.n = 0;
        ds.Item[] itemArray31 = new ds.Item[] {};
        tabela28.registros = itemArray31;
        ds.Item[] itemArray33 = tabela28.registros;
        ds.Tabela tabela34 = new ds.Tabela();
        tabela34.n = 0;
        ds.Item[] itemArray37 = new ds.Item[] {};
        tabela34.registros = itemArray37;
        tabela28.registros = itemArray37;
        int int40 = tabela28.n;
        ds.Item[] itemArray41 = tabela28.registros;
        tabela28.n = (short) 10;
        ds.Item[] itemArray44 = tabela28.registros;
        ds.Tabela tabela45 = new ds.Tabela();
        ds.Item[] itemArray46 = tabela45.registros;
        ds.Item item47 = null;
        tabela45.insere(item47);
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item item50 = null;
        int int51 = tabela49.binaria(item50);
        ds.Item[] itemArray52 = tabela49.registros;
        ds.Tabela tabela53 = new ds.Tabela();
        tabela53.n = 0;
        ds.Item[] itemArray56 = new ds.Item[] {};
        tabela53.registros = itemArray56;
        ds.Item[] itemArray58 = tabela53.registros;
        ds.Tabela tabela59 = new ds.Tabela();
        tabela59.n = 0;
        ds.Item[] itemArray62 = new ds.Item[] {};
        tabela59.registros = itemArray62;
        tabela53.registros = itemArray62;
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        tabela53.registros = itemArray66;
        tabela49.registros = itemArray66;
        tabela45.registros = itemArray66;
        tabela28.registros = itemArray66;
        tabela0.registros = itemArray66;
        ds.Item item72 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item72);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        java.lang.Class<?> wildcardClass6 = itemArray5.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item item9 = null;
        tabela6.insere(item9);
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        tabela0.registros = itemArray12;
        int int14 = tabela0.n;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.binaria(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (-1);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item item17 = null;
        int int18 = tabela14.binaria(item17);
        tabela14.n = 0;
        ds.Item[] itemArray21 = tabela14.registros;
        tabela9.registros = itemArray21;
        tabela0.registros = itemArray21;
        java.lang.Class<?> wildcardClass24 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = tabela0.binaria(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        java.lang.Class<?> wildcardClass3 = tabela0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item item19 = null;
        tabela17.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = 0;
        ds.Item[] itemArray34 = new ds.Item[] {};
        tabela31.registros = itemArray34;
        tabela25.registros = itemArray34;
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela25.registros = itemArray38;
        tabela21.registros = itemArray38;
        tabela17.registros = itemArray38;
        tabela0.registros = itemArray38;
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item item44 = null;
        int int45 = tabela43.binaria(item44);
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        int int48 = tabela46.binaria(item47);
        ds.Tabela tabela49 = new ds.Tabela();
        tabela49.n = 0;
        ds.Item[] itemArray52 = new ds.Item[] {};
        tabela49.registros = itemArray52;
        ds.Item[] itemArray54 = tabela49.registros;
        ds.Tabela tabela55 = new ds.Tabela();
        tabela55.n = 0;
        ds.Item[] itemArray58 = new ds.Item[] {};
        tabela55.registros = itemArray58;
        tabela49.registros = itemArray58;
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        tabela49.registros = itemArray62;
        ds.Tabela tabela64 = new ds.Tabela();
        ds.Item[] itemArray65 = tabela64.registros;
        tabela49.registros = itemArray65;
        tabela46.registros = itemArray65;
        tabela43.registros = itemArray65;
        ds.Item item69 = null;
        tabela43.insere(item69);
        ds.Item[] itemArray71 = tabela43.registros;
        tabela0.registros = itemArray71;
        java.lang.Class<?> wildcardClass73 = itemArray71.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        int int5 = tabela3.binaria(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        tabela6.registros = itemArray15;
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela6.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        tabela6.registros = itemArray22;
        tabela3.registros = itemArray22;
        tabela0.registros = itemArray22;
        int int26 = tabela0.n;
        ds.Item item27 = null;
        tabela0.insere(item27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        int int18 = tabela0.binaria(item17);
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        ds.Item[] itemArray24 = tabela19.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        tabela19.registros = itemArray28;
        int int31 = tabela19.n;
        ds.Item[] itemArray32 = tabela19.registros;
        tabela19.n = (short) 10;
        ds.Item[] itemArray35 = tabela19.registros;
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item[] itemArray37 = tabela36.registros;
        ds.Item item38 = null;
        tabela36.insere(item38);
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        int int42 = tabela40.binaria(item41);
        ds.Item[] itemArray43 = tabela40.registros;
        ds.Tabela tabela44 = new ds.Tabela();
        tabela44.n = 0;
        ds.Item[] itemArray47 = new ds.Item[] {};
        tabela44.registros = itemArray47;
        ds.Item[] itemArray49 = tabela44.registros;
        ds.Tabela tabela50 = new ds.Tabela();
        tabela50.n = 0;
        ds.Item[] itemArray53 = new ds.Item[] {};
        tabela50.registros = itemArray53;
        tabela44.registros = itemArray53;
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        tabela44.registros = itemArray57;
        tabela40.registros = itemArray57;
        tabela36.registros = itemArray57;
        tabela19.registros = itemArray57;
        ds.Tabela tabela62 = new ds.Tabela();
        ds.Item item63 = null;
        int int64 = tabela62.binaria(item63);
        ds.Tabela tabela65 = new ds.Tabela();
        ds.Item item66 = null;
        int int67 = tabela65.binaria(item66);
        ds.Tabela tabela68 = new ds.Tabela();
        tabela68.n = 0;
        ds.Item[] itemArray71 = new ds.Item[] {};
        tabela68.registros = itemArray71;
        ds.Item[] itemArray73 = tabela68.registros;
        ds.Tabela tabela74 = new ds.Tabela();
        tabela74.n = 0;
        ds.Item[] itemArray77 = new ds.Item[] {};
        tabela74.registros = itemArray77;
        tabela68.registros = itemArray77;
        ds.Item item80 = null;
        ds.Item[] itemArray81 = new ds.Item[] { item80 };
        tabela68.registros = itemArray81;
        ds.Tabela tabela83 = new ds.Tabela();
        ds.Item[] itemArray84 = tabela83.registros;
        tabela68.registros = itemArray84;
        tabela65.registros = itemArray84;
        tabela62.registros = itemArray84;
        ds.Item item88 = null;
        tabela62.insere(item88);
        ds.Item[] itemArray90 = tabela62.registros;
        tabela19.registros = itemArray90;
        tabela0.registros = itemArray90;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(itemArray81);
        org.junit.Assert.assertNotNull(itemArray84);
        org.junit.Assert.assertNotNull(itemArray90);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        tabela0.n = (-1);
        tabela0.n = 0;
        int int20 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = 0;
        ds.Item item7 = null;
        int int8 = tabela4.binaria(item7);
        ds.Item item9 = null;
        int int10 = tabela4.binaria(item9);
        ds.Item item11 = null;
        tabela4.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = 0;
        int int16 = tabela13.n;
        ds.Item[] itemArray17 = tabela13.registros;
        tabela4.registros = itemArray17;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        ds.Item[] itemArray24 = tabela19.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        tabela19.registros = itemArray28;
        int int31 = tabela19.n;
        tabela19.n = ' ';
        ds.Item[] itemArray34 = tabela19.registros;
        tabela4.registros = itemArray34;
        tabela0.registros = itemArray34;
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int38 = tabela0.pesquisa(item37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = (byte) -1;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.binaria(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
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
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        int int13 = tabela0.n;
        java.lang.Class<?> wildcardClass14 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela16.registros = itemArray19;
        ds.Item[] itemArray21 = tabela16.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela22.registros = itemArray25;
        tabela16.registros = itemArray25;
        tabela0.registros = itemArray25;
        java.lang.Class<?> wildcardClass29 = itemArray25.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        tabela0.registros = itemArray13;
        int int15 = tabela0.n;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.pesquisa(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (byte) -1;
        tabela0.n = (short) -1;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = 0;
        ds.Item item7 = null;
        int int8 = tabela4.binaria(item7);
        ds.Item item9 = null;
        int int10 = tabela4.binaria(item9);
        ds.Item item11 = null;
        tabela4.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = 0;
        int int16 = tabela13.n;
        ds.Item[] itemArray17 = tabela13.registros;
        tabela4.registros = itemArray17;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        ds.Item[] itemArray24 = tabela19.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        tabela19.registros = itemArray28;
        int int31 = tabela19.n;
        tabela19.n = ' ';
        ds.Item[] itemArray34 = tabela19.registros;
        tabela4.registros = itemArray34;
        tabela0.registros = itemArray34;
        ds.Item item37 = null;
        int int38 = tabela0.binaria(item37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        tabela0.registros = itemArray13;
        int int15 = tabela0.n;
        ds.Item[] itemArray16 = tabela0.registros;
        tabela0.n = '#';
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tabela0.binaria(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = 0;
        ds.Item[] itemArray7 = new ds.Item[] {};
        tabela4.registros = itemArray7;
        ds.Item[] itemArray9 = tabela4.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = 0;
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela10.registros = itemArray13;
        tabela4.registros = itemArray13;
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela4.registros = itemArray17;
        tabela0.registros = itemArray17;
        tabela0.n = (short) 10;
        int int22 = tabela0.n;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        tabela0.n = (byte) -1;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        java.lang.Class<?> wildcardClass3 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
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
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = 0;
        ds.Item item8 = null;
        int int9 = tabela5.binaria(item8);
        tabela5.n = 0;
        ds.Item[] itemArray12 = tabela5.registros;
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Item[] itemArray16 = tabela0.registros;
        tabela0.n = (byte) 100;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        tabela0.n = (-1);
        int int18 = tabela0.n;
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tabela0.binaria(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        tabela0.registros = itemArray13;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        tabela0.n = 1;
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = 0;
        ds.Item item8 = null;
        tabela5.insere(item8);
        int int10 = tabela5.n;
        ds.Item[] itemArray11 = tabela5.registros;
        ds.Item[] itemArray12 = tabela5.registros;
        tabela0.registros = itemArray12;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.binaria(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = 0;
        ds.Item[] itemArray7 = new ds.Item[] {};
        tabela4.registros = itemArray7;
        ds.Item[] itemArray9 = tabela4.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = 0;
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela10.registros = itemArray13;
        tabela4.registros = itemArray13;
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela4.registros = itemArray17;
        tabela0.registros = itemArray17;
        tabela0.n = (short) 10;
        java.lang.Class<?> wildcardClass22 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        int int5 = tabela3.binaria(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        tabela6.registros = itemArray15;
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela6.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        tabela6.registros = itemArray22;
        tabela3.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item[] itemArray26 = tabela0.registros;
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = tabela0.pesquisa(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (byte) -1;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.binaria(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item[] itemArray25 = tabela0.registros;
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = tabela0.binaria(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        java.lang.Class<?> wildcardClass7 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        tabela0.n = 0;
        tabela0.n = 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        int int5 = tabela3.binaria(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        tabela6.registros = itemArray15;
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela6.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        tabela6.registros = itemArray22;
        tabela3.registros = itemArray22;
        tabela0.registros = itemArray22;
        int int26 = tabela0.n;
        ds.Tabela tabela27 = new ds.Tabela();
        tabela27.n = 0;
        ds.Item[] itemArray30 = new ds.Item[] {};
        tabela27.registros = itemArray30;
        ds.Item[] itemArray32 = tabela27.registros;
        ds.Tabela tabela33 = new ds.Tabela();
        tabela33.n = 0;
        ds.Item[] itemArray36 = new ds.Item[] {};
        tabela33.registros = itemArray36;
        tabela27.registros = itemArray36;
        int int39 = tabela27.n;
        ds.Item[] itemArray40 = tabela27.registros;
        tabela0.registros = itemArray40;
        java.lang.Class<?> wildcardClass42 = itemArray40.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        tabela0.insere(item18);
        tabela0.n = (short) -1;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = 0;
        ds.Item[] itemArray7 = new ds.Item[] {};
        tabela4.registros = itemArray7;
        ds.Item[] itemArray9 = tabela4.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = 0;
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela10.registros = itemArray13;
        tabela4.registros = itemArray13;
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela4.registros = itemArray17;
        tabela0.registros = itemArray17;
        tabela0.n = (short) 10;
        int int22 = tabela0.n;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tabela0.binaria(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item[] itemArray25 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        tabela0.n = 0;
        ds.Item[] itemArray21 = tabela0.registros;
        java.lang.Class<?> wildcardClass22 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        int int10 = tabela7.n;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item[] itemArray12 = tabela11.registros;
        ds.Item item13 = null;
        tabela11.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        ds.Item[] itemArray24 = tabela19.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        tabela19.registros = itemArray28;
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        tabela19.registros = itemArray32;
        tabela15.registros = itemArray32;
        tabela11.registros = itemArray32;
        tabela7.registros = itemArray32;
        tabela0.registros = itemArray32;
        int int38 = tabela0.n;
        int int39 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        java.lang.Class<?> wildcardClass6 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = 0;
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela18.registros = itemArray21;
        tabela12.registros = itemArray21;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela12.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Tabela tabela28 = new ds.Tabela();
        tabela28.n = 0;
        ds.Item[] itemArray31 = new ds.Item[] {};
        tabela28.registros = itemArray31;
        ds.Item[] itemArray33 = tabela28.registros;
        ds.Tabela tabela34 = new ds.Tabela();
        tabela34.n = 0;
        ds.Item[] itemArray37 = new ds.Item[] {};
        tabela34.registros = itemArray37;
        tabela28.registros = itemArray37;
        int int40 = tabela28.n;
        ds.Item[] itemArray41 = tabela28.registros;
        tabela28.n = (short) 10;
        ds.Item[] itemArray44 = tabela28.registros;
        ds.Tabela tabela45 = new ds.Tabela();
        ds.Item[] itemArray46 = tabela45.registros;
        ds.Item item47 = null;
        tabela45.insere(item47);
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item item50 = null;
        int int51 = tabela49.binaria(item50);
        ds.Item[] itemArray52 = tabela49.registros;
        ds.Tabela tabela53 = new ds.Tabela();
        tabela53.n = 0;
        ds.Item[] itemArray56 = new ds.Item[] {};
        tabela53.registros = itemArray56;
        ds.Item[] itemArray58 = tabela53.registros;
        ds.Tabela tabela59 = new ds.Tabela();
        tabela59.n = 0;
        ds.Item[] itemArray62 = new ds.Item[] {};
        tabela59.registros = itemArray62;
        tabela53.registros = itemArray62;
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        tabela53.registros = itemArray66;
        tabela49.registros = itemArray66;
        tabela45.registros = itemArray66;
        tabela28.registros = itemArray66;
        tabela0.registros = itemArray66;
        ds.Item[] itemArray72 = tabela0.registros;
        ds.Item item73 = null;
        int int74 = tabela0.binaria(item73);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        tabela0.n = 0;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        int int10 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (byte) -1;
        tabela0.n = 100;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.pesquisa(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = ' ';
        int int3 = tabela0.n;
        tabela0.n = 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tabela0.pesquisa(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        tabela0.registros = itemArray13;
        int int15 = tabela0.n;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.pesquisa(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        tabela0.n = 1;
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = 0;
        ds.Item item8 = null;
        tabela5.insere(item8);
        int int10 = tabela5.n;
        ds.Item[] itemArray11 = tabela5.registros;
        ds.Item[] itemArray12 = tabela5.registros;
        tabela0.registros = itemArray12;
        ds.Item item14 = null;
        tabela0.insere(item14);
        ds.Item item16 = null;
        tabela0.insere(item16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = (byte) -1;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item item9 = null;
        tabela6.insere(item9);
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        tabela0.registros = itemArray12;
        int int14 = tabela0.n;
        java.lang.Class<?> wildcardClass15 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        java.lang.Class<?> wildcardClass15 = itemArray13.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        java.lang.Class<?> wildcardClass10 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela16.registros = itemArray19;
        ds.Item[] itemArray21 = tabela16.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela22.registros = itemArray25;
        tabela16.registros = itemArray25;
        tabela0.registros = itemArray25;
        int int29 = tabela0.n;
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = tabela0.binaria(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        int int14 = tabela0.n;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (-1);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item item17 = null;
        int int18 = tabela14.binaria(item17);
        tabela14.n = 0;
        ds.Item[] itemArray21 = tabela14.registros;
        tabela9.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item item24 = null;
        tabela0.insere(item24);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = 0;
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela18.registros = itemArray21;
        tabela12.registros = itemArray21;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela12.registros = itemArray25;
        tabela8.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        ds.Item item6 = null;
        tabela4.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = 0;
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela18.registros = itemArray21;
        tabela12.registros = itemArray21;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela12.registros = itemArray25;
        tabela8.registros = itemArray25;
        tabela4.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Tabela tabela30 = new ds.Tabela();
        tabela30.n = 0;
        ds.Item item33 = null;
        int int34 = tabela30.binaria(item33);
        tabela30.n = 0;
        ds.Item[] itemArray37 = tabela30.registros;
        tabela0.registros = itemArray37;
        int int39 = tabela0.n;
        ds.Item item40 = null;
        int int41 = tabela0.binaria(item40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        tabela0.n = ' ';
        tabela0.n = (short) 1;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        int int10 = tabela7.n;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item[] itemArray12 = tabela11.registros;
        ds.Item item13 = null;
        tabela11.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        ds.Item[] itemArray24 = tabela19.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        tabela19.registros = itemArray28;
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        tabela19.registros = itemArray32;
        tabela15.registros = itemArray32;
        tabela11.registros = itemArray32;
        tabela7.registros = itemArray32;
        tabela0.registros = itemArray32;
        ds.Item item38 = null;
        int int39 = tabela0.binaria(item38);
        ds.Item[] itemArray40 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela16.registros = itemArray19;
        ds.Item[] itemArray21 = tabela16.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela22.registros = itemArray25;
        tabela16.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Item[] itemArray29 = tabela0.registros;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item[] itemArray31 = tabela30.registros;
        ds.Item item32 = null;
        tabela30.insere(item32);
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        int int36 = tabela34.binaria(item35);
        ds.Item[] itemArray37 = tabela34.registros;
        ds.Tabela tabela38 = new ds.Tabela();
        tabela38.n = 0;
        ds.Item[] itemArray41 = new ds.Item[] {};
        tabela38.registros = itemArray41;
        ds.Item[] itemArray43 = tabela38.registros;
        ds.Tabela tabela44 = new ds.Tabela();
        tabela44.n = 0;
        ds.Item[] itemArray47 = new ds.Item[] {};
        tabela44.registros = itemArray47;
        tabela38.registros = itemArray47;
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        tabela38.registros = itemArray51;
        tabela34.registros = itemArray51;
        tabela30.registros = itemArray51;
        ds.Tabela tabela55 = new ds.Tabela();
        tabela55.n = 0;
        ds.Item item58 = null;
        tabela55.insere(item58);
        ds.Item[] itemArray60 = tabela55.registros;
        ds.Item[] itemArray61 = tabela55.registros;
        tabela30.registros = itemArray61;
        ds.Tabela tabela63 = new ds.Tabela();
        ds.Item item64 = null;
        int int65 = tabela63.binaria(item64);
        ds.Item[] itemArray66 = tabela63.registros;
        ds.Tabela tabela67 = new ds.Tabela();
        tabela67.n = 0;
        ds.Item[] itemArray70 = new ds.Item[] {};
        tabela67.registros = itemArray70;
        ds.Item[] itemArray72 = tabela67.registros;
        ds.Tabela tabela73 = new ds.Tabela();
        tabela73.n = 0;
        ds.Item[] itemArray76 = new ds.Item[] {};
        tabela73.registros = itemArray76;
        tabela67.registros = itemArray76;
        ds.Item item79 = null;
        ds.Item[] itemArray80 = new ds.Item[] { item79 };
        tabela67.registros = itemArray80;
        tabela63.registros = itemArray80;
        tabela30.registros = itemArray80;
        tabela0.registros = itemArray80;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = 0;
        ds.Item item8 = null;
        int int9 = tabela5.binaria(item8);
        tabela5.n = 0;
        ds.Item[] itemArray12 = tabela5.registros;
        tabela0.registros = itemArray12;
        java.lang.Class<?> wildcardClass14 = itemArray12.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        tabela0.n = (-1);
        tabela0.n = 0;
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        tabela0.n = 0;
        ds.Item item21 = null;
        tabela0.insere(item21);
        tabela0.n = 0;
        java.lang.Class<?> wildcardClass25 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = (byte) 10;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item[] itemArray25 = tabela0.registros;
        ds.Item[] itemArray26 = tabela0.registros;
        java.lang.Class<?> wildcardClass27 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Item[] itemArray31 = tabela25.registros;
        tabela0.registros = itemArray31;
        tabela0.n = (byte) 100;
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = 0;
        ds.Item[] itemArray38 = new ds.Item[] {};
        tabela35.registros = itemArray38;
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Tabela tabela41 = new ds.Tabela();
        tabela41.n = 0;
        ds.Item[] itemArray44 = new ds.Item[] {};
        tabela41.registros = itemArray44;
        tabela35.registros = itemArray44;
        int int47 = tabela35.n;
        ds.Item[] itemArray48 = tabela35.registros;
        tabela35.n = (byte) -1;
        tabela35.n = (short) -1;
        ds.Item[] itemArray53 = tabela35.registros;
        tabela0.registros = itemArray53;
        ds.Tabela tabela55 = new ds.Tabela();
        tabela55.n = 0;
        ds.Item[] itemArray58 = new ds.Item[] {};
        tabela55.registros = itemArray58;
        ds.Item[] itemArray60 = tabela55.registros;
        ds.Tabela tabela61 = new ds.Tabela();
        tabela61.n = 0;
        ds.Item[] itemArray64 = new ds.Item[] {};
        tabela61.registros = itemArray64;
        tabela55.registros = itemArray64;
        int int67 = tabela55.n;
        ds.Item[] itemArray68 = tabela55.registros;
        tabela55.n = (short) 10;
        ds.Tabela tabela71 = new ds.Tabela();
        tabela71.n = 0;
        ds.Item[] itemArray74 = new ds.Item[] {};
        tabela71.registros = itemArray74;
        ds.Item[] itemArray76 = tabela71.registros;
        ds.Tabela tabela77 = new ds.Tabela();
        tabela77.n = 0;
        ds.Item[] itemArray80 = new ds.Item[] {};
        tabela77.registros = itemArray80;
        tabela71.registros = itemArray80;
        tabela55.registros = itemArray80;
        tabela0.registros = itemArray80;
        ds.Item item85 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int86 = tabela0.binaria(item85);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        ds.Item item6 = null;
        tabela4.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = 0;
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela18.registros = itemArray21;
        tabela12.registros = itemArray21;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela12.registros = itemArray25;
        tabela8.registros = itemArray25;
        tabela4.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Tabela tabela30 = new ds.Tabela();
        tabela30.n = 0;
        ds.Item item33 = null;
        int int34 = tabela30.binaria(item33);
        tabela30.n = 0;
        ds.Item[] itemArray37 = tabela30.registros;
        tabela0.registros = itemArray37;
        tabela0.n = 32;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        tabela0.n = 0;
        ds.Item[] itemArray7 = tabela0.registros;
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item[] itemArray25 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Item[] itemArray28 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        tabela0.n = 0;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        tabela0.n = 'a';
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = 0;
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela18.registros = itemArray21;
        tabela12.registros = itemArray21;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela12.registros = itemArray25;
        tabela0.registros = itemArray25;
        tabela0.n = (short) -1;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        int int32 = tabela30.binaria(item31);
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Tabela tabela36 = new ds.Tabela();
        tabela36.n = 0;
        ds.Item[] itemArray39 = new ds.Item[] {};
        tabela36.registros = itemArray39;
        ds.Item[] itemArray41 = tabela36.registros;
        ds.Tabela tabela42 = new ds.Tabela();
        tabela42.n = 0;
        ds.Item[] itemArray45 = new ds.Item[] {};
        tabela42.registros = itemArray45;
        tabela36.registros = itemArray45;
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        tabela36.registros = itemArray49;
        ds.Tabela tabela51 = new ds.Tabela();
        ds.Item[] itemArray52 = tabela51.registros;
        tabela36.registros = itemArray52;
        tabela33.registros = itemArray52;
        tabela30.registros = itemArray52;
        int int56 = tabela30.n;
        ds.Tabela tabela57 = new ds.Tabela();
        tabela57.n = 0;
        ds.Item[] itemArray60 = new ds.Item[] {};
        tabela57.registros = itemArray60;
        ds.Item[] itemArray62 = tabela57.registros;
        ds.Tabela tabela63 = new ds.Tabela();
        tabela63.n = 0;
        ds.Item[] itemArray66 = new ds.Item[] {};
        tabela63.registros = itemArray66;
        tabela57.registros = itemArray66;
        int int69 = tabela57.n;
        ds.Item[] itemArray70 = tabela57.registros;
        tabela30.registros = itemArray70;
        tabela0.registros = itemArray70;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(itemArray70);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Item item22 = null;
        int int23 = tabela0.binaria(item22);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item item19 = null;
        tabela17.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = 0;
        ds.Item[] itemArray34 = new ds.Item[] {};
        tabela31.registros = itemArray34;
        tabela25.registros = itemArray34;
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela25.registros = itemArray38;
        tabela21.registros = itemArray38;
        tabela17.registros = itemArray38;
        tabela0.registros = itemArray38;
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item item44 = null;
        int int45 = tabela43.binaria(item44);
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        int int48 = tabela46.binaria(item47);
        ds.Tabela tabela49 = new ds.Tabela();
        tabela49.n = 0;
        ds.Item[] itemArray52 = new ds.Item[] {};
        tabela49.registros = itemArray52;
        ds.Item[] itemArray54 = tabela49.registros;
        ds.Tabela tabela55 = new ds.Tabela();
        tabela55.n = 0;
        ds.Item[] itemArray58 = new ds.Item[] {};
        tabela55.registros = itemArray58;
        tabela49.registros = itemArray58;
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        tabela49.registros = itemArray62;
        ds.Tabela tabela64 = new ds.Tabela();
        ds.Item[] itemArray65 = tabela64.registros;
        tabela49.registros = itemArray65;
        tabela46.registros = itemArray65;
        tabela43.registros = itemArray65;
        ds.Item item69 = null;
        tabela43.insere(item69);
        ds.Item[] itemArray71 = tabela43.registros;
        tabela0.registros = itemArray71;
        tabela0.n = 100;
        ds.Item item75 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int76 = tabela0.pesquisa(item75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        int int5 = tabela3.binaria(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        tabela6.registros = itemArray15;
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela6.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        tabela6.registros = itemArray22;
        tabela3.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item item26 = null;
        tabela0.insere(item26);
        int int28 = tabela0.n;
        ds.Tabela tabela29 = new ds.Tabela();
        tabela29.n = 0;
        ds.Item[] itemArray32 = new ds.Item[] {};
        tabela29.registros = itemArray32;
        ds.Item[] itemArray34 = tabela29.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = 0;
        ds.Item[] itemArray38 = new ds.Item[] {};
        tabela35.registros = itemArray38;
        tabela29.registros = itemArray38;
        int int41 = tabela29.n;
        ds.Item[] itemArray42 = tabela29.registros;
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item item44 = null;
        int int45 = tabela43.binaria(item44);
        ds.Item[] itemArray46 = tabela43.registros;
        tabela29.registros = itemArray46;
        tabela0.registros = itemArray46;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = 0;
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela18.registros = itemArray21;
        tabela12.registros = itemArray21;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela12.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Tabela tabela28 = new ds.Tabela();
        tabela28.n = 0;
        ds.Item[] itemArray31 = new ds.Item[] {};
        tabela28.registros = itemArray31;
        ds.Item[] itemArray33 = tabela28.registros;
        ds.Tabela tabela34 = new ds.Tabela();
        tabela34.n = 0;
        ds.Item[] itemArray37 = new ds.Item[] {};
        tabela34.registros = itemArray37;
        tabela28.registros = itemArray37;
        int int40 = tabela28.n;
        ds.Item[] itemArray41 = tabela28.registros;
        tabela28.n = (short) 10;
        ds.Item[] itemArray44 = tabela28.registros;
        ds.Tabela tabela45 = new ds.Tabela();
        ds.Item[] itemArray46 = tabela45.registros;
        ds.Item item47 = null;
        tabela45.insere(item47);
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item item50 = null;
        int int51 = tabela49.binaria(item50);
        ds.Item[] itemArray52 = tabela49.registros;
        ds.Tabela tabela53 = new ds.Tabela();
        tabela53.n = 0;
        ds.Item[] itemArray56 = new ds.Item[] {};
        tabela53.registros = itemArray56;
        ds.Item[] itemArray58 = tabela53.registros;
        ds.Tabela tabela59 = new ds.Tabela();
        tabela59.n = 0;
        ds.Item[] itemArray62 = new ds.Item[] {};
        tabela59.registros = itemArray62;
        tabela53.registros = itemArray62;
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        tabela53.registros = itemArray66;
        tabela49.registros = itemArray66;
        tabela45.registros = itemArray66;
        tabela28.registros = itemArray66;
        tabela0.registros = itemArray66;
        int int72 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) 100;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = 0;
        ds.Item[] itemArray23 = new ds.Item[] {};
        tabela20.registros = itemArray23;
        ds.Item[] itemArray25 = tabela20.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        tabela26.n = 0;
        ds.Item[] itemArray29 = new ds.Item[] {};
        tabela26.registros = itemArray29;
        tabela20.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Item item33 = null;
        int int34 = tabela0.binaria(item33);
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = 0;
        ds.Item item38 = null;
        tabela35.insere(item38);
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        tabela0.registros = itemArray41;
        tabela0.n = (byte) -1;
        ds.Item item45 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int46 = tabela0.pesquisa(item45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (byte) -1;
        tabela0.n = (short) -1;
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Item item22 = null;
        tabela19.insere(item22);
        int int24 = tabela19.n;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Item[] itemArray31 = tabela25.registros;
        tabela19.registros = itemArray31;
        tabela0.registros = itemArray31;
        ds.Item[] itemArray34 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        tabela0.n = 1;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (byte) -1;
        tabela0.n = (short) -1;
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (-1);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela9.registros = itemArray12;
        ds.Item[] itemArray14 = tabela9.registros;
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = 0;
        ds.Item[] itemArray18 = new ds.Item[] {};
        tabela15.registros = itemArray18;
        tabela9.registros = itemArray18;
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        tabela9.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        tabela9.registros = itemArray25;
        ds.Item item27 = null;
        int int28 = tabela9.binaria(item27);
        ds.Tabela tabela29 = new ds.Tabela();
        tabela29.n = 0;
        ds.Item[] itemArray32 = new ds.Item[] {};
        tabela29.registros = itemArray32;
        ds.Item[] itemArray34 = tabela29.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = 0;
        ds.Item[] itemArray38 = new ds.Item[] {};
        tabela35.registros = itemArray38;
        tabela29.registros = itemArray38;
        tabela9.registros = itemArray38;
        ds.Item item42 = null;
        int int43 = tabela9.binaria(item42);
        ds.Tabela tabela44 = new ds.Tabela();
        tabela44.n = 0;
        ds.Item[] itemArray47 = new ds.Item[] {};
        tabela44.registros = itemArray47;
        ds.Item[] itemArray49 = tabela44.registros;
        tabela9.registros = itemArray49;
        tabela0.registros = itemArray49;
        ds.Item item52 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int53 = tabela0.pesquisa(item52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        java.lang.Class<?> wildcardClass4 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (byte) -1;
        tabela0.n = (byte) 0;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Item[] itemArray31 = tabela25.registros;
        tabela0.registros = itemArray31;
        tabela0.n = (byte) -1;
        java.lang.Class<?> wildcardClass35 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        tabela0.n = 0;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        java.lang.Class<?> wildcardClass10 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Item[] itemArray31 = tabela25.registros;
        tabela0.registros = itemArray31;
        tabela0.n = (byte) -1;
        ds.Item item35 = null;
        tabela0.insere(item35);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = 0;
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela18.registros = itemArray21;
        tabela12.registros = itemArray21;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela12.registros = itemArray25;
        tabela0.registros = itemArray25;
        tabela0.n = (short) -1;
        ds.Item[] itemArray30 = null;
        tabela0.registros = itemArray30;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = 0;
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela18.registros = itemArray21;
        tabela12.registros = itemArray21;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela12.registros = itemArray25;
        tabela0.registros = itemArray25;
        tabela0.n = (short) -1;
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = tabela0.binaria(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        tabela0.n = (-1);
        int int18 = tabela0.n;
        tabela0.n = (short) 100;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = 0;
        ds.Item[] itemArray7 = new ds.Item[] {};
        tabela4.registros = itemArray7;
        ds.Item[] itemArray9 = tabela4.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = 0;
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela10.registros = itemArray13;
        tabela4.registros = itemArray13;
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela4.registros = itemArray17;
        tabela0.registros = itemArray17;
        ds.Item[] itemArray20 = tabela0.registros;
        ds.Item item21 = null;
        int int22 = tabela0.binaria(item21);
        ds.Item[] itemArray23 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Item[] itemArray31 = tabela25.registros;
        tabela0.registros = itemArray31;
        tabela0.n = (byte) 100;
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = 0;
        ds.Item item38 = null;
        tabela35.insere(item38);
        int int40 = tabela35.n;
        ds.Item[] itemArray41 = tabela35.registros;
        ds.Item[] itemArray42 = tabela35.registros;
        tabela0.registros = itemArray42;
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        int int5 = tabela3.binaria(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        tabela6.registros = itemArray15;
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela6.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        tabela6.registros = itemArray22;
        tabela3.registros = itemArray22;
        tabela0.registros = itemArray22;
        int int26 = tabela0.n;
        ds.Tabela tabela27 = new ds.Tabela();
        tabela27.n = 0;
        ds.Item[] itemArray30 = new ds.Item[] {};
        tabela27.registros = itemArray30;
        ds.Item[] itemArray32 = tabela27.registros;
        ds.Tabela tabela33 = new ds.Tabela();
        tabela33.n = 0;
        ds.Item[] itemArray36 = new ds.Item[] {};
        tabela33.registros = itemArray36;
        tabela27.registros = itemArray36;
        int int39 = tabela27.n;
        ds.Item[] itemArray40 = tabela27.registros;
        tabela0.registros = itemArray40;
        int int42 = tabela0.n;
        ds.Item item43 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Item item21 = null;
        int int22 = tabela0.binaria(item21);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        ds.Item item6 = null;
        tabela4.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = 0;
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela18.registros = itemArray21;
        tabela12.registros = itemArray21;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela12.registros = itemArray25;
        tabela8.registros = itemArray25;
        tabela4.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = tabela0.pesquisa(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = 0;
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela3.registros = itemArray6;
        ds.Item[] itemArray8 = tabela3.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela9.registros = itemArray12;
        tabela3.registros = itemArray12;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela3.registros = itemArray16;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela3.registros = itemArray19;
        tabela0.registros = itemArray19;
        int int22 = tabela0.n;
        ds.Item item23 = null;
        int int24 = tabela0.binaria(item23);
        ds.Item item25 = null;
        int int26 = tabela0.binaria(item25);
        ds.Item item27 = null;
        int int28 = tabela0.binaria(item27);
        ds.Item[] itemArray29 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        tabela0.n = ' ';
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        int int18 = tabela16.binaria(item17);
        ds.Item[] itemArray19 = tabela16.registros;
        tabela0.registros = itemArray19;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        tabela0.n = 0;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item item11 = null;
        int int12 = tabela8.binaria(item11);
        ds.Item item13 = null;
        int int14 = tabela8.binaria(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = 0;
        int int18 = tabela15.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item[] itemArray20 = tabela19.registros;
        ds.Item item21 = null;
        tabela19.insere(item21);
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        int int25 = tabela23.binaria(item24);
        ds.Item[] itemArray26 = tabela23.registros;
        ds.Tabela tabela27 = new ds.Tabela();
        tabela27.n = 0;
        ds.Item[] itemArray30 = new ds.Item[] {};
        tabela27.registros = itemArray30;
        ds.Item[] itemArray32 = tabela27.registros;
        ds.Tabela tabela33 = new ds.Tabela();
        tabela33.n = 0;
        ds.Item[] itemArray36 = new ds.Item[] {};
        tabela33.registros = itemArray36;
        tabela27.registros = itemArray36;
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        tabela27.registros = itemArray40;
        tabela23.registros = itemArray40;
        tabela19.registros = itemArray40;
        tabela15.registros = itemArray40;
        tabela8.registros = itemArray40;
        tabela0.registros = itemArray40;
        java.lang.Class<?> wildcardClass47 = itemArray40.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
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
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela22.registros = itemArray25;
        ds.Item[] itemArray27 = tabela22.registros;
        ds.Tabela tabela28 = new ds.Tabela();
        tabela28.n = 0;
        ds.Item[] itemArray31 = new ds.Item[] {};
        tabela28.registros = itemArray31;
        tabela22.registros = itemArray31;
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        tabela22.registros = itemArray35;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item[] itemArray38 = tabela37.registros;
        tabela22.registros = itemArray38;
        tabela0.registros = itemArray38;
        java.lang.Class<?> wildcardClass41 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = 0;
        ds.Item[] itemArray18 = new ds.Item[] {};
        tabela15.registros = itemArray18;
        ds.Item[] itemArray20 = tabela15.registros;
        ds.Tabela tabela21 = new ds.Tabela();
        tabela21.n = 0;
        ds.Item[] itemArray24 = new ds.Item[] {};
        tabela21.registros = itemArray24;
        tabela15.registros = itemArray24;
        int int27 = tabela15.n;
        tabela15.n = ' ';
        ds.Item[] itemArray30 = tabela15.registros;
        tabela0.registros = itemArray30;
        int int32 = tabela0.n;
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = tabela0.binaria(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        tabela0.insere(item18);
        ds.Item item20 = null;
        tabela0.insere(item20);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        tabela0.n = 0;
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.pesquisa(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela16.registros = itemArray19;
        ds.Item[] itemArray21 = tabela16.registros;
        tabela0.registros = itemArray21;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item item19 = null;
        tabela17.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = 0;
        ds.Item[] itemArray34 = new ds.Item[] {};
        tabela31.registros = itemArray34;
        tabela25.registros = itemArray34;
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela25.registros = itemArray38;
        tabela21.registros = itemArray38;
        tabela17.registros = itemArray38;
        tabela0.registros = itemArray38;
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item item44 = null;
        int int45 = tabela43.binaria(item44);
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        int int48 = tabela46.binaria(item47);
        ds.Tabela tabela49 = new ds.Tabela();
        tabela49.n = 0;
        ds.Item[] itemArray52 = new ds.Item[] {};
        tabela49.registros = itemArray52;
        ds.Item[] itemArray54 = tabela49.registros;
        ds.Tabela tabela55 = new ds.Tabela();
        tabela55.n = 0;
        ds.Item[] itemArray58 = new ds.Item[] {};
        tabela55.registros = itemArray58;
        tabela49.registros = itemArray58;
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        tabela49.registros = itemArray62;
        ds.Tabela tabela64 = new ds.Tabela();
        ds.Item[] itemArray65 = tabela64.registros;
        tabela49.registros = itemArray65;
        tabela46.registros = itemArray65;
        tabela43.registros = itemArray65;
        ds.Item item69 = null;
        tabela43.insere(item69);
        ds.Item[] itemArray71 = tabela43.registros;
        tabela0.registros = itemArray71;
        tabela0.n = 100;
        ds.Item item75 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int76 = tabela0.binaria(item75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (byte) -1;
        tabela0.n = (short) -1;
        ds.Item[] itemArray18 = tabela0.registros;
        java.lang.Class<?> wildcardClass19 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Item[] itemArray21 = tabela0.registros;
        int int22 = tabela0.n;
        java.lang.Class<?> wildcardClass23 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item[] itemArray12 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = 0;
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela3.registros = itemArray6;
        ds.Item[] itemArray8 = tabela3.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela9.registros = itemArray12;
        tabela3.registros = itemArray12;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela3.registros = itemArray16;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela3.registros = itemArray19;
        tabela0.registros = itemArray19;
        int int22 = tabela0.n;
        ds.Item item23 = null;
        int int24 = tabela0.binaria(item23);
        ds.Item item25 = null;
        int int26 = tabela0.binaria(item25);
        ds.Item item27 = null;
        int int28 = tabela0.binaria(item27);
        tabela0.n = ' ';
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = tabela0.binaria(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = 0;
        ds.Item[] itemArray23 = new ds.Item[] {};
        tabela20.registros = itemArray23;
        ds.Item[] itemArray25 = tabela20.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        tabela26.n = 0;
        ds.Item[] itemArray29 = new ds.Item[] {};
        tabela26.registros = itemArray29;
        tabela20.registros = itemArray29;
        tabela0.registros = itemArray29;
        java.lang.Class<?> wildcardClass33 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
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
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        tabela0.registros = itemArray13;
        int int15 = tabela0.n;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item[] itemArray19 = tabela17.registros;
        tabela0.registros = itemArray19;
        ds.Item[] itemArray21 = tabela0.registros;
        java.lang.Class<?> wildcardClass22 = itemArray21.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = 0;
        ds.Item[] itemArray7 = new ds.Item[] {};
        tabela4.registros = itemArray7;
        ds.Item[] itemArray9 = tabela4.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = 0;
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela10.registros = itemArray13;
        tabela4.registros = itemArray13;
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela4.registros = itemArray17;
        tabela0.registros = itemArray17;
        ds.Item[] itemArray20 = tabela0.registros;
        ds.Tabela tabela21 = new ds.Tabela();
        tabela21.n = 0;
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item item26 = null;
        tabela21.insere(item26);
        tabela21.n = (-1);
        ds.Tabela tabela30 = new ds.Tabela();
        tabela30.n = 0;
        ds.Item[] itemArray33 = new ds.Item[] {};
        tabela30.registros = itemArray33;
        ds.Item[] itemArray35 = tabela30.registros;
        ds.Tabela tabela36 = new ds.Tabela();
        tabela36.n = 0;
        ds.Item[] itemArray39 = new ds.Item[] {};
        tabela36.registros = itemArray39;
        tabela30.registros = itemArray39;
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        tabela30.registros = itemArray43;
        ds.Tabela tabela45 = new ds.Tabela();
        ds.Item[] itemArray46 = tabela45.registros;
        tabela30.registros = itemArray46;
        ds.Item item48 = null;
        int int49 = tabela30.binaria(item48);
        ds.Tabela tabela50 = new ds.Tabela();
        tabela50.n = 0;
        ds.Item[] itemArray53 = new ds.Item[] {};
        tabela50.registros = itemArray53;
        ds.Item[] itemArray55 = tabela50.registros;
        ds.Tabela tabela56 = new ds.Tabela();
        tabela56.n = 0;
        ds.Item[] itemArray59 = new ds.Item[] {};
        tabela56.registros = itemArray59;
        tabela50.registros = itemArray59;
        tabela30.registros = itemArray59;
        ds.Item item63 = null;
        int int64 = tabela30.binaria(item63);
        ds.Tabela tabela65 = new ds.Tabela();
        tabela65.n = 0;
        ds.Item[] itemArray68 = new ds.Item[] {};
        tabela65.registros = itemArray68;
        ds.Item[] itemArray70 = tabela65.registros;
        tabela30.registros = itemArray70;
        tabela21.registros = itemArray70;
        tabela0.registros = itemArray70;
        java.lang.Class<?> wildcardClass74 = itemArray70.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        tabela0.n = 0;
        ds.Item item21 = null;
        tabela0.insere(item21);
        tabela0.n = 0;
        tabela0.n = 2;
        ds.Item item27 = null;
        tabela0.insere(item27);
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = tabela0.binaria(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = 0;
        ds.Item[] itemArray7 = new ds.Item[] {};
        tabela4.registros = itemArray7;
        ds.Item[] itemArray9 = tabela4.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = 0;
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela10.registros = itemArray13;
        tabela4.registros = itemArray13;
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela4.registros = itemArray17;
        tabela0.registros = itemArray17;
        int int20 = tabela0.n;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Tabela tabela24 = new ds.Tabela();
        tabela24.n = 0;
        ds.Item[] itemArray27 = new ds.Item[] {};
        tabela24.registros = itemArray27;
        ds.Item[] itemArray29 = tabela24.registros;
        ds.Tabela tabela30 = new ds.Tabela();
        tabela30.n = 0;
        ds.Item[] itemArray33 = new ds.Item[] {};
        tabela30.registros = itemArray33;
        tabela24.registros = itemArray33;
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela24.registros = itemArray37;
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item[] itemArray40 = tabela39.registros;
        tabela24.registros = itemArray40;
        tabela21.registros = itemArray40;
        tabela0.registros = itemArray40;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item item19 = null;
        tabela17.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = 0;
        ds.Item[] itemArray34 = new ds.Item[] {};
        tabela31.registros = itemArray34;
        tabela25.registros = itemArray34;
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela25.registros = itemArray38;
        tabela21.registros = itemArray38;
        tabela17.registros = itemArray38;
        tabela0.registros = itemArray38;
        ds.Item[] itemArray43 = tabela0.registros;
        ds.Item[] itemArray44 = tabela0.registros;
        ds.Item item45 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int46 = tabela0.binaria(item45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        tabela0.n = (short) 0;
        ds.Item item23 = null;
        tabela0.insere(item23);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = 0;
        ds.Item item7 = null;
        tabela0.insere(item7);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = 0;
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela3.registros = itemArray6;
        ds.Item[] itemArray8 = tabela3.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela9.registros = itemArray12;
        tabela3.registros = itemArray12;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela3.registros = itemArray16;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela3.registros = itemArray19;
        tabela0.registros = itemArray19;
        int int22 = tabela0.n;
        ds.Item item23 = null;
        int int24 = tabela0.binaria(item23);
        ds.Item item25 = null;
        int int26 = tabela0.binaria(item25);
        int int27 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item item19 = null;
        int int20 = tabela16.binaria(item19);
        tabela16.n = 0;
        ds.Item[] itemArray23 = tabela16.registros;
        tabela0.registros = itemArray23;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        ds.Item item6 = null;
        tabela4.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = 0;
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela18.registros = itemArray21;
        tabela12.registros = itemArray21;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela12.registros = itemArray25;
        tabela8.registros = itemArray25;
        tabela4.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Tabela tabela30 = new ds.Tabela();
        tabela30.n = 0;
        ds.Item item33 = null;
        int int34 = tabela30.binaria(item33);
        tabela30.n = 0;
        ds.Item[] itemArray37 = tabela30.registros;
        tabela0.registros = itemArray37;
        ds.Item item39 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int40 = tabela0.pesquisa(item39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        tabela0.registros = itemArray13;
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        tabela0.insere(item3);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = 0;
        ds.Item[] itemArray23 = new ds.Item[] {};
        tabela20.registros = itemArray23;
        ds.Item[] itemArray25 = tabela20.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        tabela26.n = 0;
        ds.Item[] itemArray29 = new ds.Item[] {};
        tabela26.registros = itemArray29;
        tabela20.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Item item33 = null;
        int int34 = tabela0.binaria(item33);
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = tabela0.pesquisa(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        tabela0.n = (short) 0;
        java.lang.Class<?> wildcardClass23 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        tabela0.n = (-1);
        tabela0.n = 0;
        java.lang.Class<?> wildcardClass20 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = 0;
        ds.Item item7 = null;
        int int8 = tabela4.binaria(item7);
        ds.Item item9 = null;
        int int10 = tabela4.binaria(item9);
        ds.Item item11 = null;
        tabela4.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = 0;
        int int16 = tabela13.n;
        ds.Item[] itemArray17 = tabela13.registros;
        tabela4.registros = itemArray17;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        ds.Item[] itemArray24 = tabela19.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        tabela19.registros = itemArray28;
        int int31 = tabela19.n;
        tabela19.n = ' ';
        ds.Item[] itemArray34 = tabela19.registros;
        tabela4.registros = itemArray34;
        tabela0.registros = itemArray34;
        int int37 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = tabela0.binaria(item40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Item[] itemArray31 = tabela25.registros;
        tabela0.registros = itemArray31;
        ds.Item item33 = null;
        tabela0.insere(item33);
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = tabela0.pesquisa(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (-1);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item item17 = null;
        int int18 = tabela14.binaria(item17);
        tabela14.n = 0;
        ds.Item[] itemArray21 = tabela14.registros;
        tabela9.registros = itemArray21;
        tabela0.registros = itemArray21;
        tabela0.n = 'a';
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = tabela0.pesquisa(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = 0;
        ds.Item item20 = null;
        int int21 = tabela17.binaria(item20);
        ds.Item item22 = null;
        int int23 = tabela17.binaria(item22);
        ds.Tabela tabela24 = new ds.Tabela();
        tabela24.n = 0;
        int int27 = tabela24.n;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item[] itemArray29 = tabela28.registros;
        ds.Item item30 = null;
        tabela28.insere(item30);
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        int int34 = tabela32.binaria(item33);
        ds.Item[] itemArray35 = tabela32.registros;
        ds.Tabela tabela36 = new ds.Tabela();
        tabela36.n = 0;
        ds.Item[] itemArray39 = new ds.Item[] {};
        tabela36.registros = itemArray39;
        ds.Item[] itemArray41 = tabela36.registros;
        ds.Tabela tabela42 = new ds.Tabela();
        tabela42.n = 0;
        ds.Item[] itemArray45 = new ds.Item[] {};
        tabela42.registros = itemArray45;
        tabela36.registros = itemArray45;
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        tabela36.registros = itemArray49;
        tabela32.registros = itemArray49;
        tabela28.registros = itemArray49;
        tabela24.registros = itemArray49;
        tabela17.registros = itemArray49;
        tabela0.registros = itemArray49;
        java.lang.Class<?> wildcardClass56 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        tabela0.n = (byte) 1;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = 0;
        ds.Item item8 = null;
        tabela5.insere(item8);
        ds.Item[] itemArray10 = tabela5.registros;
        tabela0.registros = itemArray10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Item[] itemArray31 = tabela25.registros;
        tabela0.registros = itemArray31;
        tabela0.n = (byte) 100;
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = 0;
        ds.Item item38 = null;
        tabela35.insere(item38);
        int int40 = tabela35.n;
        ds.Item[] itemArray41 = tabela35.registros;
        ds.Item[] itemArray42 = tabela35.registros;
        tabela0.registros = itemArray42;
        ds.Item[] itemArray44 = tabela0.registros;
        ds.Item item45 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int46 = tabela0.binaria(item45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Item item20 = null;
        int int21 = tabela0.binaria(item20);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        java.lang.Class<?> wildcardClass5 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = tabela0.pesquisa(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Item[] itemArray31 = tabela25.registros;
        tabela0.registros = itemArray31;
        tabela0.n = (byte) 100;
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = 0;
        ds.Item item38 = null;
        tabela35.insere(item38);
        int int40 = tabela35.n;
        ds.Item[] itemArray41 = tabela35.registros;
        ds.Item[] itemArray42 = tabela35.registros;
        tabela0.registros = itemArray42;
        tabela0.n = (byte) -1;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = 0;
        ds.Item[] itemArray23 = new ds.Item[] {};
        tabela20.registros = itemArray23;
        tabela8.registros = itemArray23;
        tabela0.registros = itemArray23;
        java.lang.Class<?> wildcardClass27 = itemArray23.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = 0;
        ds.Item[] itemArray23 = new ds.Item[] {};
        tabela20.registros = itemArray23;
        ds.Item[] itemArray25 = tabela20.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        tabela26.n = 0;
        ds.Item[] itemArray29 = new ds.Item[] {};
        tabela26.registros = itemArray29;
        tabela20.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Item item33 = null;
        int int34 = tabela0.binaria(item33);
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = 0;
        ds.Item item38 = null;
        tabela35.insere(item38);
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        tabela0.registros = itemArray41;
        tabela0.n = (byte) -1;
        java.lang.Class<?> wildcardClass45 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        tabela0.n = (-1);
        tabela0.n = (short) -1;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela16.registros = itemArray19;
        ds.Item[] itemArray21 = tabela16.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela22.registros = itemArray25;
        tabela16.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Item[] itemArray29 = tabela0.registros;
        tabela0.n = 1;
        java.lang.Class<?> wildcardClass32 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = 0;
        ds.Item[] itemArray23 = new ds.Item[] {};
        tabela20.registros = itemArray23;
        ds.Item[] itemArray25 = tabela20.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        tabela26.n = 0;
        ds.Item[] itemArray29 = new ds.Item[] {};
        tabela26.registros = itemArray29;
        tabela20.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Item item33 = null;
        int int34 = tabela0.binaria(item33);
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = 0;
        ds.Item item38 = null;
        tabela35.insere(item38);
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        tabela0.registros = itemArray41;
        ds.Item item43 = null;
        tabela0.insere(item43);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (-1);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela9.registros = itemArray12;
        ds.Item[] itemArray14 = tabela9.registros;
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = 0;
        ds.Item[] itemArray18 = new ds.Item[] {};
        tabela15.registros = itemArray18;
        tabela9.registros = itemArray18;
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        tabela9.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        tabela9.registros = itemArray25;
        ds.Item item27 = null;
        int int28 = tabela9.binaria(item27);
        ds.Tabela tabela29 = new ds.Tabela();
        tabela29.n = 0;
        ds.Item[] itemArray32 = new ds.Item[] {};
        tabela29.registros = itemArray32;
        ds.Item[] itemArray34 = tabela29.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = 0;
        ds.Item[] itemArray38 = new ds.Item[] {};
        tabela35.registros = itemArray38;
        tabela29.registros = itemArray38;
        tabela9.registros = itemArray38;
        ds.Item item42 = null;
        int int43 = tabela9.binaria(item42);
        ds.Tabela tabela44 = new ds.Tabela();
        tabela44.n = 0;
        ds.Item[] itemArray47 = new ds.Item[] {};
        tabela44.registros = itemArray47;
        ds.Item[] itemArray49 = tabela44.registros;
        tabela9.registros = itemArray49;
        tabela0.registros = itemArray49;
        tabela0.n = (-1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        int int5 = tabela3.binaria(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        tabela6.registros = itemArray15;
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela6.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        tabela6.registros = itemArray22;
        tabela3.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item item26 = null;
        tabela0.insere(item26);
        ds.Item[] itemArray28 = tabela0.registros;
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = tabela0.pesquisa(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item item19 = null;
        tabela17.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = 0;
        ds.Item[] itemArray34 = new ds.Item[] {};
        tabela31.registros = itemArray34;
        tabela25.registros = itemArray34;
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela25.registros = itemArray38;
        tabela21.registros = itemArray38;
        tabela17.registros = itemArray38;
        tabela0.registros = itemArray38;
        ds.Item[] itemArray43 = tabela0.registros;
        tabela0.n = (short) 100;
        ds.Item item46 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        java.lang.Class<?> wildcardClass6 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Item[] itemArray31 = tabela25.registros;
        tabela0.registros = itemArray31;
        tabela0.n = (byte) -1;
        ds.Item[] itemArray35 = tabela0.registros;
        ds.Item[] itemArray36 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        ds.Item item6 = null;
        tabela4.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = 0;
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela18.registros = itemArray21;
        tabela12.registros = itemArray21;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela12.registros = itemArray25;
        tabela8.registros = itemArray25;
        tabela4.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Tabela tabela30 = new ds.Tabela();
        tabela30.n = 0;
        ds.Item item33 = null;
        int int34 = tabela30.binaria(item33);
        tabela30.n = 0;
        ds.Item[] itemArray37 = tabela30.registros;
        tabela0.registros = itemArray37;
        int int39 = tabela0.n;
        ds.Item[] itemArray40 = tabela0.registros;
        ds.Item[] itemArray41 = tabela0.registros;
        java.lang.Class<?> wildcardClass42 = itemArray41.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Item[] itemArray31 = tabela25.registros;
        tabela0.registros = itemArray31;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        int int35 = tabela33.binaria(item34);
        ds.Item[] itemArray36 = tabela33.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        tabela37.n = 0;
        ds.Item[] itemArray40 = new ds.Item[] {};
        tabela37.registros = itemArray40;
        ds.Item[] itemArray42 = tabela37.registros;
        ds.Tabela tabela43 = new ds.Tabela();
        tabela43.n = 0;
        ds.Item[] itemArray46 = new ds.Item[] {};
        tabela43.registros = itemArray46;
        tabela37.registros = itemArray46;
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        tabela37.registros = itemArray50;
        tabela33.registros = itemArray50;
        tabela0.registros = itemArray50;
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item[] itemArray55 = tabela54.registros;
        ds.Item item56 = null;
        int int57 = tabela54.binaria(item56);
        ds.Item[] itemArray58 = tabela54.registros;
        tabela0.registros = itemArray58;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        tabela0.n = 1;
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = 0;
        ds.Item item8 = null;
        tabela5.insere(item8);
        int int10 = tabela5.n;
        ds.Item[] itemArray11 = tabela5.registros;
        ds.Item[] itemArray12 = tabela5.registros;
        tabela0.registros = itemArray12;
        tabela0.n = '4';
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.binaria(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.binaria(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item[] itemArray25 = tabela0.registros;
        tabela0.n = (short) 10;
        int int28 = tabela0.n;
        ds.Item[] itemArray29 = tabela0.registros;
        ds.Item[] itemArray30 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = 0;
        ds.Item[] itemArray16 = new ds.Item[] {};
        tabela13.registros = itemArray16;
        ds.Item[] itemArray18 = tabela13.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        tabela13.registros = itemArray22;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = 0;
        ds.Item[] itemArray34 = new ds.Item[] {};
        tabela31.registros = itemArray34;
        tabela25.registros = itemArray34;
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela25.registros = itemArray38;
        tabela13.registros = itemArray38;
        tabela0.registros = itemArray38;
        ds.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = 0;
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela3.registros = itemArray6;
        ds.Item[] itemArray8 = tabela3.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela9.registros = itemArray12;
        tabela3.registros = itemArray12;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela3.registros = itemArray16;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela3.registros = itemArray19;
        tabela0.registros = itemArray19;
        int int22 = tabela0.n;
        ds.Item item23 = null;
        int int24 = tabela0.binaria(item23);
        int int25 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = 0;
        ds.Item item8 = null;
        int int9 = tabela5.binaria(item8);
        tabela5.n = 0;
        ds.Item[] itemArray12 = tabela5.registros;
        tabela0.registros = itemArray12;
        tabela0.n = (-1);
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.binaria(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = 0;
        ds.Item item7 = null;
        int int8 = tabela4.binaria(item7);
        ds.Item item9 = null;
        int int10 = tabela4.binaria(item9);
        ds.Item item11 = null;
        tabela4.insere(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = 0;
        int int16 = tabela13.n;
        ds.Item[] itemArray17 = tabela13.registros;
        tabela4.registros = itemArray17;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        ds.Item[] itemArray24 = tabela19.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        tabela19.registros = itemArray28;
        int int31 = tabela19.n;
        tabela19.n = ' ';
        ds.Item[] itemArray34 = tabela19.registros;
        tabela4.registros = itemArray34;
        tabela0.registros = itemArray34;
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        tabela0.n = ' ';
        ds.Item[] itemArray15 = tabela0.registros;
        int int16 = tabela0.n;
        int int17 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = 0;
        ds.Item[] itemArray23 = new ds.Item[] {};
        tabela20.registros = itemArray23;
        ds.Item[] itemArray25 = tabela20.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        tabela26.n = 0;
        ds.Item[] itemArray29 = new ds.Item[] {};
        tabela26.registros = itemArray29;
        tabela20.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        int int5 = tabela3.binaria(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        tabela6.registros = itemArray15;
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela6.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        tabela6.registros = itemArray22;
        tabela3.registros = itemArray22;
        tabela0.registros = itemArray22;
        int int26 = tabela0.n;
        ds.Tabela tabela27 = new ds.Tabela();
        tabela27.n = 0;
        ds.Item[] itemArray30 = new ds.Item[] {};
        tabela27.registros = itemArray30;
        ds.Item[] itemArray32 = tabela27.registros;
        ds.Tabela tabela33 = new ds.Tabela();
        tabela33.n = 0;
        ds.Item[] itemArray36 = new ds.Item[] {};
        tabela33.registros = itemArray36;
        tabela27.registros = itemArray36;
        int int39 = tabela27.n;
        ds.Item[] itemArray40 = tabela27.registros;
        tabela0.registros = itemArray40;
        int int42 = tabela0.n;
        int int43 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela0.registros = itemArray15;
        java.lang.Class<?> wildcardClass17 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (-1);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item item17 = null;
        int int18 = tabela14.binaria(item17);
        tabela14.n = 0;
        ds.Item[] itemArray21 = tabela14.registros;
        tabela9.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item[] itemArray24 = tabela0.registros;
        ds.Item item25 = null;
        tabela0.insere(item25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (-1);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item item17 = null;
        int int18 = tabela14.binaria(item17);
        tabela14.n = 0;
        ds.Item[] itemArray21 = tabela14.registros;
        tabela9.registros = itemArray21;
        tabela0.registros = itemArray21;
        tabela0.n = 'a';
        tabela0.n = (-1);
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = tabela0.pesquisa(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = 0;
        ds.Item item8 = null;
        int int9 = tabela5.binaria(item8);
        tabela5.n = 0;
        ds.Item[] itemArray12 = tabela5.registros;
        tabela0.registros = itemArray12;
        tabela0.n = (-1);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.binaria(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item item19 = null;
        tabela17.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = 0;
        ds.Item[] itemArray34 = new ds.Item[] {};
        tabela31.registros = itemArray34;
        tabela25.registros = itemArray34;
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela25.registros = itemArray38;
        tabela21.registros = itemArray38;
        tabela17.registros = itemArray38;
        tabela0.registros = itemArray38;
        ds.Item[] itemArray43 = tabela0.registros;
        ds.Item[] itemArray44 = tabela0.registros;
        ds.Item[] itemArray45 = tabela0.registros;
        java.lang.Class<?> wildcardClass46 = itemArray45.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = 0;
        ds.Item[] itemArray7 = new ds.Item[] {};
        tabela4.registros = itemArray7;
        ds.Item[] itemArray9 = tabela4.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = 0;
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela10.registros = itemArray13;
        tabela4.registros = itemArray13;
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela4.registros = itemArray17;
        tabela0.registros = itemArray17;
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
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        tabela0.n = 0;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        int int5 = tabela3.binaria(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        tabela6.registros = itemArray15;
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela6.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        tabela6.registros = itemArray22;
        tabela3.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item item26 = null;
        int int27 = tabela0.binaria(item26);
        ds.Item item28 = null;
        int int29 = tabela0.binaria(item28);
        ds.Item[] itemArray30 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        int int5 = tabela3.binaria(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        tabela6.registros = itemArray15;
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela6.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        tabela6.registros = itemArray22;
        tabela3.registros = itemArray22;
        tabela0.registros = itemArray22;
        int int26 = tabela0.n;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item[] itemArray28 = tabela27.registros;
        ds.Item item29 = null;
        tabela27.insere(item29);
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        int int33 = tabela31.binaria(item32);
        ds.Item[] itemArray34 = tabela31.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = 0;
        ds.Item[] itemArray38 = new ds.Item[] {};
        tabela35.registros = itemArray38;
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Tabela tabela41 = new ds.Tabela();
        tabela41.n = 0;
        ds.Item[] itemArray44 = new ds.Item[] {};
        tabela41.registros = itemArray44;
        tabela35.registros = itemArray44;
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        tabela35.registros = itemArray48;
        tabela31.registros = itemArray48;
        tabela27.registros = itemArray48;
        ds.Tabela tabela52 = new ds.Tabela();
        tabela52.n = 0;
        ds.Item item55 = null;
        tabela52.insere(item55);
        ds.Item[] itemArray57 = tabela52.registros;
        ds.Item[] itemArray58 = tabela52.registros;
        tabela27.registros = itemArray58;
        tabela27.n = (byte) 100;
        ds.Tabela tabela62 = new ds.Tabela();
        tabela62.n = 0;
        ds.Item item65 = null;
        tabela62.insere(item65);
        int int67 = tabela62.n;
        ds.Item[] itemArray68 = tabela62.registros;
        ds.Item[] itemArray69 = tabela62.registros;
        tabela27.registros = itemArray69;
        ds.Item[] itemArray71 = tabela27.registros;
        ds.Tabela tabela72 = new ds.Tabela();
        ds.Item[] itemArray73 = tabela72.registros;
        ds.Item item74 = null;
        tabela72.insere(item74);
        ds.Tabela tabela76 = new ds.Tabela();
        ds.Item item77 = null;
        int int78 = tabela76.binaria(item77);
        ds.Item[] itemArray79 = tabela76.registros;
        ds.Tabela tabela80 = new ds.Tabela();
        tabela80.n = 0;
        ds.Item[] itemArray83 = new ds.Item[] {};
        tabela80.registros = itemArray83;
        ds.Item[] itemArray85 = tabela80.registros;
        ds.Tabela tabela86 = new ds.Tabela();
        tabela86.n = 0;
        ds.Item[] itemArray89 = new ds.Item[] {};
        tabela86.registros = itemArray89;
        tabela80.registros = itemArray89;
        ds.Item item92 = null;
        ds.Item[] itemArray93 = new ds.Item[] { item92 };
        tabela80.registros = itemArray93;
        tabela76.registros = itemArray93;
        tabela72.registros = itemArray93;
        ds.Item[] itemArray97 = tabela72.registros;
        tabela27.registros = itemArray97;
        tabela0.registros = itemArray97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray83);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNotNull(itemArray89);
        org.junit.Assert.assertNotNull(itemArray93);
        org.junit.Assert.assertNotNull(itemArray97);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        tabela6.registros = itemArray15;
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela6.registros = itemArray19;
        tabela0.registros = itemArray19;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.pesquisa(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        java.lang.Class<?> wildcardClass19 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        tabela8.n = 1;
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = 0;
        ds.Item item16 = null;
        tabela13.insere(item16);
        int int18 = tabela13.n;
        ds.Item[] itemArray19 = tabela13.registros;
        ds.Item[] itemArray20 = tabela13.registros;
        tabela8.registros = itemArray20;
        tabela0.registros = itemArray20;
        int int23 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = 0;
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela3.registros = itemArray6;
        ds.Item[] itemArray8 = tabela3.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela9.registros = itemArray12;
        tabela3.registros = itemArray12;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela3.registros = itemArray16;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela3.registros = itemArray19;
        tabela0.registros = itemArray19;
        int int22 = tabela0.n;
        ds.Item item23 = null;
        tabela0.insere(item23);
        java.lang.Class<?> wildcardClass25 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        tabela0.n = 'a';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        tabela0.n = 0;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        tabela0.n = 0;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        tabela0.n = 'a';
        ds.Item[] itemArray12 = tabela0.registros;
        java.lang.Class<?> wildcardClass13 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        tabela0.n = (short) 0;
        ds.Item item23 = null;
        int int24 = tabela0.binaria(item23);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Item[] itemArray21 = tabela0.registros;
        int int22 = tabela0.n;
        ds.Tabela tabela23 = new ds.Tabela();
        tabela23.n = 0;
        int int26 = tabela23.n;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item[] itemArray28 = tabela27.registros;
        ds.Item item29 = null;
        tabela27.insere(item29);
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        int int33 = tabela31.binaria(item32);
        ds.Item[] itemArray34 = tabela31.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = 0;
        ds.Item[] itemArray38 = new ds.Item[] {};
        tabela35.registros = itemArray38;
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Tabela tabela41 = new ds.Tabela();
        tabela41.n = 0;
        ds.Item[] itemArray44 = new ds.Item[] {};
        tabela41.registros = itemArray44;
        tabela35.registros = itemArray44;
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        tabela35.registros = itemArray48;
        tabela31.registros = itemArray48;
        tabela27.registros = itemArray48;
        tabela23.registros = itemArray48;
        tabela0.registros = itemArray48;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        tabela0.registros = itemArray13;
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        int int5 = tabela3.binaria(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        tabela6.registros = itemArray15;
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela6.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        tabela6.registros = itemArray22;
        tabela3.registros = itemArray22;
        tabela0.registros = itemArray22;
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
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
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = 0;
        ds.Item[] itemArray23 = new ds.Item[] {};
        tabela20.registros = itemArray23;
        ds.Item[] itemArray25 = tabela20.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        tabela26.n = 0;
        ds.Item[] itemArray29 = new ds.Item[] {};
        tabela26.registros = itemArray29;
        tabela20.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Item item33 = null;
        int int34 = tabela0.binaria(item33);
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = 0;
        ds.Item item38 = null;
        tabela35.insere(item38);
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        tabela0.registros = itemArray41;
        tabela0.n = (byte) -1;
        ds.Item item45 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int46 = tabela0.binaria(item45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        tabela0.n = 0;
        ds.Item item21 = null;
        tabela0.insere(item21);
        ds.Item item23 = null;
        tabela0.insere(item23);
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tabela0.pesquisa(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        tabela0.n = 0;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item item10 = null;
        tabela0.insere(item10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        int int5 = tabela3.binaria(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        tabela6.registros = itemArray15;
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela6.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        tabela6.registros = itemArray22;
        tabela3.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item[] itemArray26 = tabela0.registros;
        ds.Tabela tabela27 = new ds.Tabela();
        tabela27.n = 0;
        int int30 = tabela27.n;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item[] itemArray32 = tabela31.registros;
        ds.Item item33 = null;
        tabela31.insere(item33);
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        int int37 = tabela35.binaria(item36);
        ds.Item[] itemArray38 = tabela35.registros;
        ds.Tabela tabela39 = new ds.Tabela();
        tabela39.n = 0;
        ds.Item[] itemArray42 = new ds.Item[] {};
        tabela39.registros = itemArray42;
        ds.Item[] itemArray44 = tabela39.registros;
        ds.Tabela tabela45 = new ds.Tabela();
        tabela45.n = 0;
        ds.Item[] itemArray48 = new ds.Item[] {};
        tabela45.registros = itemArray48;
        tabela39.registros = itemArray48;
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        tabela39.registros = itemArray52;
        tabela35.registros = itemArray52;
        tabela31.registros = itemArray52;
        tabela27.registros = itemArray52;
        ds.Tabela tabela57 = new ds.Tabela();
        tabela57.n = 0;
        ds.Item item60 = null;
        int int61 = tabela57.binaria(item60);
        tabela57.n = 0;
        ds.Item[] itemArray64 = tabela57.registros;
        tabela27.registros = itemArray64;
        int int66 = tabela27.n;
        ds.Item[] itemArray67 = tabela27.registros;
        tabela0.registros = itemArray67;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela22.registros = itemArray25;
        ds.Item[] itemArray27 = tabela22.registros;
        ds.Tabela tabela28 = new ds.Tabela();
        tabela28.n = 0;
        ds.Item[] itemArray31 = new ds.Item[] {};
        tabela28.registros = itemArray31;
        tabela22.registros = itemArray31;
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        tabela22.registros = itemArray35;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item[] itemArray38 = tabela37.registros;
        tabela22.registros = itemArray38;
        tabela0.registros = itemArray38;
        ds.Item[] itemArray41 = tabela0.registros;
        ds.Tabela tabela42 = new ds.Tabela();
        tabela42.n = 0;
        ds.Item[] itemArray45 = new ds.Item[] {};
        tabela42.registros = itemArray45;
        ds.Item[] itemArray47 = tabela42.registros;
        ds.Tabela tabela48 = new ds.Tabela();
        tabela48.n = 0;
        ds.Item[] itemArray51 = new ds.Item[] {};
        tabela48.registros = itemArray51;
        tabela42.registros = itemArray51;
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        tabela42.registros = itemArray55;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item[] itemArray58 = tabela57.registros;
        tabela42.registros = itemArray58;
        int int60 = tabela42.n;
        ds.Item item61 = null;
        int int62 = tabela42.binaria(item61);
        tabela42.n = (short) 0;
        ds.Item[] itemArray65 = tabela42.registros;
        tabela0.registros = itemArray65;
        java.lang.Class<?> wildcardClass67 = itemArray65.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = 0;
        ds.Item item8 = null;
        int int9 = tabela5.binaria(item8);
        tabela5.n = 0;
        ds.Item[] itemArray12 = tabela5.registros;
        tabela0.registros = itemArray12;
        tabela0.n = (-1);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        int int20 = tabela0.binaria(item19);
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela22.registros = itemArray25;
        ds.Item[] itemArray27 = tabela22.registros;
        ds.Tabela tabela28 = new ds.Tabela();
        tabela28.n = 0;
        ds.Item[] itemArray31 = new ds.Item[] {};
        tabela28.registros = itemArray31;
        tabela22.registros = itemArray31;
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        tabela22.registros = itemArray35;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item[] itemArray38 = tabela37.registros;
        tabela22.registros = itemArray38;
        tabela0.registros = itemArray38;
        ds.Item[] itemArray41 = tabela0.registros;
        tabela0.n = (byte) 10;
        tabela0.n = 10;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        tabela0.insere(item18);
        int int20 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = 0;
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela3.registros = itemArray6;
        ds.Item[] itemArray8 = tabela3.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela9.registros = itemArray12;
        tabela3.registros = itemArray12;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela3.registros = itemArray16;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela3.registros = itemArray19;
        tabela0.registros = itemArray19;
        int int22 = tabela0.n;
        ds.Item item23 = null;
        int int24 = tabela0.binaria(item23);
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item item28 = null;
        int int29 = tabela25.binaria(item28);
        ds.Item item30 = null;
        int int31 = tabela25.binaria(item30);
        ds.Item item32 = null;
        tabela25.insere(item32);
        ds.Tabela tabela34 = new ds.Tabela();
        tabela34.n = 0;
        int int37 = tabela34.n;
        ds.Item[] itemArray38 = tabela34.registros;
        tabela25.registros = itemArray38;
        int int40 = tabela25.n;
        ds.Item[] itemArray41 = tabela25.registros;
        ds.Tabela tabela42 = new ds.Tabela();
        ds.Item[] itemArray43 = tabela42.registros;
        ds.Item[] itemArray44 = tabela42.registros;
        tabela25.registros = itemArray44;
        tabela0.registros = itemArray44;
        tabela0.n = 1;
        int int49 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        tabela0.n = 100;
        int int17 = tabela0.n;
        tabela0.n = (byte) -1;
        int int20 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        int int10 = tabela7.n;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item[] itemArray12 = tabela11.registros;
        ds.Item item13 = null;
        tabela11.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item[] itemArray18 = tabela15.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        ds.Item[] itemArray24 = tabela19.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        tabela19.registros = itemArray28;
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        tabela19.registros = itemArray32;
        tabela15.registros = itemArray32;
        tabela11.registros = itemArray32;
        tabela7.registros = itemArray32;
        tabela0.registros = itemArray32;
        ds.Item item38 = null;
        int int39 = tabela0.binaria(item38);
        ds.Item item40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = tabela0.pesquisa(item40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = 0;
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela3.registros = itemArray6;
        ds.Item[] itemArray8 = tabela3.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela9.registros = itemArray12;
        tabela3.registros = itemArray12;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela3.registros = itemArray16;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela3.registros = itemArray19;
        tabela0.registros = itemArray19;
        int int22 = tabela0.n;
        ds.Item item23 = null;
        int int24 = tabela0.binaria(item23);
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item item28 = null;
        int int29 = tabela25.binaria(item28);
        ds.Item item30 = null;
        int int31 = tabela25.binaria(item30);
        ds.Item item32 = null;
        tabela25.insere(item32);
        ds.Tabela tabela34 = new ds.Tabela();
        tabela34.n = 0;
        int int37 = tabela34.n;
        ds.Item[] itemArray38 = tabela34.registros;
        tabela25.registros = itemArray38;
        int int40 = tabela25.n;
        ds.Item[] itemArray41 = tabela25.registros;
        ds.Tabela tabela42 = new ds.Tabela();
        ds.Item[] itemArray43 = tabela42.registros;
        ds.Item[] itemArray44 = tabela42.registros;
        tabela25.registros = itemArray44;
        tabela0.registros = itemArray44;
        ds.Item item47 = null;
        int int48 = tabela0.binaria(item47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela16.registros = itemArray19;
        ds.Item[] itemArray21 = tabela16.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela22.registros = itemArray25;
        tabela16.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Item[] itemArray29 = tabela0.registros;
        tabela0.n = 1;
        ds.Item[] itemArray32 = tabela0.registros;
        tabela0.n = (byte) 10;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        tabela0.insere(item4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        ds.Tabela tabela20 = new ds.Tabela();
        tabela20.n = 0;
        ds.Item[] itemArray23 = new ds.Item[] {};
        tabela20.registros = itemArray23;
        ds.Item[] itemArray25 = tabela20.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        tabela26.n = 0;
        ds.Item[] itemArray29 = new ds.Item[] {};
        tabela26.registros = itemArray29;
        tabela20.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Item item33 = null;
        int int34 = tabela0.binaria(item33);
        ds.Tabela tabela35 = new ds.Tabela();
        tabela35.n = 0;
        ds.Item item38 = null;
        tabela35.insere(item38);
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        tabela0.registros = itemArray41;
        int int43 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = 0;
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela3.registros = itemArray6;
        ds.Item[] itemArray8 = tabela3.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela9.registros = itemArray12;
        tabela3.registros = itemArray12;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela3.registros = itemArray16;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela3.registros = itemArray19;
        tabela0.registros = itemArray19;
        int int22 = tabela0.n;
        ds.Item item23 = null;
        tabela0.insere(item23);
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item[] itemArray26 = tabela25.registros;
        ds.Item item27 = null;
        tabela25.insere(item27);
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        int int31 = tabela29.binaria(item30);
        ds.Item[] itemArray32 = tabela29.registros;
        ds.Tabela tabela33 = new ds.Tabela();
        tabela33.n = 0;
        ds.Item[] itemArray36 = new ds.Item[] {};
        tabela33.registros = itemArray36;
        ds.Item[] itemArray38 = tabela33.registros;
        ds.Tabela tabela39 = new ds.Tabela();
        tabela39.n = 0;
        ds.Item[] itemArray42 = new ds.Item[] {};
        tabela39.registros = itemArray42;
        tabela33.registros = itemArray42;
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        tabela33.registros = itemArray46;
        tabela29.registros = itemArray46;
        tabela25.registros = itemArray46;
        ds.Item[] itemArray50 = tabela25.registros;
        tabela0.registros = itemArray50;
        ds.Item item52 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int53 = tabela0.pesquisa(item52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = 0;
        ds.Item[] itemArray18 = new ds.Item[] {};
        tabela15.registros = itemArray18;
        ds.Item[] itemArray20 = tabela15.registros;
        ds.Tabela tabela21 = new ds.Tabela();
        tabela21.n = 0;
        ds.Item[] itemArray24 = new ds.Item[] {};
        tabela21.registros = itemArray24;
        tabela15.registros = itemArray24;
        int int27 = tabela15.n;
        tabela15.n = ' ';
        ds.Item[] itemArray30 = tabela15.registros;
        tabela0.registros = itemArray30;
        int int32 = tabela0.n;
        tabela0.n = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item item3 = null;
        tabela0.insere(item3);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        tabela0.n = 1;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        tabela0.n = (short) 100;
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Item item22 = null;
        tabela19.insere(item22);
        ds.Tabela tabela24 = new ds.Tabela();
        tabela24.n = 0;
        ds.Item item27 = null;
        int int28 = tabela24.binaria(item27);
        tabela24.n = 0;
        ds.Item[] itemArray31 = tabela24.registros;
        tabela19.registros = itemArray31;
        tabela19.n = (-1);
        ds.Item[] itemArray35 = tabela19.registros;
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        int int38 = tabela36.binaria(item37);
        ds.Tabela tabela39 = new ds.Tabela();
        tabela39.n = 0;
        ds.Item[] itemArray42 = new ds.Item[] {};
        tabela39.registros = itemArray42;
        ds.Item[] itemArray44 = tabela39.registros;
        ds.Tabela tabela45 = new ds.Tabela();
        tabela45.n = 0;
        ds.Item[] itemArray48 = new ds.Item[] {};
        tabela45.registros = itemArray48;
        tabela39.registros = itemArray48;
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        tabela39.registros = itemArray52;
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item[] itemArray55 = tabela54.registros;
        tabela39.registros = itemArray55;
        tabela36.registros = itemArray55;
        int int58 = tabela36.n;
        ds.Item item59 = null;
        tabela36.insere(item59);
        ds.Tabela tabela61 = new ds.Tabela();
        ds.Item[] itemArray62 = tabela61.registros;
        ds.Item item63 = null;
        tabela61.insere(item63);
        ds.Tabela tabela65 = new ds.Tabela();
        ds.Item item66 = null;
        int int67 = tabela65.binaria(item66);
        ds.Item[] itemArray68 = tabela65.registros;
        ds.Tabela tabela69 = new ds.Tabela();
        tabela69.n = 0;
        ds.Item[] itemArray72 = new ds.Item[] {};
        tabela69.registros = itemArray72;
        ds.Item[] itemArray74 = tabela69.registros;
        ds.Tabela tabela75 = new ds.Tabela();
        tabela75.n = 0;
        ds.Item[] itemArray78 = new ds.Item[] {};
        tabela75.registros = itemArray78;
        tabela69.registros = itemArray78;
        ds.Item item81 = null;
        ds.Item[] itemArray82 = new ds.Item[] { item81 };
        tabela69.registros = itemArray82;
        tabela65.registros = itemArray82;
        tabela61.registros = itemArray82;
        ds.Item[] itemArray86 = tabela61.registros;
        tabela36.registros = itemArray86;
        tabela19.registros = itemArray86;
        tabela0.registros = itemArray86;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNotNull(itemArray86);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        tabela5.n = 0;
        ds.Item item8 = null;
        int int9 = tabela5.binaria(item8);
        tabela5.n = 0;
        ds.Item[] itemArray12 = tabela5.registros;
        tabela0.registros = itemArray12;
        int int14 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = 0;
        ds.Item[] itemArray7 = new ds.Item[] {};
        tabela4.registros = itemArray7;
        ds.Item[] itemArray9 = tabela4.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = 0;
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela10.registros = itemArray13;
        tabela4.registros = itemArray13;
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela4.registros = itemArray17;
        tabela0.registros = itemArray17;
        ds.Item[] itemArray20 = tabela0.registros;
        java.lang.Class<?> wildcardClass21 = itemArray20.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tabela0.binaria(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        ds.Item[] itemArray20 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item[] itemArray4 = tabela0.registros;
        java.lang.Class<?> wildcardClass5 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        tabela0.registros = itemArray22;
        int int25 = tabela0.n;
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        tabela0.registros = itemArray13;
        int int15 = tabela0.n;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item[] itemArray17 = tabela0.registros;
        tabela0.n = (short) 100;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        tabela0.n = ' ';
        ds.Item[] itemArray15 = tabela0.registros;
        int int16 = tabela0.n;
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = 0;
        ds.Item item21 = null;
        int int22 = tabela18.binaria(item21);
        ds.Item item23 = null;
        int int24 = tabela18.binaria(item23);
        ds.Item item25 = null;
        tabela18.insere(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        tabela27.n = 0;
        int int30 = tabela27.n;
        ds.Item[] itemArray31 = tabela27.registros;
        tabela18.registros = itemArray31;
        int int33 = tabela18.n;
        ds.Item[] itemArray34 = tabela18.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item[] itemArray36 = tabela35.registros;
        ds.Item[] itemArray37 = tabela35.registros;
        tabela18.registros = itemArray37;
        tabela0.registros = itemArray37;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item[] itemArray4 = tabela0.registros;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = 0;
        ds.Item[] itemArray7 = new ds.Item[] {};
        tabela4.registros = itemArray7;
        ds.Item[] itemArray9 = tabela4.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = 0;
        ds.Item[] itemArray13 = new ds.Item[] {};
        tabela10.registros = itemArray13;
        tabela4.registros = itemArray13;
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela4.registros = itemArray17;
        tabela0.registros = itemArray17;
        ds.Item[] itemArray20 = tabela0.registros;
        ds.Item[] itemArray21 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        ds.Item item6 = null;
        tabela4.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        int int10 = tabela8.binaria(item9);
        ds.Item[] itemArray11 = tabela8.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item[] itemArray15 = new ds.Item[] {};
        tabela12.registros = itemArray15;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        tabela18.n = 0;
        ds.Item[] itemArray21 = new ds.Item[] {};
        tabela18.registros = itemArray21;
        tabela12.registros = itemArray21;
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela12.registros = itemArray25;
        tabela8.registros = itemArray25;
        tabela4.registros = itemArray25;
        tabela0.registros = itemArray25;
        ds.Item[] itemArray30 = tabela0.registros;
        ds.Item[] itemArray31 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (byte) -1;
        tabela0.n = (short) -1;
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Item item22 = null;
        tabela19.insere(item22);
        int int24 = tabela19.n;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Item[] itemArray31 = tabela25.registros;
        tabela19.registros = itemArray31;
        tabela0.registros = itemArray31;
        int int34 = tabela0.n;
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = tabela0.binaria(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela16.registros = itemArray19;
        ds.Item[] itemArray21 = tabela16.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela22.registros = itemArray25;
        tabela16.registros = itemArray25;
        tabela0.registros = itemArray25;
        int int29 = tabela0.n;
        ds.Tabela tabela30 = new ds.Tabela();
        tabela30.n = 0;
        ds.Item[] itemArray33 = new ds.Item[] {};
        tabela30.registros = itemArray33;
        ds.Item[] itemArray35 = tabela30.registros;
        ds.Tabela tabela36 = new ds.Tabela();
        tabela36.n = 0;
        ds.Item[] itemArray39 = new ds.Item[] {};
        tabela36.registros = itemArray39;
        tabela30.registros = itemArray39;
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        tabela30.registros = itemArray43;
        ds.Tabela tabela45 = new ds.Tabela();
        ds.Item[] itemArray46 = tabela45.registros;
        tabela30.registros = itemArray46;
        ds.Item item48 = null;
        int int49 = tabela30.binaria(item48);
        ds.Tabela tabela50 = new ds.Tabela();
        tabela50.n = 0;
        ds.Item[] itemArray53 = new ds.Item[] {};
        tabela50.registros = itemArray53;
        ds.Item[] itemArray55 = tabela50.registros;
        ds.Tabela tabela56 = new ds.Tabela();
        tabela56.n = 0;
        ds.Item[] itemArray59 = new ds.Item[] {};
        tabela56.registros = itemArray59;
        tabela50.registros = itemArray59;
        tabela30.registros = itemArray59;
        ds.Item[] itemArray63 = tabela30.registros;
        tabela0.registros = itemArray63;
        ds.Item[] itemArray65 = tabela0.registros;
        ds.Item[] itemArray66 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (short) 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        tabela0.n = (short) 100;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.pesquisa(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item item19 = null;
        tabela17.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = 0;
        ds.Item[] itemArray34 = new ds.Item[] {};
        tabela31.registros = itemArray34;
        tabela25.registros = itemArray34;
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela25.registros = itemArray38;
        tabela21.registros = itemArray38;
        tabela17.registros = itemArray38;
        tabela0.registros = itemArray38;
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item item44 = null;
        int int45 = tabela43.binaria(item44);
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        int int48 = tabela46.binaria(item47);
        ds.Tabela tabela49 = new ds.Tabela();
        tabela49.n = 0;
        ds.Item[] itemArray52 = new ds.Item[] {};
        tabela49.registros = itemArray52;
        ds.Item[] itemArray54 = tabela49.registros;
        ds.Tabela tabela55 = new ds.Tabela();
        tabela55.n = 0;
        ds.Item[] itemArray58 = new ds.Item[] {};
        tabela55.registros = itemArray58;
        tabela49.registros = itemArray58;
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        tabela49.registros = itemArray62;
        ds.Tabela tabela64 = new ds.Tabela();
        ds.Item[] itemArray65 = tabela64.registros;
        tabela49.registros = itemArray65;
        tabela46.registros = itemArray65;
        tabela43.registros = itemArray65;
        ds.Item item69 = null;
        tabela43.insere(item69);
        ds.Item[] itemArray71 = tabela43.registros;
        tabela0.registros = itemArray71;
        tabela0.n = 100;
        int int75 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela16.registros = itemArray19;
        ds.Item[] itemArray21 = tabela16.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela22.registros = itemArray25;
        tabela16.registros = itemArray25;
        tabela0.registros = itemArray25;
        int int29 = tabela0.n;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item[] itemArray31 = tabela30.registros;
        ds.Item item32 = null;
        tabela30.insere(item32);
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        int int36 = tabela34.binaria(item35);
        ds.Item[] itemArray37 = tabela34.registros;
        ds.Tabela tabela38 = new ds.Tabela();
        tabela38.n = 0;
        ds.Item[] itemArray41 = new ds.Item[] {};
        tabela38.registros = itemArray41;
        ds.Item[] itemArray43 = tabela38.registros;
        ds.Tabela tabela44 = new ds.Tabela();
        tabela44.n = 0;
        ds.Item[] itemArray47 = new ds.Item[] {};
        tabela44.registros = itemArray47;
        tabela38.registros = itemArray47;
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        tabela38.registros = itemArray51;
        tabela34.registros = itemArray51;
        tabela30.registros = itemArray51;
        ds.Tabela tabela55 = new ds.Tabela();
        tabela55.n = 0;
        ds.Item item58 = null;
        tabela55.insere(item58);
        ds.Item[] itemArray60 = tabela55.registros;
        ds.Item[] itemArray61 = tabela55.registros;
        tabela30.registros = itemArray61;
        tabela0.registros = itemArray61;
        ds.Item[] itemArray64 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item item19 = null;
        tabela17.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        int int23 = tabela21.binaria(item22);
        ds.Item[] itemArray24 = tabela21.registros;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item[] itemArray28 = new ds.Item[] {};
        tabela25.registros = itemArray28;
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = 0;
        ds.Item[] itemArray34 = new ds.Item[] {};
        tabela31.registros = itemArray34;
        tabela25.registros = itemArray34;
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela25.registros = itemArray38;
        tabela21.registros = itemArray38;
        tabela17.registros = itemArray38;
        tabela0.registros = itemArray38;
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item item44 = null;
        int int45 = tabela43.binaria(item44);
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        int int48 = tabela46.binaria(item47);
        ds.Tabela tabela49 = new ds.Tabela();
        tabela49.n = 0;
        ds.Item[] itemArray52 = new ds.Item[] {};
        tabela49.registros = itemArray52;
        ds.Item[] itemArray54 = tabela49.registros;
        ds.Tabela tabela55 = new ds.Tabela();
        tabela55.n = 0;
        ds.Item[] itemArray58 = new ds.Item[] {};
        tabela55.registros = itemArray58;
        tabela49.registros = itemArray58;
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        tabela49.registros = itemArray62;
        ds.Tabela tabela64 = new ds.Tabela();
        ds.Item[] itemArray65 = tabela64.registros;
        tabela49.registros = itemArray65;
        tabela46.registros = itemArray65;
        tabela43.registros = itemArray65;
        ds.Item item69 = null;
        tabela43.insere(item69);
        ds.Item[] itemArray71 = tabela43.registros;
        tabela0.registros = itemArray71;
        ds.Tabela tabela73 = new ds.Tabela();
        tabela73.n = 0;
        ds.Item[] itemArray76 = new ds.Item[] {};
        tabela73.registros = itemArray76;
        ds.Item[] itemArray78 = tabela73.registros;
        ds.Tabela tabela79 = new ds.Tabela();
        tabela79.n = 0;
        ds.Item[] itemArray82 = new ds.Item[] {};
        tabela79.registros = itemArray82;
        tabela73.registros = itemArray82;
        int int85 = tabela73.n;
        ds.Item[] itemArray86 = tabela73.registros;
        tabela73.n = (byte) -1;
        ds.Item[] itemArray89 = tabela73.registros;
        ds.Item[] itemArray90 = tabela73.registros;
        tabela0.registros = itemArray90;
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(itemArray86);
        org.junit.Assert.assertNotNull(itemArray89);
        org.junit.Assert.assertNotNull(itemArray90);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = (-1);
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item item17 = null;
        int int18 = tabela14.binaria(item17);
        tabela14.n = 0;
        ds.Item[] itemArray21 = tabela14.registros;
        tabela9.registros = itemArray21;
        tabela0.registros = itemArray21;
        tabela0.n = 'a';
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Tabela tabela3 = new ds.Tabela();
        tabela3.n = 0;
        ds.Item[] itemArray6 = new ds.Item[] {};
        tabela3.registros = itemArray6;
        ds.Item[] itemArray8 = tabela3.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela9.registros = itemArray12;
        tabela3.registros = itemArray12;
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela3.registros = itemArray16;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela3.registros = itemArray19;
        tabela0.registros = itemArray19;
        int int22 = tabela0.n;
        ds.Item item23 = null;
        int int24 = tabela0.binaria(item23);
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item item28 = null;
        int int29 = tabela25.binaria(item28);
        ds.Item item30 = null;
        int int31 = tabela25.binaria(item30);
        ds.Item item32 = null;
        tabela25.insere(item32);
        ds.Tabela tabela34 = new ds.Tabela();
        tabela34.n = 0;
        int int37 = tabela34.n;
        ds.Item[] itemArray38 = tabela34.registros;
        tabela25.registros = itemArray38;
        int int40 = tabela25.n;
        ds.Item[] itemArray41 = tabela25.registros;
        ds.Tabela tabela42 = new ds.Tabela();
        ds.Item[] itemArray43 = tabela42.registros;
        ds.Item[] itemArray44 = tabela42.registros;
        tabela25.registros = itemArray44;
        tabela0.registros = itemArray44;
        java.lang.Class<?> wildcardClass47 = itemArray44.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item[] itemArray25 = tabela0.registros;
        tabela0.n = (short) 10;
        int int28 = tabela0.n;
        int int29 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Item[] itemArray9 = new ds.Item[] {};
        tabela6.registros = itemArray9;
        tabela0.registros = itemArray9;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) 10;
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item[] itemArray19 = new ds.Item[] {};
        tabela16.registros = itemArray19;
        ds.Item[] itemArray21 = tabela16.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela22.registros = itemArray25;
        tabela16.registros = itemArray25;
        tabela0.registros = itemArray25;
        int int29 = tabela0.n;
        ds.Tabela tabela30 = new ds.Tabela();
        tabela30.n = 0;
        ds.Item[] itemArray33 = new ds.Item[] {};
        tabela30.registros = itemArray33;
        ds.Item[] itemArray35 = tabela30.registros;
        ds.Tabela tabela36 = new ds.Tabela();
        tabela36.n = 0;
        ds.Item[] itemArray39 = new ds.Item[] {};
        tabela36.registros = itemArray39;
        tabela30.registros = itemArray39;
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        tabela30.registros = itemArray43;
        ds.Tabela tabela45 = new ds.Tabela();
        ds.Item[] itemArray46 = tabela45.registros;
        tabela30.registros = itemArray46;
        ds.Item item48 = null;
        int int49 = tabela30.binaria(item48);
        ds.Tabela tabela50 = new ds.Tabela();
        tabela50.n = 0;
        ds.Item[] itemArray53 = new ds.Item[] {};
        tabela50.registros = itemArray53;
        ds.Item[] itemArray55 = tabela50.registros;
        ds.Tabela tabela56 = new ds.Tabela();
        tabela56.n = 0;
        ds.Item[] itemArray59 = new ds.Item[] {};
        tabela56.registros = itemArray59;
        tabela50.registros = itemArray59;
        tabela30.registros = itemArray59;
        ds.Item[] itemArray63 = tabela30.registros;
        tabela0.registros = itemArray63;
        ds.Item item65 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int66 = tabela0.binaria(item65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray63);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        int int6 = tabela4.binaria(item5);
        ds.Item[] itemArray7 = tabela4.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        tabela8.n = 0;
        ds.Item[] itemArray11 = new ds.Item[] {};
        tabela8.registros = itemArray11;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela14.registros = itemArray17;
        tabela8.registros = itemArray17;
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        tabela8.registros = itemArray21;
        tabela4.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Item item28 = null;
        tabela25.insere(item28);
        ds.Item[] itemArray30 = tabela25.registros;
        ds.Item[] itemArray31 = tabela25.registros;
        tabela0.registros = itemArray31;
        tabela0.n = (byte) -1;
        int int35 = tabela0.n;
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = tabela0.pesquisa(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }
}

