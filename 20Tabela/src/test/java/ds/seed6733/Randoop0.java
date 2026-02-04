package ds.seed6733;

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
        ds.Item[] itemArray1 = tabela0.registros;
        java.lang.Class<?> wildcardClass2 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = tabela0.pesquisa(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tabela0.pesquisa(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item[] itemArray4 = new ds.Item[] {};
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = tabela0.binaria(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.binaria(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        java.lang.Class<?> wildcardClass4 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela7.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 'a';
        java.lang.Class<?> wildcardClass3 = tabela0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela7.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.binaria(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item[] itemArray4 = new ds.Item[] {};
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = null;
        tabela0.registros = itemArray7;
        java.lang.Class<?> wildcardClass9 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = (byte) 1;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Tabela tabela2 = new ds.Tabela();
        ds.Item[] itemArray3 = tabela2.registros;
        ds.Item item4 = null;
        tabela2.insere(item4);
        tabela2.n = 10;
        int int8 = tabela2.n;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item[] itemArray13 = tabela12.registros;
        tabela9.registros = itemArray13;
        tabela2.registros = itemArray13;
        ds.Item[] itemArray16 = tabela2.registros;
        tabela0.registros = itemArray16;
        java.lang.Class<?> wildcardClass18 = itemArray16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = tabela0.pesquisa(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        ds.Item item8 = null;
        tabela6.insere(item8);
        tabela6.n = 10;
        int int12 = tabela6.n;
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = 0;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        tabela13.registros = itemArray17;
        tabela6.registros = itemArray17;
        tabela0.registros = itemArray17;
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.binaria(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 'a';
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        tabela0.n = '4';
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
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
        java.lang.Class<?> wildcardClass30 = itemArray25.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = tabela0.pesquisa(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = null;
        tabela0.registros = itemArray7;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        java.lang.Class<?> wildcardClass7 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
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
        ds.Item[] itemArray30 = tabela0.registros;
        java.lang.Class<?> wildcardClass31 = itemArray30.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = null;
        tabela0.registros = itemArray7;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
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
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
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
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
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
        java.lang.Class<?> wildcardClass21 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        int int6 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        java.lang.Class<?> wildcardClass9 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = ' ';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        ds.Item item8 = null;
        tabela6.insere(item8);
        tabela6.n = 10;
        int int12 = tabela6.n;
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = 0;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        tabela13.registros = itemArray17;
        tabela6.registros = itemArray17;
        tabela0.registros = itemArray17;
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.pesquisa(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        int int6 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.binaria(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = ' ';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        ds.Item item8 = null;
        tabela6.insere(item8);
        tabela6.n = 10;
        int int12 = tabela6.n;
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = 0;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        tabela13.registros = itemArray17;
        tabela6.registros = itemArray17;
        tabela0.registros = itemArray17;
        java.lang.Class<?> wildcardClass21 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 1;
        java.lang.Class<?> wildcardClass4 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
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
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = tabela0.binaria(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        tabela0.insere(item2);
        java.lang.Class<?> wildcardClass4 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        tabela8.insere(item10);
        tabela8.n = 10;
        int int14 = tabela8.n;
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = 0;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela15.registros = itemArray19;
        tabela8.registros = itemArray19;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela6.registros = itemArray22;
        tabela0.registros = itemArray22;
        java.lang.Class<?> wildcardClass25 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = ' ';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        ds.Item item8 = null;
        tabela6.insere(item8);
        tabela6.n = 10;
        int int12 = tabela6.n;
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = 0;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        tabela13.registros = itemArray17;
        tabela6.registros = itemArray17;
        tabela0.registros = itemArray17;
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.binaria(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 1;
        ds.Item[] itemArray4 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (short) 100;
        ds.Item[] itemArray9 = tabela0.registros;
        int int10 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
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
        java.lang.Class<?> wildcardClass21 = itemArray19.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = tabela0.binaria(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Tabela tabela0 = new ds.Tabela();
        java.lang.Class<?> wildcardClass1 = tabela0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        tabela0.n = (short) 100;
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tabela0.binaria(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        tabela6.registros = itemArray10;
        ds.Item item12 = null;
        int int13 = tabela6.binaria(item12);
        ds.Item[] itemArray14 = tabela6.registros;
        int int15 = tabela6.n;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        ds.Item item18 = null;
        tabela16.insere(item18);
        tabela16.n = 10;
        ds.Item[] itemArray22 = tabela16.registros;
        tabela6.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tabela0.binaria(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        java.lang.Class<?> wildcardClass13 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        tabela0.n = (byte) 100;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
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
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        java.lang.Class<?> wildcardClass3 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        java.lang.Class<?> wildcardClass9 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = ' ';
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        tabela0.n = (byte) 100;
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        int int6 = tabela0.n;
        java.lang.Class<?> wildcardClass7 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
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
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        int int8 = tabela0.n;
        java.lang.Class<?> wildcardClass9 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        ds.Item item8 = null;
        tabela6.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela6.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.binaria(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        java.lang.Class<?> wildcardClass6 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        tabela0.n = (short) 100;
        java.lang.Class<?> wildcardClass5 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        tabela6.registros = itemArray10;
        ds.Item item12 = null;
        int int13 = tabela6.binaria(item12);
        ds.Item[] itemArray14 = tabela6.registros;
        int int15 = tabela6.n;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        ds.Item item18 = null;
        tabela16.insere(item18);
        tabela16.n = 10;
        ds.Item[] itemArray22 = tabela16.registros;
        tabela6.registros = itemArray22;
        tabela0.registros = itemArray22;
        java.lang.Class<?> wildcardClass25 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        java.lang.Class<?> wildcardClass7 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        tabela0.n = (short) 1;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.pesquisa(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.binaria(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
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
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = '#';
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        int int8 = tabela0.n;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.binaria(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = null;
        tabela0.registros = itemArray7;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        tabela9.insere(item11);
        tabela9.n = 10;
        ds.Item[] itemArray15 = tabela9.registros;
        tabela0.registros = itemArray15;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.pesquisa(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item[] itemArray10 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
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
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        tabela0.n = (short) 1;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        tabela0.n = (short) 1;
        tabela0.n = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        tabela0.n = (byte) -1;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.binaria(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        tabela0.n = '4';
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
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
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
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
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
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
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = null;
        tabela0.registros = itemArray7;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        tabela9.insere(item11);
        tabela9.n = 10;
        ds.Item[] itemArray15 = tabela9.registros;
        tabela0.registros = itemArray15;
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
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (byte) 0;
        tabela0.n = (short) 10;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        tabela10.insere(item12);
        tabela10.n = 10;
        ds.Item[] itemArray16 = tabela10.registros;
        tabela0.registros = itemArray16;
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
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
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
        ds.Item[] itemArray30 = tabela0.registros;
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = tabela0.pesquisa(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela7.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        ds.Item item18 = null;
        tabela16.insere(item18);
        tabela16.n = 0;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item[] itemArray24 = tabela23.registros;
        ds.Item item25 = null;
        int int26 = tabela23.binaria(item25);
        ds.Item[] itemArray27 = new ds.Item[] {};
        tabela23.registros = itemArray27;
        tabela16.registros = itemArray27;
        tabela16.n = '4';
        ds.Tabela tabela32 = new ds.Tabela();
        tabela32.n = 0;
        ds.Item item35 = null;
        tabela32.insere(item35);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela32.registros = itemArray38;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item[] itemArray41 = tabela40.registros;
        ds.Item item42 = null;
        int int43 = tabela40.binaria(item42);
        ds.Item item44 = null;
        tabela40.insere(item44);
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item[] itemArray47 = tabela46.registros;
        ds.Item item48 = null;
        tabela46.insere(item48);
        tabela46.n = 10;
        int int52 = tabela46.n;
        ds.Tabela tabela53 = new ds.Tabela();
        tabela53.n = 0;
        ds.Tabela tabela56 = new ds.Tabela();
        ds.Item[] itemArray57 = tabela56.registros;
        tabela53.registros = itemArray57;
        tabela46.registros = itemArray57;
        tabela40.registros = itemArray57;
        tabela32.registros = itemArray57;
        ds.Item[] itemArray62 = tabela32.registros;
        tabela16.registros = itemArray62;
        tabela0.registros = itemArray62;
        tabela0.n = 35;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
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
        java.lang.Class<?> wildcardClass21 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (short) 100;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        tabela10.insere(item12);
        tabela10.n = 10;
        ds.Item[] itemArray16 = tabela10.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item[] itemArray21 = tabela20.registros;
        ds.Item item22 = null;
        tabela20.insere(item22);
        tabela20.n = 0;
        int int26 = tabela20.n;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item[] itemArray28 = tabela27.registros;
        ds.Item item29 = null;
        int int30 = tabela27.binaria(item29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        tabela27.registros = itemArray31;
        tabela20.registros = itemArray31;
        tabela0.registros = itemArray31;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
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
        // The following exception was thrown during execution in test generation
        try {
            int int27 = tabela0.pesquisa(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        ds.Item item7 = null;
        int int8 = tabela5.binaria(item7);
        ds.Item item9 = null;
        tabela5.insere(item9);
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
        tabela5.registros = itemArray22;
        tabela0.registros = itemArray22;
        int int27 = tabela0.n;
        java.lang.Class<?> wildcardClass28 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        tabela0.n = '4';
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela7.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item[] itemArray15 = tabela0.registros;
        int int16 = tabela0.n;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = ' ';
        java.lang.Class<?> wildcardClass6 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        tabela0.n = (short) 1;
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = null;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        int int10 = tabela0.n;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        int int6 = tabela0.n;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        int int11 = tabela8.binaria(item10);
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela8.registros = itemArray12;
        tabela0.registros = itemArray12;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
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
        tabela0.n = '4';
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        tabela16.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        ds.Item item26 = null;
        int int27 = tabela24.binaria(item26);
        ds.Item item28 = null;
        tabela24.insere(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item[] itemArray31 = tabela30.registros;
        ds.Item item32 = null;
        tabela30.insere(item32);
        tabela30.n = 10;
        int int36 = tabela30.n;
        ds.Tabela tabela37 = new ds.Tabela();
        tabela37.n = 0;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item[] itemArray41 = tabela40.registros;
        tabela37.registros = itemArray41;
        tabela30.registros = itemArray41;
        tabela24.registros = itemArray41;
        tabela16.registros = itemArray41;
        ds.Item[] itemArray46 = tabela16.registros;
        tabela0.registros = itemArray46;
        ds.Item[] itemArray48 = tabela0.registros;
        java.lang.Class<?> wildcardClass49 = itemArray48.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        int int6 = tabela0.n;
        tabela0.n = (byte) 100;
        tabela0.n = 100;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        tabela0.n = (short) 100;
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tabela0.pesquisa(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
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
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 'a';
        tabela0.n = (byte) 10;
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
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
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
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
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
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = 10;
        tabela0.n = 35;
        tabela0.n = 'a';
        java.lang.Class<?> wildcardClass15 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        java.lang.Class<?> wildcardClass13 = itemArray12.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        tabela0.insere(item8);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        ds.Item[] itemArray8 = tabela0.registros;
        java.lang.Class<?> wildcardClass9 = itemArray8.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
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
        ds.Tabela tabela21 = new ds.Tabela();
        tabela21.n = 0;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        tabela21.registros = itemArray25;
        ds.Item item27 = null;
        int int28 = tabela21.binaria(item27);
        ds.Item[] itemArray29 = tabela21.registros;
        int int30 = tabela21.n;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item[] itemArray32 = tabela31.registros;
        ds.Item item33 = null;
        tabela31.insere(item33);
        tabela31.n = 10;
        ds.Item[] itemArray37 = tabela31.registros;
        tabela21.registros = itemArray37;
        tabela0.registros = itemArray37;
        ds.Item item40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = tabela0.pesquisa(item40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        ds.Item item8 = null;
        tabela6.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela6.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 'a';
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = tabela0.binaria(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = null;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(itemArray10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        java.lang.Class<?> wildcardClass8 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
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
        tabela0.n = '4';
        java.lang.Class<?> wildcardClass23 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
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
        java.lang.Class<?> wildcardClass11 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        int int8 = tabela0.n;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 1;
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
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.binaria(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item[] itemArray14 = tabela13.registros;
        ds.Item item15 = null;
        tabela13.insere(item15);
        int int17 = tabela13.n;
        ds.Item item18 = null;
        tabela13.insere(item18);
        ds.Item[] itemArray20 = tabela13.registros;
        tabela0.registros = itemArray20;
        int int22 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        int int12 = tabela9.binaria(item11);
        int int13 = tabela9.n;
        tabela9.n = (short) -1;
        ds.Item item16 = null;
        tabela9.insere(item16);
        int int18 = tabela9.n;
        ds.Item[] itemArray19 = tabela9.registros;
        tabela0.registros = itemArray19;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = tabela0.binaria(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
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
        tabela0.n = (byte) 10;
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = tabela0.binaria(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = ' ';
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.binaria(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 'a';
        tabela0.n = '#';
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tabela0.binaria(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        tabela0.n = 0;
        tabela0.n = 2;
        java.lang.Class<?> wildcardClass11 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
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
        tabela0.n = '4';
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        tabela16.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        ds.Item item26 = null;
        int int27 = tabela24.binaria(item26);
        ds.Item item28 = null;
        tabela24.insere(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item[] itemArray31 = tabela30.registros;
        ds.Item item32 = null;
        tabela30.insere(item32);
        tabela30.n = 10;
        int int36 = tabela30.n;
        ds.Tabela tabela37 = new ds.Tabela();
        tabela37.n = 0;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item[] itemArray41 = tabela40.registros;
        tabela37.registros = itemArray41;
        tabela30.registros = itemArray41;
        tabela24.registros = itemArray41;
        tabela16.registros = itemArray41;
        ds.Item[] itemArray46 = tabela16.registros;
        tabela0.registros = itemArray46;
        ds.Item[] itemArray48 = tabela0.registros;
        ds.Item item49 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
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
        tabela0.n = '4';
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.pesquisa(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
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
        tabela0.n = (short) 10;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
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
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = tabela0.binaria(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        tabela0.n = (short) 0;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item item13 = null;
        tabela0.insere(item13);
        tabela0.n = 'a';
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
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
        tabela0.n = '4';
        ds.Item[] itemArray16 = tabela0.registros;
        java.lang.Class<?> wildcardClass17 = itemArray16.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela7.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = null;
        tabela0.registros = itemArray7;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.binaria(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 'a';
        tabela0.n = '#';
        java.lang.Class<?> wildcardClass5 = tabela0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
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
        tabela0.n = '4';
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        tabela16.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        ds.Item item26 = null;
        int int27 = tabela24.binaria(item26);
        ds.Item item28 = null;
        tabela24.insere(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item[] itemArray31 = tabela30.registros;
        ds.Item item32 = null;
        tabela30.insere(item32);
        tabela30.n = 10;
        int int36 = tabela30.n;
        ds.Tabela tabela37 = new ds.Tabela();
        tabela37.n = 0;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item[] itemArray41 = tabela40.registros;
        tabela37.registros = itemArray41;
        tabela30.registros = itemArray41;
        tabela24.registros = itemArray41;
        tabela16.registros = itemArray41;
        ds.Item[] itemArray46 = tabela16.registros;
        tabela0.registros = itemArray46;
        java.lang.Class<?> wildcardClass48 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item item13 = null;
        tabela0.insere(item13);
        ds.Item[] itemArray15 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tabela0.pesquisa(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Tabela tabela2 = new ds.Tabela();
        ds.Item[] itemArray3 = tabela2.registros;
        ds.Item item4 = null;
        tabela2.insere(item4);
        tabela2.n = 10;
        int int8 = tabela2.n;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item[] itemArray13 = tabela12.registros;
        tabela9.registros = itemArray13;
        tabela2.registros = itemArray13;
        ds.Item[] itemArray16 = tabela2.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        int int6 = tabela0.n;
        tabela0.n = (byte) 100;
        tabela0.n = (short) -1;
        java.lang.Class<?> wildcardClass11 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Item item8 = null;
        int int9 = tabela6.binaria(item8);
        tabela6.n = '#';
        ds.Item[] itemArray12 = tabela6.registros;
        ds.Item[] itemArray13 = tabela6.registros;
        tabela0.registros = itemArray13;
        java.lang.Class<?> wildcardClass15 = itemArray13.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
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
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        ds.Item item23 = null;
        int int24 = tabela21.binaria(item23);
        int int25 = tabela21.n;
        tabela21.n = (short) -1;
        ds.Item item28 = null;
        tabela21.insere(item28);
        ds.Item[] itemArray30 = tabela21.registros;
        tabela0.registros = itemArray30;
        ds.Item item32 = null;
        int int33 = tabela0.binaria(item32);
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item[] itemArray35 = tabela34.registros;
        tabela0.registros = itemArray35;
        java.lang.Class<?> wildcardClass37 = itemArray35.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Tabela tabela2 = new ds.Tabela();
        ds.Item[] itemArray3 = tabela2.registros;
        ds.Item item4 = null;
        tabela2.insere(item4);
        tabela2.n = 10;
        int int8 = tabela2.n;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item[] itemArray13 = tabela12.registros;
        tabela9.registros = itemArray13;
        tabela2.registros = itemArray13;
        ds.Item[] itemArray16 = tabela2.registros;
        tabela0.registros = itemArray16;
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        tabela0.n = (short) 1;
        ds.Item item8 = null;
        tabela0.insere(item8);
        int int10 = tabela0.n;
        ds.Item item11 = null;
        tabela0.insere(item11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
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
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        ds.Item item23 = null;
        int int24 = tabela21.binaria(item23);
        int int25 = tabela21.n;
        tabela21.n = (short) -1;
        ds.Item item28 = null;
        tabela21.insere(item28);
        ds.Item[] itemArray30 = tabela21.registros;
        tabela0.registros = itemArray30;
        ds.Item item32 = null;
        int int33 = tabela0.binaria(item32);
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item[] itemArray35 = tabela34.registros;
        tabela0.registros = itemArray35;
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int38 = tabela0.pesquisa(item37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        tabela0.n = '4';
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        tabela0.n = '4';
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = tabela0.binaria(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = (-1);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        java.lang.Class<?> wildcardClass11 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
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
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        tabela8.insere(item10);
        tabela8.n = 10;
        int int14 = tabela8.n;
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = 0;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela15.registros = itemArray19;
        tabela8.registros = itemArray19;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela6.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item[] itemArray29 = tabela28.registros;
        tabela25.registros = itemArray29;
        ds.Item item31 = null;
        int int32 = tabela25.binaria(item31);
        ds.Item[] itemArray33 = tabela25.registros;
        int int34 = tabela25.n;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item[] itemArray36 = tabela35.registros;
        ds.Item item37 = null;
        tabela35.insere(item37);
        tabela35.n = 10;
        ds.Item[] itemArray41 = tabela35.registros;
        tabela25.registros = itemArray41;
        ds.Item[] itemArray43 = tabela25.registros;
        tabela0.registros = itemArray43;
        tabela0.n = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = 0;
        ds.Item[] itemArray10 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
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
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        int int12 = tabela9.binaria(item11);
        int int13 = tabela9.n;
        tabela9.n = (short) -1;
        ds.Item item16 = null;
        tabela9.insere(item16);
        int int18 = tabela9.n;
        ds.Item[] itemArray19 = tabela9.registros;
        tabela0.registros = itemArray19;
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.pesquisa(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = 10;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
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
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        ds.Item item23 = null;
        int int24 = tabela21.binaria(item23);
        int int25 = tabela21.n;
        tabela21.n = (short) -1;
        ds.Item item28 = null;
        tabela21.insere(item28);
        ds.Item[] itemArray30 = tabela21.registros;
        tabela0.registros = itemArray30;
        tabela0.n = (byte) 0;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        tabela9.insere(item11);
        tabela9.n = 0;
        tabela9.n = 100;
        ds.Item[] itemArray17 = tabela9.registros;
        ds.Item[] itemArray18 = tabela9.registros;
        tabela0.registros = itemArray18;
        java.lang.Class<?> wildcardClass20 = itemArray18.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
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
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        tabela0.n = (short) 100;
        ds.Item[] itemArray5 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
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
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        ds.Item item23 = null;
        int int24 = tabela21.binaria(item23);
        int int25 = tabela21.n;
        tabela21.n = (short) -1;
        ds.Item item28 = null;
        tabela21.insere(item28);
        ds.Item[] itemArray30 = tabela21.registros;
        tabela0.registros = itemArray30;
        ds.Item item32 = null;
        int int33 = tabela0.binaria(item32);
        ds.Item item34 = null;
        int int35 = tabela0.binaria(item34);
        java.lang.Class<?> wildcardClass36 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
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
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        ds.Item item23 = null;
        int int24 = tabela21.binaria(item23);
        int int25 = tabela21.n;
        tabela21.n = (short) -1;
        ds.Item item28 = null;
        tabela21.insere(item28);
        ds.Item[] itemArray30 = tabela21.registros;
        tabela0.registros = itemArray30;
        ds.Item item32 = null;
        tabela0.insere(item32);
        java.lang.Class<?> wildcardClass34 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela7.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item[] itemArray15 = tabela0.registros;
        java.lang.Class<?> wildcardClass16 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela7.registros = itemArray11;
        tabela0.registros = itemArray11;
        java.lang.Class<?> wildcardClass14 = itemArray11.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 1;
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
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        tabela0.insere(item11);
        java.lang.Class<?> wildcardClass13 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
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
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = 0;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item[] itemArray35 = tabela34.registros;
        tabela31.registros = itemArray35;
        ds.Item item37 = null;
        int int38 = tabela31.binaria(item37);
        ds.Item[] itemArray39 = tabela31.registros;
        int int40 = tabela31.n;
        ds.Item item41 = null;
        tabela31.insere(item41);
        ds.Item[] itemArray43 = tabela31.registros;
        ds.Tabela tabela44 = new ds.Tabela();
        int int45 = tabela44.n;
        ds.Item[] itemArray46 = tabela44.registros;
        tabela31.registros = itemArray46;
        tabela0.registros = itemArray46;
        java.lang.Class<?> wildcardClass49 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item item12 = null;
        int int13 = tabela0.binaria(item12);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        ds.Item item8 = null;
        tabela6.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela6.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item[] itemArray15 = tabela14.registros;
        ds.Item item16 = null;
        tabela14.insere(item16);
        tabela14.n = 0;
        tabela14.n = 100;
        ds.Item[] itemArray22 = tabela14.registros;
        ds.Item[] itemArray23 = tabela14.registros;
        tabela0.registros = itemArray23;
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tabela0.binaria(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
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
        int int12 = tabela9.binaria(item11);
        tabela9.n = ' ';
        ds.Item[] itemArray15 = tabela9.registros;
        tabela0.registros = itemArray15;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        int int8 = tabela0.n;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
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
        ds.Item[] itemArray12 = tabela11.registros;
        ds.Item item13 = null;
        int int14 = tabela11.binaria(item13);
        int int15 = tabela11.n;
        tabela11.n = (short) -1;
        ds.Item item18 = null;
        tabela11.insere(item18);
        ds.Item[] itemArray20 = tabela11.registros;
        tabela0.registros = itemArray20;
        ds.Item item22 = null;
        tabela0.insere(item22);
        java.lang.Class<?> wildcardClass24 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        tabela0.n = '#';
        tabela0.n = 10;
        int int10 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        tabela0.n = (short) 1;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = 0;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item[] itemArray14 = tabela13.registros;
        tabela10.registros = itemArray14;
        tabela0.registros = itemArray14;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
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
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        tabela10.insere(item12);
        tabela10.n = 10;
        ds.Item[] itemArray16 = tabela10.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        ds.Item item20 = null;
        int int21 = tabela0.binaria(item20);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        ds.Item item7 = null;
        int int8 = tabela5.binaria(item7);
        ds.Item item9 = null;
        tabela5.insere(item9);
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
        tabela5.registros = itemArray22;
        tabela0.registros = itemArray22;
        int int27 = tabela0.n;
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = tabela0.binaria(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
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
        ds.Item[] itemArray30 = tabela0.registros;
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = tabela0.pesquisa(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
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
        tabela0.n = '4';
        tabela0.n = ' ';
        java.lang.Class<?> wildcardClass25 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
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
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela7.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        ds.Item item18 = null;
        tabela16.insere(item18);
        tabela16.n = 0;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item[] itemArray24 = tabela23.registros;
        ds.Item item25 = null;
        int int26 = tabela23.binaria(item25);
        ds.Item[] itemArray27 = new ds.Item[] {};
        tabela23.registros = itemArray27;
        tabela16.registros = itemArray27;
        tabela16.n = '4';
        ds.Tabela tabela32 = new ds.Tabela();
        tabela32.n = 0;
        ds.Item item35 = null;
        tabela32.insere(item35);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela32.registros = itemArray38;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item[] itemArray41 = tabela40.registros;
        ds.Item item42 = null;
        int int43 = tabela40.binaria(item42);
        ds.Item item44 = null;
        tabela40.insere(item44);
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item[] itemArray47 = tabela46.registros;
        ds.Item item48 = null;
        tabela46.insere(item48);
        tabela46.n = 10;
        int int52 = tabela46.n;
        ds.Tabela tabela53 = new ds.Tabela();
        tabela53.n = 0;
        ds.Tabela tabela56 = new ds.Tabela();
        ds.Item[] itemArray57 = tabela56.registros;
        tabela53.registros = itemArray57;
        tabela46.registros = itemArray57;
        tabela40.registros = itemArray57;
        tabela32.registros = itemArray57;
        ds.Item[] itemArray62 = tabela32.registros;
        tabela16.registros = itemArray62;
        tabela0.registros = itemArray62;
        int int65 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        tabela0.n = (short) -1;
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        tabela9.insere(item11);
        ds.Item item13 = null;
        tabela9.insere(item13);
        tabela9.n = (-1);
        ds.Item[] itemArray17 = tabela9.registros;
        tabela0.registros = itemArray17;
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tabela0.pesquisa(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        tabela0.n = (byte) -1;
        ds.Item[] itemArray10 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        java.lang.Class<?> wildcardClass6 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = tabela0.pesquisa(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = 0;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
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
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        ds.Item item23 = null;
        int int24 = tabela21.binaria(item23);
        int int25 = tabela21.n;
        tabela21.n = (short) -1;
        ds.Item item28 = null;
        tabela21.insere(item28);
        ds.Item[] itemArray30 = tabela21.registros;
        tabela0.registros = itemArray30;
        ds.Item item32 = null;
        int int33 = tabela0.binaria(item32);
        ds.Item[] itemArray34 = tabela0.registros;
        ds.Item[] itemArray35 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
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
        ds.Item[] itemArray12 = tabela11.registros;
        ds.Item item13 = null;
        int int14 = tabela11.binaria(item13);
        int int15 = tabela11.n;
        tabela11.n = (short) -1;
        ds.Item item18 = null;
        tabela11.insere(item18);
        ds.Item[] itemArray20 = tabela11.registros;
        tabela0.registros = itemArray20;
        ds.Item item22 = null;
        tabela0.insere(item22);
        ds.Item item24 = null;
        tabela0.insere(item24);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = 10;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        tabela0.n = 0;
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        int int12 = tabela9.binaria(item11);
        int int13 = tabela9.n;
        tabela9.n = (short) -1;
        ds.Item item16 = null;
        tabela9.insere(item16);
        int int18 = tabela9.n;
        ds.Item[] itemArray19 = tabela9.registros;
        tabela0.registros = itemArray19;
        java.lang.Class<?> wildcardClass21 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (byte) 0;
        java.lang.Class<?> wildcardClass11 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        ds.Item[] itemArray15 = tabela13.registros;
        tabela0.registros = itemArray15;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.pesquisa(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela7.registros = itemArray11;
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        ds.Item item15 = null;
        int int16 = tabela13.binaria(item15);
        tabela13.n = '#';
        ds.Item[] itemArray19 = tabela13.registros;
        ds.Item[] itemArray20 = tabela13.registros;
        tabela7.registros = itemArray20;
        tabela0.registros = itemArray20;
        java.lang.Class<?> wildcardClass23 = itemArray20.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        tabela8.insere(item10);
        tabela8.n = 10;
        int int14 = tabela8.n;
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = 0;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela15.registros = itemArray19;
        tabela8.registros = itemArray19;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela6.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item[] itemArray29 = tabela28.registros;
        tabela25.registros = itemArray29;
        ds.Item item31 = null;
        int int32 = tabela25.binaria(item31);
        ds.Item[] itemArray33 = tabela25.registros;
        int int34 = tabela25.n;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item[] itemArray36 = tabela35.registros;
        ds.Item item37 = null;
        tabela35.insere(item37);
        tabela35.n = 10;
        ds.Item[] itemArray41 = tabela35.registros;
        tabela25.registros = itemArray41;
        ds.Item[] itemArray43 = tabela25.registros;
        tabela0.registros = itemArray43;
        ds.Item[] itemArray45 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
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
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        int int8 = tabela0.n;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = 'a';
        tabela10.n = 100;
        ds.Item[] itemArray15 = tabela10.registros;
        tabela0.registros = itemArray15;
        ds.Item[] itemArray17 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        int int12 = tabela9.binaria(item11);
        tabela9.n = ' ';
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        ds.Item item17 = null;
        tabela15.insere(item17);
        tabela15.n = 10;
        int int21 = tabela15.n;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item[] itemArray26 = tabela25.registros;
        tabela22.registros = itemArray26;
        tabela15.registros = itemArray26;
        tabela9.registros = itemArray26;
        tabela0.registros = itemArray26;
        ds.Item[] itemArray31 = tabela0.registros;
        ds.Item item32 = null;
        tabela0.insere(item32);
        ds.Item item34 = null;
        int int35 = tabela0.binaria(item34);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        ds.Item[] itemArray15 = tabela13.registros;
        tabela0.registros = itemArray15;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item item19 = null;
        tabela17.insere(item19);
        ds.Item item21 = null;
        tabela17.insere(item21);
        ds.Tabela tabela23 = new ds.Tabela();
        tabela23.n = 0;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item[] itemArray27 = tabela26.registros;
        tabela23.registros = itemArray27;
        ds.Item item29 = null;
        int int30 = tabela23.binaria(item29);
        ds.Item[] itemArray31 = tabela23.registros;
        int int32 = tabela23.n;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item[] itemArray34 = tabela33.registros;
        ds.Item item35 = null;
        tabela33.insere(item35);
        tabela33.n = 10;
        ds.Item[] itemArray39 = tabela33.registros;
        tabela23.registros = itemArray39;
        tabela17.registros = itemArray39;
        tabela0.registros = itemArray39;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
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
        tabela0.n = 35;
        ds.Item[] itemArray32 = tabela0.registros;
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
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        int int10 = tabela0.n;
        java.lang.Class<?> wildcardClass11 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 0;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        tabela0.insere(item10);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = (-1);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.binaria(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        tabela9.insere(item11);
        ds.Item item13 = null;
        tabela9.insere(item13);
        tabela9.n = (-1);
        ds.Item[] itemArray17 = tabela9.registros;
        tabela0.registros = itemArray17;
        tabela0.n = ' ';
        java.lang.Class<?> wildcardClass21 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (short) 100;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
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
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item[] itemArray23 = tabela22.registros;
        ds.Item item24 = null;
        int int25 = tabela22.binaria(item24);
        int int26 = tabela22.n;
        tabela22.n = (short) -1;
        ds.Item item29 = null;
        tabela22.insere(item29);
        ds.Item[] itemArray31 = tabela22.registros;
        tabela0.registros = itemArray31;
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
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        int int6 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 'a';
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
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        ds.Item item8 = null;
        tabela6.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela6.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item[] itemArray15 = tabela14.registros;
        ds.Item item16 = null;
        tabela14.insere(item16);
        tabela14.n = 0;
        tabela14.n = 100;
        ds.Item[] itemArray22 = tabela14.registros;
        ds.Item[] itemArray23 = tabela14.registros;
        tabela0.registros = itemArray23;
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tabela0.pesquisa(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = 1;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.binaria(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        ds.Item[] itemArray15 = tabela13.registros;
        tabela0.registros = itemArray15;
        tabela0.n = 0;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
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
        ds.Item[] itemArray12 = tabela11.registros;
        ds.Item item13 = null;
        int int14 = tabela11.binaria(item13);
        int int15 = tabela11.n;
        tabela11.n = (short) -1;
        ds.Item item18 = null;
        tabela11.insere(item18);
        ds.Item[] itemArray20 = tabela11.registros;
        tabela0.registros = itemArray20;
        ds.Item item22 = null;
        tabela0.insere(item22);
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tabela0.binaria(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = tabela0.registros;
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = tabela0.pesquisa(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 1;
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
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        ds.Item item7 = null;
        int int8 = tabela5.binaria(item7);
        int int9 = tabela5.n;
        tabela5.n = (short) -1;
        ds.Tabela tabela12 = new ds.Tabela();
        int int13 = tabela12.n;
        ds.Item[] itemArray14 = tabela12.registros;
        ds.Item[] itemArray15 = tabela12.registros;
        tabela5.registros = itemArray15;
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = 0;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item[] itemArray21 = tabela20.registros;
        tabela17.registros = itemArray21;
        ds.Item item23 = null;
        int int24 = tabela17.binaria(item23);
        ds.Item[] itemArray25 = tabela17.registros;
        int int26 = tabela17.n;
        ds.Item item27 = null;
        tabela17.insere(item27);
        ds.Item[] itemArray29 = tabela17.registros;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item[] itemArray31 = tabela30.registros;
        ds.Item item32 = null;
        tabela30.insere(item32);
        int int34 = tabela30.n;
        ds.Item item35 = null;
        tabela30.insere(item35);
        ds.Item[] itemArray37 = tabela30.registros;
        tabela17.registros = itemArray37;
        tabela5.registros = itemArray37;
        tabela0.registros = itemArray37;
        java.lang.Class<?> wildcardClass41 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = (-1);
        int int8 = tabela0.n;
        ds.Item[] itemArray9 = tabela0.registros;
        java.lang.Class<?> wildcardClass10 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        int int2 = tabela0.n;
        java.lang.Class<?> wildcardClass3 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        int int11 = tabela8.binaria(item10);
        int int12 = tabela8.n;
        tabela8.n = (short) -1;
        ds.Item item15 = null;
        tabela8.insere(item15);
        ds.Item item17 = null;
        int int18 = tabela8.binaria(item17);
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item[] itemArray20 = tabela19.registros;
        ds.Item item21 = null;
        tabela19.insere(item21);
        tabela19.n = 10;
        int int25 = tabela19.n;
        ds.Tabela tabela26 = new ds.Tabela();
        tabela26.n = 0;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item[] itemArray30 = tabela29.registros;
        tabela26.registros = itemArray30;
        tabela19.registros = itemArray30;
        ds.Item[] itemArray33 = tabela19.registros;
        ds.Item[] itemArray34 = tabela19.registros;
        tabela8.registros = itemArray34;
        ds.Item item36 = null;
        int int37 = tabela8.binaria(item36);
        ds.Item[] itemArray38 = tabela8.registros;
        tabela0.registros = itemArray38;
        java.lang.Class<?> wildcardClass40 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
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
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        tabela9.insere(item11);
        ds.Item item13 = null;
        tabela9.insere(item13);
        tabela9.n = (-1);
        ds.Item[] itemArray17 = tabela9.registros;
        tabela0.registros = itemArray17;
        tabela0.n = 0;
        ds.Item item21 = null;
        tabela0.insere(item21);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
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
        ds.Item[] itemArray30 = tabela0.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item[] itemArray32 = tabela31.registros;
        ds.Item item33 = null;
        int int34 = tabela31.binaria(item33);
        ds.Item item35 = null;
        int int36 = tabela31.binaria(item35);
        ds.Item[] itemArray37 = tabela31.registros;
        ds.Tabela tabela38 = new ds.Tabela();
        tabela38.n = 0;
        ds.Tabela tabela41 = new ds.Tabela();
        ds.Item[] itemArray42 = tabela41.registros;
        tabela38.registros = itemArray42;
        ds.Tabela tabela44 = new ds.Tabela();
        int int45 = tabela44.n;
        ds.Item item46 = null;
        int int47 = tabela44.binaria(item46);
        tabela44.n = '#';
        ds.Item[] itemArray50 = tabela44.registros;
        ds.Item[] itemArray51 = tabela44.registros;
        tabela38.registros = itemArray51;
        tabela31.registros = itemArray51;
        tabela0.registros = itemArray51;
        ds.Item[] itemArray55 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        tabela0.insere(item6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
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
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.binaria(item21);
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
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        tabela6.registros = itemArray10;
        ds.Item item12 = null;
        int int13 = tabela6.binaria(item12);
        ds.Item[] itemArray14 = tabela6.registros;
        int int15 = tabela6.n;
        tabela6.n = '4';
        ds.Item[] itemArray18 = tabela6.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        tabela19.n = 0;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item[] itemArray23 = tabela22.registros;
        tabela19.registros = itemArray23;
        ds.Item item25 = null;
        int int26 = tabela19.binaria(item25);
        ds.Item[] itemArray27 = tabela19.registros;
        int int28 = tabela19.n;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item[] itemArray30 = tabela29.registros;
        ds.Item item31 = null;
        tabela29.insere(item31);
        tabela29.n = 10;
        ds.Item[] itemArray35 = tabela29.registros;
        tabela19.registros = itemArray35;
        tabela6.registros = itemArray35;
        tabela0.registros = itemArray35;
        java.lang.Class<?> wildcardClass39 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        int int8 = tabela0.n;
        ds.Item[] itemArray9 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        tabela8.n = 1;
        ds.Item item12 = null;
        tabela8.insere(item12);
        ds.Item[] itemArray14 = tabela8.registros;
        tabela0.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        ds.Item item18 = null;
        int int19 = tabela16.binaria(item18);
        ds.Item[] itemArray20 = new ds.Item[] {};
        tabela16.registros = itemArray20;
        tabela0.registros = itemArray20;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tabela0.pesquisa(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        int int13 = tabela10.binaria(item12);
        tabela10.n = ' ';
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        ds.Item item18 = null;
        tabela16.insere(item18);
        tabela16.n = 10;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        tabela23.n = 0;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item[] itemArray27 = tabela26.registros;
        tabela23.registros = itemArray27;
        tabela16.registros = itemArray27;
        tabela10.registros = itemArray27;
        tabela0.registros = itemArray27;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item[] itemArray33 = tabela32.registros;
        ds.Item item34 = null;
        tabela32.insere(item34);
        tabela32.n = 0;
        int int38 = tabela32.n;
        ds.Item[] itemArray39 = tabela32.registros;
        tabela0.registros = itemArray39;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
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
        tabela0.n = 35;
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
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
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
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Tabela tabela2 = new ds.Tabela();
        ds.Item[] itemArray3 = tabela2.registros;
        ds.Item item4 = null;
        tabela2.insere(item4);
        tabela2.n = 10;
        int int8 = tabela2.n;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item[] itemArray13 = tabela12.registros;
        tabela9.registros = itemArray13;
        tabela2.registros = itemArray13;
        ds.Item[] itemArray16 = tabela2.registros;
        tabela0.registros = itemArray16;
        int int18 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
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
        int int14 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela7.registros = itemArray11;
        tabela0.registros = itemArray11;
        tabela0.n = (byte) 0;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
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
        int int21 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
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
        java.lang.Class<?> wildcardClass15 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        int int13 = tabela10.binaria(item12);
        tabela10.n = ' ';
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        ds.Item item18 = null;
        tabela16.insere(item18);
        tabela16.n = 10;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        tabela23.n = 0;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item[] itemArray27 = tabela26.registros;
        tabela23.registros = itemArray27;
        tabela16.registros = itemArray27;
        tabela10.registros = itemArray27;
        tabela0.registros = itemArray27;
        ds.Tabela tabela32 = new ds.Tabela();
        int int33 = tabela32.n;
        ds.Item item34 = null;
        int int35 = tabela32.binaria(item34);
        tabela32.n = 1;
        ds.Item[] itemArray38 = tabela32.registros;
        tabela0.registros = itemArray38;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        tabela0.n = '4';
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        int int13 = tabela10.binaria(item12);
        ds.Item item14 = null;
        tabela10.insere(item14);
        tabela10.n = (byte) 0;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        ds.Item item20 = null;
        tabela18.insere(item20);
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item[] itemArray23 = tabela22.registros;
        tabela18.registros = itemArray23;
        ds.Item[] itemArray25 = null;
        tabela18.registros = itemArray25;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item[] itemArray28 = tabela27.registros;
        ds.Item item29 = null;
        tabela27.insere(item29);
        tabela27.n = 10;
        ds.Item[] itemArray33 = tabela27.registros;
        tabela18.registros = itemArray33;
        tabela10.registros = itemArray33;
        tabela0.registros = itemArray33;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item[] itemArray38 = tabela37.registros;
        ds.Item item39 = null;
        int int40 = tabela37.binaria(item39);
        tabela37.n = ' ';
        ds.Item[] itemArray43 = tabela37.registros;
        tabela0.registros = itemArray43;
        java.lang.Class<?> wildcardClass45 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
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
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        ds.Item item23 = null;
        int int24 = tabela21.binaria(item23);
        int int25 = tabela21.n;
        tabela21.n = (short) -1;
        ds.Item item28 = null;
        tabela21.insere(item28);
        ds.Item[] itemArray30 = tabela21.registros;
        tabela0.registros = itemArray30;
        ds.Item item32 = null;
        int int33 = tabela0.binaria(item32);
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item[] itemArray35 = tabela34.registros;
        tabela0.registros = itemArray35;
        ds.Item[] itemArray37 = tabela0.registros;
        ds.Item item38 = null;
        tabela0.insere(item38);
        ds.Item item40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = tabela0.binaria(item40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Item item8 = null;
        int int9 = tabela6.binaria(item8);
        tabela6.n = '#';
        ds.Item[] itemArray12 = tabela6.registros;
        ds.Item[] itemArray13 = tabela6.registros;
        tabela0.registros = itemArray13;
        ds.Item[] itemArray15 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
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
        int int13 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
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
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = tabela0.binaria(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
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
        ds.Item item38 = null;
        tabela0.insere(item38);
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
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
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
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tabela0.binaria(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = tabela0.pesquisa(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (short) 100;
        ds.Item[] itemArray9 = tabela0.registros;
        tabela0.n = (byte) 0;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        ds.Item item8 = null;
        tabela6.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela6.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item[] itemArray15 = tabela14.registros;
        ds.Item item16 = null;
        tabela14.insere(item16);
        tabela14.n = 0;
        tabela14.n = 100;
        ds.Item[] itemArray22 = tabela14.registros;
        ds.Item[] itemArray23 = tabela14.registros;
        tabela0.registros = itemArray23;
        ds.Item[] itemArray25 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        tabela0.n = 0;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        tabela8.insere(item10);
        int int12 = tabela8.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item[] itemArray14 = tabela13.registros;
        ds.Item item15 = null;
        tabela13.insere(item15);
        tabela13.n = 0;
        int int19 = tabela13.n;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item[] itemArray21 = tabela20.registros;
        ds.Item item22 = null;
        int int23 = tabela20.binaria(item22);
        ds.Item[] itemArray24 = new ds.Item[] {};
        tabela20.registros = itemArray24;
        tabela13.registros = itemArray24;
        ds.Item[] itemArray27 = tabela13.registros;
        tabela8.registros = itemArray27;
        tabela8.n = '4';
        tabela8.n = ' ';
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item[] itemArray34 = tabela33.registros;
        ds.Item item35 = null;
        tabela33.insere(item35);
        int int37 = tabela33.n;
        int int38 = tabela33.n;
        int int39 = tabela33.n;
        int int40 = tabela33.n;
        ds.Tabela tabela41 = new ds.Tabela();
        tabela41.n = 0;
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item[] itemArray45 = tabela44.registros;
        tabela41.registros = itemArray45;
        ds.Item item47 = null;
        int int48 = tabela41.binaria(item47);
        ds.Item[] itemArray49 = tabela41.registros;
        int int50 = tabela41.n;
        ds.Item item51 = null;
        tabela41.insere(item51);
        ds.Item[] itemArray53 = tabela41.registros;
        ds.Item[] itemArray54 = tabela41.registros;
        tabela33.registros = itemArray54;
        tabela8.registros = itemArray54;
        tabela0.registros = itemArray54;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
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
        java.lang.Class<?> wildcardClass43 = tabela0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
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
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        ds.Item item23 = null;
        int int24 = tabela21.binaria(item23);
        int int25 = tabela21.n;
        tabela21.n = (short) -1;
        ds.Item item28 = null;
        tabela21.insere(item28);
        ds.Item[] itemArray30 = tabela21.registros;
        tabela0.registros = itemArray30;
        ds.Item item32 = null;
        int int33 = tabela0.binaria(item32);
        ds.Item item34 = null;
        tabela0.insere(item34);
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = tabela0.pesquisa(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (short) 100;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.binaria(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
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
        tabela0.n = 35;
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = tabela0.binaria(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = tabela0.registros;
        java.lang.Class<?> wildcardClass4 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        tabela0.n = (short) 100;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = ' ';
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (byte) -1;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        tabela0.insere(item6);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
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
        tabela0.n = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        ds.Item[] itemArray15 = tabela13.registros;
        tabela0.registros = itemArray15;
        ds.Item item17 = null;
        tabela0.insere(item17);
        ds.Item[] itemArray19 = tabela0.registros;
        tabela0.n = (byte) 10;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (byte) -1;
        ds.Item[] itemArray9 = tabela0.registros;
        java.lang.Class<?> wildcardClass10 = itemArray9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
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
        ds.Tabela tabela23 = new ds.Tabela();
        int int24 = tabela23.n;
        ds.Item item25 = null;
        int int26 = tabela23.binaria(item25);
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela0.registros = itemArray28;
        ds.Item item30 = null;
        tabela0.insere(item30);
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item[] itemArray33 = tabela32.registros;
        ds.Item item34 = null;
        int int35 = tabela32.binaria(item34);
        ds.Item item36 = null;
        tabela32.insere(item36);
        tabela32.n = (byte) 0;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item[] itemArray41 = tabela40.registros;
        ds.Item item42 = null;
        tabela40.insere(item42);
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item[] itemArray45 = tabela44.registros;
        tabela40.registros = itemArray45;
        ds.Item[] itemArray47 = null;
        tabela40.registros = itemArray47;
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item[] itemArray50 = tabela49.registros;
        ds.Item item51 = null;
        tabela49.insere(item51);
        tabela49.n = 10;
        ds.Item[] itemArray55 = tabela49.registros;
        tabela40.registros = itemArray55;
        tabela32.registros = itemArray55;
        ds.Tabela tabela58 = new ds.Tabela();
        tabela58.n = 0;
        ds.Item item61 = null;
        tabela58.insere(item61);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        tabela58.registros = itemArray64;
        ds.Tabela tabela66 = new ds.Tabela();
        ds.Item[] itemArray67 = tabela66.registros;
        ds.Item item68 = null;
        int int69 = tabela66.binaria(item68);
        ds.Item item70 = null;
        tabela66.insere(item70);
        ds.Tabela tabela72 = new ds.Tabela();
        ds.Item[] itemArray73 = tabela72.registros;
        ds.Item item74 = null;
        tabela72.insere(item74);
        tabela72.n = 10;
        int int78 = tabela72.n;
        ds.Tabela tabela79 = new ds.Tabela();
        tabela79.n = 0;
        ds.Tabela tabela82 = new ds.Tabela();
        ds.Item[] itemArray83 = tabela82.registros;
        tabela79.registros = itemArray83;
        tabela72.registros = itemArray83;
        tabela66.registros = itemArray83;
        tabela58.registros = itemArray83;
        ds.Item[] itemArray88 = tabela58.registros;
        tabela32.registros = itemArray88;
        tabela0.registros = itemArray88;
        ds.Item item91 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int92 = tabela0.pesquisa(item91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertNotNull(itemArray83);
        org.junit.Assert.assertNotNull(itemArray88);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
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
        tabela0.n = '4';
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = '#';
        int int11 = tabela0.n;
        int int12 = tabela0.n;
        java.lang.Class<?> wildcardClass13 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
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
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.pesquisa(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        int int8 = tabela0.n;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item[] itemArray12 = tabela11.registros;
        ds.Item item13 = null;
        int int14 = tabela11.binaria(item13);
        int int15 = tabela11.n;
        tabela11.n = (short) -1;
        ds.Tabela tabela18 = new ds.Tabela();
        int int19 = tabela18.n;
        ds.Item[] itemArray20 = tabela18.registros;
        ds.Item[] itemArray21 = tabela18.registros;
        tabela11.registros = itemArray21;
        ds.Tabela tabela23 = new ds.Tabela();
        tabela23.n = 0;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item[] itemArray27 = tabela26.registros;
        tabela23.registros = itemArray27;
        ds.Item item29 = null;
        int int30 = tabela23.binaria(item29);
        ds.Item[] itemArray31 = tabela23.registros;
        int int32 = tabela23.n;
        ds.Item item33 = null;
        tabela23.insere(item33);
        ds.Item[] itemArray35 = tabela23.registros;
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item[] itemArray37 = tabela36.registros;
        ds.Item item38 = null;
        tabela36.insere(item38);
        int int40 = tabela36.n;
        ds.Item item41 = null;
        tabela36.insere(item41);
        ds.Item[] itemArray43 = tabela36.registros;
        tabela23.registros = itemArray43;
        tabela11.registros = itemArray43;
        tabela0.registros = itemArray43;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        ds.Item item7 = null;
        int int8 = tabela5.binaria(item7);
        int int9 = tabela5.n;
        tabela5.n = (short) -1;
        ds.Tabela tabela12 = new ds.Tabela();
        int int13 = tabela12.n;
        ds.Item[] itemArray14 = tabela12.registros;
        ds.Item[] itemArray15 = tabela12.registros;
        tabela5.registros = itemArray15;
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = 0;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item[] itemArray21 = tabela20.registros;
        tabela17.registros = itemArray21;
        ds.Item item23 = null;
        int int24 = tabela17.binaria(item23);
        ds.Item[] itemArray25 = tabela17.registros;
        int int26 = tabela17.n;
        ds.Item item27 = null;
        tabela17.insere(item27);
        ds.Item[] itemArray29 = tabela17.registros;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item[] itemArray31 = tabela30.registros;
        ds.Item item32 = null;
        tabela30.insere(item32);
        int int34 = tabela30.n;
        ds.Item item35 = null;
        tabela30.insere(item35);
        ds.Item[] itemArray37 = tabela30.registros;
        tabela17.registros = itemArray37;
        tabela5.registros = itemArray37;
        tabela0.registros = itemArray37;
        int int41 = tabela0.n;
        int int42 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        ds.Item item7 = null;
        int int8 = tabela5.binaria(item7);
        int int9 = tabela5.n;
        tabela5.n = (short) -1;
        ds.Tabela tabela12 = new ds.Tabela();
        int int13 = tabela12.n;
        ds.Item[] itemArray14 = tabela12.registros;
        ds.Item[] itemArray15 = tabela12.registros;
        tabela5.registros = itemArray15;
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = 0;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item[] itemArray21 = tabela20.registros;
        tabela17.registros = itemArray21;
        ds.Item item23 = null;
        int int24 = tabela17.binaria(item23);
        ds.Item[] itemArray25 = tabela17.registros;
        int int26 = tabela17.n;
        ds.Item item27 = null;
        tabela17.insere(item27);
        ds.Item[] itemArray29 = tabela17.registros;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item[] itemArray31 = tabela30.registros;
        ds.Item item32 = null;
        tabela30.insere(item32);
        int int34 = tabela30.n;
        ds.Item item35 = null;
        tabela30.insere(item35);
        ds.Item[] itemArray37 = tabela30.registros;
        tabela17.registros = itemArray37;
        tabela5.registros = itemArray37;
        tabela0.registros = itemArray37;
        ds.Tabela tabela41 = new ds.Tabela();
        ds.Item[] itemArray42 = tabela41.registros;
        ds.Item item43 = null;
        tabela41.insere(item43);
        int int45 = tabela41.n;
        tabela41.n = 2;
        ds.Tabela tabela48 = new ds.Tabela();
        tabela48.n = 0;
        ds.Tabela tabela51 = new ds.Tabela();
        ds.Item[] itemArray52 = tabela51.registros;
        tabela48.registros = itemArray52;
        ds.Item item54 = null;
        int int55 = tabela48.binaria(item54);
        ds.Item[] itemArray56 = tabela48.registros;
        int int57 = tabela48.n;
        ds.Item item58 = null;
        tabela48.insere(item58);
        ds.Item[] itemArray60 = tabela48.registros;
        ds.Tabela tabela61 = new ds.Tabela();
        ds.Item[] itemArray62 = tabela61.registros;
        ds.Item item63 = null;
        tabela61.insere(item63);
        int int65 = tabela61.n;
        ds.Item item66 = null;
        tabela61.insere(item66);
        ds.Item[] itemArray68 = tabela61.registros;
        tabela48.registros = itemArray68;
        tabela41.registros = itemArray68;
        tabela0.registros = itemArray68;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
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
        int int23 = tabela0.n;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        ds.Item item26 = null;
        int int27 = tabela24.binaria(item26);
        int int28 = tabela24.n;
        tabela24.n = (short) -1;
        ds.Item item31 = null;
        tabela24.insere(item31);
        int int33 = tabela24.n;
        ds.Item[] itemArray34 = tabela24.registros;
        tabela0.registros = itemArray34;
        ds.Item[] itemArray36 = tabela0.registros;
        java.lang.Class<?> wildcardClass37 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = tabela0.registros;
        tabela0.n = (byte) 100;
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
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
        ds.Tabela tabela31 = new ds.Tabela();
        tabela31.n = 0;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item[] itemArray35 = tabela34.registros;
        tabela31.registros = itemArray35;
        ds.Item item37 = null;
        int int38 = tabela31.binaria(item37);
        ds.Item[] itemArray39 = tabela31.registros;
        int int40 = tabela31.n;
        ds.Item item41 = null;
        tabela31.insere(item41);
        ds.Item[] itemArray43 = tabela31.registros;
        ds.Tabela tabela44 = new ds.Tabela();
        int int45 = tabela44.n;
        ds.Item[] itemArray46 = tabela44.registros;
        tabela31.registros = itemArray46;
        tabela0.registros = itemArray46;
        int int49 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (byte) -1;
        int int9 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item[] itemArray15 = tabela14.registros;
        ds.Item item16 = null;
        int int17 = tabela14.binaria(item16);
        int int18 = tabela14.n;
        tabela14.n = (short) -1;
        ds.Item item21 = null;
        tabela14.insere(item21);
        ds.Item[] itemArray23 = tabela14.registros;
        tabela0.registros = itemArray23;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
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
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item[] itemArray23 = tabela22.registros;
        ds.Item item24 = null;
        int int25 = tabela22.binaria(item24);
        int int26 = tabela22.n;
        tabela22.n = (short) -1;
        ds.Item item29 = null;
        tabela22.insere(item29);
        ds.Item[] itemArray31 = tabela22.registros;
        tabela0.registros = itemArray31;
        java.lang.Class<?> wildcardClass33 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        java.lang.Class<?> wildcardClass7 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        tabela0.n = (short) 100;
        ds.Item[] itemArray8 = tabela0.registros;
        java.lang.Class<?> wildcardClass9 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
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
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
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
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        ds.Item item23 = null;
        int int24 = tabela21.binaria(item23);
        int int25 = tabela21.n;
        tabela21.n = (short) -1;
        ds.Item item28 = null;
        tabela21.insere(item28);
        ds.Item[] itemArray30 = tabela21.registros;
        tabela0.registros = itemArray30;
        ds.Item item32 = null;
        int int33 = tabela0.binaria(item32);
        tabela0.n = (-1);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = 1;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.binaria(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = '#';
        ds.Tabela tabela12 = new ds.Tabela();
        int int13 = tabela12.n;
        ds.Item item14 = null;
        int int15 = tabela12.binaria(item14);
        tabela12.n = '#';
        ds.Tabela tabela18 = new ds.Tabela();
        int int19 = tabela18.n;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item[] itemArray21 = tabela20.registros;
        ds.Item item22 = null;
        tabela20.insere(item22);
        tabela20.n = 10;
        int int26 = tabela20.n;
        ds.Tabela tabela27 = new ds.Tabela();
        tabela27.n = 0;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item[] itemArray31 = tabela30.registros;
        tabela27.registros = itemArray31;
        tabela20.registros = itemArray31;
        ds.Item[] itemArray34 = tabela20.registros;
        tabela18.registros = itemArray34;
        tabela12.registros = itemArray34;
        ds.Tabela tabela37 = new ds.Tabela();
        tabela37.n = 0;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item[] itemArray41 = tabela40.registros;
        tabela37.registros = itemArray41;
        ds.Item item43 = null;
        int int44 = tabela37.binaria(item43);
        ds.Item[] itemArray45 = tabela37.registros;
        int int46 = tabela37.n;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item[] itemArray48 = tabela47.registros;
        ds.Item item49 = null;
        tabela47.insere(item49);
        tabela47.n = 10;
        ds.Item[] itemArray53 = tabela47.registros;
        tabela37.registros = itemArray53;
        ds.Item[] itemArray55 = tabela37.registros;
        tabela12.registros = itemArray55;
        tabela0.registros = itemArray55;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
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
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item[] itemArray24 = tabela23.registros;
        ds.Item item25 = null;
        tabela23.insere(item25);
        tabela23.n = 10;
        ds.Item[] itemArray29 = tabela23.registros;
        int int30 = tabela23.n;
        ds.Item[] itemArray31 = tabela23.registros;
        tabela0.registros = itemArray31;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 'a';
        tabela0.n = '#';
        ds.Item[] itemArray5 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 1;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        ds.Item item6 = null;
        tabela4.insere(item6);
        ds.Item item8 = null;
        tabela4.insere(item8);
        tabela4.n = (-1);
        ds.Item[] itemArray12 = tabela4.registros;
        tabela0.registros = itemArray12;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item[] itemArray5 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
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
        tabela0.n = 35;
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = tabela0.pesquisa(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela7.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item[] itemArray15 = tabela0.registros;
        int int16 = tabela0.n;
        ds.Item[] itemArray17 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        int int11 = tabela8.binaria(item10);
        int int12 = tabela8.n;
        tabela8.n = (short) -1;
        ds.Item item15 = null;
        tabela8.insere(item15);
        tabela8.n = (byte) 0;
        ds.Item[] itemArray19 = tabela8.registros;
        ds.Item[] itemArray20 = tabela8.registros;
        tabela0.registros = itemArray20;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = 0;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        int int8 = tabela0.n;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
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
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item item10 = null;
        tabela0.insere(item10);
        int int12 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        int int8 = tabela0.n;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = 'a';
        tabela10.n = 100;
        ds.Item[] itemArray15 = tabela10.registros;
        tabela0.registros = itemArray15;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.pesquisa(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        int int12 = tabela9.binaria(item11);
        tabela9.n = ' ';
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        ds.Item item17 = null;
        tabela15.insere(item17);
        tabela15.n = 10;
        int int21 = tabela15.n;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item[] itemArray26 = tabela25.registros;
        tabela22.registros = itemArray26;
        tabela15.registros = itemArray26;
        tabela9.registros = itemArray26;
        tabela0.registros = itemArray26;
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = tabela0.binaria(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        tabela9.insere(item11);
        ds.Item item13 = null;
        tabela9.insere(item13);
        tabela9.n = (-1);
        ds.Item[] itemArray17 = tabela9.registros;
        tabela0.registros = itemArray17;
        ds.Item item19 = null;
        tabela0.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        ds.Item item23 = null;
        int int24 = tabela21.binaria(item23);
        int int25 = tabela21.n;
        tabela21.n = (short) -1;
        ds.Item item28 = null;
        tabela21.insere(item28);
        ds.Item item30 = null;
        int int31 = tabela21.binaria(item30);
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item[] itemArray33 = tabela32.registros;
        ds.Item item34 = null;
        tabela32.insere(item34);
        tabela32.n = 10;
        int int38 = tabela32.n;
        ds.Tabela tabela39 = new ds.Tabela();
        tabela39.n = 0;
        ds.Tabela tabela42 = new ds.Tabela();
        ds.Item[] itemArray43 = tabela42.registros;
        tabela39.registros = itemArray43;
        tabela32.registros = itemArray43;
        ds.Item[] itemArray46 = tabela32.registros;
        ds.Item[] itemArray47 = tabela32.registros;
        tabela21.registros = itemArray47;
        ds.Item item49 = null;
        int int50 = tabela21.binaria(item49);
        ds.Item[] itemArray51 = tabela21.registros;
        tabela0.registros = itemArray51;
        tabela0.n = 35;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) 100;
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tabela0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        int int8 = tabela0.n;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = 'a';
        tabela10.n = 100;
        ds.Item[] itemArray15 = tabela10.registros;
        tabela0.registros = itemArray15;
        ds.Item item17 = null;
        tabela0.insere(item17);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (short) 0;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = 'a';
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = 35;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
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
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item[] itemArray15 = tabela14.registros;
        ds.Item item16 = null;
        int int17 = tabela14.binaria(item16);
        ds.Item item18 = null;
        tabela14.insere(item18);
        tabela14.n = (byte) 0;
        ds.Item[] itemArray22 = tabela14.registros;
        tabela14.n = (byte) 0;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item[] itemArray29 = tabela28.registros;
        tabela25.registros = itemArray29;
        ds.Item item31 = null;
        int int32 = tabela25.binaria(item31);
        ds.Item[] itemArray33 = tabela25.registros;
        tabela14.registros = itemArray33;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item[] itemArray36 = tabela35.registros;
        ds.Item item37 = null;
        int int38 = tabela35.binaria(item37);
        int int39 = tabela35.n;
        tabela35.n = (short) -1;
        ds.Item item42 = null;
        tabela35.insere(item42);
        ds.Item[] itemArray44 = tabela35.registros;
        tabela14.registros = itemArray44;
        tabela0.registros = itemArray44;
        java.lang.Class<?> wildcardClass47 = itemArray44.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
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
        int int23 = tabela0.n;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        ds.Item item26 = null;
        int int27 = tabela24.binaria(item26);
        int int28 = tabela24.n;
        tabela24.n = (short) -1;
        ds.Item item31 = null;
        tabela24.insere(item31);
        int int33 = tabela24.n;
        ds.Item[] itemArray34 = tabela24.registros;
        tabela0.registros = itemArray34;
        ds.Item[] itemArray36 = tabela0.registros;
        int int37 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
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
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item[] itemArray23 = tabela22.registros;
        ds.Item item24 = null;
        int int25 = tabela22.binaria(item24);
        int int26 = tabela22.n;
        tabela22.n = (short) -1;
        ds.Item item29 = null;
        tabela22.insere(item29);
        ds.Item[] itemArray31 = tabela22.registros;
        tabela0.registros = itemArray31;
        ds.Item[] itemArray33 = tabela0.registros;
        ds.Item[] itemArray34 = tabela0.registros;
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = tabela0.pesquisa(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        int int10 = tabela0.n;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Item[] itemArray9 = tabela0.registros;
        tabela0.n = 32;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
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
        ds.Item item23 = null;
        tabela0.insere(item23);
        java.lang.Class<?> wildcardClass25 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
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
        int int23 = tabela0.n;
        ds.Item[] itemArray24 = tabela0.registros;
        int int25 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        tabela8.n = 1;
        ds.Item item12 = null;
        tabela8.insere(item12);
        ds.Item[] itemArray14 = tabela8.registros;
        tabela0.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        ds.Item item18 = null;
        int int19 = tabela16.binaria(item18);
        ds.Item[] itemArray20 = new ds.Item[] {};
        tabela16.registros = itemArray20;
        tabela0.registros = itemArray20;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        tabela0.n = '4';
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        ds.Item item15 = null;
        int int16 = tabela13.binaria(item15);
        ds.Item item17 = null;
        tabela13.insere(item17);
        ds.Item[] itemArray19 = tabela13.registros;
        tabela0.registros = itemArray19;
        java.lang.Class<?> wildcardClass21 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        tabela0.n = (short) 0;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        ds.Item item7 = null;
        int int8 = tabela5.binaria(item7);
        ds.Item item9 = null;
        tabela5.insere(item9);
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
        tabela5.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item[] itemArray27 = tabela0.registros;
        int int28 = tabela0.n;
        int int29 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = null;
        tabela0.registros = itemArray7;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.binaria(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        int int6 = tabela0.n;
        tabela0.n = (byte) 10;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Tabela tabela1 = new ds.Tabela();
        int int2 = tabela1.n;
        ds.Item[] itemArray3 = tabela1.registros;
        ds.Item[] itemArray4 = tabela1.registros;
        tabela0.registros = itemArray4;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
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
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Tabela tabela6 = new ds.Tabela();
        tabela6.n = 0;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        tabela6.registros = itemArray10;
        ds.Item item12 = null;
        int int13 = tabela6.binaria(item12);
        ds.Item[] itemArray14 = tabela6.registros;
        int int15 = tabela6.n;
        tabela6.n = '4';
        ds.Item[] itemArray18 = tabela6.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        int int20 = tabela19.n;
        ds.Item item21 = null;
        int int22 = tabela19.binaria(item21);
        ds.Item item23 = null;
        tabela19.insere(item23);
        ds.Item[] itemArray25 = tabela19.registros;
        tabela6.registros = itemArray25;
        tabela0.registros = itemArray25;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        ds.Item[] itemArray7 = null;
        tabela0.registros = itemArray7;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        tabela9.insere(item11);
        tabela9.n = 10;
        ds.Item[] itemArray15 = tabela9.registros;
        tabela0.registros = itemArray15;
        ds.Item item17 = null;
        tabela0.insere(item17);
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item[] itemArray20 = tabela19.registros;
        ds.Item item21 = null;
        tabela19.insere(item21);
        tabela19.n = 10;
        ds.Item[] itemArray25 = tabela19.registros;
        tabela19.n = (short) 100;
        ds.Item[] itemArray28 = tabela19.registros;
        tabela0.registros = itemArray28;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        tabela0.n = 10;
        int int10 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        int int8 = tabela0.n;
        int int9 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Tabela tabela1 = new ds.Tabela();
        int int2 = tabela1.n;
        ds.Item[] itemArray3 = tabela1.registros;
        ds.Item[] itemArray4 = tabela1.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tabela0.pesquisa(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        ds.Item[] itemArray15 = tabela13.registros;
        tabela0.registros = itemArray15;
        ds.Item item17 = null;
        tabela0.insere(item17);
        int int19 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
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
        tabela0.n = 32;
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tabela0.binaria(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
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
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
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
        tabela0.n = '4';
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        tabela16.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        ds.Item item26 = null;
        int int27 = tabela24.binaria(item26);
        ds.Item item28 = null;
        tabela24.insere(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item[] itemArray31 = tabela30.registros;
        ds.Item item32 = null;
        tabela30.insere(item32);
        tabela30.n = 10;
        int int36 = tabela30.n;
        ds.Tabela tabela37 = new ds.Tabela();
        tabela37.n = 0;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item[] itemArray41 = tabela40.registros;
        tabela37.registros = itemArray41;
        tabela30.registros = itemArray41;
        tabela24.registros = itemArray41;
        tabela16.registros = itemArray41;
        ds.Item[] itemArray46 = tabela16.registros;
        tabela0.registros = itemArray46;
        ds.Item[] itemArray48 = tabela0.registros;
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item[] itemArray50 = tabela49.registros;
        ds.Item item51 = null;
        tabela49.insere(item51);
        int int53 = tabela49.n;
        int int54 = tabela49.n;
        int int55 = tabela49.n;
        ds.Tabela tabela56 = new ds.Tabela();
        int int57 = tabela56.n;
        ds.Item[] itemArray58 = tabela56.registros;
        tabela49.registros = itemArray58;
        tabela0.registros = itemArray58;
        ds.Item item61 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int62 = tabela0.binaria(item61);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
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
        tabela0.n = '4';
        int int16 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item[] itemArray13 = tabela12.registros;
        ds.Item item14 = null;
        int int15 = tabela12.binaria(item14);
        ds.Item item16 = null;
        tabela12.insere(item16);
        tabela12.n = (byte) 0;
        ds.Item[] itemArray20 = tabela12.registros;
        tabela12.n = (byte) 0;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item[] itemArray24 = tabela23.registros;
        ds.Item item25 = null;
        int int26 = tabela23.binaria(item25);
        int int27 = tabela23.n;
        tabela23.n = (short) -1;
        ds.Item item30 = null;
        tabela23.insere(item30);
        ds.Item[] itemArray32 = tabela23.registros;
        tabela12.registros = itemArray32;
        tabela0.registros = itemArray32;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
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
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item[] itemArray15 = tabela14.registros;
        ds.Item item16 = null;
        int int17 = tabela14.binaria(item16);
        ds.Item item18 = null;
        tabela14.insere(item18);
        tabela14.n = (byte) 0;
        ds.Item[] itemArray22 = tabela14.registros;
        tabela14.n = (byte) 0;
        ds.Tabela tabela25 = new ds.Tabela();
        tabela25.n = 0;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item[] itemArray29 = tabela28.registros;
        tabela25.registros = itemArray29;
        ds.Item item31 = null;
        int int32 = tabela25.binaria(item31);
        ds.Item[] itemArray33 = tabela25.registros;
        tabela14.registros = itemArray33;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item[] itemArray36 = tabela35.registros;
        ds.Item item37 = null;
        int int38 = tabela35.binaria(item37);
        int int39 = tabela35.n;
        tabela35.n = (short) -1;
        ds.Item item42 = null;
        tabela35.insere(item42);
        ds.Item[] itemArray44 = tabela35.registros;
        tabela14.registros = itemArray44;
        tabela0.registros = itemArray44;
        ds.Item item47 = null;
        tabela0.insere(item47);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela7.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        ds.Item item18 = null;
        tabela16.insere(item18);
        tabela16.n = 0;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item[] itemArray24 = tabela23.registros;
        ds.Item item25 = null;
        int int26 = tabela23.binaria(item25);
        ds.Item[] itemArray27 = new ds.Item[] {};
        tabela23.registros = itemArray27;
        tabela16.registros = itemArray27;
        tabela16.n = '4';
        ds.Tabela tabela32 = new ds.Tabela();
        tabela32.n = 0;
        ds.Item item35 = null;
        tabela32.insere(item35);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela32.registros = itemArray38;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item[] itemArray41 = tabela40.registros;
        ds.Item item42 = null;
        int int43 = tabela40.binaria(item42);
        ds.Item item44 = null;
        tabela40.insere(item44);
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item[] itemArray47 = tabela46.registros;
        ds.Item item48 = null;
        tabela46.insere(item48);
        tabela46.n = 10;
        int int52 = tabela46.n;
        ds.Tabela tabela53 = new ds.Tabela();
        tabela53.n = 0;
        ds.Tabela tabela56 = new ds.Tabela();
        ds.Item[] itemArray57 = tabela56.registros;
        tabela53.registros = itemArray57;
        tabela46.registros = itemArray57;
        tabela40.registros = itemArray57;
        tabela32.registros = itemArray57;
        ds.Item[] itemArray62 = tabela32.registros;
        tabela16.registros = itemArray62;
        tabela0.registros = itemArray62;
        java.lang.Class<?> wildcardClass65 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        ds.Item[] itemArray8 = tabela0.registros;
        java.lang.Class<?> wildcardClass9 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
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
        int int48 = tabela44.n;
        tabela44.n = (short) -1;
        ds.Tabela tabela51 = new ds.Tabela();
        int int52 = tabela51.n;
        ds.Item[] itemArray53 = tabela51.registros;
        ds.Item[] itemArray54 = tabela51.registros;
        tabela44.registros = itemArray54;
        ds.Tabela tabela56 = new ds.Tabela();
        tabela56.n = 0;
        ds.Item item59 = null;
        tabela56.insere(item59);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        tabela56.registros = itemArray62;
        tabela44.registros = itemArray62;
        ds.Item[] itemArray65 = tabela44.registros;
        tabela0.registros = itemArray65;
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        tabela0.n = '4';
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = 0;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        tabela13.registros = itemArray17;
        ds.Item item19 = null;
        int int20 = tabela13.binaria(item19);
        ds.Item[] itemArray21 = tabela13.registros;
        int int22 = tabela13.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item[] itemArray24 = tabela23.registros;
        ds.Item item25 = null;
        tabela23.insere(item25);
        tabela23.n = 10;
        ds.Item[] itemArray29 = tabela23.registros;
        tabela13.registros = itemArray29;
        tabela0.registros = itemArray29;
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = tabela0.binaria(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tabela0.binaria(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        int int11 = tabela0.n;
        tabela0.n = (byte) 10;
        tabela0.n = 32;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        int int13 = tabela10.binaria(item12);
        tabela10.n = ' ';
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        ds.Item item18 = null;
        tabela16.insere(item18);
        tabela16.n = 10;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        tabela23.n = 0;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item[] itemArray27 = tabela26.registros;
        tabela23.registros = itemArray27;
        tabela16.registros = itemArray27;
        tabela10.registros = itemArray27;
        tabela0.registros = itemArray27;
        ds.Item[] itemArray32 = tabela0.registros;
        ds.Tabela tabela33 = new ds.Tabela();
        tabela33.n = 0;
        ds.Item item36 = null;
        tabela33.insere(item36);
        tabela33.n = (short) 0;
        ds.Item[] itemArray40 = tabela33.registros;
        ds.Item[] itemArray41 = tabela33.registros;
        tabela0.registros = itemArray41;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item[] itemArray3 = new ds.Item[] {};
        tabela0.registros = itemArray3;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (byte) -1;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
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
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        ds.Item item23 = null;
        int int24 = tabela21.binaria(item23);
        int int25 = tabela21.n;
        tabela21.n = (short) -1;
        ds.Item item28 = null;
        tabela21.insere(item28);
        ds.Item[] itemArray30 = tabela21.registros;
        tabela0.registros = itemArray30;
        ds.Item item32 = null;
        int int33 = tabela0.binaria(item32);
        ds.Item[] itemArray34 = tabela0.registros;
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = tabela0.pesquisa(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = 1;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item[] itemArray8 = null;
        tabela0.registros = itemArray8;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        tabela10.insere(item12);
        tabela10.n = 10;
        ds.Item[] itemArray16 = tabela10.registros;
        tabela0.registros = itemArray16;
        ds.Item[] itemArray18 = tabela0.registros;
        tabela0.n = '#';
        ds.Tabela tabela21 = new ds.Tabela();
        tabela21.n = 0;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        tabela21.registros = itemArray25;
        ds.Item item27 = null;
        int int28 = tabela21.binaria(item27);
        ds.Item[] itemArray29 = tabela21.registros;
        ds.Item item30 = null;
        int int31 = tabela21.binaria(item30);
        ds.Item[] itemArray32 = tabela21.registros;
        tabela0.registros = itemArray32;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item[] itemArray35 = tabela34.registros;
        ds.Item item36 = null;
        tabela34.insere(item36);
        int int38 = tabela34.n;
        tabela34.n = 2;
        ds.Tabela tabela41 = new ds.Tabela();
        tabela41.n = 0;
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item[] itemArray45 = tabela44.registros;
        tabela41.registros = itemArray45;
        ds.Item item47 = null;
        int int48 = tabela41.binaria(item47);
        ds.Item[] itemArray49 = tabela41.registros;
        int int50 = tabela41.n;
        ds.Item item51 = null;
        tabela41.insere(item51);
        ds.Item[] itemArray53 = tabela41.registros;
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item[] itemArray55 = tabela54.registros;
        ds.Item item56 = null;
        tabela54.insere(item56);
        int int58 = tabela54.n;
        ds.Item item59 = null;
        tabela54.insere(item59);
        ds.Item[] itemArray61 = tabela54.registros;
        tabela41.registros = itemArray61;
        tabela34.registros = itemArray61;
        tabela0.registros = itemArray61;
        ds.Item[] itemArray65 = tabela0.registros;
        int int66 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 35 + "'", int66 == 35);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        int int6 = tabela0.n;
        java.lang.Class<?> wildcardClass7 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        tabela8.insere(item10);
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item[] itemArray13 = tabela12.registros;
        tabela8.registros = itemArray13;
        ds.Item[] itemArray15 = null;
        tabela8.registros = itemArray15;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item item19 = null;
        tabela17.insere(item19);
        tabela17.n = 10;
        ds.Item[] itemArray23 = tabela17.registros;
        tabela8.registros = itemArray23;
        tabela0.registros = itemArray23;
        ds.Item item26 = null;
        int int27 = tabela0.binaria(item26);
        ds.Tabela tabela28 = new ds.Tabela();
        int int29 = tabela28.n;
        ds.Item[] itemArray30 = tabela28.registros;
        ds.Item[] itemArray31 = new ds.Item[] {};
        tabela28.registros = itemArray31;
        ds.Item[] itemArray33 = tabela28.registros;
        ds.Item[] itemArray34 = tabela28.registros;
        tabela28.n = (byte) -1;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item[] itemArray38 = tabela37.registros;
        ds.Item item39 = null;
        int int40 = tabela37.binaria(item39);
        ds.Item item41 = null;
        tabela37.insere(item41);
        tabela37.n = (byte) 0;
        ds.Item[] itemArray45 = tabela37.registros;
        tabela37.n = (byte) 0;
        ds.Tabela tabela48 = new ds.Tabela();
        tabela48.n = 0;
        ds.Tabela tabela51 = new ds.Tabela();
        ds.Item[] itemArray52 = tabela51.registros;
        tabela48.registros = itemArray52;
        ds.Item item54 = null;
        int int55 = tabela48.binaria(item54);
        ds.Item[] itemArray56 = tabela48.registros;
        tabela37.registros = itemArray56;
        ds.Tabela tabela58 = new ds.Tabela();
        ds.Item[] itemArray59 = tabela58.registros;
        ds.Item item60 = null;
        int int61 = tabela58.binaria(item60);
        int int62 = tabela58.n;
        tabela58.n = (short) -1;
        ds.Item item65 = null;
        tabela58.insere(item65);
        ds.Item[] itemArray67 = tabela58.registros;
        tabela37.registros = itemArray67;
        ds.Item[] itemArray69 = tabela37.registros;
        tabela28.registros = itemArray69;
        tabela0.registros = itemArray69;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray69);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item[] itemArray8 = tabela7.registros;
        ds.Item item9 = null;
        tabela7.insere(item9);
        tabela7.n = 10;
        int int13 = tabela7.n;
        ds.Tabela tabela14 = new ds.Tabela();
        tabela14.n = 0;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        tabela14.registros = itemArray18;
        tabela7.registros = itemArray18;
        ds.Item[] itemArray21 = tabela7.registros;
        tabela0.registros = itemArray21;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item[] itemArray13 = tabela12.registros;
        ds.Item item14 = null;
        int int15 = tabela12.binaria(item14);
        tabela12.n = ' ';
        ds.Item[] itemArray18 = tabela12.registros;
        tabela0.registros = itemArray18;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        tabela10.insere(item12);
        tabela10.n = 10;
        ds.Item[] itemArray16 = tabela10.registros;
        tabela0.registros = itemArray16;
        ds.Item[] itemArray18 = tabela0.registros;
        tabela0.n = (short) 100;
        tabela0.n = (byte) 1;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = 0;
        java.lang.Class<?> wildcardClass6 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
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
        tabela0.n = '4';
        tabela0.n = ' ';
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item[] itemArray26 = tabela25.registros;
        ds.Item item27 = null;
        tabela25.insere(item27);
        int int29 = tabela25.n;
        int int30 = tabela25.n;
        int int31 = tabela25.n;
        int int32 = tabela25.n;
        ds.Tabela tabela33 = new ds.Tabela();
        tabela33.n = 0;
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item[] itemArray37 = tabela36.registros;
        tabela33.registros = itemArray37;
        ds.Item item39 = null;
        int int40 = tabela33.binaria(item39);
        ds.Item[] itemArray41 = tabela33.registros;
        int int42 = tabela33.n;
        ds.Item item43 = null;
        tabela33.insere(item43);
        ds.Item[] itemArray45 = tabela33.registros;
        ds.Item[] itemArray46 = tabela33.registros;
        tabela25.registros = itemArray46;
        tabela0.registros = itemArray46;
        java.lang.Class<?> wildcardClass49 = itemArray46.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = (-1);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        int int13 = tabela0.binaria(item12);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        tabela0.n = (short) 0;
        ds.Item item4 = null;
        tabela0.insere(item4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
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
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.binaria(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        tabela8.insere(item10);
        tabela8.n = 10;
        int int14 = tabela8.n;
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = 0;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela15.registros = itemArray19;
        tabela8.registros = itemArray19;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela6.registros = itemArray22;
        tabela0.registros = itemArray22;
        int int25 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
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
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item[] itemArray23 = tabela22.registros;
        ds.Item item24 = null;
        int int25 = tabela22.binaria(item24);
        int int26 = tabela22.n;
        tabela22.n = (short) -1;
        ds.Item item29 = null;
        tabela22.insere(item29);
        ds.Item[] itemArray31 = tabela22.registros;
        tabela0.registros = itemArray31;
        tabela0.n = (short) 10;
        java.lang.Class<?> wildcardClass35 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        tabela0.n = (short) 1;
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = 2;
        int int12 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Item[] itemArray9 = tabela0.registros;
        int int10 = tabela0.n;
        tabela0.n = 10;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela0.registros = itemArray6;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        tabela8.n = 1;
        ds.Item item12 = null;
        tabela8.insere(item12);
        ds.Item[] itemArray14 = tabela8.registros;
        tabela0.registros = itemArray14;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        ds.Item item18 = null;
        int int19 = tabela16.binaria(item18);
        ds.Item[] itemArray20 = new ds.Item[] {};
        tabela16.registros = itemArray20;
        tabela0.registros = itemArray20;
        tabela0.n = '#';
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 1;
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
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Tabela tabela2 = new ds.Tabela();
        ds.Item[] itemArray3 = tabela2.registros;
        ds.Item item4 = null;
        tabela2.insere(item4);
        tabela2.n = 10;
        int int8 = tabela2.n;
        ds.Tabela tabela9 = new ds.Tabela();
        tabela9.n = 0;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item[] itemArray13 = tabela12.registros;
        tabela9.registros = itemArray13;
        tabela2.registros = itemArray13;
        ds.Item[] itemArray16 = tabela2.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        tabela0.insere(item18);
        int int20 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
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
        ds.Item[] itemArray21 = tabela8.registros;
        tabela0.registros = itemArray21;
        ds.Tabela tabela23 = new ds.Tabela();
        int int24 = tabela23.n;
        ds.Item item25 = null;
        int int26 = tabela23.binaria(item25);
        ds.Item[] itemArray27 = tabela23.registros;
        tabela0.registros = itemArray27;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
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
        ds.Tabela tabela23 = new ds.Tabela();
        int int24 = tabela23.n;
        ds.Item item25 = null;
        int int26 = tabela23.binaria(item25);
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela0.registros = itemArray28;
        ds.Item item30 = null;
        tabela0.insere(item30);
        ds.Item item32 = null;
        tabela0.insere(item32);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        tabela0.n = (short) 1;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        int int11 = tabela8.binaria(item10);
        tabela8.n = 0;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item[] itemArray15 = tabela14.registros;
        ds.Item item16 = null;
        tabela14.insere(item16);
        int int18 = tabela14.n;
        ds.Item item19 = null;
        tabela14.insere(item19);
        tabela14.n = 0;
        ds.Item[] itemArray23 = tabela14.registros;
        tabela8.registros = itemArray23;
        tabela0.registros = itemArray23;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = 10;
        tabela0.n = 35;
        tabela0.n = 52;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela7.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
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
        ds.Item[] itemArray21 = tabela8.registros;
        tabela0.registros = itemArray21;
        ds.Item item23 = null;
        tabela0.insere(item23);
        tabela0.n = 32;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
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
        tabela0.n = '4';
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        tabela16.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        ds.Item item26 = null;
        int int27 = tabela24.binaria(item26);
        ds.Item item28 = null;
        tabela24.insere(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item[] itemArray31 = tabela30.registros;
        ds.Item item32 = null;
        tabela30.insere(item32);
        tabela30.n = 10;
        int int36 = tabela30.n;
        ds.Tabela tabela37 = new ds.Tabela();
        tabela37.n = 0;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item[] itemArray41 = tabela40.registros;
        tabela37.registros = itemArray41;
        tabela30.registros = itemArray41;
        tabela24.registros = itemArray41;
        tabela16.registros = itemArray41;
        ds.Item[] itemArray46 = tabela16.registros;
        tabela0.registros = itemArray46;
        ds.Item[] itemArray48 = tabela0.registros;
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item[] itemArray50 = tabela49.registros;
        ds.Item item51 = null;
        tabela49.insere(item51);
        int int53 = tabela49.n;
        int int54 = tabela49.n;
        int int55 = tabela49.n;
        ds.Tabela tabela56 = new ds.Tabela();
        int int57 = tabela56.n;
        ds.Item[] itemArray58 = tabela56.registros;
        tabela49.registros = itemArray58;
        tabela0.registros = itemArray58;
        java.lang.Class<?> wildcardClass61 = itemArray58.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (-1);
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        int int12 = tabela9.binaria(item11);
        tabela9.n = ' ';
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        ds.Item item17 = null;
        tabela15.insere(item17);
        tabela15.n = 10;
        int int21 = tabela15.n;
        ds.Tabela tabela22 = new ds.Tabela();
        tabela22.n = 0;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item[] itemArray26 = tabela25.registros;
        tabela22.registros = itemArray26;
        tabela15.registros = itemArray26;
        tabela9.registros = itemArray26;
        tabela0.registros = itemArray26;
        ds.Item[] itemArray31 = tabela0.registros;
        tabela0.n = 'a';
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.binaria(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        tabela10.insere(item12);
        tabela10.n = 10;
        ds.Item[] itemArray16 = tabela10.registros;
        tabela0.registros = itemArray16;
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Item[] itemArray19 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        tabela0.n = 0;
        int int9 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
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
        tabela0.n = ' ';
        ds.Item[] itemArray23 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        tabela0.n = (short) 1;
        ds.Item item8 = null;
        tabela0.insere(item8);
        int int10 = tabela0.n;
        int int11 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.binaria(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        int int5 = tabela0.binaria(item4);
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        tabela0.n = 2;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela7.registros = itemArray11;
        ds.Item item13 = null;
        int int14 = tabela7.binaria(item13);
        ds.Item[] itemArray15 = tabela7.registros;
        int int16 = tabela7.n;
        ds.Item item17 = null;
        tabela7.insere(item17);
        ds.Item[] itemArray19 = tabela7.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item[] itemArray21 = tabela20.registros;
        ds.Item item22 = null;
        tabela20.insere(item22);
        int int24 = tabela20.n;
        ds.Item item25 = null;
        tabela20.insere(item25);
        ds.Item[] itemArray27 = tabela20.registros;
        tabela7.registros = itemArray27;
        tabela0.registros = itemArray27;
        java.lang.Class<?> wildcardClass30 = itemArray27.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        ds.Item item5 = null;
        tabela3.insere(item5);
        tabela3.n = 0;
        int int9 = tabela3.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        int int13 = tabela10.binaria(item12);
        ds.Item[] itemArray14 = new ds.Item[] {};
        tabela10.registros = itemArray14;
        tabela3.registros = itemArray14;
        tabela3.n = '4';
        ds.Item[] itemArray19 = tabela3.registros;
        tabela0.registros = itemArray19;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        int int5 = tabela0.n;
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
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        tabela8.insere(item10);
        tabela8.n = 10;
        int int14 = tabela8.n;
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = 0;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela15.registros = itemArray19;
        tabela8.registros = itemArray19;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela6.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = ' ';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        ds.Item item8 = null;
        tabela6.insere(item8);
        tabela6.n = 10;
        int int12 = tabela6.n;
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = 0;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        tabela13.registros = itemArray17;
        tabela6.registros = itemArray17;
        tabela0.registros = itemArray17;
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        int int23 = tabela22.n;
        ds.Item[] itemArray24 = tabela22.registros;
        ds.Item[] itemArray25 = new ds.Item[] {};
        tabela22.registros = itemArray25;
        ds.Item[] itemArray27 = tabela22.registros;
        ds.Item[] itemArray28 = tabela22.registros;
        tabela0.registros = itemArray28;
        tabela0.n = 0;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.binaria(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 1;
        ds.Tabela tabela4 = new ds.Tabela();
        int int5 = tabela4.n;
        int int6 = tabela4.n;
        ds.Item item7 = null;
        tabela4.insere(item7);
        ds.Item[] itemArray9 = tabela4.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        tabela10.insere(item12);
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item[] itemArray15 = tabela14.registros;
        tabela10.registros = itemArray15;
        tabela4.registros = itemArray15;
        tabela0.registros = itemArray15;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item[] itemArray10 = null;
        tabela0.registros = itemArray10;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 0;
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        java.lang.Class<?> wildcardClass11 = itemArray10.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        tabela0.n = (byte) 1;
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item item7 = null;
        tabela0.insere(item7);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        int int8 = tabela0.n;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        tabela9.insere(item11);
        tabela9.n = 0;
        tabela9.n = 100;
        ds.Item[] itemArray17 = tabela9.registros;
        ds.Item[] itemArray18 = tabela9.registros;
        tabela0.registros = itemArray18;
        tabela0.n = (-1);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
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
        tabela0.n = 0;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        tabela8.insere(item10);
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item[] itemArray13 = tabela12.registros;
        tabela8.registros = itemArray13;
        ds.Item[] itemArray15 = null;
        tabela8.registros = itemArray15;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item item19 = null;
        tabela17.insere(item19);
        tabela17.n = 10;
        ds.Item[] itemArray23 = tabela17.registros;
        tabela8.registros = itemArray23;
        tabela0.registros = itemArray23;
        ds.Tabela tabela26 = new ds.Tabela();
        tabela26.n = 0;
        ds.Item item29 = null;
        tabela26.insere(item29);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        tabela26.registros = itemArray32;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item[] itemArray35 = tabela34.registros;
        ds.Item item36 = null;
        int int37 = tabela34.binaria(item36);
        ds.Item item38 = null;
        tabela34.insere(item38);
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item[] itemArray41 = tabela40.registros;
        ds.Item item42 = null;
        tabela40.insere(item42);
        tabela40.n = 10;
        int int46 = tabela40.n;
        ds.Tabela tabela47 = new ds.Tabela();
        tabela47.n = 0;
        ds.Tabela tabela50 = new ds.Tabela();
        ds.Item[] itemArray51 = tabela50.registros;
        tabela47.registros = itemArray51;
        tabela40.registros = itemArray51;
        tabela34.registros = itemArray51;
        tabela26.registros = itemArray51;
        ds.Item[] itemArray56 = tabela26.registros;
        tabela0.registros = itemArray56;
        ds.Tabela tabela58 = new ds.Tabela();
        ds.Item[] itemArray59 = tabela58.registros;
        ds.Item item60 = null;
        int int61 = tabela58.binaria(item60);
        ds.Item[] itemArray62 = new ds.Item[] {};
        tabela58.registros = itemArray62;
        tabela0.registros = itemArray62;
        ds.Item item65 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int66 = tabela0.pesquisa(item65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
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
        int int11 = tabela0.n;
        ds.Tabela tabela12 = new ds.Tabela();
        tabela12.n = 0;
        ds.Item item15 = null;
        tabela12.insere(item15);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        tabela12.registros = itemArray18;
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
        tabela12.registros = itemArray37;
        ds.Item[] itemArray42 = tabela12.registros;
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item[] itemArray44 = tabela43.registros;
        ds.Item item45 = null;
        int int46 = tabela43.binaria(item45);
        ds.Item item47 = null;
        int int48 = tabela43.binaria(item47);
        ds.Item[] itemArray49 = tabela43.registros;
        ds.Tabela tabela50 = new ds.Tabela();
        tabela50.n = 0;
        ds.Tabela tabela53 = new ds.Tabela();
        ds.Item[] itemArray54 = tabela53.registros;
        tabela50.registros = itemArray54;
        ds.Tabela tabela56 = new ds.Tabela();
        int int57 = tabela56.n;
        ds.Item item58 = null;
        int int59 = tabela56.binaria(item58);
        tabela56.n = '#';
        ds.Item[] itemArray62 = tabela56.registros;
        ds.Item[] itemArray63 = tabela56.registros;
        tabela50.registros = itemArray63;
        tabela43.registros = itemArray63;
        tabela12.registros = itemArray63;
        tabela0.registros = itemArray63;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray63);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Item[] itemArray6 = tabela0.registros;
        java.lang.Class<?> wildcardClass7 = itemArray6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item[] itemArray4 = new ds.Item[] {};
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        int int8 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
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
        int int22 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        tabela10.insere(item12);
        tabela10.n = 10;
        ds.Item[] itemArray16 = tabela10.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        int int20 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = tabela0.registros;
        tabela0.n = (byte) 0;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        tabela8.insere(item10);
        tabela8.n = 10;
        int int14 = tabela8.n;
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = 0;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela15.registros = itemArray19;
        tabela8.registros = itemArray19;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela6.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item[] itemArray25 = tabela0.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item[] itemArray27 = tabela26.registros;
        ds.Item item28 = null;
        int int29 = tabela26.binaria(item28);
        ds.Item item30 = null;
        tabela26.insere(item30);
        ds.Item item32 = null;
        tabela26.insere(item32);
        ds.Item item34 = null;
        tabela26.insere(item34);
        tabela26.n = '#';
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item[] itemArray39 = tabela38.registros;
        tabela38.n = 1;
        ds.Item item42 = null;
        tabela38.insere(item42);
        ds.Item[] itemArray44 = tabela38.registros;
        ds.Item[] itemArray45 = tabela38.registros;
        ds.Item item46 = null;
        tabela38.insere(item46);
        ds.Tabela tabela48 = new ds.Tabela();
        ds.Item[] itemArray49 = tabela48.registros;
        ds.Item item50 = null;
        int int51 = tabela48.binaria(item50);
        tabela48.n = ' ';
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item[] itemArray55 = tabela54.registros;
        ds.Item item56 = null;
        tabela54.insere(item56);
        tabela54.n = 10;
        int int60 = tabela54.n;
        ds.Tabela tabela61 = new ds.Tabela();
        tabela61.n = 0;
        ds.Tabela tabela64 = new ds.Tabela();
        ds.Item[] itemArray65 = tabela64.registros;
        tabela61.registros = itemArray65;
        tabela54.registros = itemArray65;
        tabela48.registros = itemArray65;
        tabela38.registros = itemArray65;
        ds.Tabela tabela70 = new ds.Tabela();
        tabela70.n = 0;
        ds.Item item73 = null;
        tabela70.insere(item73);
        ds.Item item75 = null;
        ds.Item[] itemArray76 = new ds.Item[] { item75 };
        tabela70.registros = itemArray76;
        ds.Tabela tabela78 = new ds.Tabela();
        tabela78.n = 0;
        ds.Tabela tabela81 = new ds.Tabela();
        ds.Item[] itemArray82 = tabela81.registros;
        tabela78.registros = itemArray82;
        ds.Item item84 = null;
        int int85 = tabela78.binaria(item84);
        ds.Item[] itemArray86 = tabela78.registros;
        int int87 = tabela78.n;
        ds.Item item88 = null;
        tabela78.insere(item88);
        ds.Item[] itemArray90 = tabela78.registros;
        ds.Tabela tabela91 = new ds.Tabela();
        int int92 = tabela91.n;
        ds.Item[] itemArray93 = tabela91.registros;
        tabela78.registros = itemArray93;
        tabela70.registros = itemArray93;
        tabela38.registros = itemArray93;
        tabela26.registros = itemArray93;
        tabela0.registros = itemArray93;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(itemArray86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(itemArray90);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(itemArray93);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
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
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tabela0.pesquisa(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
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
        ds.Tabela tabela23 = new ds.Tabela();
        int int24 = tabela23.n;
        ds.Item item25 = null;
        int int26 = tabela23.binaria(item25);
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela0.registros = itemArray28;
        ds.Item item30 = null;
        tabela0.insere(item30);
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item[] itemArray33 = tabela32.registros;
        ds.Item item34 = null;
        int int35 = tabela32.binaria(item34);
        ds.Item item36 = null;
        tabela32.insere(item36);
        tabela32.n = (byte) 0;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item[] itemArray41 = tabela40.registros;
        ds.Item item42 = null;
        tabela40.insere(item42);
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item[] itemArray45 = tabela44.registros;
        tabela40.registros = itemArray45;
        ds.Item[] itemArray47 = null;
        tabela40.registros = itemArray47;
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item[] itemArray50 = tabela49.registros;
        ds.Item item51 = null;
        tabela49.insere(item51);
        tabela49.n = 10;
        ds.Item[] itemArray55 = tabela49.registros;
        tabela40.registros = itemArray55;
        tabela32.registros = itemArray55;
        ds.Tabela tabela58 = new ds.Tabela();
        tabela58.n = 0;
        ds.Item item61 = null;
        tabela58.insere(item61);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        tabela58.registros = itemArray64;
        ds.Tabela tabela66 = new ds.Tabela();
        ds.Item[] itemArray67 = tabela66.registros;
        ds.Item item68 = null;
        int int69 = tabela66.binaria(item68);
        ds.Item item70 = null;
        tabela66.insere(item70);
        ds.Tabela tabela72 = new ds.Tabela();
        ds.Item[] itemArray73 = tabela72.registros;
        ds.Item item74 = null;
        tabela72.insere(item74);
        tabela72.n = 10;
        int int78 = tabela72.n;
        ds.Tabela tabela79 = new ds.Tabela();
        tabela79.n = 0;
        ds.Tabela tabela82 = new ds.Tabela();
        ds.Item[] itemArray83 = tabela82.registros;
        tabela79.registros = itemArray83;
        tabela72.registros = itemArray83;
        tabela66.registros = itemArray83;
        tabela58.registros = itemArray83;
        ds.Item[] itemArray88 = tabela58.registros;
        tabela32.registros = itemArray88;
        tabela0.registros = itemArray88;
        ds.Item[] itemArray91 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertNotNull(itemArray83);
        org.junit.Assert.assertNotNull(itemArray88);
        org.junit.Assert.assertNotNull(itemArray91);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item[] itemArray5 = tabela4.registros;
        tabela0.registros = itemArray5;
        tabela0.n = (byte) 1;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
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
        tabela0.n = 100;
        java.lang.Class<?> wildcardClass24 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
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
        tabela0.n = '4';
        ds.Tabela tabela16 = new ds.Tabela();
        tabela16.n = 0;
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        tabela16.registros = itemArray22;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        ds.Item item26 = null;
        int int27 = tabela24.binaria(item26);
        ds.Item item28 = null;
        tabela24.insere(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item[] itemArray31 = tabela30.registros;
        ds.Item item32 = null;
        tabela30.insere(item32);
        tabela30.n = 10;
        int int36 = tabela30.n;
        ds.Tabela tabela37 = new ds.Tabela();
        tabela37.n = 0;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item[] itemArray41 = tabela40.registros;
        tabela37.registros = itemArray41;
        tabela30.registros = itemArray41;
        tabela24.registros = itemArray41;
        tabela16.registros = itemArray41;
        ds.Item[] itemArray46 = tabela16.registros;
        tabela0.registros = itemArray46;
        ds.Item[] itemArray48 = tabela0.registros;
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item[] itemArray50 = tabela49.registros;
        ds.Item item51 = null;
        tabela49.insere(item51);
        int int53 = tabela49.n;
        int int54 = tabela49.n;
        int int55 = tabela49.n;
        ds.Tabela tabela56 = new ds.Tabela();
        int int57 = tabela56.n;
        ds.Item[] itemArray58 = tabela56.registros;
        tabela49.registros = itemArray58;
        tabela0.registros = itemArray58;
        java.lang.Class<?> wildcardClass61 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = '#';
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        tabela8.insere(item10);
        tabela8.n = 10;
        int int14 = tabela8.n;
        ds.Tabela tabela15 = new ds.Tabela();
        tabela15.n = 0;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        tabela15.registros = itemArray19;
        tabela8.registros = itemArray19;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela6.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Item[] itemArray25 = tabela0.registros;
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = tabela0.binaria(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
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
        tabela0.n = ' ';
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tabela0.pesquisa(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item[] itemArray10 = tabela9.registros;
        ds.Item item11 = null;
        tabela9.insere(item11);
        int int13 = tabela9.n;
        ds.Item item14 = null;
        tabela9.insere(item14);
        tabela9.n = 0;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        ds.Item item20 = null;
        int int21 = tabela18.binaria(item20);
        ds.Item item22 = null;
        int int23 = tabela18.binaria(item22);
        ds.Item[] itemArray24 = tabela18.registros;
        tabela9.registros = itemArray24;
        tabela0.registros = itemArray24;
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = tabela0.binaria(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
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
        tabela0.n = 35;
        tabela0.n = (short) 1;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Tabela tabela1 = new ds.Tabela();
        int int2 = tabela1.n;
        ds.Item[] itemArray3 = tabela1.registros;
        ds.Item[] itemArray4 = tabela1.registros;
        tabela0.registros = itemArray4;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        tabela0.n = 35;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        int int14 = tabela13.n;
        ds.Item[] itemArray15 = tabela13.registros;
        tabela0.registros = itemArray15;
        ds.Item item17 = null;
        tabela0.insere(item17);
        ds.Item[] itemArray19 = tabela0.registros;
        tabela0.n = (byte) 10;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item[] itemArray23 = tabela22.registros;
        ds.Item item24 = null;
        tabela22.insere(item24);
        int int26 = tabela22.n;
        ds.Item item27 = null;
        tabela22.insere(item27);
        ds.Item[] itemArray29 = tabela22.registros;
        tabela0.registros = itemArray29;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = '4';
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = 0;
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item[] itemArray14 = tabela13.registros;
        ds.Item item15 = null;
        tabela13.insere(item15);
        ds.Tabela tabela17 = new ds.Tabela();
        tabela17.n = 0;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item[] itemArray21 = tabela20.registros;
        tabela17.registros = itemArray21;
        ds.Item item23 = null;
        int int24 = tabela17.binaria(item23);
        ds.Item[] itemArray25 = tabela17.registros;
        tabela13.registros = itemArray25;
        tabela0.registros = itemArray25;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
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
        int int23 = tabela0.n;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        ds.Item item26 = null;
        int int27 = tabela24.binaria(item26);
        int int28 = tabela24.n;
        tabela24.n = (short) -1;
        ds.Item item31 = null;
        tabela24.insere(item31);
        int int33 = tabela24.n;
        ds.Item[] itemArray34 = tabela24.registros;
        tabela0.registros = itemArray34;
        ds.Item[] itemArray36 = tabela0.registros;
        tabela0.n = (byte) 0;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
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
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item[] itemArray23 = tabela22.registros;
        ds.Item item24 = null;
        int int25 = tabela22.binaria(item24);
        int int26 = tabela22.n;
        tabela22.n = (short) -1;
        ds.Item item29 = null;
        tabela22.insere(item29);
        ds.Item[] itemArray31 = tabela22.registros;
        tabela0.registros = itemArray31;
        ds.Item[] itemArray33 = tabela0.registros;
        java.lang.Class<?> wildcardClass34 = itemArray33.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
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
        tabela0.n = (byte) 100;
        ds.Item[] itemArray16 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = ' ';
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
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
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        tabela8.insere(item10);
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item[] itemArray13 = tabela12.registros;
        tabela8.registros = itemArray13;
        ds.Item[] itemArray15 = null;
        tabela8.registros = itemArray15;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item item19 = null;
        tabela17.insere(item19);
        tabela17.n = 10;
        ds.Item[] itemArray23 = tabela17.registros;
        tabela8.registros = itemArray23;
        tabela0.registros = itemArray23;
        ds.Tabela tabela26 = new ds.Tabela();
        tabela26.n = 0;
        ds.Item item29 = null;
        tabela26.insere(item29);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        tabela26.registros = itemArray32;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item[] itemArray35 = tabela34.registros;
        ds.Item item36 = null;
        int int37 = tabela34.binaria(item36);
        ds.Item item38 = null;
        tabela34.insere(item38);
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item[] itemArray41 = tabela40.registros;
        ds.Item item42 = null;
        tabela40.insere(item42);
        tabela40.n = 10;
        int int46 = tabela40.n;
        ds.Tabela tabela47 = new ds.Tabela();
        tabela47.n = 0;
        ds.Tabela tabela50 = new ds.Tabela();
        ds.Item[] itemArray51 = tabela50.registros;
        tabela47.registros = itemArray51;
        tabela40.registros = itemArray51;
        tabela34.registros = itemArray51;
        tabela26.registros = itemArray51;
        ds.Item[] itemArray56 = tabela26.registros;
        tabela0.registros = itemArray56;
        ds.Tabela tabela58 = new ds.Tabela();
        ds.Item[] itemArray59 = tabela58.registros;
        ds.Item item60 = null;
        int int61 = tabela58.binaria(item60);
        ds.Item[] itemArray62 = new ds.Item[] {};
        tabela58.registros = itemArray62;
        tabela0.registros = itemArray62;
        java.lang.Class<?> wildcardClass65 = itemArray62.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item[] itemArray6 = tabela5.registros;
        ds.Item item7 = null;
        tabela5.insere(item7);
        tabela5.n = 0;
        tabela5.n = 100;
        ds.Item[] itemArray13 = tabela5.registros;
        tabela5.n = '#';
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        ds.Item item18 = null;
        int int19 = tabela16.binaria(item18);
        ds.Item item20 = null;
        tabela16.insere(item20);
        tabela16.n = (byte) 0;
        ds.Item[] itemArray24 = tabela16.registros;
        tabela5.registros = itemArray24;
        tabela0.registros = itemArray24;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = (-1);
        int int8 = tabela0.n;
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
        ds.Item[] itemArray43 = tabela10.registros;
        ds.Item[] itemArray44 = tabela10.registros;
        tabela0.registros = itemArray44;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
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
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = (-1);
        ds.Item item8 = null;
        tabela0.insere(item8);
        tabela0.n = (byte) 1;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item[] itemArray13 = tabela12.registros;
        ds.Item item14 = null;
        tabela12.insere(item14);
        tabela12.n = 0;
        int int18 = tabela12.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item[] itemArray20 = tabela19.registros;
        ds.Item item21 = null;
        int int22 = tabela19.binaria(item21);
        ds.Item[] itemArray23 = new ds.Item[] {};
        tabela19.registros = itemArray23;
        tabela12.registros = itemArray23;
        tabela0.registros = itemArray23;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        java.lang.Class<?> wildcardClass3 = tabela0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        tabela0.n = (short) 100;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        int int11 = tabela0.n;
        ds.Item item12 = null;
        tabela0.insere(item12);
        int int14 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        tabela10.insere(item12);
        tabela10.n = 10;
        ds.Item[] itemArray16 = tabela10.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        int int19 = tabela0.binaria(item18);
        ds.Item[] itemArray20 = tabela0.registros;
        tabela0.n = ' ';
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
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
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        ds.Item item23 = null;
        int int24 = tabela21.binaria(item23);
        int int25 = tabela21.n;
        tabela21.n = (short) -1;
        ds.Item item28 = null;
        tabela21.insere(item28);
        ds.Item[] itemArray30 = tabela21.registros;
        tabela0.registros = itemArray30;
        ds.Item item32 = null;
        int int33 = tabela0.binaria(item32);
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item[] itemArray35 = tabela34.registros;
        tabela0.registros = itemArray35;
        ds.Item[] itemArray37 = tabela0.registros;
        ds.Item item38 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int39 = tabela0.pesquisa(item38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (byte) 0;
        ds.Item[] itemArray9 = tabela0.registros;
        tabela0.n = '#';
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
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
        ds.Item[] itemArray12 = tabela11.registros;
        ds.Item item13 = null;
        int int14 = tabela11.binaria(item13);
        int int15 = tabela11.n;
        tabela11.n = (short) -1;
        ds.Item item18 = null;
        tabela11.insere(item18);
        ds.Item[] itemArray20 = tabela11.registros;
        tabela0.registros = itemArray20;
        ds.Item item22 = null;
        tabela0.insere(item22);
        int int24 = tabela0.n;
        java.lang.Class<?> wildcardClass25 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        tabela0.n = 0;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        int int11 = tabela0.binaria(item10);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        tabela0.n = ' ';
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item[] itemArray7 = tabela6.registros;
        ds.Item item8 = null;
        tabela6.insere(item8);
        tabela6.n = 10;
        int int12 = tabela6.n;
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = 0;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        tabela13.registros = itemArray17;
        tabela6.registros = itemArray17;
        tabela0.registros = itemArray17;
        ds.Item[] itemArray21 = tabela0.registros;
        int int22 = tabela0.n;
        tabela0.n = (byte) -1;
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tabela0.pesquisa(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
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
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item[] itemArray22 = tabela21.registros;
        ds.Item item23 = null;
        int int24 = tabela21.binaria(item23);
        int int25 = tabela21.n;
        tabela21.n = (short) -1;
        ds.Item item28 = null;
        tabela21.insere(item28);
        ds.Item[] itemArray30 = tabela21.registros;
        tabela0.registros = itemArray30;
        ds.Item item32 = null;
        int int33 = tabela0.binaria(item32);
        ds.Item item34 = null;
        tabela0.insere(item34);
        tabela0.n = (byte) -1;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        ds.Item item12 = null;
        tabela10.insere(item12);
        tabela10.n = 10;
        ds.Item[] itemArray16 = tabela10.registros;
        tabela0.registros = itemArray16;
        ds.Item[] itemArray18 = tabela0.registros;
        int int19 = tabela0.n;
        ds.Item[] itemArray20 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
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
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        ds.Item item17 = null;
        int int18 = tabela15.binaria(item17);
        ds.Item item19 = null;
        tabela15.insere(item19);
        tabela15.n = (byte) 0;
        ds.Item[] itemArray23 = tabela15.registros;
        tabela15.n = (byte) 0;
        ds.Tabela tabela26 = new ds.Tabela();
        tabela26.n = 0;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item[] itemArray30 = tabela29.registros;
        tabela26.registros = itemArray30;
        ds.Item item32 = null;
        int int33 = tabela26.binaria(item32);
        ds.Item[] itemArray34 = tabela26.registros;
        tabela15.registros = itemArray34;
        ds.Item[] itemArray36 = tabela15.registros;
        int int37 = tabela15.n;
        int int38 = tabela15.n;
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item[] itemArray40 = tabela39.registros;
        ds.Item item41 = null;
        int int42 = tabela39.binaria(item41);
        int int43 = tabela39.n;
        tabela39.n = (short) -1;
        ds.Item item46 = null;
        tabela39.insere(item46);
        int int48 = tabela39.n;
        ds.Item[] itemArray49 = tabela39.registros;
        tabela15.registros = itemArray49;
        tabela15.n = 0;
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
        ds.Item[] itemArray67 = tabela53.registros;
        ds.Item[] itemArray68 = tabela53.registros;
        tabela15.registros = itemArray68;
        tabela0.registros = itemArray68;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = tabela0.registros;
        tabela0.n = (byte) 100;
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.pesquisa(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        ds.Tabela tabela4 = new ds.Tabela();
        tabela4.n = 0;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item[] itemArray8 = tabela7.registros;
        tabela4.registros = itemArray8;
        ds.Item item10 = null;
        int int11 = tabela4.binaria(item10);
        ds.Item[] itemArray12 = tabela4.registros;
        tabela0.registros = itemArray12;
        int int14 = tabela0.n;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item[] itemArray16 = tabela15.registros;
        ds.Item item17 = null;
        tabela15.insere(item17);
        int int19 = tabela15.n;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item[] itemArray21 = tabela20.registros;
        ds.Item item22 = null;
        tabela20.insere(item22);
        tabela20.n = 0;
        int int26 = tabela20.n;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item[] itemArray28 = tabela27.registros;
        ds.Item item29 = null;
        int int30 = tabela27.binaria(item29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        tabela27.registros = itemArray31;
        tabela20.registros = itemArray31;
        ds.Item[] itemArray34 = tabela20.registros;
        tabela15.registros = itemArray34;
        ds.Item[] itemArray36 = tabela15.registros;
        tabela0.registros = itemArray36;
        tabela0.n = 3;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item item7 = null;
        tabela0.insere(item7);
        int int9 = tabela0.n;
        int int10 = tabela0.n;
        tabela0.n = 10;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item[] itemArray14 = tabela13.registros;
        ds.Item item15 = null;
        tabela13.insere(item15);
        int int17 = tabela13.n;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item[] itemArray19 = tabela18.registros;
        ds.Item item20 = null;
        tabela18.insere(item20);
        tabela18.n = 0;
        int int24 = tabela18.n;
        ds.Tabela tabela25 = new ds.Tabela();
        ds.Item[] itemArray26 = tabela25.registros;
        ds.Item item27 = null;
        int int28 = tabela25.binaria(item27);
        ds.Item[] itemArray29 = new ds.Item[] {};
        tabela25.registros = itemArray29;
        tabela18.registros = itemArray29;
        ds.Item[] itemArray32 = tabela18.registros;
        tabela13.registros = itemArray32;
        ds.Item[] itemArray34 = tabela13.registros;
        tabela0.registros = itemArray34;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        tabela0.n = 52;
        ds.Item[] itemArray12 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
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
        tabela0.n = 32;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
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
        ds.Item[] itemArray12 = tabela11.registros;
        ds.Item item13 = null;
        int int14 = tabela11.binaria(item13);
        int int15 = tabela11.n;
        tabela11.n = (short) -1;
        ds.Item item18 = null;
        tabela11.insere(item18);
        ds.Item[] itemArray20 = tabela11.registros;
        tabela0.registros = itemArray20;
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
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 10;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item[] itemArray11 = tabela10.registros;
        tabela7.registros = itemArray11;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item[] itemArray15 = tabela0.registros;
        int int16 = tabela0.n;
        int int17 = tabela0.n;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item[] itemArray14 = tabela13.registros;
        ds.Item item15 = null;
        tabela13.insere(item15);
        int int17 = tabela13.n;
        ds.Item item18 = null;
        tabela13.insere(item18);
        ds.Item[] itemArray20 = tabela13.registros;
        tabela0.registros = itemArray20;
        java.lang.Class<?> wildcardClass22 = itemArray20.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        int int4 = tabela0.n;
        tabela0.n = 3;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        tabela0.n = 1;
        ds.Item item4 = null;
        tabela0.insere(item4);
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        java.lang.Class<?> wildcardClass11 = itemArray10.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Tabela tabela6 = new ds.Tabela();
        int int7 = tabela6.n;
        ds.Item item8 = null;
        int int9 = tabela6.binaria(item8);
        tabela6.n = '#';
        ds.Item[] itemArray12 = tabela6.registros;
        ds.Item[] itemArray13 = tabela6.registros;
        tabela0.registros = itemArray13;
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tabela0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item[] itemArray4 = tabela3.registros;
        tabela0.registros = itemArray4;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        tabela0.n = '4';
        ds.Item[] itemArray12 = tabela0.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        tabela13.n = 0;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item[] itemArray17 = tabela16.registros;
        tabela13.registros = itemArray17;
        ds.Item item19 = null;
        int int20 = tabela13.binaria(item19);
        ds.Item[] itemArray21 = tabela13.registros;
        int int22 = tabela13.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item[] itemArray24 = tabela23.registros;
        ds.Item item25 = null;
        tabela23.insere(item25);
        tabela23.n = 10;
        ds.Item[] itemArray29 = tabela23.registros;
        tabela13.registros = itemArray29;
        tabela0.registros = itemArray29;
        int int32 = tabela0.n;
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = tabela0.pesquisa(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        int int3 = tabela0.binaria(item2);
        ds.Item item4 = null;
        tabela0.insere(item4);
        tabela0.n = (byte) 0;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item[] itemArray9 = tabela8.registros;
        ds.Item item10 = null;
        tabela8.insere(item10);
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item[] itemArray13 = tabela12.registros;
        tabela8.registros = itemArray13;
        ds.Item[] itemArray15 = null;
        tabela8.registros = itemArray15;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item[] itemArray18 = tabela17.registros;
        ds.Item item19 = null;
        tabela17.insere(item19);
        tabela17.n = 10;
        ds.Item[] itemArray23 = tabela17.registros;
        tabela8.registros = itemArray23;
        tabela0.registros = itemArray23;
        ds.Tabela tabela26 = new ds.Tabela();
        tabela26.n = 0;
        ds.Item item29 = null;
        tabela26.insere(item29);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        tabela26.registros = itemArray32;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item[] itemArray35 = tabela34.registros;
        ds.Item item36 = null;
        int int37 = tabela34.binaria(item36);
        ds.Item item38 = null;
        tabela34.insere(item38);
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item[] itemArray41 = tabela40.registros;
        ds.Item item42 = null;
        tabela40.insere(item42);
        tabela40.n = 10;
        int int46 = tabela40.n;
        ds.Tabela tabela47 = new ds.Tabela();
        tabela47.n = 0;
        ds.Tabela tabela50 = new ds.Tabela();
        ds.Item[] itemArray51 = tabela50.registros;
        tabela47.registros = itemArray51;
        tabela40.registros = itemArray51;
        tabela34.registros = itemArray51;
        tabela26.registros = itemArray51;
        ds.Item[] itemArray56 = tabela26.registros;
        tabela0.registros = itemArray56;
        ds.Tabela tabela58 = new ds.Tabela();
        ds.Item[] itemArray59 = tabela58.registros;
        ds.Item item60 = null;
        int int61 = tabela58.binaria(item60);
        ds.Item[] itemArray62 = new ds.Item[] {};
        tabela58.registros = itemArray62;
        tabela0.registros = itemArray62;
        int int65 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        tabela0.n = 0;
        tabela0.n = 100;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = '#';
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item[] itemArray12 = tabela11.registros;
        ds.Item item13 = null;
        int int14 = tabela11.binaria(item13);
        ds.Item item15 = null;
        tabela11.insere(item15);
        tabela11.n = (byte) 0;
        ds.Item[] itemArray19 = tabela11.registros;
        tabela0.registros = itemArray19;
        int int21 = tabela0.n;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.binaria(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        ds.Item item2 = null;
        tabela0.insere(item2);
        int int4 = tabela0.n;
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item[] itemArray8 = tabela7.registros;
        ds.Item item9 = null;
        tabela7.insere(item9);
        tabela7.n = 0;
        ds.Item item13 = null;
        int int14 = tabela7.binaria(item13);
        int int15 = tabela7.n;
        ds.Item[] itemArray16 = tabela7.registros;
        tabela0.registros = itemArray16;
        ds.Item item18 = null;
        tabela0.insere(item18);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = 0;
        ds.Item[] itemArray3 = tabela0.registros;
        tabela0.n = (byte) -1;
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
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
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item[] itemArray23 = tabela22.registros;
        ds.Item item24 = null;
        int int25 = tabela22.binaria(item24);
        int int26 = tabela22.n;
        tabela22.n = (short) -1;
        ds.Item item29 = null;
        tabela22.insere(item29);
        ds.Item[] itemArray31 = tabela22.registros;
        tabela0.registros = itemArray31;
        ds.Item item33 = null;
        int int34 = tabela0.binaria(item33);
        ds.Item[] itemArray35 = tabela0.registros;
        int int36 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
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
        int int23 = tabela0.n;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item[] itemArray25 = tabela24.registros;
        ds.Item item26 = null;
        int int27 = tabela24.binaria(item26);
        int int28 = tabela24.n;
        tabela24.n = (short) -1;
        ds.Item item31 = null;
        tabela24.insere(item31);
        int int33 = tabela24.n;
        ds.Item[] itemArray34 = tabela24.registros;
        tabela0.registros = itemArray34;
        tabela0.n = 0;
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item[] itemArray39 = tabela38.registros;
        ds.Item item40 = null;
        tabela38.insere(item40);
        tabela38.n = 10;
        int int44 = tabela38.n;
        ds.Tabela tabela45 = new ds.Tabela();
        tabela45.n = 0;
        ds.Tabela tabela48 = new ds.Tabela();
        ds.Item[] itemArray49 = tabela48.registros;
        tabela45.registros = itemArray49;
        tabela38.registros = itemArray49;
        ds.Item[] itemArray52 = tabela38.registros;
        ds.Item[] itemArray53 = tabela38.registros;
        tabela0.registros = itemArray53;
        tabela0.n = (short) -1;
        ds.Item item57 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int58 = tabela0.binaria(item57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray53);
    }
}

