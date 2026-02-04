package ds.seed9006;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Class<?> wildcardClass1 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        int int7 = fila0.frente;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        int int7 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        int int7 = fila0.frente;
        fila0.enfileira((java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.tras = (byte) -1;
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = 100;
        fila0.tras = (short) -1;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila13.item = objArray17;
        boolean boolean19 = fila13.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = (byte) 100;
        boolean boolean11 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.frente;
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila6.item = objArray10;
        fila0.item = objArray10;
        int int13 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = 100;
        int int11 = fila0.frente;
        int int12 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        fila0.tras = (byte) 100;
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Class<?> wildcardClass14 = objArray13.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[a, 100, false]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = (short) 10;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        int int18 = fila12.tras;
        boolean boolean19 = fila12.vazia();
        fila12.frente = 10;
        fila12.tras = (byte) 100;
        java.lang.Object[] objArray24 = fila12.item;
        fila0.item = objArray24;
        int int26 = fila0.tras;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila27.item = objArray31;
        int int33 = fila27.tras;
        boolean boolean34 = fila27.vazia();
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        fila27.item = objArray35;
        fila27.frente = (short) 10;
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila39.item = objArray43;
        int int45 = fila39.tras;
        boolean boolean46 = fila39.vazia();
        fila39.frente = 10;
        fila39.tras = (byte) 100;
        java.lang.Object[] objArray51 = fila39.item;
        fila27.item = objArray51;
        fila0.item = objArray51;
        java.lang.Class<?> wildcardClass54 = objArray51.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[a, 100, false]");
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = (short) 10;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        int int18 = fila12.tras;
        boolean boolean19 = fila12.vazia();
        fila12.frente = 10;
        fila12.tras = (byte) 100;
        java.lang.Object[] objArray24 = fila12.item;
        fila0.item = objArray24;
        java.lang.Object[] objArray26 = fila0.item;
        java.lang.Class<?> wildcardClass27 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[a, 100, false]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.tras = (byte) -1;
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila13.item = objArray17;
        int int19 = fila13.tras;
        boolean boolean20 = fila13.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        fila13.item = objArray21;
        fila13.frente = (short) 10;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila25.item = objArray29;
        int int31 = fila25.tras;
        boolean boolean32 = fila25.vazia();
        fila25.frente = 10;
        fila25.tras = (byte) 100;
        java.lang.Object[] objArray37 = fila25.item;
        fila13.item = objArray37;
        int int39 = fila13.tras;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila40.item = objArray44;
        int int46 = fila40.tras;
        boolean boolean47 = fila40.vazia();
        java.lang.Object[] objArray48 = new java.lang.Object[] {};
        fila40.item = objArray48;
        fila40.frente = (short) 10;
        ds.Fila fila52 = new ds.Fila();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila52.item = objArray56;
        int int58 = fila52.tras;
        boolean boolean59 = fila52.vazia();
        fila52.frente = 10;
        fila52.tras = (byte) 100;
        java.lang.Object[] objArray64 = fila52.item;
        fila40.item = objArray64;
        fila13.item = objArray64;
        fila0.item = objArray64;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[a, 100, false]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.tras = 0;
        fila0.tras = (byte) 0;
        fila0.tras = 1;
        int int12 = fila0.tras;
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = (short) 10;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        int int18 = fila12.tras;
        boolean boolean19 = fila12.vazia();
        fila12.frente = 10;
        fila12.tras = (byte) 100;
        java.lang.Object[] objArray24 = fila12.item;
        fila0.item = objArray24;
        int int26 = fila0.tras;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila27.item = objArray31;
        int int33 = fila27.tras;
        boolean boolean34 = fila27.vazia();
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        fila27.item = objArray35;
        fila27.frente = (short) 10;
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila39.item = objArray43;
        int int45 = fila39.tras;
        boolean boolean46 = fila39.vazia();
        fila39.frente = 10;
        fila39.tras = (byte) 100;
        java.lang.Object[] objArray51 = fila39.item;
        fila27.item = objArray51;
        fila0.item = objArray51;
        java.lang.Class<?> wildcardClass54 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[a, 100, false]");
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        fila0.tras = (byte) 100;
        fila0.frente = (byte) 100;
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.tras = 0;
        ds.Fila fila8 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object[] objArray10 = fila0.item;
        fila0.frente = '4';
        int int13 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.tras = (byte) -1;
        fila0.frente = '4';
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.tras = 0;
        ds.Fila fila8 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila10.item = objArray14;
        fila10.tras = 0;
        fila8.enfileira((java.lang.Object) 0);
        fila8.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[a, 100, false]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        int int10 = fila0.tras;
        int int11 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = (short) 10;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        int int18 = fila12.tras;
        boolean boolean19 = fila12.vazia();
        fila12.frente = 10;
        fila12.tras = (byte) 100;
        java.lang.Object[] objArray24 = fila12.item;
        fila0.item = objArray24;
        int int26 = fila0.tras;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila27.item = objArray31;
        int int33 = fila27.tras;
        boolean boolean34 = fila27.vazia();
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        fila27.item = objArray35;
        fila27.frente = (short) 10;
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila39.item = objArray43;
        int int45 = fila39.tras;
        boolean boolean46 = fila39.vazia();
        fila39.frente = 10;
        fila39.tras = (byte) 100;
        java.lang.Object[] objArray51 = fila39.item;
        fila27.item = objArray51;
        java.lang.Object[] objArray53 = fila27.item;
        fila0.item = objArray53;
        java.lang.Class<?> wildcardClass55 = objArray53.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[a, 100, false]");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        fila0.tras = (byte) 100;
        fila0.frente = (byte) 100;
        java.lang.Object[] objArray14 = null;
        fila0.item = objArray14;
        java.lang.Object[] objArray16 = fila0.item;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objArray16);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.tras = (byte) -1;
        int int10 = fila0.tras;
        int int11 = fila0.frente;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        int int18 = fila12.tras;
        boolean boolean19 = fila12.vazia();
        fila12.tras = (byte) -1;
        fila12.frente = ' ';
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila24.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray34 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila30.item = objArray34;
        fila24.item = objArray34;
        fila12.item = objArray34;
        fila12.frente = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[a, 100, false]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        fila0.tras = (byte) 100;
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Object[] objArray13 = fila0.item;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila14.item = objArray18;
        int int20 = fila14.tras;
        boolean boolean21 = fila14.vazia();
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        fila14.item = objArray22;
        fila14.frente = (short) 10;
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila26.item = objArray30;
        int int32 = fila26.tras;
        boolean boolean33 = fila26.vazia();
        fila26.frente = 10;
        fila26.tras = (byte) 100;
        java.lang.Object[] objArray38 = fila26.item;
        fila14.item = objArray38;
        int int40 = fila14.tras;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray45 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila41.item = objArray45;
        int int47 = fila41.tras;
        boolean boolean48 = fila41.vazia();
        java.lang.Object[] objArray49 = new java.lang.Object[] {};
        fila41.item = objArray49;
        fila41.frente = (short) 10;
        ds.Fila fila53 = new ds.Fila();
        java.lang.Object[] objArray57 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila53.item = objArray57;
        int int59 = fila53.tras;
        boolean boolean60 = fila53.vazia();
        fila53.frente = 10;
        fila53.tras = (byte) 100;
        java.lang.Object[] objArray65 = fila53.item;
        fila41.item = objArray65;
        java.lang.Object[] objArray67 = fila41.item;
        fila14.item = objArray67;
        fila0.item = objArray67;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[a, 100, false]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = 100;
        int int11 = fila0.frente;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        fila12.tras = 0;
        fila0.enfileira((java.lang.Object) fila12);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.tras = '4';
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.tras = 0;
        java.lang.Object[] objArray8 = null;
        fila0.item = objArray8;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        fila12.tras = 0;
        ds.Fila fila20 = new ds.Fila();
        fila12.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila12);
        fila12.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.tras = (byte) -1;
        fila0.frente = (byte) 1;
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila13.item = objArray17;
        int int19 = fila13.tras;
        boolean boolean20 = fila13.vazia();
        fila13.frente = 10;
        java.lang.Object obj23 = null;
        fila13.enfileira(obj23);
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira(obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[null, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[null, 100, false]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0f);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.frente = 0;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 100, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.tras = 0;
        ds.Fila fila8 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila8);
        int int10 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = (short) 10;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        int int18 = fila12.tras;
        boolean boolean19 = fila12.vazia();
        fila12.frente = 10;
        fila12.tras = (byte) 100;
        java.lang.Object[] objArray24 = fila12.item;
        fila0.item = objArray24;
        java.lang.Object[] objArray26 = fila0.item;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila27.item = objArray31;
        int int33 = fila27.tras;
        boolean boolean34 = fila27.vazia();
        fila27.frente = 10;
        java.lang.Object obj37 = null;
        fila27.enfileira(obj37);
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila39.item = objArray43;
        int int45 = fila39.tras;
        boolean boolean46 = fila39.vazia();
        int int47 = fila39.frente;
        java.lang.Object[] objArray48 = fila39.item;
        fila27.item = objArray48;
        fila0.item = objArray48;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[null, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[null, 100, false]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[a, 100, false]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = (byte) 100;
        int int11 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = 100;
        int int11 = fila0.frente;
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = 100;
        fila0.tras = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = 100;
        int int11 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[null, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[null, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = (short) 10;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        fila12.tras = 0;
        ds.Fila fila20 = new ds.Fila();
        fila12.enfileira((java.lang.Object) fila20);
        java.lang.Object[] objArray22 = fila12.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        fila12.tras = 0;
        ds.Fila fila20 = new ds.Fila();
        fila12.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila12);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila8.item = objArray12;
        fila8.tras = 0;
        ds.Fila fila16 = new ds.Fila();
        fila8.enfileira((java.lang.Object) fila16);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila18.item = objArray22;
        fila18.tras = 0;
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object[] objArray27 = fila16.item;
        fila0.enfileira((java.lang.Object) fila16);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = (short) 10;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        int int18 = fila12.tras;
        boolean boolean19 = fila12.vazia();
        fila12.frente = 10;
        fila12.tras = (byte) 100;
        java.lang.Object[] objArray24 = fila12.item;
        fila0.item = objArray24;
        int int26 = fila0.tras;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila27.item = objArray31;
        int int33 = fila27.tras;
        boolean boolean34 = fila27.vazia();
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        fila27.item = objArray35;
        fila27.frente = (short) 10;
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila39.item = objArray43;
        int int45 = fila39.tras;
        boolean boolean46 = fila39.vazia();
        fila39.frente = 10;
        fila39.tras = (byte) 100;
        java.lang.Object[] objArray51 = fila39.item;
        fila27.item = objArray51;
        fila0.item = objArray51;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[a, 100, false]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.frente;
        java.lang.Object[] objArray9 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[a, 100, false]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.tras = 0;
        ds.Fila fila8 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean10 = fila8.vazia();
        fila8.tras = (-1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.tras = 0;
        ds.Fila fila8 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila8);
        int int10 = fila8.tras;
        int int11 = fila8.frente;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = 100;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila11.item = objArray15;
        int int17 = fila11.tras;
        boolean boolean18 = fila11.vazia();
        int int19 = fila11.tras;
        fila11.frente = 100;
        fila11.tras = (short) -1;
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean25 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.tras = 0;
        ds.Fila fila8 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.tras;
        fila0.tras = '4';
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = (byte) 100;
        boolean boolean11 = fila0.vazia();
        int int12 = fila0.tras;
        fila0.tras = (byte) 10;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila15.item = objArray19;
        int int21 = fila15.tras;
        boolean boolean22 = fila15.vazia();
        fila15.frente = 10;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila25.item = objArray29;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila31.item = objArray35;
        fila25.item = objArray35;
        fila15.item = objArray35;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[a, 100, false]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.tras = 0;
        fila0.tras = (byte) 0;
        fila0.tras = 1;
        fila0.frente = 1;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.frente = 100;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, 100, false]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0f);
        fila0.frente = (byte) 100;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila11.item = objArray15;
        int int17 = fila11.tras;
        boolean boolean18 = fila11.vazia();
        fila11.tras = (byte) -1;
        fila11.frente = ' ';
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila23.item = objArray27;
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila29.item = objArray33;
        fila23.item = objArray33;
        fila11.item = objArray33;
        fila0.item = objArray33;
        int int38 = fila0.tras;
        java.lang.Class<?> wildcardClass39 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 100, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = (short) 10;
        fila0.tras = 0;
        fila0.frente = '#';
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.tras = (byte) -1;
        int int10 = fila0.tras;
        int int11 = fila0.frente;
        fila0.tras = 0;
        fila0.imprime();
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.tras = 0;
        fila0.tras = (byte) 0;
        fila0.tras = 1;
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.tras = 0;
        ds.Fila fila8 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = '#';
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0f);
        fila0.frente = (byte) 100;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila11.item = objArray15;
        int int17 = fila11.tras;
        boolean boolean18 = fila11.vazia();
        fila11.tras = (byte) -1;
        fila11.frente = ' ';
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila23.item = objArray27;
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila29.item = objArray33;
        fila23.item = objArray33;
        fila11.item = objArray33;
        fila0.item = objArray33;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 100, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[a, 100, false]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila8.item = objArray12;
        int int14 = fila8.tras;
        boolean boolean15 = fila8.vazia();
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        fila8.item = objArray16;
        fila8.frente = (short) 10;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila20.item = objArray24;
        int int26 = fila20.tras;
        boolean boolean27 = fila20.vazia();
        fila20.frente = 10;
        fila20.tras = (byte) 100;
        java.lang.Object[] objArray32 = fila20.item;
        fila8.item = objArray32;
        fila0.item = objArray32;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[a, 100, false]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        fila0.tras = (byte) 0;
        int int12 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.tras = 0;
        fila0.tras = (byte) 0;
        fila0.tras = 1;
        int int12 = fila0.tras;
        fila0.frente = (short) -1;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 100;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = 0;
        fila0.frente = (short) 100;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila8.item = objArray12;
        int int14 = fila8.tras;
        boolean boolean15 = fila8.vazia();
        fila8.frente = 10;
        java.lang.Object obj18 = null;
        fila8.enfileira(obj18);
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila20.item = objArray24;
        int int26 = fila20.tras;
        boolean boolean27 = fila20.vazia();
        int int28 = fila20.frente;
        java.lang.Object[] objArray29 = fila20.item;
        fila8.item = objArray29;
        fila0.item = objArray29;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[null, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[null, 100, false]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[a, 100, false]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = 100;
        int int11 = fila0.frente;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        int int18 = fila12.tras;
        boolean boolean19 = fila12.vazia();
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        fila12.item = objArray20;
        fila0.item = objArray20;
        int int23 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        fila12.tras = 0;
        ds.Fila fila20 = new ds.Fila();
        fila12.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila23.item = objArray27;
        fila12.item = objArray27;
        java.lang.Object obj30 = fila12.desenfileira();
        int int31 = fila12.tras;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[a, 100, false]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 'a' + "'", obj30, 'a');
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        fila0.tras = (byte) 100;
        java.lang.Object[] objArray12 = fila0.item;
        int int13 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = 100;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila11.item = objArray15;
        int int17 = fila11.tras;
        boolean boolean18 = fila11.vazia();
        int int19 = fila11.tras;
        fila11.frente = 100;
        fila11.tras = (short) -1;
        fila0.enfileira((java.lang.Object) fila11);
        int int25 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila7.item = objArray11;
        int int13 = fila7.tras;
        boolean boolean14 = fila7.vazia();
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        fila7.item = objArray15;
        fila7.frente = (short) 10;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila19.item = objArray23;
        int int25 = fila19.tras;
        boolean boolean26 = fila19.vazia();
        fila19.frente = 10;
        fila19.tras = (byte) 100;
        java.lang.Object[] objArray31 = fila19.item;
        fila7.item = objArray31;
        java.lang.Object[] objArray33 = fila7.item;
        fila0.item = objArray33;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[a, 100, false]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        int int18 = fila12.tras;
        boolean boolean19 = fila12.vazia();
        int int20 = fila12.frente;
        java.lang.Object[] objArray21 = fila12.item;
        fila0.item = objArray21;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[null, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[null, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[a, 100, false]");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        fila0.tras = (byte) 100;
        fila0.frente = (byte) 100;
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = (short) 10;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        int int18 = fila12.tras;
        boolean boolean19 = fila12.vazia();
        fila12.frente = 10;
        fila12.tras = (byte) 100;
        java.lang.Object[] objArray24 = fila12.item;
        fila0.item = objArray24;
        java.lang.Object[] objArray26 = fila0.item;
        fila0.frente = 'a';
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[a, 100, false]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.frente;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila10.item = objArray14;
        int int16 = fila10.tras;
        boolean boolean17 = fila10.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        fila10.item = objArray18;
        fila10.frente = (short) 10;
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila22.item = objArray26;
        int int28 = fila22.tras;
        boolean boolean29 = fila22.vazia();
        fila22.frente = 10;
        fila22.tras = (byte) 100;
        java.lang.Object[] objArray34 = fila22.item;
        fila10.item = objArray34;
        int int36 = fila10.tras;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila37.item = objArray41;
        int int43 = fila37.tras;
        boolean boolean44 = fila37.vazia();
        java.lang.Object[] objArray45 = new java.lang.Object[] {};
        fila37.item = objArray45;
        fila37.frente = (short) 10;
        ds.Fila fila49 = new ds.Fila();
        java.lang.Object[] objArray53 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila49.item = objArray53;
        int int55 = fila49.tras;
        boolean boolean56 = fila49.vazia();
        fila49.frente = 10;
        fila49.tras = (byte) 100;
        java.lang.Object[] objArray61 = fila49.item;
        fila37.item = objArray61;
        fila10.item = objArray61;
        fila0.item = objArray61;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[a, 100, false]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = (byte) 100;
        int int11 = fila0.frente;
        int int12 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila6.item = objArray10;
        fila0.item = objArray10;
        int int13 = fila0.tras;
        fila0.frente = (byte) 10;
        fila0.tras = (byte) 10;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.frente = (short) 100;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = (short) 10;
        fila0.tras = ' ';
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = 100;
        int int11 = fila0.frente;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        int int18 = fila12.tras;
        boolean boolean19 = fila12.vazia();
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        fila12.item = objArray20;
        fila0.item = objArray20;
        int int23 = fila0.tras;
        java.lang.Object[] objArray24 = fila0.item;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.tras = (byte) -1;
        int int10 = fila0.tras;
        int int11 = fila0.frente;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila15.item = objArray19;
        fila15.tras = 0;
        ds.Fila fila23 = new ds.Fila();
        fila15.enfileira((java.lang.Object) fila23);
        java.lang.Object[] objArray25 = fila15.item;
        int int26 = fila15.tras;
        java.lang.Object[] objArray27 = fila15.item;
        fila0.item = objArray27;
        fila0.tras = (byte) 0;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        fila0.tras = (byte) 100;
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Object[] objArray13 = fila0.item;
        int int14 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.tras = 0;
        fila0.tras = (byte) 0;
        fila0.tras = 1;
        int int12 = fila0.tras;
        fila0.imprime();
        int int14 = fila0.frente;
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.tras = (byte) -1;
        fila0.frente = (byte) 1;
        java.lang.Object[] objArray12 = fila0.item;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[a, 100, false]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.tras = (byte) -1;
        int int10 = fila0.tras;
        int int11 = fila0.frente;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila15.item = objArray19;
        fila15.tras = 0;
        ds.Fila fila23 = new ds.Fila();
        fila15.enfileira((java.lang.Object) fila23);
        java.lang.Object[] objArray25 = fila15.item;
        int int26 = fila15.tras;
        fila0.enfileira((java.lang.Object) int26);
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.tras = (byte) -1;
        fila0.frente = ' ';
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila18.item = objArray22;
        fila12.item = objArray22;
        fila0.item = objArray22;
        int int26 = fila0.tras;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila27.item = objArray31;
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila33.item = objArray37;
        fila27.item = objArray37;
        int int40 = fila27.tras;
        fila27.frente = (byte) 10;
        java.lang.Object[] objArray43 = fila27.item;
        fila0.item = objArray43;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[a, 100, false]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = 0;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        int int18 = fila12.tras;
        boolean boolean19 = fila12.vazia();
        fila12.tras = (byte) -1;
        int int22 = fila12.tras;
        int int23 = fila12.frente;
        fila12.tras = 0;
        fila12.imprime();
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila27.item = objArray31;
        fila27.tras = 0;
        ds.Fila fila35 = new ds.Fila();
        fila27.enfileira((java.lang.Object) fila35);
        java.lang.Object[] objArray37 = fila27.item;
        int int38 = fila27.tras;
        java.lang.Object[] objArray39 = fila27.item;
        fila12.item = objArray39;
        fila0.item = objArray39;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = (short) 10;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        int int18 = fila12.tras;
        boolean boolean19 = fila12.vazia();
        fila12.frente = 10;
        fila12.tras = (byte) 100;
        java.lang.Object[] objArray24 = fila12.item;
        fila0.item = objArray24;
        int int26 = fila0.tras;
        java.lang.Object[] objArray27 = fila0.item;
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila28.item = objArray32;
        int int34 = fila28.tras;
        boolean boolean35 = fila28.vazia();
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        fila28.item = objArray36;
        int int38 = fila28.tras;
        int int39 = fila28.tras;
        fila0.enfileira((java.lang.Object) int39);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0, 100, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, 100, false]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0, 100, false]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = 100;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, 100, false]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0f);
        fila0.frente = (byte) 100;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila11.item = objArray15;
        int int17 = fila11.tras;
        boolean boolean18 = fila11.vazia();
        fila11.tras = (byte) -1;
        fila11.frente = ' ';
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila23.item = objArray27;
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila29.item = objArray33;
        fila23.item = objArray33;
        fila11.item = objArray33;
        fila0.item = objArray33;
        int int38 = fila0.tras;
        java.lang.Object[] objArray39 = fila0.item;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 100, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[a, 100, false]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.tras = 0;
        fila0.tras = (byte) 0;
        fila0.tras = 1;
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 'a' + "'", obj12, 'a');
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        fila12.tras = 0;
        ds.Fila fila20 = new ds.Fila();
        fila12.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila23.item = objArray27;
        int int29 = fila23.tras;
        boolean boolean30 = fila23.vazia();
        int int31 = fila23.tras;
        fila12.enfileira((java.lang.Object) int31);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.frente = (short) 10;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        int int18 = fila12.tras;
        boolean boolean19 = fila12.vazia();
        fila12.frente = 10;
        fila12.tras = (byte) 100;
        java.lang.Object[] objArray24 = fila12.item;
        fila0.item = objArray24;
        java.lang.Object[] objArray26 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0, 100, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, 100, false]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0, 100, false]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.tras = (byte) -1;
        fila0.frente = ' ';
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila18.item = objArray22;
        fila12.item = objArray22;
        fila0.item = objArray22;
        int int26 = fila0.tras;
        java.lang.Object[] objArray27 = fila0.item;
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila28.item = objArray32;
        int int34 = fila28.tras;
        boolean boolean35 = fila28.vazia();
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        fila28.item = objArray36;
        fila28.frente = (short) 10;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila40.item = objArray44;
        int int46 = fila40.tras;
        boolean boolean47 = fila40.vazia();
        fila40.frente = 10;
        fila40.tras = (byte) 100;
        java.lang.Object[] objArray52 = fila40.item;
        fila28.item = objArray52;
        int int54 = fila28.tras;
        ds.Fila fila55 = new ds.Fila();
        java.lang.Object[] objArray59 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila55.item = objArray59;
        int int61 = fila55.tras;
        boolean boolean62 = fila55.vazia();
        java.lang.Object[] objArray63 = new java.lang.Object[] {};
        fila55.item = objArray63;
        fila55.frente = (short) 10;
        ds.Fila fila67 = new ds.Fila();
        java.lang.Object[] objArray71 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila67.item = objArray71;
        int int73 = fila67.tras;
        boolean boolean74 = fila67.vazia();
        fila67.frente = 10;
        fila67.tras = (byte) 100;
        java.lang.Object[] objArray79 = fila67.item;
        fila55.item = objArray79;
        java.lang.Object[] objArray81 = fila55.item;
        fila28.item = objArray81;
        fila0.item = objArray81;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[a, 100, false]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[null, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[null, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        fila0.tras = 0;
        ds.Fila fila8 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object[] objArray10 = fila0.item;
        fila0.enfileira((java.lang.Object) (-1));
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = (byte) 100;
        boolean boolean11 = fila0.vazia();
        int int12 = fila0.tras;
        fila0.tras = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        fila0.frente = (short) 1;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.tras = (byte) -1;
        int int10 = fila0.tras;
        int int11 = fila0.frente;
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.tras = (byte) -1;
        fila0.frente = ' ';
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila18.item = objArray22;
        fila12.item = objArray22;
        fila0.item = objArray22;
        int int26 = fila0.tras;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila27.item = objArray31;
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila33.item = objArray37;
        fila27.item = objArray37;
        int int40 = fila27.tras;
        fila27.frente = (byte) 10;
        java.lang.Object[] objArray43 = fila27.item;
        fila0.item = objArray43;
        java.lang.Class<?> wildcardClass45 = objArray43.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[a, 100, false]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[a, 100, false]");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        fila0.tras = (byte) 100;
        fila0.frente = (byte) 100;
        fila0.imprime();
        int int15 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.tras = (byte) -1;
        int int10 = fila0.tras;
        int int11 = fila0.frente;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila12.item = objArray16;
        int int18 = fila12.tras;
        boolean boolean19 = fila12.vazia();
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        fila12.item = objArray20;
        fila12.tras = (byte) -1;
        java.lang.Object[] objArray24 = fila12.item;
        fila0.item = objArray24;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        fila0.tras = (byte) -1;
        int int12 = fila0.frente;
        fila0.frente = (byte) 10;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (byte) 100, false };
        fila0.item = objArray4;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 10;
        fila0.tras = (byte) 100;
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100, false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[a, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[a, 100, false]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

