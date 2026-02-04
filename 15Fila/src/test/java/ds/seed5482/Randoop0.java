package ds.seed5482;

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
        ds.Fila fila0 = new ds.Fila();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        int int8 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        fila9.imprime();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        java.lang.Object[] objArray15 = fila13.item;
        fila9.item = objArray15;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        fila8.frente = 0;
        fila8.imprime();
        fila8.frente = 0;
        fila8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila8);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray10 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        int int4 = fila0.tras;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#' };
        fila0.item = objArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100.0d };
        fila3.item = objArray6;
        java.lang.Object[] objArray8 = fila3.item;
        int int9 = fila3.tras;
        java.lang.Object[] objArray10 = fila3.item;
        fila0.item = objArray10;
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        fila0.frente = 100;
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        java.lang.Class<?> wildcardClass16 = objArray14.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.tras = 10;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        fila9.imprime();
        int int13 = fila9.tras;
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#' };
        fila9.item = objArray15;
        java.lang.Class<?> wildcardClass17 = fila9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[#]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        fila0.frente = 100;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        fila9.frente = 0;
        java.lang.Object[] objArray14 = fila9.item;
        fila9.imprime();
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 1, 100.0d };
        fila16.item = objArray19;
        java.lang.Object[] objArray21 = fila16.item;
        int int22 = fila16.tras;
        java.lang.Object[] objArray23 = fila16.item;
        fila9.item = objArray23;
        fila0.item = objArray23;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.tras;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        fila12.item = objArray15;
        java.lang.Object[] objArray17 = fila12.item;
        int int18 = fila12.tras;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        fila19.item = objArray22;
        java.lang.Object[] objArray24 = fila19.item;
        int int25 = fila19.tras;
        java.lang.Object[] objArray26 = fila19.item;
        fila19.tras = (byte) -1;
        java.lang.Object obj29 = fila19.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 1, 100.0d };
        fila30.item = objArray33;
        java.lang.Object[] objArray35 = fila30.item;
        int int36 = fila30.tras;
        java.lang.Object[] objArray37 = fila30.item;
        fila19.item = objArray37;
        fila12.item = objArray37;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray43 = new java.lang.Object[] { (short) 1, 100.0d };
        fila40.item = objArray43;
        java.lang.Object[] objArray45 = fila40.item;
        int int46 = fila40.tras;
        ds.Fila fila47 = new ds.Fila();
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) 1, 100.0d };
        fila47.item = objArray50;
        java.lang.Object[] objArray52 = fila47.item;
        int int53 = fila47.tras;
        java.lang.Object[] objArray54 = fila47.item;
        fila47.tras = (byte) -1;
        java.lang.Object obj57 = fila47.desenfileira();
        ds.Fila fila58 = new ds.Fila();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (short) 1, 100.0d };
        fila58.item = objArray61;
        java.lang.Object[] objArray63 = fila58.item;
        int int64 = fila58.tras;
        java.lang.Object[] objArray65 = fila58.item;
        fila47.item = objArray65;
        fila40.item = objArray65;
        fila12.item = objArray65;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila12);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) 1 + "'", obj29, (short) 1);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (short) 1 + "'", obj57, (short) 1);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[1, 100.0]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        fila11.item = objArray14;
        java.lang.Object[] objArray16 = fila11.item;
        int int17 = fila11.tras;
        java.lang.Object[] objArray18 = fila11.item;
        fila11.tras = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 1 + "'", obj10, (short) 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        fila0.frente = (-1);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        int int4 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        fila0.frente = 'a';
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        fila0.item = objArray12;
        int int15 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) -1;
        boolean boolean6 = fila0.vazia();
        fila0.tras = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.tras;
        boolean boolean4 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        int int11 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        fila0.frente = 10;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        boolean boolean6 = fila0.vazia();
        fila0.frente = (byte) 100;
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.tras = 10;
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        fila0.imprime();
        fila0.frente = (short) 10;
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        fila7.frente = 100;
        int int16 = fila7.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) int16);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray7 = null;
        fila0.item = objArray7;
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 1 + "'", obj10, (short) 1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        ds.Fila fila6 = new ds.Fila();
        fila6.frente = 0;
        fila6.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        java.lang.Object[] objArray12 = fila10.item;
        fila6.item = objArray12;
        fila0.item = objArray12;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        fila0.frente = 2;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        fila0.frente = 'a';
        java.lang.Object[] objArray9 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objArray7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray10 = fila0.item;
        fila0.tras = '4';
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.frente;
        java.lang.Object[] objArray9 = null;
        fila0.item = objArray9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.tras = 10;
        int int5 = fila0.frente;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.frente = (byte) 1;
        java.lang.Object[] objArray10 = fila0.item;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        fila0.imprime();
        int int9 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        fila0.frente = (-1);
        fila0.tras = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) -1;
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100.0d };
        fila3.item = objArray6;
        java.lang.Object[] objArray8 = fila3.item;
        int int9 = fila3.tras;
        java.lang.Object[] objArray10 = fila3.item;
        fila0.item = objArray10;
        fila0.imprime();
        fila0.frente = '#';
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        fila0.frente = 100;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        fila9.frente = 0;
        java.lang.Object[] objArray14 = fila9.item;
        fila9.imprime();
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 1, 100.0d };
        fila16.item = objArray19;
        java.lang.Object[] objArray21 = fila16.item;
        int int22 = fila16.tras;
        java.lang.Object[] objArray23 = fila16.item;
        fila9.item = objArray23;
        fila0.item = objArray23;
        int int26 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100.0d };
        fila3.item = objArray6;
        java.lang.Object[] objArray8 = fila3.item;
        int int9 = fila3.tras;
        java.lang.Object[] objArray10 = fila3.item;
        fila0.item = objArray10;
        fila0.imprime();
        fila0.frente = '#';
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.tras;
        fila0.imprime();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, 100.0d };
        fila1.item = objArray4;
        java.lang.Object[] objArray6 = fila1.item;
        int int7 = fila1.tras;
        fila1.frente = 100;
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        fila10.frente = 0;
        java.lang.Object[] objArray15 = fila10.item;
        fila10.imprime();
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        fila17.item = objArray20;
        java.lang.Object[] objArray22 = fila17.item;
        int int23 = fila17.tras;
        java.lang.Object[] objArray24 = fila17.item;
        fila10.item = objArray24;
        fila1.item = objArray24;
        fila0.enfileira((java.lang.Object) fila1);
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        int int4 = fila0.tras;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#' };
        fila0.item = objArray6;
        java.lang.Object[] objArray8 = fila0.item;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        java.lang.Object[] objArray14 = fila9.item;
        int int15 = fila9.tras;
        java.lang.Object[] objArray16 = fila9.item;
        fila9.tras = (byte) -1;
        java.lang.Object obj19 = fila9.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 1, 100.0d };
        fila20.item = objArray23;
        java.lang.Object[] objArray25 = fila20.item;
        int int26 = fila20.tras;
        java.lang.Object[] objArray27 = fila20.item;
        fila9.item = objArray27;
        int int29 = fila9.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila9);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 1 + "'", obj19, (short) 1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.frente = 0;
        fila5.tras = (byte) -1;
        java.lang.Object[] objArray11 = fila5.item;
        fila0.item = objArray11;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object[] objArray7 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 100.0]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        int int16 = fila0.frente;
        int int17 = fila0.frente;
        ds.Fila fila18 = new ds.Fila();
        fila18.frente = 0;
        fila18.frente = 0;
        java.lang.Object[] objArray23 = null;
        fila18.item = objArray23;
        java.lang.Object[] objArray25 = fila18.item;
        fila18.imprime();
        fila0.enfileira((java.lang.Object) fila18);
        java.lang.Object[] objArray28 = fila18.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(objArray25);
        org.junit.Assert.assertNull(objArray28);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        fila0.frente = 100;
        int int9 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        fila0.tras = 100;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        java.lang.Object[] objArray14 = fila9.item;
        fila0.item = objArray14;
        int int16 = fila0.frente;
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.frente = 0;
        fila8.frente = 0;
        java.lang.Object[] objArray13 = null;
        fila8.item = objArray13;
        java.lang.Object[] objArray15 = fila8.item;
        fila0.enfileira((java.lang.Object) objArray15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objArray15);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        int int10 = fila8.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        fila11.item = objArray14;
        java.lang.Object[] objArray16 = fila11.item;
        int int17 = fila11.tras;
        java.lang.Object[] objArray18 = fila11.item;
        fila8.item = objArray18;
        fila0.item = objArray18;
        fila0.imprime();
        int int22 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        int int3 = fila0.tras;
        boolean boolean4 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        java.lang.Object[] objArray10 = fila8.item;
        fila0.item = objArray10;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila7.tras = (byte) -1;
        java.lang.Object obj17 = fila7.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        int int24 = fila18.tras;
        java.lang.Object[] objArray25 = fila18.item;
        fila7.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 1, 100.0d };
        fila29.item = objArray32;
        java.lang.Object[] objArray34 = fila29.item;
        fila29.tras = (short) 0;
        java.lang.Object[] objArray37 = fila29.item;
        fila0.item = objArray37;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 100.0]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.frente = '#';
        int int6 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.frente = '#';
        fila0.tras = (byte) 10;
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila7.tras = (byte) -1;
        java.lang.Object obj17 = fila7.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        int int24 = fila18.tras;
        java.lang.Object[] objArray25 = fila18.item;
        fila7.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        boolean boolean29 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, 100.0d };
        fila1.item = objArray4;
        java.lang.Object[] objArray6 = fila1.item;
        int int7 = fila1.tras;
        fila1.frente = 100;
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        fila10.frente = 0;
        java.lang.Object[] objArray15 = fila10.item;
        fila10.imprime();
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        fila17.item = objArray20;
        java.lang.Object[] objArray22 = fila17.item;
        int int23 = fila17.tras;
        java.lang.Object[] objArray24 = fila17.item;
        fila10.item = objArray24;
        fila1.item = objArray24;
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Class<?> wildcardClass28 = fila1.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        fila0.tras = (short) 1;
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        fila0.frente = (-1);
        fila0.tras = 0;
        int int15 = fila0.frente;
        fila0.frente = (short) 1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        fila0.frente = (short) 0;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        fila0.frente = (short) 0;
        fila0.tras = (byte) 1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray10 = fila0.item;
        fila0.tras = '4';
        fila0.tras = (byte) 100;
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila7.tras = (byte) -1;
        java.lang.Object obj17 = fila7.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        int int24 = fila18.tras;
        java.lang.Object[] objArray25 = fila18.item;
        fila7.item = objArray25;
        fila0.item = objArray25;
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 1, 100.0d };
        fila28.item = objArray31;
        java.lang.Object[] objArray33 = fila28.item;
        int int34 = fila28.tras;
        ds.Fila fila35 = new ds.Fila();
        java.lang.Object[] objArray38 = new java.lang.Object[] { (short) 1, 100.0d };
        fila35.item = objArray38;
        java.lang.Object[] objArray40 = fila35.item;
        int int41 = fila35.tras;
        java.lang.Object[] objArray42 = fila35.item;
        fila35.tras = (byte) -1;
        java.lang.Object obj45 = fila35.desenfileira();
        ds.Fila fila46 = new ds.Fila();
        java.lang.Object[] objArray49 = new java.lang.Object[] { (short) 1, 100.0d };
        fila46.item = objArray49;
        java.lang.Object[] objArray51 = fila46.item;
        int int52 = fila46.tras;
        java.lang.Object[] objArray53 = fila46.item;
        fila35.item = objArray53;
        fila28.item = objArray53;
        fila0.item = objArray53;
        java.lang.Class<?> wildcardClass57 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) 1 + "'", obj45, (short) 1);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila7.tras = (byte) -1;
        java.lang.Object obj17 = fila7.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        int int24 = fila18.tras;
        java.lang.Object[] objArray25 = fila18.item;
        fila7.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.tras = 1;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 1, 100.0d };
        fila31.item = objArray34;
        java.lang.Object[] objArray36 = fila31.item;
        fila31.tras = (short) 0;
        ds.Fila fila39 = new ds.Fila();
        boolean boolean40 = fila39.vazia();
        int int41 = fila39.frente;
        ds.Fila fila42 = new ds.Fila();
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 1, 100.0d };
        fila42.item = objArray45;
        java.lang.Object[] objArray47 = fila42.item;
        int int48 = fila42.tras;
        java.lang.Object[] objArray49 = fila42.item;
        fila39.item = objArray49;
        fila31.item = objArray49;
        fila0.item = objArray49;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1, 100.0]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        ds.Fila fila11 = new ds.Fila();
        fila11.frente = 0;
        boolean boolean14 = fila11.vazia();
        fila11.frente = '#';
        fila11.tras = (byte) 10;
        boolean boolean19 = fila11.vazia();
        java.lang.Object[] objArray20 = fila11.item;
        fila0.item = objArray20;
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        int int24 = fila22.frente;
        int int25 = fila22.tras;
        fila0.enfileira((java.lang.Object) int25);
        fila0.tras = ' ';
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        fila6.item = objArray9;
        java.lang.Object[] objArray11 = fila6.item;
        int int12 = fila6.tras;
        java.lang.Object[] objArray13 = fila6.item;
        fila6.tras = (byte) -1;
        java.lang.Object[] objArray16 = fila6.item;
        fila6.tras = '4';
        java.lang.Class<?> wildcardClass19 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = null;
        fila0.enfileira(obj21);
        java.lang.Object obj23 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        fila0.tras = (short) 100;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.tras = (short) 100;
        int int11 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        fila0.frente = (short) 0;
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        int int4 = fila0.frente;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.tras = 10;
        fila0.tras = (short) 100;
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila7.tras = (byte) -1;
        java.lang.Object obj17 = fila7.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        int int24 = fila18.tras;
        java.lang.Object[] objArray25 = fila18.item;
        fila7.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.tras = 1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        java.lang.Object[] objArray9 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, 100.0]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.frente = (byte) 1;
        java.lang.Object[] objArray10 = fila0.item;
        ds.Fila fila11 = new ds.Fila();
        fila11.frente = 0;
        fila11.imprime();
        fila11.frente = 0;
        fila11.imprime();
        int int18 = fila11.frente;
        int int19 = fila11.frente;
        boolean boolean20 = fila11.vazia();
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        fila21.item = objArray24;
        fila21.enfileira((java.lang.Object) (short) -1);
        fila21.imprime();
        fila21.imprime();
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 1, 100.0d };
        fila30.item = objArray33;
        fila21.item = objArray33;
        java.lang.Object[] objArray36 = fila21.item;
        fila11.item = objArray36;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila11);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 100.0]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.tras = 10;
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.frente = (byte) 1;
        fila0.tras = 10;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        int int4 = fila0.frente;
        int int5 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        fila0.frente = 0;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        fila9.enfileira((java.lang.Object) (short) -1);
        fila9.imprime();
        fila9.imprime();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        fila9.item = objArray21;
        fila0.item = objArray21;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        fila12.item = objArray15;
        fila12.enfileira((java.lang.Object) (short) -1);
        fila12.imprime();
        fila12.imprime();
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        fila21.item = objArray24;
        fila12.item = objArray24;
        fila0.item = objArray24;
        java.lang.Class<?> wildcardClass28 = objArray24.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.frente;
        java.lang.Object[] objArray9 = null;
        fila0.item = objArray9;
        java.lang.Object[] objArray11 = null;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        fila13.item = objArray16;
        java.lang.Object[] objArray18 = fila13.item;
        fila13.tras = (short) 0;
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        int int23 = fila21.frente;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 1, 100.0d };
        fila24.item = objArray27;
        java.lang.Object[] objArray29 = fila24.item;
        int int30 = fila24.tras;
        java.lang.Object[] objArray31 = fila24.item;
        fila21.item = objArray31;
        fila13.item = objArray31;
        fila13.imprime();
        int int35 = fila13.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        int int10 = fila8.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        fila11.item = objArray14;
        java.lang.Object[] objArray16 = fila11.item;
        int int17 = fila11.tras;
        java.lang.Object[] objArray18 = fila11.item;
        fila8.item = objArray18;
        fila0.item = objArray18;
        fila0.imprime();
        int int22 = fila0.tras;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 1, 100.0d };
        fila23.item = objArray26;
        java.lang.Object[] objArray28 = fila23.item;
        fila0.item = objArray28;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 100.0]");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 1, 100.0d };
        fila10.item = objArray13;
        fila10.enfileira((java.lang.Object) (short) -1);
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        fila19.item = objArray22;
        fila10.item = objArray22;
        java.lang.Object[] objArray25 = fila10.item;
        fila0.item = objArray25;
        int int27 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        fila6.item = objArray9;
        java.lang.Object[] objArray11 = fila6.item;
        int int12 = fila6.tras;
        java.lang.Object[] objArray13 = fila6.item;
        fila6.tras = (byte) -1;
        java.lang.Object[] objArray16 = fila6.item;
        fila6.tras = '4';
        java.lang.Class<?> wildcardClass19 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object[] objArray21 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        int int10 = fila0.frente;
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila7.tras = (byte) -1;
        java.lang.Object obj17 = fila7.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        int int24 = fila18.tras;
        java.lang.Object[] objArray25 = fila18.item;
        fila7.item = objArray25;
        fila0.item = objArray25;
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        fila28.frente = 0;
        fila28.tras = (byte) -1;
        java.lang.Object[] objArray34 = fila28.item;
        java.lang.Object obj35 = fila28.desenfileira();
        java.lang.Object[] objArray36 = fila28.item;
        fila0.item = objArray36;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        fila0.frente = 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.tras = '#';
        int int5 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.frente = (byte) 1;
        java.lang.Object[] objArray10 = fila0.item;
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        fila0.frente = 0;
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 100.0d };
        fila4.item = objArray7;
        java.lang.Object[] objArray9 = fila4.item;
        fila4.tras = (short) 0;
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        int int14 = fila12.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 100.0d };
        fila15.item = objArray18;
        java.lang.Object[] objArray20 = fila15.item;
        int int21 = fila15.tras;
        java.lang.Object[] objArray22 = fila15.item;
        fila12.item = objArray22;
        fila4.item = objArray22;
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        int int30 = fila28.frente;
        int int31 = fila28.tras;
        int int32 = fila28.frente;
        fila0.enfileira((java.lang.Object) fila28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        fila0.tras = 0;
        int int7 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.frente = '#';
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        fila6.item = objArray9;
        java.lang.Object[] objArray11 = fila6.item;
        int int12 = fila6.tras;
        java.lang.Object[] objArray13 = fila6.item;
        fila6.frente = (byte) 1;
        java.lang.Object[] objArray16 = fila6.item;
        fila0.item = objArray16;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.tras;
        int int3 = fila0.tras;
        fila0.tras = (-1);
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        fila0.tras = 0;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.frente = 0;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        fila0.tras = 100;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        java.lang.Object[] objArray14 = fila9.item;
        fila0.item = objArray14;
        int int16 = fila0.frente;
        fila0.frente = (-1);
        java.lang.Class<?> wildcardClass19 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        fila12.item = objArray15;
        fila12.enfileira((java.lang.Object) (short) -1);
        fila12.imprime();
        fila12.imprime();
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        fila21.item = objArray24;
        fila12.item = objArray24;
        fila0.item = objArray24;
        fila0.frente = ' ';
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.frente = (byte) 1;
        fila0.tras = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila7.tras = (byte) -1;
        java.lang.Object obj17 = fila7.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        int int24 = fila18.tras;
        java.lang.Object[] objArray25 = fila18.item;
        fila7.item = objArray25;
        fila0.item = objArray25;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        fila11.item = objArray14;
        java.lang.Object[] objArray16 = fila11.item;
        int int17 = fila11.tras;
        java.lang.Object[] objArray18 = fila11.item;
        fila11.tras = (byte) -1;
        java.lang.Object[] objArray21 = fila11.item;
        int int22 = fila11.tras;
        java.lang.Object obj23 = fila11.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 1, 100.0d };
        fila24.item = objArray27;
        java.lang.Object[] objArray29 = fila24.item;
        fila24.tras = (short) 0;
        java.lang.Object[] objArray32 = fila24.item;
        fila11.item = objArray32;
        int int34 = fila11.frente;
        fila0.enfileira((java.lang.Object) int34);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 1 + "'", obj23, (short) 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        fila0.tras = 0;
        java.lang.Object[] objArray12 = fila0.item;
        ds.Fila fila13 = new ds.Fila();
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 100.0d };
        fila14.item = objArray17;
        java.lang.Object[] objArray19 = fila14.item;
        int int20 = fila14.tras;
        fila14.frente = 100;
        ds.Fila fila23 = new ds.Fila();
        fila23.frente = 0;
        fila23.frente = 0;
        java.lang.Object[] objArray28 = fila23.item;
        fila23.imprime();
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 1, 100.0d };
        fila30.item = objArray33;
        java.lang.Object[] objArray35 = fila30.item;
        int int36 = fila30.tras;
        java.lang.Object[] objArray37 = fila30.item;
        fila23.item = objArray37;
        fila14.item = objArray37;
        fila13.enfileira((java.lang.Object) fila14);
        fila14.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila14);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[false, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[false, 100.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[false, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[false, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[false, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[false, 100.0]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 100.0d };
        fila4.item = objArray7;
        java.lang.Object[] objArray9 = fila4.item;
        fila4.tras = (short) 0;
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        int int14 = fila12.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 100.0d };
        fila15.item = objArray18;
        java.lang.Object[] objArray20 = fila15.item;
        int int21 = fila15.tras;
        java.lang.Object[] objArray22 = fila15.item;
        fila12.item = objArray22;
        fila4.item = objArray22;
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila28 = new ds.Fila();
        fila28.frente = 0;
        fila28.imprime();
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        java.lang.Object[] objArray34 = fila32.item;
        fila28.item = objArray34;
        fila4.item = objArray34;
        java.lang.Class<?> wildcardClass37 = objArray34.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Object[] objArray10 = fila0.item;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        fila11.item = objArray14;
        java.lang.Object[] objArray16 = fila11.item;
        int int17 = fila11.tras;
        java.lang.Object[] objArray18 = fila11.item;
        fila11.frente = (byte) 1;
        fila11.imprime();
        int int22 = fila11.frente;
        fila0.enfileira((java.lang.Object) int22);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.imprime();
        int int9 = fila0.frente;
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        fila10.frente = 0;
        java.lang.Object[] objArray15 = fila10.item;
        fila10.imprime();
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        fila17.item = objArray20;
        java.lang.Object[] objArray22 = fila17.item;
        int int23 = fila17.tras;
        java.lang.Object[] objArray24 = fila17.item;
        fila10.item = objArray24;
        java.lang.Object[] objArray26 = fila10.item;
        fila0.enfileira((java.lang.Object) objArray26);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[[1, 100.0], 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[[1, 100.0], 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[1, 100.0], 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 100.0]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        fila0.tras = 0;
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.tras;
        int int3 = fila0.tras;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        fila0.tras = (short) -1;
        ds.Fila fila11 = new ds.Fila();
        fila11.frente = 0;
        fila11.imprime();
        fila11.frente = 0;
        fila11.imprime();
        fila11.tras = 100;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 1, 100.0d };
        fila20.item = objArray23;
        java.lang.Object[] objArray25 = fila20.item;
        fila11.item = objArray25;
        int int27 = fila11.frente;
        fila11.frente = (-1);
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila11);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        fila0.frente = (byte) 10;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.frente = (byte) 1;
        int int10 = fila0.frente;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        fila0.frente = (-1);
        int int13 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        fila0.tras = (short) -1;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        fila9.enfileira((java.lang.Object) (short) -1);
        fila9.imprime();
        fila9.imprime();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        fila9.item = objArray21;
        java.lang.Object[] objArray24 = fila9.item;
        fila0.item = objArray24;
        java.lang.Class<?> wildcardClass26 = objArray24.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) 1, 100.0d };
        fila8.item = objArray11;
        java.lang.Object[] objArray13 = fila8.item;
        int int14 = fila8.tras;
        fila8.frente = 100;
        ds.Fila fila17 = new ds.Fila();
        fila17.frente = 0;
        fila17.frente = 0;
        java.lang.Object[] objArray22 = fila17.item;
        fila17.imprime();
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 1, 100.0d };
        fila24.item = objArray27;
        java.lang.Object[] objArray29 = fila24.item;
        int int30 = fila24.tras;
        java.lang.Object[] objArray31 = fila24.item;
        fila17.item = objArray31;
        fila8.item = objArray31;
        fila0.enfileira((java.lang.Object) objArray31);
        java.lang.Object[] objArray35 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[[1, 100.0], 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[[1, 100.0], 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[[1, 100.0], 100.0]");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.frente = (byte) 1;
        fila0.imprime();
        int int11 = fila0.frente;
        java.lang.Object[] objArray12 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila7.tras = (byte) -1;
        java.lang.Object obj17 = fila7.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        int int24 = fila18.tras;
        java.lang.Object[] objArray25 = fila18.item;
        fila7.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.tras = 1;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 1, 100.0d };
        fila31.item = objArray34;
        java.lang.Object[] objArray36 = fila31.item;
        int int37 = fila31.tras;
        java.lang.Object[] objArray38 = fila31.item;
        fila31.tras = (byte) -1;
        java.lang.Object[] objArray41 = fila31.item;
        int int42 = fila31.tras;
        java.lang.Object obj43 = fila31.desenfileira();
        java.lang.Object[] objArray44 = fila31.item;
        fila0.item = objArray44;
        fila0.tras = 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) 1 + "'", obj43, (short) 1);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 100.0]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        int int6 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila7.tras = (byte) -1;
        java.lang.Object obj17 = fila7.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        int int24 = fila18.tras;
        java.lang.Object[] objArray25 = fila18.item;
        fila7.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.frente = (-1);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        int int9 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object obj10 = fila0.desenfileira();
        int int11 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Object obj14 = fila0.desenfileira();
        int int15 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 1 + "'", obj10, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        fila0.tras = 0;
        java.lang.Object[] objArray12 = fila0.item;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        fila13.item = objArray16;
        java.lang.Object[] objArray18 = fila13.item;
        int int19 = fila13.tras;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 1, 100.0d };
        fila20.item = objArray23;
        java.lang.Object[] objArray25 = fila20.item;
        int int26 = fila20.tras;
        java.lang.Object[] objArray27 = fila20.item;
        fila20.tras = (byte) -1;
        java.lang.Object obj30 = fila20.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 1, 100.0d };
        fila31.item = objArray34;
        java.lang.Object[] objArray36 = fila31.item;
        int int37 = fila31.tras;
        java.lang.Object[] objArray38 = fila31.item;
        fila20.item = objArray38;
        fila13.item = objArray38;
        fila0.item = objArray38;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) 1 + "'", obj30, (short) 1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1, 100.0]");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 100.0d };
        fila4.item = objArray7;
        java.lang.Object[] objArray9 = fila4.item;
        fila4.tras = (short) 0;
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        int int14 = fila12.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 100.0d };
        fila15.item = objArray18;
        java.lang.Object[] objArray20 = fila15.item;
        int int21 = fila15.tras;
        java.lang.Object[] objArray22 = fila15.item;
        fila12.item = objArray22;
        fila4.item = objArray22;
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila28 = new ds.Fila();
        fila28.frente = 0;
        fila28.imprime();
        fila28.frente = 0;
        fila28.imprime();
        boolean boolean35 = fila28.vazia();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila28);
        ds.Fila fila39 = new ds.Fila();
        fila39.frente = 0;
        fila39.imprime();
        fila39.frente = 0;
        fila39.imprime();
        int int46 = fila39.frente;
        int int47 = fila39.frente;
        ds.Fila fila48 = new ds.Fila();
        boolean boolean49 = fila48.vazia();
        java.lang.Object[] objArray50 = fila48.item;
        fila39.item = objArray50;
        fila0.item = objArray50;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        fila0.frente = 'a';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.tras = 1;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        int int11 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        fila9.imprime();
        fila9.frente = 0;
        fila9.imprime();
        fila9.tras = 100;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        fila9.item = objArray23;
        int int25 = fila9.frente;
        fila0.enfileira((java.lang.Object) int25);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 100.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        fila0.enfileira((java.lang.Object) "hi!");
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        java.lang.Object[] objArray14 = fila9.item;
        int int15 = fila9.tras;
        fila9.frente = 100;
        ds.Fila fila18 = new ds.Fila();
        fila18.frente = 0;
        fila18.frente = 0;
        java.lang.Object[] objArray23 = fila18.item;
        fila18.imprime();
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 1, 100.0d };
        fila25.item = objArray28;
        java.lang.Object[] objArray30 = fila25.item;
        int int31 = fila25.tras;
        java.lang.Object[] objArray32 = fila25.item;
        fila18.item = objArray32;
        fila9.item = objArray32;
        fila0.item = objArray32;
        fila0.frente = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, 100.0]");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.tras = (short) -1;
        fila0.tras = 10;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = '4';
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        fila0.tras = 100;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        java.lang.Object[] objArray14 = fila9.item;
        fila0.item = objArray14;
        fila0.frente = (byte) 1;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        fila18.enfileira((java.lang.Object) (short) -1);
        fila18.imprime();
        fila18.frente = 0;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila18);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1, 100.0]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        fila0.item = objArray12;
        fila0.tras = (short) 0;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.tras;
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        int int10 = fila0.frente;
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        fila0.frente = 2;
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.frente = 0;
        fila11.tras = (byte) 1;
        boolean boolean17 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        fila0.frente = 0;
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object[] objArray11 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, 100.0]");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila7.tras = (byte) -1;
        java.lang.Object obj17 = fila7.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        int int24 = fila18.tras;
        java.lang.Object[] objArray25 = fila18.item;
        fila7.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.tras = 1;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 1, 100.0d };
        fila31.item = objArray34;
        java.lang.Object[] objArray36 = fila31.item;
        int int37 = fila31.tras;
        java.lang.Object[] objArray38 = fila31.item;
        fila31.tras = (byte) -1;
        java.lang.Object[] objArray41 = fila31.item;
        int int42 = fila31.tras;
        java.lang.Object obj43 = fila31.desenfileira();
        java.lang.Object[] objArray44 = fila31.item;
        fila0.item = objArray44;
        ds.Fila fila46 = new ds.Fila();
        boolean boolean47 = fila46.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) boolean47);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) 1 + "'", obj43, (short) 1);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        fila11.item = objArray14;
        java.lang.Object[] objArray16 = fila11.item;
        int int17 = fila11.tras;
        java.lang.Object[] objArray18 = fila11.item;
        fila0.item = objArray18;
        int int20 = fila0.tras;
        java.lang.Object obj21 = fila0.desenfileira();
        fila0.tras = '4';
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 1 + "'", obj10, (short) 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        int int4 = fila0.tras;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#' };
        fila0.item = objArray6;
        java.lang.Object[] objArray8 = fila0.item;
        int int9 = fila0.frente;
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        boolean boolean13 = fila10.vazia();
        fila10.frente = '#';
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 1, 100.0d };
        fila16.item = objArray19;
        java.lang.Object[] objArray21 = fila16.item;
        int int22 = fila16.tras;
        java.lang.Object[] objArray23 = fila16.item;
        fila16.frente = (byte) 1;
        java.lang.Object[] objArray26 = fila16.item;
        fila10.item = objArray26;
        fila0.item = objArray26;
        boolean boolean29 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        fila0.tras = (short) -1;
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.frente = (byte) 10;
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila12 = new ds.Fila();
        fila12.frente = 0;
        fila12.imprime();
        int int16 = fila12.tras;
        java.lang.Object[] objArray18 = new java.lang.Object[] { '#' };
        fila12.item = objArray18;
        fila0.item = objArray18;
        int int21 = fila0.tras;
        boolean boolean22 = fila0.vazia();
        java.lang.Object[] objArray23 = fila0.item;
        fila0.tras = (short) -1;
        fila0.frente = 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[#]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[#]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        int int10 = fila0.frente;
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        fila0.frente = 0;
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        int int11 = fila9.frente;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        fila12.item = objArray15;
        java.lang.Object[] objArray17 = fila12.item;
        int int18 = fila12.tras;
        java.lang.Object[] objArray19 = fila12.item;
        fila9.item = objArray19;
        java.lang.Object[] objArray21 = fila9.item;
        int int22 = fila9.tras;
        fila0.enfileira((java.lang.Object) int22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.tras;
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        fila13.item = objArray16;
        java.lang.Object[] objArray18 = fila13.item;
        fila13.tras = (short) 0;
        java.lang.Object[] objArray21 = fila13.item;
        fila0.item = objArray21;
        int int23 = fila0.frente;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 1, 100.0d };
        fila24.item = objArray27;
        java.lang.Object[] objArray29 = fila24.item;
        fila24.tras = (short) 0;
        fila24.frente = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        int int11 = fila0.tras;
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.frente = 0;
        fila13.tras = (byte) -1;
        java.lang.Object[] objArray19 = fila13.item;
        java.lang.Object obj20 = fila13.desenfileira();
        java.lang.Object[] objArray21 = fila13.item;
        fila0.item = objArray21;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.frente = '#';
        fila0.tras = (byte) 10;
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        fila10.frente = 0;
        java.lang.Object[] objArray15 = fila10.item;
        fila10.imprime();
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        fila17.item = objArray20;
        java.lang.Object[] objArray22 = fila17.item;
        int int23 = fila17.tras;
        java.lang.Object[] objArray24 = fila17.item;
        fila10.item = objArray24;
        java.lang.Object[] objArray26 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = fila10.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 100.0]");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        boolean boolean14 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        fila0.frente = 100;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        fila9.frente = 0;
        java.lang.Object[] objArray14 = fila9.item;
        fila9.imprime();
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 1, 100.0d };
        fila16.item = objArray19;
        java.lang.Object[] objArray21 = fila16.item;
        int int22 = fila16.tras;
        java.lang.Object[] objArray23 = fila16.item;
        fila9.item = objArray23;
        fila0.item = objArray23;
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila26.frente = 0;
        fila26.tras = (byte) 1;
        fila26.tras = (short) 1;
        java.lang.Object[] objArray34 = fila26.item;
        fila0.item = objArray34;
        boolean boolean36 = fila0.vazia();
        int int37 = fila0.frente;
        fila0.frente = (byte) 10;
        java.lang.Object obj40 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        fila0.tras = 100;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        fila12.item = objArray15;
        java.lang.Object[] objArray17 = fila12.item;
        int int18 = fila12.tras;
        java.lang.Object[] objArray19 = fila12.item;
        fila12.tras = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.tras = (byte) 10;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        int int11 = fila0.tras;
        boolean boolean12 = fila0.vazia();
        fila0.frente = 35;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        int int16 = fila0.frente;
        int int17 = fila0.frente;
        fila0.frente = 2;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 1, 100.0d };
        fila20.item = objArray23;
        java.lang.Object[] objArray25 = fila20.item;
        int int26 = fila20.tras;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 1, 100.0d };
        fila27.item = objArray30;
        java.lang.Object[] objArray32 = fila27.item;
        int int33 = fila27.tras;
        java.lang.Object[] objArray34 = fila27.item;
        fila27.tras = (byte) -1;
        java.lang.Object obj37 = fila27.desenfileira();
        ds.Fila fila38 = new ds.Fila();
        java.lang.Object[] objArray41 = new java.lang.Object[] { (short) 1, 100.0d };
        fila38.item = objArray41;
        java.lang.Object[] objArray43 = fila38.item;
        int int44 = fila38.tras;
        java.lang.Object[] objArray45 = fila38.item;
        fila27.item = objArray45;
        fila20.item = objArray45;
        ds.Fila fila48 = new ds.Fila();
        java.lang.Object[] objArray51 = new java.lang.Object[] { (short) 1, 100.0d };
        fila48.item = objArray51;
        java.lang.Object[] objArray53 = fila48.item;
        int int54 = fila48.tras;
        ds.Fila fila55 = new ds.Fila();
        java.lang.Object[] objArray58 = new java.lang.Object[] { (short) 1, 100.0d };
        fila55.item = objArray58;
        java.lang.Object[] objArray60 = fila55.item;
        int int61 = fila55.tras;
        java.lang.Object[] objArray62 = fila55.item;
        fila55.tras = (byte) -1;
        java.lang.Object obj65 = fila55.desenfileira();
        ds.Fila fila66 = new ds.Fila();
        java.lang.Object[] objArray69 = new java.lang.Object[] { (short) 1, 100.0d };
        fila66.item = objArray69;
        java.lang.Object[] objArray71 = fila66.item;
        int int72 = fila66.tras;
        java.lang.Object[] objArray73 = fila66.item;
        fila55.item = objArray73;
        fila48.item = objArray73;
        fila20.item = objArray73;
        fila0.item = objArray73;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (short) 1 + "'", obj37, (short) 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (short) 1 + "'", obj65, (short) 1);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[1, 100.0]");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.tras;
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        fila13.item = objArray16;
        java.lang.Object[] objArray18 = fila13.item;
        fila13.tras = (short) 0;
        java.lang.Object[] objArray21 = fila13.item;
        fila0.item = objArray21;
        java.lang.Object obj23 = fila0.desenfileira();
        fila0.tras = (short) -1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        fila0.tras = 0;
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        int int4 = fila0.tras;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#' };
        fila0.item = objArray6;
        java.lang.Object[] objArray8 = fila0.item;
        fila0.frente = (-1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#]");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        int int16 = fila0.frente;
        int int17 = fila0.frente;
        ds.Fila fila18 = new ds.Fila();
        fila18.frente = 0;
        fila18.frente = 0;
        java.lang.Object[] objArray23 = null;
        fila18.item = objArray23;
        java.lang.Object[] objArray25 = fila18.item;
        fila18.imprime();
        fila0.enfileira((java.lang.Object) fila18);
        int int28 = fila18.frente;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = 0;
        fila9.tras = (byte) 1;
        fila9.tras = (short) 1;
        java.lang.Object[] objArray17 = fila9.item;
        fila0.item = objArray17;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        fila11.item = objArray14;
        java.lang.Object[] objArray16 = fila11.item;
        int int17 = fila11.tras;
        java.lang.Object[] objArray18 = fila11.item;
        fila0.item = objArray18;
        int int20 = fila0.tras;
        java.lang.Object obj21 = fila0.desenfileira();
        int int22 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 1 + "'", obj10, (short) 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.frente = '#';
        fila0.tras = (byte) 10;
        boolean boolean8 = fila0.vazia();
        fila0.tras = (short) 1;
        int int11 = fila0.frente;
        fila0.tras = (byte) 1;
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 1 + "'", obj10, (short) 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila12 = new ds.Fila();
        fila12.frente = 0;
        fila12.imprime();
        int int16 = fila12.tras;
        java.lang.Object[] objArray18 = new java.lang.Object[] { '#' };
        fila12.item = objArray18;
        fila0.item = objArray18;
        fila0.tras = (byte) -1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[#]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.tras;
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Object[] objArray13 = fila0.item;
        ds.Fila fila14 = new ds.Fila();
        fila14.frente = 0;
        fila14.imprime();
        fila14.frente = 0;
        fila14.imprime();
        fila14.tras = 100;
        boolean boolean23 = fila14.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100.0d };
        fila3.item = objArray6;
        java.lang.Object[] objArray8 = fila3.item;
        int int9 = fila3.tras;
        java.lang.Object[] objArray10 = fila3.item;
        fila0.item = objArray10;
        java.lang.Object[] objArray12 = fila0.item;
        int int13 = fila0.tras;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        fila0.frente = 100;
        fila0.frente = (byte) 10;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        fila0.frente = 0;
        fila0.frente = 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 1, 100.0d };
        fila10.item = objArray13;
        fila10.enfileira((java.lang.Object) (short) -1);
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        fila19.item = objArray22;
        fila10.item = objArray22;
        java.lang.Object[] objArray25 = fila10.item;
        fila0.item = objArray25;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 1, 100.0d };
        fila27.item = objArray30;
        fila27.tras = 0;
        fila27.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) fila27);
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 1, 100.0d };
        fila37.item = objArray40;
        java.lang.Object[] objArray42 = fila37.item;
        fila37.tras = (short) 0;
        fila37.tras = 1;
        java.lang.Object[] objArray47 = fila37.item;
        fila27.item = objArray47;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[1, 100.0]");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.frente = 0;
        fila7.tras = (byte) 1;
        fila7.frente = 0;
        int int15 = fila7.frente;
        boolean boolean16 = fila7.vazia();
        int int17 = fila7.tras;
        java.lang.Object[] objArray18 = fila7.item;
        fila0.item = objArray18;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        fila0.tras = (short) -1;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        fila9.enfileira((java.lang.Object) (short) -1);
        fila9.imprime();
        fila9.imprime();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        fila9.item = objArray21;
        java.lang.Object[] objArray24 = fila9.item;
        fila0.item = objArray24;
        fila0.tras = '4';
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.tras;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 100.0d };
        fila15.item = objArray18;
        java.lang.Object[] objArray20 = fila15.item;
        int int21 = fila15.tras;
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        fila22.item = objArray25;
        java.lang.Object[] objArray27 = fila22.item;
        int int28 = fila22.tras;
        java.lang.Object[] objArray29 = fila22.item;
        fila22.tras = (byte) -1;
        java.lang.Object obj32 = fila22.desenfileira();
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 1, 100.0d };
        fila33.item = objArray36;
        java.lang.Object[] objArray38 = fila33.item;
        int int39 = fila33.tras;
        java.lang.Object[] objArray40 = fila33.item;
        fila22.item = objArray40;
        fila15.item = objArray40;
        fila0.item = objArray40;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) 1 + "'", obj32, (short) 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1, 100.0]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray2 = fila0.item;
        fila0.tras = 2;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila7.tras = (byte) -1;
        java.lang.Object obj17 = fila7.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        int int24 = fila18.tras;
        java.lang.Object[] objArray25 = fila18.item;
        fila7.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.tras = 1;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 1, 100.0d };
        fila31.item = objArray34;
        java.lang.Object[] objArray36 = fila31.item;
        int int37 = fila31.tras;
        java.lang.Object[] objArray38 = fila31.item;
        fila31.tras = (byte) -1;
        java.lang.Object[] objArray41 = fila31.item;
        int int42 = fila31.tras;
        java.lang.Object obj43 = fila31.desenfileira();
        java.lang.Object[] objArray44 = fila31.item;
        fila0.item = objArray44;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) 1 + "'", obj43, (short) 1);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 100.0]");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        int int10 = fila8.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        fila11.item = objArray14;
        java.lang.Object[] objArray16 = fila11.item;
        int int17 = fila11.tras;
        java.lang.Object[] objArray18 = fila11.item;
        fila8.item = objArray18;
        fila0.item = objArray18;
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.frente = 0;
        fila23.imprime();
        int int27 = fila23.tras;
        java.lang.Object[] objArray29 = new java.lang.Object[] { '#' };
        fila23.item = objArray29;
        java.lang.Object[] objArray31 = fila23.item;
        fila0.item = objArray31;
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        fila33.frente = 0;
        java.lang.Object[] objArray37 = fila33.item;
        fila0.item = objArray37;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[#]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[#]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) ' ');
        int int10 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        fila0.item = objArray12;
        java.lang.Object[] objArray15 = fila0.item;
        java.lang.Object obj16 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 1 + "'", obj16, (short) 1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        java.lang.Object[] objArray16 = fila0.item;
        fila0.frente = (short) -1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object obj10 = fila0.desenfileira();
        int int11 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Object obj14 = fila0.desenfileira();
        java.lang.Object[] objArray15 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 1 + "'", obj10, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        fila0.frente = 0;
        int int8 = fila0.frente;
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Object[] objArray8 = fila0.item;
        fila0.tras = 'a';
        java.lang.Object[] objArray11 = fila0.item;
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertNull(objArray11);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.tras = 1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.frente = '#';
        fila0.tras = (byte) 10;
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        fila0.tras = 100;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        fila0.item = objArray12;
        java.lang.Object[] objArray15 = fila0.item;
        fila0.imprime();
        fila0.tras = (-1);
        fila0.tras = (byte) 0;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        int int7 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        java.lang.Object[] objArray8 = fila0.item;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        fila9.enfileira((java.lang.Object) (short) -1);
        int int16 = fila9.tras;
        fila9.imprime();
        fila9.frente = 100;
        int int20 = fila9.tras;
        boolean boolean21 = fila9.vazia();
        java.lang.Class<?> wildcardClass22 = fila9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila7.tras = (byte) -1;
        java.lang.Object obj17 = fila7.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        int int24 = fila18.tras;
        java.lang.Object[] objArray25 = fila18.item;
        fila7.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.tras = 1;
        int int31 = fila0.frente;
        java.lang.Class<?> wildcardClass32 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        fila0.tras = 100;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        java.lang.Object[] objArray14 = fila9.item;
        fila0.item = objArray14;
        fila0.frente = (byte) 1;
        java.lang.Object[] objArray18 = null;
        fila0.item = objArray18;
        fila0.frente = (byte) 0;
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        int int4 = fila0.tras;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#' };
        fila0.item = objArray6;
        java.lang.Object[] objArray8 = fila0.item;
        int int9 = fila0.frente;
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        boolean boolean13 = fila10.vazia();
        fila10.frente = '#';
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 1, 100.0d };
        fila16.item = objArray19;
        java.lang.Object[] objArray21 = fila16.item;
        int int22 = fila16.tras;
        java.lang.Object[] objArray23 = fila16.item;
        fila16.frente = (byte) 1;
        java.lang.Object[] objArray26 = fila16.item;
        fila10.item = objArray26;
        fila0.item = objArray26;
        java.lang.Class<?> wildcardClass29 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        ds.Fila fila11 = new ds.Fila();
        fila11.frente = 0;
        boolean boolean14 = fila11.vazia();
        fila11.frente = '#';
        fila11.tras = (byte) 10;
        boolean boolean19 = fila11.vazia();
        java.lang.Object[] objArray20 = fila11.item;
        fila0.item = objArray20;
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        fila22.item = objArray25;
        fila22.enfileira((java.lang.Object) (short) -1);
        fila22.imprime();
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 1, 100.0d };
        fila30.item = objArray33;
        java.lang.Object[] objArray35 = fila30.item;
        int int36 = fila30.tras;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 1, 100.0d };
        fila37.item = objArray40;
        java.lang.Object[] objArray42 = fila37.item;
        int int43 = fila37.tras;
        java.lang.Object[] objArray44 = fila37.item;
        fila37.tras = (byte) -1;
        java.lang.Object obj47 = fila37.desenfileira();
        ds.Fila fila48 = new ds.Fila();
        java.lang.Object[] objArray51 = new java.lang.Object[] { (short) 1, 100.0d };
        fila48.item = objArray51;
        java.lang.Object[] objArray53 = fila48.item;
        int int54 = fila48.tras;
        java.lang.Object[] objArray55 = fila48.item;
        fila37.item = objArray55;
        fila30.item = objArray55;
        int int58 = fila30.tras;
        int int59 = fila30.frente;
        int int60 = fila30.frente;
        java.lang.Object[] objArray61 = fila30.item;
        fila22.item = objArray61;
        fila0.item = objArray61;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (short) 1 + "'", obj47, (short) 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[1, 100.0]");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Object[] objArray8 = fila0.item;
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (short) 100;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        fila13.item = objArray16;
        java.lang.Object[] objArray18 = fila13.item;
        fila13.tras = (short) 0;
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        int int23 = fila21.frente;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 1, 100.0d };
        fila24.item = objArray27;
        java.lang.Object[] objArray29 = fila24.item;
        int int30 = fila24.tras;
        java.lang.Object[] objArray31 = fila24.item;
        fila21.item = objArray31;
        fila13.item = objArray31;
        fila13.imprime();
        fila13.imprime();
        fila9.enfileira((java.lang.Object) fila13);
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, 100.0]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        fila0.item = objArray12;
        java.lang.Object[] objArray15 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray17 = fila0.item;
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila18.frente = 0;
        fila18.tras = (byte) -1;
        java.lang.Object[] objArray24 = fila18.item;
        java.lang.Object obj25 = fila18.desenfileira();
        java.lang.Object[] objArray26 = fila18.item;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 1, 100.0d };
        fila27.item = objArray30;
        fila27.enfileira((java.lang.Object) (short) -1);
        fila27.imprime();
        fila27.imprime();
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        fila36.item = objArray39;
        fila27.item = objArray39;
        fila18.item = objArray39;
        fila0.item = objArray39;
        ds.Fila fila44 = new ds.Fila();
        fila44.frente = 0;
        fila44.imprime();
        fila44.frente = 0;
        fila44.imprime();
        int int51 = fila44.frente;
        int int52 = fila44.frente;
        fila44.tras = (short) -1;
        ds.Fila fila55 = new ds.Fila();
        fila55.frente = 0;
        fila55.frente = 0;
        java.lang.Object[] objArray60 = fila55.item;
        fila55.imprime();
        java.lang.Object[] objArray62 = fila55.item;
        fila44.item = objArray62;
        fila0.item = objArray62;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.tras;
        int int15 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        fila0.tras = (short) -1;
        int int11 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        ds.Fila fila11 = new ds.Fila();
        fila11.frente = 0;
        boolean boolean14 = fila11.vazia();
        fila11.frente = '#';
        fila11.tras = (byte) 10;
        boolean boolean19 = fila11.vazia();
        java.lang.Object[] objArray20 = fila11.item;
        fila0.item = objArray20;
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        int int24 = fila22.frente;
        int int25 = fila22.tras;
        fila0.enfileira((java.lang.Object) int25);
        java.lang.Object obj27 = fila0.desenfileira();
        boolean boolean28 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        java.lang.Object[] objArray6 = null;
        fila0.item = objArray6;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.frente = '#';
        fila0.tras = (byte) 10;
        boolean boolean8 = fila0.vazia();
        fila0.tras = (short) 1;
        int int11 = fila0.frente;
        fila0.tras = (byte) 1;
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.tras = (short) -1;
        fila0.tras = (byte) 0;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) -1;
        fila0.frente = 100;
        fila0.frente = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        fila0.frente = '4';
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        fila0.frente = (short) 0;
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        fila0.tras = (short) -1;
        java.lang.Object obj9 = fila0.desenfileira();
        int int10 = fila0.frente;
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        fila0.tras = (short) -1;
        java.lang.Object[] objArray15 = fila0.item;
        fila0.tras = (-1);
        fila0.tras = 'a';
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1, 100.0]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila7.tras = (byte) -1;
        java.lang.Object obj17 = fila7.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        int int24 = fila18.tras;
        java.lang.Object[] objArray25 = fila18.item;
        fila7.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.tras = 1;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 1, 100.0d };
        fila31.item = objArray34;
        java.lang.Object[] objArray36 = fila31.item;
        int int37 = fila31.tras;
        java.lang.Object[] objArray38 = fila31.item;
        fila31.tras = (byte) -1;
        java.lang.Object[] objArray41 = fila31.item;
        int int42 = fila31.tras;
        java.lang.Object obj43 = fila31.desenfileira();
        java.lang.Object[] objArray44 = fila31.item;
        fila0.item = objArray44;
        java.lang.Class<?> wildcardClass46 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) 1 + "'", obj43, (short) 1);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.tras;
        int int3 = fila0.tras;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (short) 100;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.frente = 0;
        fila4.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100.0d };
        fila3.item = objArray6;
        java.lang.Object[] objArray8 = fila3.item;
        int int9 = fila3.tras;
        java.lang.Object[] objArray10 = fila3.item;
        fila3.tras = (byte) -1;
        java.lang.Object obj13 = fila3.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 100.0d };
        fila14.item = objArray17;
        java.lang.Object[] objArray19 = fila14.item;
        int int20 = fila14.tras;
        java.lang.Object[] objArray21 = fila14.item;
        fila3.item = objArray21;
        boolean boolean23 = fila3.vazia();
        fila0.enfileira((java.lang.Object) boolean23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100.0d };
        fila3.item = objArray6;
        java.lang.Object[] objArray8 = fila3.item;
        int int9 = fila3.tras;
        java.lang.Object[] objArray10 = fila3.item;
        fila0.item = objArray10;
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Class<?> wildcardClass13 = objArray12.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object[] objArray10 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(objArray10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100.0d };
        fila3.item = objArray6;
        java.lang.Object[] objArray8 = fila3.item;
        int int9 = fila3.tras;
        java.lang.Object[] objArray10 = fila3.item;
        fila0.item = objArray10;
        fila0.imprime();
        int int13 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        ds.Fila fila11 = new ds.Fila();
        fila11.frente = 0;
        boolean boolean14 = fila11.vazia();
        fila11.frente = '#';
        fila11.tras = (byte) 10;
        boolean boolean19 = fila11.vazia();
        java.lang.Object[] objArray20 = fila11.item;
        fila0.item = objArray20;
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        int int24 = fila22.frente;
        int int25 = fila22.tras;
        fila0.enfileira((java.lang.Object) int25);
        java.lang.Object obj27 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int30 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        fila0.frente = 100;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        fila9.frente = 0;
        java.lang.Object[] objArray14 = fila9.item;
        fila9.imprime();
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 1, 100.0d };
        fila16.item = objArray19;
        java.lang.Object[] objArray21 = fila16.item;
        int int22 = fila16.tras;
        java.lang.Object[] objArray23 = fila16.item;
        fila9.item = objArray23;
        fila0.item = objArray23;
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila26.frente = 0;
        fila26.tras = (byte) 1;
        fila26.tras = (short) 1;
        java.lang.Object[] objArray34 = fila26.item;
        fila0.item = objArray34;
        boolean boolean36 = fila0.vazia();
        int int37 = fila0.frente;
        fila0.tras = (-1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.frente = (byte) 1;
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.frente = 2;
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        fila0.frente = (short) 10;
        fila0.tras = ' ';
        java.lang.Object obj8 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        fila0.tras = (short) 1;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        fila6.item = objArray9;
        java.lang.Object[] objArray11 = fila6.item;
        int int12 = fila6.tras;
        java.lang.Object[] objArray13 = fila6.item;
        fila6.tras = (byte) -1;
        java.lang.Object[] objArray16 = fila6.item;
        fila6.tras = '4';
        java.lang.Class<?> wildcardClass19 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = null;
        fila0.enfileira(obj21);
        boolean boolean23 = fila0.vazia();
        fila0.frente = (byte) 10;
        java.lang.Object obj26 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila7.tras = (byte) -1;
        java.lang.Object obj17 = fila7.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        int int24 = fila18.tras;
        java.lang.Object[] objArray25 = fila18.item;
        fila7.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        int int29 = fila0.frente;
        fila0.tras = (byte) 10;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.frente = 0;
        fila8.tras = (byte) -1;
        java.lang.Object[] objArray14 = fila8.item;
        java.lang.Object obj15 = fila8.desenfileira();
        fila0.enfileira(obj15);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[null, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[null, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        fila0.tras = (short) -1;
        java.lang.Object[] objArray15 = fila0.item;
        fila0.frente = 10;
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        java.lang.Object obj6 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        fila0.tras = 0;
        ds.Fila fila12 = new ds.Fila();
        fila12.frente = 0;
        fila12.imprime();
        int int16 = fila12.tras;
        java.lang.Object[] objArray18 = new java.lang.Object[] { '#' };
        fila12.item = objArray18;
        fila0.item = objArray18;
        int int21 = fila0.tras;
        boolean boolean22 = fila0.vazia();
        java.lang.Object[] objArray23 = fila0.item;
        boolean boolean24 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[#]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[#]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        fila0.tras = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        int int4 = fila0.tras;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#' };
        fila0.item = objArray6;
        java.lang.Object[] objArray8 = fila0.item;
        int int9 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100.0f);
        int int10 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.tras = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        boolean boolean3 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        fila0.frente = (short) 10;
        fila0.tras = ' ';
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        fila0.item = objArray12;
        java.lang.Object[] objArray15 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray17 = fila0.item;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        fila18.item = objArray21;
        java.lang.Object[] objArray23 = fila18.item;
        fila18.tras = (short) 0;
        java.lang.Object[] objArray26 = fila18.item;
        java.lang.Object[] objArray27 = fila18.item;
        fila18.tras = 0;
        ds.Fila fila30 = new ds.Fila();
        fila30.frente = 0;
        fila30.imprime();
        int int34 = fila30.tras;
        java.lang.Object[] objArray36 = new java.lang.Object[] { '#' };
        fila30.item = objArray36;
        fila18.item = objArray36;
        int int39 = fila18.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila18);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[#]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        fila7.enfileira((java.lang.Object) (short) -1);
        fila7.imprime();
        fila7.imprime();
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 1, 100.0d };
        fila16.item = objArray19;
        fila7.item = objArray19;
        java.lang.Object[] objArray22 = fila7.item;
        fila7.imprime();
        java.lang.Object[] objArray24 = fila7.item;
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila25.frente = 0;
        fila25.tras = (byte) -1;
        java.lang.Object[] objArray31 = fila25.item;
        java.lang.Object obj32 = fila25.desenfileira();
        java.lang.Object[] objArray33 = fila25.item;
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 1, 100.0d };
        fila34.item = objArray37;
        fila34.enfileira((java.lang.Object) (short) -1);
        fila34.imprime();
        fila34.imprime();
        ds.Fila fila43 = new ds.Fila();
        java.lang.Object[] objArray46 = new java.lang.Object[] { (short) 1, 100.0d };
        fila43.item = objArray46;
        fila34.item = objArray46;
        fila25.item = objArray46;
        fila7.item = objArray46;
        fila0.item = objArray46;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[1, 100.0]");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) 1, 100.0d };
        fila8.item = objArray11;
        java.lang.Object[] objArray13 = fila8.item;
        int int14 = fila8.tras;
        java.lang.Object[] objArray15 = fila8.item;
        fila8.frente = (byte) 1;
        java.lang.Object[] objArray18 = fila8.item;
        fila0.item = objArray18;
        java.lang.Object[] objArray20 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = fila0.item;
        fila0.tras = 2;
        fila0.frente = 35;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object obj10 = fila0.desenfileira();
        int int11 = fila0.tras;
        java.lang.Object[] objArray12 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 1 + "'", obj10, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 100.0d };
        fila14.item = objArray17;
        java.lang.Object[] objArray19 = fila14.item;
        int int20 = fila14.tras;
        int int21 = fila14.tras;
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        fila22.item = objArray25;
        java.lang.Object[] objArray27 = fila22.item;
        int int28 = fila22.tras;
        fila22.frente = 100;
        ds.Fila fila31 = new ds.Fila();
        fila31.frente = 0;
        fila31.frente = 0;
        java.lang.Object[] objArray36 = fila31.item;
        fila31.imprime();
        ds.Fila fila38 = new ds.Fila();
        java.lang.Object[] objArray41 = new java.lang.Object[] { (short) 1, 100.0d };
        fila38.item = objArray41;
        java.lang.Object[] objArray43 = fila38.item;
        int int44 = fila38.tras;
        java.lang.Object[] objArray45 = fila38.item;
        fila31.item = objArray45;
        fila22.item = objArray45;
        fila14.enfileira((java.lang.Object) objArray45);
        ds.Fila fila49 = new ds.Fila();
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 1, 100.0d };
        fila49.item = objArray52;
        java.lang.Object[] objArray54 = fila49.item;
        fila49.tras = (short) 0;
        java.lang.Object[] objArray57 = fila49.item;
        java.lang.Object[] objArray58 = fila49.item;
        int int59 = fila49.frente;
        ds.Fila fila60 = new ds.Fila();
        java.lang.Object[] objArray63 = new java.lang.Object[] { (short) 1, 100.0d };
        fila60.item = objArray63;
        fila60.enfileira((java.lang.Object) (short) -1);
        fila60.imprime();
        java.lang.Object[] objArray68 = fila60.item;
        fila49.enfileira((java.lang.Object) objArray68);
        fila14.item = objArray68;
        fila0.item = objArray68;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[[1, 100.0], 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[[1, 100.0], 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[[-1, 100.0], 100.0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[[-1, 100.0], 100.0]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[[-1, 100.0], 100.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[[-1, 100.0], 100.0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[-1, 100.0]");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        int int8 = fila0.tras;
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100.0d };
        fila3.item = objArray6;
        java.lang.Object[] objArray8 = fila3.item;
        int int9 = fila3.tras;
        java.lang.Object[] objArray10 = fila3.item;
        fila0.item = objArray10;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        fila12.item = objArray15;
        fila0.enfileira((java.lang.Object) fila12);
        boolean boolean18 = fila12.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.tras;
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        fila13.item = objArray16;
        java.lang.Object[] objArray18 = fila13.item;
        fila13.tras = (short) 0;
        java.lang.Object[] objArray21 = fila13.item;
        fila0.item = objArray21;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 1, 100.0d };
        fila23.item = objArray26;
        java.lang.Object[] objArray28 = fila23.item;
        fila23.tras = (short) 0;
        java.lang.Object[] objArray31 = fila23.item;
        java.lang.Object[] objArray32 = fila23.item;
        fila23.tras = 0;
        ds.Fila fila35 = new ds.Fila();
        fila35.frente = 0;
        fila35.imprime();
        int int39 = fila35.tras;
        java.lang.Object[] objArray41 = new java.lang.Object[] { '#' };
        fila35.item = objArray41;
        fila23.item = objArray41;
        int int44 = fila23.tras;
        boolean boolean45 = fila23.vazia();
        java.lang.Object[] objArray46 = fila23.item;
        fila0.item = objArray46;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[#]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[#]");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        int int9 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        fila11.item = objArray14;
        java.lang.Object[] objArray16 = fila11.item;
        int int17 = fila11.tras;
        java.lang.Object[] objArray18 = fila11.item;
        fila0.item = objArray18;
        int int20 = fila0.tras;
        java.lang.Object obj21 = fila0.desenfileira();
        int int22 = fila0.frente;
        fila0.tras = 32;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 1 + "'", obj10, (short) 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.frente = (short) -1;
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        fila0.item = objArray12;
        java.lang.Object[] objArray15 = fila0.item;
        fila0.imprime();
        fila0.tras = (-1);
        boolean boolean19 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        fila9.item = objArray12;
        fila9.enfileira((java.lang.Object) (short) -1);
        fila9.imprime();
        fila9.imprime();
        int int18 = fila9.frente;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        fila19.item = objArray22;
        java.lang.Object[] objArray24 = fila19.item;
        fila19.tras = (short) 0;
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        int int29 = fila27.frente;
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 1, 100.0d };
        fila30.item = objArray33;
        java.lang.Object[] objArray35 = fila30.item;
        int int36 = fila30.tras;
        java.lang.Object[] objArray37 = fila30.item;
        fila27.item = objArray37;
        fila19.item = objArray37;
        fila9.item = objArray37;
        fila0.enfileira((java.lang.Object) objArray37);
        java.lang.Object obj42 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, [1, 100.0]]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        fila11.item = objArray14;
        java.lang.Object[] objArray16 = fila11.item;
        int int17 = fila11.tras;
        java.lang.Object[] objArray18 = fila11.item;
        fila0.item = objArray18;
        int int20 = fila0.tras;
        java.lang.Object obj21 = fila0.desenfileira();
        int int22 = fila0.frente;
        int int23 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 1 + "'", obj10, (short) 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        fila0.tras = (short) 1;
        java.lang.Object[] objArray8 = fila0.item;
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        fila0.frente = 0;
        int int8 = fila0.frente;
        fila0.tras = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        fila0.tras = 100;
        fila0.frente = 100;
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) ' ');
        fila0.tras = (byte) 10;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        fila12.item = objArray15;
        fila12.enfileira((java.lang.Object) (short) -1);
        fila12.imprime();
        fila12.imprime();
        int int21 = fila12.frente;
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        fila12.frente = 35;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        fila0.frente = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.tras = 10;
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 1, 100.0d };
        fila10.item = objArray13;
        fila10.enfileira((java.lang.Object) (short) -1);
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        fila19.item = objArray22;
        fila10.item = objArray22;
        java.lang.Object[] objArray25 = fila10.item;
        fila0.item = objArray25;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 1, 100.0d };
        fila27.item = objArray30;
        fila27.tras = 0;
        fila27.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) fila27);
        fila27.tras = 10;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1, 100.0]");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        int int3 = fila0.tras;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = 0;
        fila4.tras = (byte) -1;
        java.lang.Object[] objArray10 = fila4.item;
        java.lang.Object obj11 = fila4.desenfileira();
        java.lang.Object[] objArray12 = fila4.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 100.0d };
        fila14.item = objArray17;
        java.lang.Object[] objArray19 = fila14.item;
        int int20 = fila14.tras;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        fila21.item = objArray24;
        java.lang.Object[] objArray26 = fila21.item;
        int int27 = fila21.tras;
        java.lang.Object[] objArray28 = fila21.item;
        fila21.tras = (byte) -1;
        java.lang.Object obj31 = fila21.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 1, 100.0d };
        fila32.item = objArray35;
        java.lang.Object[] objArray37 = fila32.item;
        int int38 = fila32.tras;
        java.lang.Object[] objArray39 = fila32.item;
        fila21.item = objArray39;
        fila14.item = objArray39;
        fila0.enfileira((java.lang.Object) fila14);
        ds.Fila fila43 = new ds.Fila();
        fila43.frente = 0;
        fila43.imprime();
        fila43.frente = 0;
        fila43.imprime();
        fila43.tras = 100;
        ds.Fila fila52 = new ds.Fila();
        java.lang.Object[] objArray55 = new java.lang.Object[] { (short) 1, 100.0d };
        fila52.item = objArray55;
        java.lang.Object[] objArray57 = fila52.item;
        fila43.item = objArray57;
        fila43.frente = (byte) 1;
        java.lang.Object[] objArray61 = fila43.item;
        fila0.item = objArray61;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 1 + "'", obj31, (short) 1);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[1, 100.0]");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.tras = 10;
        int int5 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.tras = 1;
        fila0.frente = (short) 10;
        boolean boolean10 = fila0.vazia();
        fila0.frente = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.frente = 0;
        fila6.frente = 0;
        java.lang.Object[] objArray11 = fila6.item;
        fila6.imprime();
        int int13 = fila6.tras;
        fila0.enfileira((java.lang.Object) fila6);
        int int15 = fila0.frente;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 1, 100.0d };
        fila16.item = objArray19;
        java.lang.Object[] objArray21 = fila16.item;
        fila16.tras = (short) 0;
        fila16.tras = 1;
        fila0.enfileira((java.lang.Object) fila16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = fila0.item;
        fila0.tras = 2;
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100.0d };
        fila3.item = objArray6;
        java.lang.Object[] objArray8 = fila3.item;
        int int9 = fila3.tras;
        java.lang.Object[] objArray10 = fila3.item;
        fila0.item = objArray10;
        fila0.imprime();
        fila0.frente = '#';
        fila0.frente = (byte) -1;
        fila0.frente = (short) -1;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        fila19.item = objArray22;
        fila19.enfileira((java.lang.Object) (short) -1);
        int int26 = fila19.tras;
        fila19.imprime();
        fila19.frente = 100;
        ds.Fila fila30 = new ds.Fila();
        fila30.frente = 0;
        boolean boolean33 = fila30.vazia();
        fila30.frente = '#';
        fila30.tras = (byte) 10;
        boolean boolean38 = fila30.vazia();
        java.lang.Object[] objArray39 = fila30.item;
        fila19.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        boolean boolean42 = fila41.vazia();
        int int43 = fila41.frente;
        int int44 = fila41.tras;
        fila19.enfileira((java.lang.Object) int44);
        java.lang.Object obj46 = fila19.desenfileira();
        fila0.enfileira(obj46);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[null, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[null, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[null, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[null, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        int int3 = fila0.tras;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = 0;
        fila4.tras = (byte) -1;
        java.lang.Object[] objArray10 = fila4.item;
        java.lang.Object obj11 = fila4.desenfileira();
        java.lang.Object[] objArray12 = fila4.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 100.0d };
        fila14.item = objArray17;
        java.lang.Object[] objArray19 = fila14.item;
        int int20 = fila14.tras;
        java.lang.Object[] objArray21 = fila14.item;
        fila14.tras = (byte) -1;
        java.lang.Object obj24 = fila14.desenfileira();
        int int25 = fila14.tras;
        fila14.tras = (short) 100;
        java.lang.Object obj28 = fila14.desenfileira();
        fila0.enfileira(obj28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 1 + "'", obj24, (short) 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        fila0.frente = 100;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        fila9.frente = 0;
        java.lang.Object[] objArray14 = fila9.item;
        fila9.imprime();
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 1, 100.0d };
        fila16.item = objArray19;
        java.lang.Object[] objArray21 = fila16.item;
        int int22 = fila16.tras;
        java.lang.Object[] objArray23 = fila16.item;
        fila9.item = objArray23;
        fila0.item = objArray23;
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila26.frente = 0;
        fila26.tras = (byte) 1;
        fila26.tras = (short) 1;
        java.lang.Object[] objArray34 = fila26.item;
        fila0.item = objArray34;
        java.lang.Object obj36 = fila0.desenfileira();
        boolean boolean37 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 100.0d };
        fila4.item = objArray7;
        java.lang.Object[] objArray9 = fila4.item;
        fila4.tras = (short) 0;
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        int int14 = fila12.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 100.0d };
        fila15.item = objArray18;
        java.lang.Object[] objArray20 = fila15.item;
        int int21 = fila15.tras;
        java.lang.Object[] objArray22 = fila15.item;
        fila12.item = objArray22;
        fila4.item = objArray22;
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = fila4.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        java.lang.Object[] objArray8 = fila0.item;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        fila9.frente = 0;
        java.lang.Object[] objArray14 = fila9.item;
        fila9.imprime();
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 1, 100.0d };
        fila16.item = objArray19;
        java.lang.Object[] objArray21 = fila16.item;
        int int22 = fila16.tras;
        java.lang.Object[] objArray23 = fila16.item;
        fila9.item = objArray23;
        java.lang.Object[] objArray25 = fila9.item;
        fila0.item = objArray25;
        fila0.frente = (short) 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, 100.0d };
        fila1.item = objArray4;
        java.lang.Object[] objArray6 = fila1.item;
        int int7 = fila1.tras;
        fila1.frente = 100;
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        fila10.frente = 0;
        java.lang.Object[] objArray15 = fila10.item;
        fila10.imprime();
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        fila17.item = objArray20;
        java.lang.Object[] objArray22 = fila17.item;
        int int23 = fila17.tras;
        java.lang.Object[] objArray24 = fila17.item;
        fila10.item = objArray24;
        fila1.item = objArray24;
        fila0.enfileira((java.lang.Object) fila1);
        boolean boolean28 = fila1.vazia();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) ' ');
        fila0.tras = (byte) 10;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        fila12.item = objArray15;
        fila12.enfileira((java.lang.Object) (short) -1);
        fila12.imprime();
        fila12.imprime();
        int int21 = fila12.frente;
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        int int24 = fila12.tras;
        ds.Fila fila25 = new ds.Fila();
        fila25.frente = 0;
        fila25.tras = 10;
        boolean boolean30 = fila25.vazia();
        fila25.frente = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            fila12.enfileira((java.lang.Object) fila25);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.frente = '#';
        fila0.tras = (byte) 10;
        boolean boolean8 = fila0.vazia();
        fila0.frente = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        ds.Fila fila11 = new ds.Fila();
        fila11.frente = 0;
        boolean boolean14 = fila11.vazia();
        fila11.frente = '#';
        fila11.tras = (byte) 10;
        boolean boolean19 = fila11.vazia();
        java.lang.Object[] objArray20 = fila11.item;
        fila0.item = objArray20;
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        int int24 = fila22.frente;
        int int25 = fila22.tras;
        fila0.enfileira((java.lang.Object) int25);
        java.lang.Class<?> wildcardClass27 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.tras;
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Object[] objArray13 = fila0.item;
        int int14 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.tras;
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        fila13.item = objArray16;
        java.lang.Object[] objArray18 = fila13.item;
        fila13.tras = (short) 0;
        java.lang.Object[] objArray21 = fila13.item;
        fila0.item = objArray21;
        java.lang.Object obj23 = fila0.desenfileira();
        java.lang.Object obj24 = fila0.desenfileira();
        fila0.frente = (short) 10;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 1, 100.0d };
        fila27.item = objArray30;
        java.lang.Object[] objArray32 = fila27.item;
        int int33 = fila27.tras;
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 1, 100.0d };
        fila34.item = objArray37;
        java.lang.Object[] objArray39 = fila34.item;
        int int40 = fila34.tras;
        java.lang.Object[] objArray41 = fila34.item;
        fila34.tras = (byte) -1;
        java.lang.Object obj44 = fila34.desenfileira();
        ds.Fila fila45 = new ds.Fila();
        java.lang.Object[] objArray48 = new java.lang.Object[] { (short) 1, 100.0d };
        fila45.item = objArray48;
        java.lang.Object[] objArray50 = fila45.item;
        int int51 = fila45.tras;
        java.lang.Object[] objArray52 = fila45.item;
        fila34.item = objArray52;
        fila27.item = objArray52;
        int int55 = fila27.tras;
        fila27.frente = (-1);
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 1 + "'", obj24, (short) 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (short) 1 + "'", obj44, (short) 1);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        int int10 = fila0.frente;
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.frente = 0;
        fila6.frente = 0;
        java.lang.Object[] objArray11 = fila6.item;
        fila6.imprime();
        int int13 = fila6.tras;
        fila0.enfileira((java.lang.Object) fila6);
        int int15 = fila0.frente;
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.frente = 0;
        fila16.tras = (byte) 1;
        fila16.tras = (short) 1;
        java.lang.Object[] objArray24 = fila16.item;
        fila0.enfileira((java.lang.Object) objArray24);
        int int26 = fila0.tras;
        fila0.frente = 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        java.lang.Object[] objArray9 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, 100.0]");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.tras = 100;
        java.lang.Object[] objArray12 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1, 100.0]");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.frente = 0;
        fila4.frente = 0;
        java.lang.Object[] objArray9 = null;
        fila4.item = objArray9;
        java.lang.Object[] objArray11 = fila4.item;
        java.lang.Object[] objArray12 = fila4.item;
        fila4.tras = 'a';
        fila0.enfileira((java.lang.Object) fila4);
        int int16 = fila0.frente;
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        fila0.tras = (byte) -1;
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) ' ');
        fila0.tras = (byte) 10;
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.tras = 1;
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Object[] objArray10 = fila0.item;
        ds.Fila fila11 = new ds.Fila();
        fila11.frente = 0;
        fila11.imprime();
        int int15 = fila11.tras;
        java.lang.Object[] objArray17 = new java.lang.Object[] { '#' };
        fila11.item = objArray17;
        java.lang.Object[] objArray19 = fila11.item;
        fila0.enfileira((java.lang.Object) fila11);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[#]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[#]");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.frente = 0;
        fila4.imprime();
        fila4.frente = 0;
        java.lang.Class<?> wildcardClass10 = fila4.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass10);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        fila12.item = objArray15;
        java.lang.Object[] objArray17 = fila12.item;
        int int18 = fila12.tras;
        java.lang.Object[] objArray19 = fila12.item;
        fila12.frente = (byte) 1;
        java.lang.Object[] objArray22 = fila12.item;
        fila0.item = objArray22;
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        int int9 = fila0.tras;
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.frente = 0;
        fila10.tras = (byte) 1;
        fila10.tras = (short) 1;
        fila10.tras = 2;
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.imprime();
        int int23 = fila20.tras;
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila24.frente = 0;
        fila24.tras = (byte) -1;
        java.lang.Object[] objArray30 = fila24.item;
        java.lang.Object obj31 = fila24.desenfileira();
        java.lang.Object[] objArray32 = fila24.item;
        fila20.item = objArray32;
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 1, 100.0d };
        fila34.item = objArray37;
        java.lang.Object[] objArray39 = fila34.item;
        int int40 = fila34.tras;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 1, 100.0d };
        fila41.item = objArray44;
        java.lang.Object[] objArray46 = fila41.item;
        int int47 = fila41.tras;
        java.lang.Object[] objArray48 = fila41.item;
        fila41.tras = (byte) -1;
        java.lang.Object obj51 = fila41.desenfileira();
        ds.Fila fila52 = new ds.Fila();
        java.lang.Object[] objArray55 = new java.lang.Object[] { (short) 1, 100.0d };
        fila52.item = objArray55;
        java.lang.Object[] objArray57 = fila52.item;
        int int58 = fila52.tras;
        java.lang.Object[] objArray59 = fila52.item;
        fila41.item = objArray59;
        fila34.item = objArray59;
        fila20.enfileira((java.lang.Object) fila34);
        fila10.enfileira((java.lang.Object) fila20);
        java.lang.Object[] objArray64 = fila20.item;
        fila0.enfileira((java.lang.Object) fila20);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (short) 1 + "'", obj51, (short) 1);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.tras = 0;
        fila0.tras = (byte) 100;
        java.lang.Object[] objArray9 = fila0.item;
        int int10 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.tras = '4';
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.frente = 0;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        fila7.item = objArray10;
        java.lang.Object[] objArray12 = fila7.item;
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        int int16 = fila0.frente;
        java.lang.Object[] objArray17 = fila0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        java.lang.Object[] objArray7 = fila0.item;
        int int8 = fila0.frente;
        java.lang.Object[] objArray9 = fila0.item;
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100.0d };
        fila3.item = objArray6;
        java.lang.Object[] objArray8 = fila3.item;
        int int9 = fila3.tras;
        java.lang.Object[] objArray10 = fila3.item;
        fila0.item = objArray10;
        fila0.imprime();
        fila0.frente = '#';
        fila0.frente = (byte) -1;
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        int int9 = fila0.tras;
        java.lang.Object[] objArray10 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1, 100.0]");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) 1, 100.0d };
        fila8.item = objArray11;
        fila8.enfileira((java.lang.Object) (short) -1);
        int int15 = fila8.tras;
        fila8.imprime();
        fila8.frente = 100;
        fila8.frente = (-1);
        fila8.tras = 0;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Class<?> wildcardClass24 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.tras;
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Object[] objArray13 = fila0.item;
        fila0.tras = '4';
        fila0.frente = 'a';
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        fila0.tras = 1;
        fila0.frente = (byte) 100;
        fila0.frente = (short) 1;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.tras = 10;
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        int int7 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        fila6.item = objArray9;
        java.lang.Object[] objArray11 = fila6.item;
        int int12 = fila6.tras;
        java.lang.Object[] objArray13 = fila6.item;
        fila6.tras = (byte) -1;
        java.lang.Object[] objArray16 = fila6.item;
        fila6.tras = '4';
        java.lang.Class<?> wildcardClass19 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = null;
        fila0.enfileira(obj21);
        boolean boolean23 = fila0.vazia();
        fila0.frente = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.frente = '#';
        fila0.tras = (byte) 10;
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        int int10 = fila0.tras;
        fila0.frente = 0;
        fila0.tras = (byte) 100;
        ds.Fila fila15 = new ds.Fila();
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = 0;
        fila16.imprime();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        java.lang.Object[] objArray22 = fila20.item;
        fila16.item = objArray22;
        fila15.enfileira((java.lang.Object) objArray22);
        fila0.item = objArray22;
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 1, 100.0d };
        fila26.item = objArray29;
        java.lang.Object[] objArray31 = fila26.item;
        int int32 = fila26.tras;
        fila26.frente = 100;
        ds.Fila fila35 = new ds.Fila();
        fila35.frente = 0;
        fila35.frente = 0;
        java.lang.Object[] objArray40 = fila35.item;
        fila35.imprime();
        ds.Fila fila42 = new ds.Fila();
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 1, 100.0d };
        fila42.item = objArray45;
        java.lang.Object[] objArray47 = fila42.item;
        int int48 = fila42.tras;
        java.lang.Object[] objArray49 = fila42.item;
        fila35.item = objArray49;
        fila26.item = objArray49;
        ds.Fila fila52 = new ds.Fila();
        boolean boolean53 = fila52.vazia();
        fila52.frente = 0;
        fila52.tras = (byte) 1;
        fila52.tras = (short) 1;
        java.lang.Object[] objArray60 = fila52.item;
        fila26.item = objArray60;
        boolean boolean62 = fila26.vazia();
        fila0.enfileira((java.lang.Object) fila26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray6 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        fila6.frente = 0;
        fila6.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        fila10.imprime();
        fila10.frente = 0;
        java.lang.Class<?> wildcardClass16 = fila10.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass16);
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

