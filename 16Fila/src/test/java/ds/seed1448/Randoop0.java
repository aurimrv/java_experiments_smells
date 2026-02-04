package ds.seed1448;

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
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Class<?> wildcardClass5 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila2.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        boolean boolean6 = fila2.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila2.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        java.lang.Class<?> wildcardClass13 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        java.lang.Class<?> wildcardClass7 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        java.lang.Class<?> wildcardClass17 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila2.enfileira((java.lang.Object) fila6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = fila6.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        fila0.imprime();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila2.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila10.enfileira((java.lang.Object) fila12);
        fila10.enfileira((java.lang.Object) 1.0d);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass19 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        java.lang.Class<?> wildcardClass14 = fila8.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila2.enfileira((java.lang.Object) fila6);
        java.lang.Class<?> wildcardClass15 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        java.lang.Class<?> wildcardClass17 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        boolean boolean6 = fila2.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) true);
        java.lang.Object obj12 = fila7.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        boolean boolean18 = fila15.vazia();
        fila7.enfileira((java.lang.Object) fila15);
        boolean boolean20 = fila15.vazia();
        boolean boolean21 = fila15.vazia();
        fila2.enfileira((java.lang.Object) boolean21);
        boolean boolean23 = fila2.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        java.lang.Object obj11 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila8.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.enfileira((java.lang.Object) 1.0d);
        fila5.imprime();
        boolean boolean13 = fila5.vazia();
        boolean boolean14 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj16 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = fila8.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila13.enfileira((java.lang.Object) 1.0d);
        fila13.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila13.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Class<?> wildcardClass30 = fila13.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila9.enfileira((java.lang.Object) 1.0d);
        fila9.imprime();
        java.lang.Object obj17 = fila9.desenfileira();
        fila0.enfileira(obj17);
        fila0.imprime();
        boolean boolean20 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 10L);
        java.lang.Object obj4 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10L + "'", obj4, 10L);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        boolean boolean6 = fila2.vazia();
        java.lang.Class<?> wildcardClass7 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.enfileira((java.lang.Object) 1.0d);
        fila5.imprime();
        boolean boolean13 = fila5.vazia();
        boolean boolean14 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        fila18.imprime();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila23.enfileira((java.lang.Object) fila25);
        boolean boolean28 = fila23.vazia();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila18.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila23);
        java.lang.Class<?> wildcardClass34 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        boolean boolean15 = fila8.vazia();
        java.lang.Class<?> wildcardClass16 = fila8.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) true);
        fila15.imprime();
        fila8.enfileira((java.lang.Object) fila15);
        java.lang.Object obj22 = fila15.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = fila15.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) true);
        java.lang.Object obj18 = fila13.desenfileira();
        fila0.enfileira(obj18);
        java.lang.Class<?> wildcardClass20 = obj18.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean12 = fila0.vazia();
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Object obj14 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) true);
        java.lang.Object obj14 = fila9.desenfileira();
        fila0.enfileira(obj14);
        boolean boolean16 = fila0.vazia();
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Object obj9 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila11.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.enfileira((java.lang.Object) 1.0d);
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        java.lang.Class<?> wildcardClass16 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila2.enfileira((java.lang.Object) fila15);
        java.lang.Object obj20 = fila2.desenfileira();
        java.lang.Class<?> wildcardClass21 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) true);
        fila15.imprime();
        fila8.enfileira((java.lang.Object) fila15);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila22.enfileira((java.lang.Object) 1.0d);
        fila22.imprime();
        fila22.imprime();
        fila22.imprime();
        boolean boolean32 = fila22.vazia();
        fila8.enfileira((java.lang.Object) boolean32);
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        fila34.enfileira((java.lang.Object) fila36);
        fila34.enfileira((java.lang.Object) 1.0d);
        fila34.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila43 = new ds.Fila();
        boolean boolean44 = fila43.vazia();
        fila43.imprime();
        fila43.enfileira((java.lang.Object) true);
        ds.Fila fila48 = new ds.Fila();
        boolean boolean49 = fila48.vazia();
        fila48.imprime();
        fila48.enfileira((java.lang.Object) true);
        fila48.imprime();
        fila43.enfileira((java.lang.Object) fila48);
        boolean boolean55 = fila43.vazia();
        java.lang.Object obj56 = fila43.desenfileira();
        fila34.enfileira((java.lang.Object) fila43);
        java.lang.Object obj58 = fila34.desenfileira();
        fila8.enfileira((java.lang.Object) fila34);
        boolean boolean60 = fila34.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + true + "'", obj56, true);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.enfileira((java.lang.Object) 1.0d);
        fila16.imprime();
        boolean boolean24 = fila16.vazia();
        boolean boolean25 = fila16.vazia();
        fila11.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila16);
        boolean boolean28 = fila0.vazia();
        java.lang.Class<?> wildcardClass29 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        fila10.enfileira(obj19);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        fila23.imprime();
        fila10.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass29 = fila10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.enfileira((java.lang.Object) 1.0d);
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        boolean boolean16 = fila7.vazia();
        java.lang.Object obj17 = fila7.desenfileira();
        fila7.imprime();
        boolean boolean19 = fila7.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        boolean boolean11 = fila2.vazia();
        java.lang.Object obj12 = fila2.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila13.enfileira((java.lang.Object) 1.0d);
        fila13.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila24.imprime();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila29.imprime();
        fila24.enfileira((java.lang.Object) fila29);
        fila13.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila24);
        java.lang.Object obj35 = fila24.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = fila24.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila10.enfileira((java.lang.Object) fila12);
        fila10.enfileira((java.lang.Object) 1.0d);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj19 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass20 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila13.enfileira((java.lang.Object) 1.0d);
        fila13.imprime();
        boolean boolean21 = fila13.vazia();
        boolean boolean22 = fila13.vazia();
        fila8.enfileira((java.lang.Object) fila13);
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila24.enfileira((java.lang.Object) fila26);
        fila26.imprime();
        fila26.imprime();
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        fila31.enfileira((java.lang.Object) fila33);
        boolean boolean36 = fila31.vazia();
        fila31.imprime();
        boolean boolean38 = fila31.vazia();
        fila31.imprime();
        fila26.enfileira((java.lang.Object) fila31);
        fila8.enfileira((java.lang.Object) fila31);
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean43 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila2.enfileira((java.lang.Object) fila4);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.enfileira((java.lang.Object) 1.0d);
        fila7.imprime();
        boolean boolean15 = fila7.vazia();
        fila2.enfileira((java.lang.Object) boolean15);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila17.enfileira((java.lang.Object) fila19);
        boolean boolean22 = fila19.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila23.enfileira((java.lang.Object) fila25);
        boolean boolean28 = fila23.vazia();
        java.lang.Object obj29 = fila23.desenfileira();
        boolean boolean30 = fila23.vazia();
        fila19.enfileira((java.lang.Object) fila23);
        fila23.imprime();
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        fila33.enfileira((java.lang.Object) fila35);
        fila33.imprime();
        fila33.imprime();
        fila23.enfileira((java.lang.Object) fila33);
        fila2.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila23);
        java.lang.Class<?> wildcardClass43 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.imprime();
        fila17.imprime();
        java.lang.Class<?> wildcardClass21 = fila17.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila7.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila24.enfileira((java.lang.Object) fila26);
        boolean boolean29 = fila24.vazia();
        fila24.imprime();
        boolean boolean31 = fila24.vazia();
        fila24.imprime();
        java.lang.Object obj33 = fila24.desenfileira();
        fila7.enfileira(obj33);
        java.lang.Class<?> wildcardClass35 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) true);
        java.lang.Object obj22 = fila17.desenfileira();
        boolean boolean23 = fila17.vazia();
        java.lang.Class<?> wildcardClass24 = fila17.getClass();
        fila2.enfileira((java.lang.Object) fila17);
        java.lang.Class<?> wildcardClass26 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        java.lang.Object obj14 = fila7.desenfileira();
        fila2.enfileira(obj14);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.enfileira((java.lang.Object) 1.0d);
        fila16.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) true);
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila30.imprime();
        fila30.enfileira((java.lang.Object) true);
        fila30.imprime();
        fila25.enfileira((java.lang.Object) fila30);
        boolean boolean37 = fila25.vazia();
        java.lang.Object obj38 = fila25.desenfileira();
        fila16.enfileira((java.lang.Object) fila25);
        fila2.enfileira((java.lang.Object) fila25);
        java.lang.Object obj41 = fila2.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) true);
        java.lang.Object obj9 = fila4.desenfileira();
        boolean boolean10 = fila4.vazia();
        java.lang.Object obj11 = null;
        fila4.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) true);
        java.lang.Object obj18 = fila13.desenfileira();
        fila4.enfileira(obj18);
        boolean boolean20 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        // The following exception was thrown during execution in test generation
        try {
            fila4.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) true);
        java.lang.Object obj18 = fila13.desenfileira();
        fila0.enfileira(obj18);
        fila0.imprime();
        boolean boolean21 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila2.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        fila10.enfileira(obj19);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        fila23.imprime();
        fila10.enfileira((java.lang.Object) fila23);
        java.lang.Class<?> wildcardClass28 = fila23.getClass();
        fila0.enfileira((java.lang.Object) fila23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        fila10.enfileira(obj19);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        fila23.imprime();
        fila10.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila10);
        fila0.imprime();
        java.lang.Class<?> wildcardClass30 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila2.enfileira((java.lang.Object) fila15);
        boolean boolean20 = fila15.vazia();
        fila15.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.enfileira((java.lang.Object) 1.0d);
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        boolean boolean16 = fila7.vazia();
        java.lang.Object obj17 = fila7.desenfileira();
        fila7.imprime();
        java.lang.Class<?> wildcardClass19 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila1.imprime();
        fila1.enfileira((java.lang.Object) true);
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) true);
        fila6.imprime();
        fila1.enfileira((java.lang.Object) fila6);
        boolean boolean13 = fila1.vazia();
        java.lang.Object obj14 = fila1.desenfileira();
        java.lang.Object obj15 = fila1.desenfileira();
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean16);
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) true);
        java.lang.Object obj9 = fila4.desenfileira();
        boolean boolean10 = fila4.vazia();
        java.lang.Object obj11 = null;
        fila4.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) true);
        java.lang.Object obj18 = fila13.desenfileira();
        fila4.enfileira(obj18);
        boolean boolean20 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj22 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.imprime();
        fila10.enfileira((java.lang.Object) fila15);
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila19.enfileira((java.lang.Object) fila21);
        fila10.enfileira((java.lang.Object) fila19);
        fila2.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass26 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        fila2.enfileira((java.lang.Object) fila11);
        boolean boolean17 = fila2.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila2.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = fila15.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila13.enfileira((java.lang.Object) 1.0d);
        fila13.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila13.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj30 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila8.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        fila7.enfileira((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.enfileira((java.lang.Object) 1.0d);
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        java.lang.Object obj16 = fila2.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        boolean boolean13 = fila2.vazia();
        java.lang.Class<?> wildcardClass14 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        java.lang.Object obj13 = null;
        fila2.enfileira(obj13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        fila2.imprime();
        fila2.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        fila10.enfileira(obj19);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        fila23.imprime();
        fila10.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean29 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        java.lang.Object obj14 = fila7.desenfileira();
        fila2.enfileira(obj14);
        fila2.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila11.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (short) 1);
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila9.enfileira((java.lang.Object) 1.0d);
        fila9.imprime();
        java.lang.Object obj17 = fila9.desenfileira();
        fila0.enfileira(obj17);
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean9 = fila0.vazia();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila2.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.imprime();
        fila16.imprime();
        fila6.enfileira((java.lang.Object) fila16);
        boolean boolean24 = fila16.vazia();
        fila16.enfileira((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) true);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) true);
        fila14.imprime();
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean21 = fila9.vazia();
        java.lang.Object obj22 = fila9.desenfileira();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila24.enfileira((java.lang.Object) fila26);
        fila24.enfileira((java.lang.Object) 1.0d);
        fila24.imprime();
        fila24.imprime();
        fila24.imprime();
        fila9.enfileira((java.lang.Object) fila24);
        java.lang.Class<?> wildcardClass35 = fila24.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila2.enfileira((java.lang.Object) fila15);
        boolean boolean20 = fila2.vazia();
        java.lang.Object obj21 = fila2.desenfileira();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.enfileira((java.lang.Object) 1.0d);
        fila5.imprime();
        boolean boolean13 = fila5.vazia();
        boolean boolean14 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        fila18.imprime();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila23.enfileira((java.lang.Object) fila25);
        boolean boolean28 = fila23.vazia();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila18.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila23);
        java.lang.Object obj34 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.enfileira((java.lang.Object) 1.0d);
        fila5.imprime();
        boolean boolean13 = fila5.vazia();
        boolean boolean14 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        fila18.imprime();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila23.enfileira((java.lang.Object) fila25);
        boolean boolean28 = fila23.vazia();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila18.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila23);
        boolean boolean34 = fila23.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        fila8.enfileira((java.lang.Object) 1.0d);
        fila8.imprime();
        boolean boolean16 = fila8.vazia();
        boolean boolean17 = fila8.vazia();
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        fila26.enfileira((java.lang.Object) fila28);
        fila26.enfileira((java.lang.Object) 1.0d);
        fila26.imprime();
        boolean boolean34 = fila26.vazia();
        boolean boolean35 = fila26.vazia();
        fila21.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila26);
        java.lang.Class<?> wildcardClass38 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0d + "'", obj11, 1.0d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        boolean boolean13 = fila10.vazia();
        boolean boolean14 = fila10.vazia();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass16 = fila10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila13.enfileira((java.lang.Object) 1.0d);
        fila13.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila24.imprime();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila29.imprime();
        fila24.enfileira((java.lang.Object) fila29);
        fila13.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        java.lang.Class<?> wildcardClass36 = fila24.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean12 = fila5.vazia();
        java.lang.Class<?> wildcardClass13 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) true);
        java.lang.Object obj9 = fila4.desenfileira();
        boolean boolean10 = fila4.vazia();
        java.lang.Object obj11 = null;
        fila4.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) true);
        java.lang.Object obj18 = fila13.desenfileira();
        fila4.enfileira(obj18);
        boolean boolean20 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean22 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila10.enfileira((java.lang.Object) fila12);
        fila10.enfileira((java.lang.Object) 1.0d);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj19 = fila0.desenfileira();
        java.lang.Object obj20 = fila0.desenfileira();
        boolean boolean21 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1.0d + "'", obj20, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila9.enfileira((java.lang.Object) 1.0d);
        fila9.imprime();
        java.lang.Object obj17 = fila9.desenfileira();
        fila0.enfileira(obj17);
        fila0.imprime();
        java.lang.Object obj20 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1.0d + "'", obj20, 1.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) true);
        java.lang.Object obj9 = fila4.desenfileira();
        boolean boolean10 = fila4.vazia();
        java.lang.Object obj11 = null;
        fila4.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) true);
        java.lang.Object obj18 = fila13.desenfileira();
        fila4.enfileira(obj18);
        boolean boolean20 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila2.enfileira((java.lang.Object) fila15);
        java.lang.Object obj20 = fila2.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila21.imprime();
        fila21.enfileira((java.lang.Object) true);
        java.lang.Object obj26 = fila21.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila27.enfileira((java.lang.Object) fila29);
        boolean boolean32 = fila29.vazia();
        fila21.enfileira((java.lang.Object) fila29);
        boolean boolean34 = fila29.vazia();
        boolean boolean35 = fila29.vazia();
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        fila36.imprime();
        fila36.enfileira((java.lang.Object) true);
        fila36.imprime();
        fila29.enfileira((java.lang.Object) fila36);
        java.lang.Object obj43 = fila36.desenfileira();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        fila2.enfileira(obj43);
        boolean boolean46 = fila2.vazia();
        java.lang.Class<?> wildcardClass47 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + true + "'", obj26, true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + true + "'", obj43, true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) true);
        fila15.imprime();
        fila8.enfileira((java.lang.Object) fila15);
        java.lang.Object obj22 = fila15.desenfileira();
        boolean boolean23 = fila15.vazia();
        boolean boolean24 = fila15.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = fila15.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila2.enfileira((java.lang.Object) fila15);
        boolean boolean20 = fila2.vazia();
        java.lang.Object obj21 = fila2.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila22.enfileira((java.lang.Object) 1.0d);
        fila22.imprime();
        fila22.enfileira((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass32 = fila22.getClass();
        fila2.enfileira((java.lang.Object) fila22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 1);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila12.enfileira((java.lang.Object) fila14);
        fila12.enfileira((java.lang.Object) 1.0d);
        fila12.imprime();
        boolean boolean20 = fila12.vazia();
        boolean boolean21 = fila12.vazia();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila22.enfileira((java.lang.Object) 1.0d);
        fila22.imprime();
        fila12.enfileira((java.lang.Object) fila22);
        java.lang.Object obj31 = fila12.desenfileira();
        fila0.enfileira((java.lang.Object) fila12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.enfileira((java.lang.Object) 1.0d);
        fila5.imprime();
        boolean boolean13 = fila5.vazia();
        fila0.enfileira((java.lang.Object) boolean13);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila10.enfileira((java.lang.Object) fila12);
        fila10.enfileira((java.lang.Object) 1.0d);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) true);
        java.lang.Object obj24 = fila19.desenfileira();
        boolean boolean25 = fila19.vazia();
        fila19.imprime();
        fila0.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass28 = fila19.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean12 = fila0.vazia();
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Object obj14 = fila0.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila15.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        fila17.imprime();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        boolean boolean27 = fila22.vazia();
        fila22.imprime();
        boolean boolean29 = fila22.vazia();
        fila22.imprime();
        fila17.enfileira((java.lang.Object) fila22);
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        fila32.imprime();
        fila32.imprime();
        java.lang.Class<?> wildcardClass36 = fila32.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass36);
        java.lang.Object obj38 = fila22.desenfileira();
        fila0.enfileira(obj38);
        boolean boolean40 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila10.enfileira((java.lang.Object) fila12);
        fila10.enfileira((java.lang.Object) 1.0d);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        fila10.imprime();
        java.lang.Object obj20 = fila10.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila11.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila11.vazia();
        boolean boolean22 = fila11.vazia();
        boolean boolean23 = fila11.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) true);
        java.lang.Object obj14 = fila9.desenfileira();
        boolean boolean15 = fila9.vazia();
        fila9.enfileira((java.lang.Object) (short) 1);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass19 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) true);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) true);
        fila14.imprime();
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean21 = fila9.vazia();
        java.lang.Object obj22 = fila9.desenfileira();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila24.enfileira((java.lang.Object) fila26);
        fila24.enfileira((java.lang.Object) 1.0d);
        fila24.imprime();
        fila24.imprime();
        fila24.imprime();
        fila9.enfileira((java.lang.Object) fila24);
        java.lang.Class<?> wildcardClass35 = fila9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila14.enfileira((java.lang.Object) fila16);
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila19.enfileira((java.lang.Object) fila21);
        boolean boolean24 = fila19.vazia();
        java.lang.Object obj25 = fila19.desenfileira();
        fila16.enfileira(obj25);
        java.lang.Object obj27 = fila16.desenfileira();
        fila0.enfileira(obj27);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila20.enfileira((java.lang.Object) fila22);
        fila11.enfileira((java.lang.Object) fila20);
        fila20.imprime();
        fila0.enfileira((java.lang.Object) fila20);
        boolean boolean28 = fila20.vazia();
        fila20.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila14.enfileira((java.lang.Object) fila16);
        fila14.enfileira((java.lang.Object) 1.0d);
        fila14.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila23.enfileira((java.lang.Object) fila25);
        fila25.imprime();
        fila25.imprime();
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila30.imprime();
        fila25.enfileira((java.lang.Object) fila30);
        fila14.enfileira((java.lang.Object) fila25);
        java.lang.Class<?> wildcardClass35 = fila25.getClass();
        fila0.enfileira((java.lang.Object) fila25);
        java.lang.Object obj37 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + true + "'", obj37, true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        boolean boolean18 = fila7.vazia();
        boolean boolean19 = fila7.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila2.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        boolean boolean16 = fila6.vazia();
        java.lang.Class<?> wildcardClass17 = fila6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila12.enfileira((java.lang.Object) fila14);
        fila12.enfileira((java.lang.Object) 1.0d);
        fila12.imprime();
        boolean boolean20 = fila12.vazia();
        boolean boolean21 = fila12.vazia();
        boolean boolean22 = fila12.vazia();
        fila0.enfileira((java.lang.Object) boolean22);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.imprime();
        fila17.imprime();
        java.lang.Class<?> wildcardClass21 = fila17.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila7.desenfileira();
        fila7.imprime();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        fila25.enfileira((java.lang.Object) fila27);
        boolean boolean30 = fila25.vazia();
        fila25.imprime();
        java.lang.Object obj32 = fila25.desenfileira();
        fila7.enfileira((java.lang.Object) fila25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = fila25.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila20.enfileira((java.lang.Object) fila22);
        fila11.enfileira((java.lang.Object) fila20);
        fila20.imprime();
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj28 = fila20.desenfileira();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (short) 1);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.enfileira((java.lang.Object) 1.0d);
        fila5.imprime();
        boolean boolean13 = fila5.vazia();
        fila0.enfileira((java.lang.Object) boolean13);
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila15.enfileira((java.lang.Object) fila17);
        boolean boolean20 = fila17.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        boolean boolean26 = fila21.vazia();
        java.lang.Object obj27 = fila21.desenfileira();
        boolean boolean28 = fila21.vazia();
        fila17.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        fila31.enfileira((java.lang.Object) fila33);
        fila31.imprime();
        fila31.imprime();
        fila21.enfileira((java.lang.Object) fila31);
        fila0.enfileira((java.lang.Object) fila21);
        java.lang.Object obj40 = fila21.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila13.enfileira((java.lang.Object) 1.0d);
        fila13.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila13.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila13);
        fila13.imprime();
        java.lang.Object obj31 = fila13.desenfileira();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        fila8.enfileira((java.lang.Object) 1.0d);
        fila8.imprime();
        boolean boolean16 = fila8.vazia();
        boolean boolean17 = fila8.vazia();
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Class<?> wildcardClass21 = fila8.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        java.lang.Object obj14 = fila7.desenfileira();
        fila2.enfileira(obj14);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.enfileira((java.lang.Object) 1.0d);
        fila16.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) true);
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila30.imprime();
        fila30.enfileira((java.lang.Object) true);
        fila30.imprime();
        fila25.enfileira((java.lang.Object) fila30);
        boolean boolean37 = fila25.vazia();
        java.lang.Object obj38 = fila25.desenfileira();
        fila16.enfileira((java.lang.Object) fila25);
        fila2.enfileira((java.lang.Object) fila25);
        boolean boolean41 = fila2.vazia();
        java.lang.Class<?> wildcardClass42 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.enfileira((java.lang.Object) 1.0d);
        fila11.imprime();
        boolean boolean19 = fila11.vazia();
        boolean boolean20 = fila11.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        fila21.enfileira((java.lang.Object) 1.0d);
        fila21.imprime();
        fila11.enfileira((java.lang.Object) fila21);
        java.lang.Object obj30 = fila21.desenfileira();
        fila0.enfileira((java.lang.Object) fila21);
        fila0.imprime();
        boolean boolean33 = fila0.vazia();
        boolean boolean34 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.enfileira((java.lang.Object) 1.0d);
        fila16.imprime();
        boolean boolean24 = fila16.vazia();
        boolean boolean25 = fila16.vazia();
        fila11.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila16);
        boolean boolean28 = fila16.vazia();
        java.lang.Class<?> wildcardClass29 = fila16.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila0.enfileira((java.lang.Object) boolean8);
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila13.enfileira((java.lang.Object) 1.0d);
        fila13.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila24.imprime();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila29.imprime();
        fila24.enfileira((java.lang.Object) fila29);
        fila13.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila24);
        java.lang.Class<?> wildcardClass35 = fila24.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) true);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) true);
        fila14.imprime();
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean21 = fila9.vazia();
        java.lang.Object obj22 = fila9.desenfileira();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila24.enfileira((java.lang.Object) fila26);
        fila24.enfileira((java.lang.Object) 1.0d);
        fila24.imprime();
        fila24.imprime();
        fila24.imprime();
        fila9.enfileira((java.lang.Object) fila24);
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        ds.Fila fila37 = new ds.Fila();
        boolean boolean38 = fila37.vazia();
        fila35.enfileira((java.lang.Object) fila37);
        fila35.imprime();
        fila35.imprime();
        fila35.imprime();
        boolean boolean43 = fila35.vazia();
        java.lang.Object obj44 = fila35.desenfileira();
        fila9.enfileira(obj44);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) true);
        java.lang.Object obj9 = fila4.desenfileira();
        boolean boolean10 = fila4.vazia();
        java.lang.Object obj11 = null;
        fila4.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) true);
        java.lang.Object obj18 = fila13.desenfileira();
        fila4.enfileira(obj18);
        boolean boolean20 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean22 = fila0.vazia();
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.imprime();
        fila17.imprime();
        java.lang.Class<?> wildcardClass21 = fila17.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila7.desenfileira();
        fila7.imprime();
        java.lang.Object obj25 = fila7.desenfileira();
        java.lang.Class<?> wildcardClass26 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean16 = fila11.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = fila11.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        fila10.enfileira(obj19);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        fila23.imprime();
        fila10.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila10);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        java.lang.Object obj14 = fila7.desenfileira();
        fila2.enfileira(obj14);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.enfileira((java.lang.Object) 1.0d);
        fila16.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) true);
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila30.imprime();
        fila30.enfileira((java.lang.Object) true);
        fila30.imprime();
        fila25.enfileira((java.lang.Object) fila30);
        boolean boolean37 = fila25.vazia();
        java.lang.Object obj38 = fila25.desenfileira();
        fila16.enfileira((java.lang.Object) fila25);
        fila2.enfileira((java.lang.Object) fila25);
        boolean boolean41 = fila2.vazia();
        boolean boolean42 = fila2.vazia();
        boolean boolean43 = fila2.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        java.lang.Object obj14 = fila7.desenfileira();
        fila2.enfileira(obj14);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.enfileira((java.lang.Object) 1.0d);
        fila16.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) true);
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila30.imprime();
        fila30.enfileira((java.lang.Object) true);
        fila30.imprime();
        fila25.enfileira((java.lang.Object) fila30);
        boolean boolean37 = fila25.vazia();
        java.lang.Object obj38 = fila25.desenfileira();
        fila16.enfileira((java.lang.Object) fila25);
        fila2.enfileira((java.lang.Object) fila25);
        java.lang.Object obj41 = fila25.desenfileira();
        boolean boolean42 = fila25.vazia();
        boolean boolean43 = fila25.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = fila25.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.enfileira((java.lang.Object) 1.0d);
        fila11.imprime();
        boolean boolean19 = fila11.vazia();
        boolean boolean20 = fila11.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        fila21.enfileira((java.lang.Object) 1.0d);
        fila21.imprime();
        fila11.enfileira((java.lang.Object) fila21);
        java.lang.Object obj30 = fila21.desenfileira();
        fila0.enfileira((java.lang.Object) fila21);
        java.lang.Object obj32 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila2.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.imprime();
        fila16.imprime();
        fila6.enfileira((java.lang.Object) fila16);
        fila6.imprime();
        java.lang.Class<?> wildcardClass25 = fila6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        fila7.imprime();
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila14.enfileira((java.lang.Object) fila16);
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila19.enfileira((java.lang.Object) fila21);
        boolean boolean24 = fila19.vazia();
        java.lang.Object obj25 = fila19.desenfileira();
        fila16.enfileira(obj25);
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila27.enfileira((java.lang.Object) fila29);
        fila29.imprime();
        fila16.enfileira((java.lang.Object) fila29);
        boolean boolean34 = fila29.vazia();
        java.lang.Class<?> wildcardClass35 = fila29.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass35);
        java.lang.Class<?> wildcardClass37 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.enfileira((java.lang.Object) 1.0d);
        fila16.imprime();
        boolean boolean24 = fila16.vazia();
        boolean boolean25 = fila16.vazia();
        fila11.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila16);
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila28.enfileira((java.lang.Object) fila30);
        fila28.imprime();
        fila28.imprime();
        fila28.imprime();
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        ds.Fila fila38 = new ds.Fila();
        boolean boolean39 = fila38.vazia();
        fila36.enfileira((java.lang.Object) fila38);
        ds.Fila fila41 = new ds.Fila();
        boolean boolean42 = fila41.vazia();
        ds.Fila fila43 = new ds.Fila();
        boolean boolean44 = fila43.vazia();
        fila41.enfileira((java.lang.Object) fila43);
        boolean boolean46 = fila41.vazia();
        java.lang.Object obj47 = fila41.desenfileira();
        fila38.enfileira(obj47);
        ds.Fila fila49 = new ds.Fila();
        boolean boolean50 = fila49.vazia();
        ds.Fila fila51 = new ds.Fila();
        boolean boolean52 = fila51.vazia();
        fila49.enfileira((java.lang.Object) fila51);
        fila51.imprime();
        fila38.enfileira((java.lang.Object) fila51);
        fila28.enfileira((java.lang.Object) fila38);
        fila28.imprime();
        fila0.enfileira((java.lang.Object) fila28);
        boolean boolean59 = fila28.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) true);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) true);
        fila14.imprime();
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean21 = fila9.vazia();
        java.lang.Object obj22 = fila9.desenfileira();
        java.lang.Object obj23 = fila9.desenfileira();
        boolean boolean24 = fila9.vazia();
        fila9.imprime();
        java.lang.Class<?> wildcardClass26 = fila9.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.enfileira((java.lang.Object) 1.0d);
        fila5.imprime();
        boolean boolean13 = fila5.vazia();
        boolean boolean14 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        fila18.imprime();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila23.enfileira((java.lang.Object) fila25);
        boolean boolean28 = fila23.vazia();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila18.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila23);
        boolean boolean34 = fila0.vazia();
        java.lang.Class<?> wildcardClass35 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.enfileira((java.lang.Object) 1.0d);
        fila16.imprime();
        boolean boolean24 = fila16.vazia();
        boolean boolean25 = fila16.vazia();
        fila11.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila16);
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila28.enfileira((java.lang.Object) fila30);
        fila28.imprime();
        fila28.imprime();
        fila28.imprime();
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        ds.Fila fila38 = new ds.Fila();
        boolean boolean39 = fila38.vazia();
        fila36.enfileira((java.lang.Object) fila38);
        ds.Fila fila41 = new ds.Fila();
        boolean boolean42 = fila41.vazia();
        ds.Fila fila43 = new ds.Fila();
        boolean boolean44 = fila43.vazia();
        fila41.enfileira((java.lang.Object) fila43);
        boolean boolean46 = fila41.vazia();
        java.lang.Object obj47 = fila41.desenfileira();
        fila38.enfileira(obj47);
        ds.Fila fila49 = new ds.Fila();
        boolean boolean50 = fila49.vazia();
        ds.Fila fila51 = new ds.Fila();
        boolean boolean52 = fila51.vazia();
        fila49.enfileira((java.lang.Object) fila51);
        fila51.imprime();
        fila38.enfileira((java.lang.Object) fila51);
        fila28.enfileira((java.lang.Object) fila38);
        fila28.imprime();
        fila0.enfileira((java.lang.Object) fila28);
        boolean boolean59 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 10L);
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.enfileira((java.lang.Object) 1.0d);
        fila7.imprime();
        boolean boolean15 = fila7.vazia();
        boolean boolean16 = fila7.vazia();
        fila0.enfileira((java.lang.Object) boolean16);
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) true);
        java.lang.Object obj23 = fila18.desenfileira();
        fila18.imprime();
        fila0.enfileira((java.lang.Object) fila18);
        java.lang.Class<?> wildcardClass26 = fila18.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + true + "'", obj23, true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) true);
        java.lang.Object obj16 = fila11.desenfileira();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        fila11.enfileira(obj19);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila27.enfileira((java.lang.Object) fila29);
        fila27.enfileira((java.lang.Object) 1.0d);
        fila27.imprime();
        boolean boolean35 = fila27.vazia();
        boolean boolean36 = fila27.vazia();
        fila22.enfileira((java.lang.Object) fila27);
        fila11.enfileira((java.lang.Object) fila27);
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Class<?> wildcardClass40 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + true + "'", obj16, true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila15.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        fila17.imprime();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila22.imprime();
        fila17.enfileira((java.lang.Object) fila22);
        fila8.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        boolean boolean28 = fila17.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila20.enfileira((java.lang.Object) fila22);
        fila11.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj27 = fila11.desenfileira();
        boolean boolean28 = fila11.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) true);
        java.lang.Object obj16 = fila11.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila17.enfileira((java.lang.Object) fila19);
        boolean boolean22 = fila19.vazia();
        fila11.enfileira((java.lang.Object) fila19);
        boolean boolean24 = fila19.vazia();
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila26.imprime();
        fila26.enfileira((java.lang.Object) true);
        fila26.imprime();
        fila19.enfileira((java.lang.Object) fila26);
        fila19.imprime();
        fila0.enfileira((java.lang.Object) fila19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + true + "'", obj16, true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        boolean boolean6 = fila2.vazia();
        boolean boolean7 = fila2.vazia();
        fila2.imprime();
        java.lang.Class<?> wildcardClass9 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        fila2.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        boolean boolean18 = fila11.vazia();
        fila11.imprime();
        java.lang.Object obj20 = fila11.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        fila2.imprime();
        boolean boolean14 = fila2.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) true);
        java.lang.Object obj14 = fila9.desenfileira();
        boolean boolean15 = fila9.vazia();
        fila9.imprime();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        fila9.enfileira(obj17);
        java.lang.Object obj20 = fila9.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        fila21.enfileira((java.lang.Object) 1.0d);
        fila21.imprime();
        boolean boolean29 = fila21.vazia();
        boolean boolean30 = fila21.vazia();
        boolean boolean31 = fila21.vazia();
        fila9.enfileira((java.lang.Object) boolean31);
        java.lang.Class<?> wildcardClass33 = fila9.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        boolean boolean13 = fila2.vazia();
        boolean boolean14 = fila2.vazia();
        java.lang.Object obj15 = fila2.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila13.enfileira((java.lang.Object) 1.0d);
        fila13.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila24.imprime();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila29.imprime();
        fila24.enfileira((java.lang.Object) fila29);
        fila13.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        boolean boolean36 = fila24.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        boolean boolean6 = fila2.vazia();
        fila2.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila2.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.imprime();
        fila16.imprime();
        fila6.enfileira((java.lang.Object) fila16);
        fila16.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) true);
        java.lang.Object obj14 = fila9.desenfileira();
        boolean boolean15 = fila9.vazia();
        fila9.imprime();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        fila9.enfileira(obj17);
        java.lang.Object obj20 = fila9.desenfileira();
        fila9.imprime();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila22.imprime();
        fila22.enfileira((java.lang.Object) true);
        java.lang.Object obj27 = fila22.desenfileira();
        boolean boolean28 = fila22.vazia();
        fila22.imprime();
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        fila22.enfileira(obj30);
        java.lang.Object obj33 = fila22.desenfileira();
        fila9.enfileira(obj33);
        fila0.enfileira(obj33);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + true + "'", obj27, true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) true);
        fila15.imprime();
        fila8.enfileira((java.lang.Object) fila15);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila22.enfileira((java.lang.Object) 1.0d);
        fila22.imprime();
        fila22.imprime();
        fila22.imprime();
        boolean boolean32 = fila22.vazia();
        fila8.enfileira((java.lang.Object) boolean32);
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        fila34.enfileira((java.lang.Object) fila36);
        fila34.enfileira((java.lang.Object) 1.0d);
        fila34.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila43 = new ds.Fila();
        boolean boolean44 = fila43.vazia();
        fila43.imprime();
        fila43.enfileira((java.lang.Object) true);
        ds.Fila fila48 = new ds.Fila();
        boolean boolean49 = fila48.vazia();
        fila48.imprime();
        fila48.enfileira((java.lang.Object) true);
        fila48.imprime();
        fila43.enfileira((java.lang.Object) fila48);
        boolean boolean55 = fila43.vazia();
        java.lang.Object obj56 = fila43.desenfileira();
        fila34.enfileira((java.lang.Object) fila43);
        java.lang.Object obj58 = fila34.desenfileira();
        fila8.enfileira((java.lang.Object) fila34);
        fila8.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + true + "'", obj56, true);
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) true);
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) true);
        fila12.imprime();
        fila7.enfileira((java.lang.Object) fila12);
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila19.enfileira((java.lang.Object) fila21);
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila24.enfileira((java.lang.Object) fila26);
        boolean boolean29 = fila24.vazia();
        java.lang.Object obj30 = fila24.desenfileira();
        fila21.enfileira(obj30);
        java.lang.Object obj32 = fila21.desenfileira();
        fila7.enfileira((java.lang.Object) fila21);
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        fila34.imprime();
        fila21.enfileira((java.lang.Object) fila34);
        fila0.enfileira((java.lang.Object) fila21);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila10.enfileira((java.lang.Object) fila12);
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) true);
        fila15.imprime();
        boolean boolean21 = fila15.vazia();
        fila12.enfileira((java.lang.Object) fila15);
        fila0.enfileira((java.lang.Object) fila15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) true);
        java.lang.Object obj18 = fila13.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila19.enfileira((java.lang.Object) fila21);
        boolean boolean24 = fila21.vazia();
        fila13.enfileira((java.lang.Object) fila21);
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        fila26.enfileira((java.lang.Object) fila28);
        fila26.enfileira((java.lang.Object) 1.0d);
        fila26.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        ds.Fila fila37 = new ds.Fila();
        boolean boolean38 = fila37.vazia();
        fila35.enfileira((java.lang.Object) fila37);
        fila37.imprime();
        fila37.imprime();
        ds.Fila fila42 = new ds.Fila();
        boolean boolean43 = fila42.vazia();
        fila42.imprime();
        fila37.enfileira((java.lang.Object) fila42);
        fila26.enfileira((java.lang.Object) fila37);
        fila13.enfileira((java.lang.Object) fila37);
        fila8.enfileira((java.lang.Object) fila13);
        fila13.enfileira((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.enfileira((java.lang.Object) 1.0d);
        fila16.imprime();
        boolean boolean24 = fila16.vazia();
        boolean boolean25 = fila16.vazia();
        fila11.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila16);
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila28.enfileira((java.lang.Object) fila30);
        fila28.imprime();
        fila28.imprime();
        fila28.imprime();
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        ds.Fila fila38 = new ds.Fila();
        boolean boolean39 = fila38.vazia();
        fila36.enfileira((java.lang.Object) fila38);
        ds.Fila fila41 = new ds.Fila();
        boolean boolean42 = fila41.vazia();
        ds.Fila fila43 = new ds.Fila();
        boolean boolean44 = fila43.vazia();
        fila41.enfileira((java.lang.Object) fila43);
        boolean boolean46 = fila41.vazia();
        java.lang.Object obj47 = fila41.desenfileira();
        fila38.enfileira(obj47);
        ds.Fila fila49 = new ds.Fila();
        boolean boolean50 = fila49.vazia();
        ds.Fila fila51 = new ds.Fila();
        boolean boolean52 = fila51.vazia();
        fila49.enfileira((java.lang.Object) fila51);
        fila51.imprime();
        fila38.enfileira((java.lang.Object) fila51);
        fila28.enfileira((java.lang.Object) fila38);
        fila28.imprime();
        fila0.enfileira((java.lang.Object) fila28);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila2.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        fila23.imprime();
        fila23.imprime();
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        fila28.imprime();
        fila23.enfileira((java.lang.Object) fila28);
        java.lang.Class<?> wildcardClass32 = fila23.getClass();
        fila15.enfileira((java.lang.Object) fila23);
        java.lang.Object obj34 = fila15.desenfileira();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila13.enfileira((java.lang.Object) 1.0d);
        fila13.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila13.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila24);
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila30.imprime();
        fila30.enfileira((java.lang.Object) true);
        java.lang.Object obj35 = fila30.desenfileira();
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        ds.Fila fila38 = new ds.Fila();
        boolean boolean39 = fila38.vazia();
        fila36.enfileira((java.lang.Object) fila38);
        boolean boolean41 = fila38.vazia();
        fila30.enfileira((java.lang.Object) fila38);
        fila38.imprime();
        fila0.enfileira((java.lang.Object) fila38);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + true + "'", obj35, true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.enfileira((java.lang.Object) 1.0d);
        fila5.imprime();
        boolean boolean13 = fila5.vazia();
        java.lang.Class<?> wildcardClass14 = fila5.getClass();
        fila0.enfileira((java.lang.Object) fila5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) true);
        fila15.imprime();
        fila8.enfileira((java.lang.Object) fila15);
        java.lang.Object obj22 = fila15.desenfileira();
        java.lang.Class<?> wildcardClass23 = fila15.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila11.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila11.vazia();
        boolean boolean22 = fila11.vazia();
        fila11.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) true);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) true);
        fila14.imprime();
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean21 = fila9.vazia();
        java.lang.Object obj22 = fila9.desenfileira();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass24 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) true);
        fila15.imprime();
        fila8.enfileira((java.lang.Object) fila15);
        boolean boolean22 = fila8.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila9.enfileira((java.lang.Object) 1.0d);
        fila9.imprime();
        java.lang.Object obj17 = fila9.desenfileira();
        fila0.enfileira(obj17);
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila19.enfileira((java.lang.Object) fila21);
        fila19.enfileira((java.lang.Object) 1.0d);
        fila19.imprime();
        boolean boolean27 = fila19.vazia();
        boolean boolean28 = fila19.vazia();
        boolean boolean29 = fila19.vazia();
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        fila30.enfileira((java.lang.Object) fila32);
        fila30.enfileira((java.lang.Object) 1.0d);
        fila30.imprime();
        boolean boolean38 = fila30.vazia();
        boolean boolean39 = fila30.vazia();
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        ds.Fila fila42 = new ds.Fila();
        boolean boolean43 = fila42.vazia();
        fila40.enfileira((java.lang.Object) fila42);
        fila40.enfileira((java.lang.Object) 1.0d);
        fila40.imprime();
        fila30.enfileira((java.lang.Object) fila40);
        java.lang.Object obj49 = fila40.desenfileira();
        fila19.enfileira((java.lang.Object) fila40);
        fila40.imprime();
        fila40.imprime();
        fila0.enfileira((java.lang.Object) fila40);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila10.enfileira((java.lang.Object) fila12);
        fila10.enfileira((java.lang.Object) 1.0d);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) true);
        java.lang.Object obj24 = fila19.desenfileira();
        boolean boolean25 = fila19.vazia();
        fila19.imprime();
        fila0.enfileira((java.lang.Object) fila19);
        fila19.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila10.enfileira((java.lang.Object) fila12);
        fila10.enfileira((java.lang.Object) 1.0d);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) true);
        java.lang.Object obj24 = fila19.desenfileira();
        boolean boolean25 = fila19.vazia();
        fila19.imprime();
        fila0.enfileira((java.lang.Object) fila19);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) true);
        fila15.imprime();
        fila8.enfileira((java.lang.Object) fila15);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila22.enfileira((java.lang.Object) 1.0d);
        fila22.imprime();
        fila22.imprime();
        fila22.imprime();
        boolean boolean32 = fila22.vazia();
        fila8.enfileira((java.lang.Object) boolean32);
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        fila34.enfileira((java.lang.Object) fila36);
        fila34.enfileira((java.lang.Object) 1.0d);
        fila34.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila43 = new ds.Fila();
        boolean boolean44 = fila43.vazia();
        fila43.imprime();
        fila43.enfileira((java.lang.Object) true);
        ds.Fila fila48 = new ds.Fila();
        boolean boolean49 = fila48.vazia();
        fila48.imprime();
        fila48.enfileira((java.lang.Object) true);
        fila48.imprime();
        fila43.enfileira((java.lang.Object) fila48);
        boolean boolean55 = fila43.vazia();
        java.lang.Object obj56 = fila43.desenfileira();
        fila34.enfileira((java.lang.Object) fila43);
        java.lang.Object obj58 = fila34.desenfileira();
        fila8.enfileira((java.lang.Object) fila34);
        boolean boolean60 = fila8.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + true + "'", obj56, true);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        boolean boolean13 = fila2.vazia();
        boolean boolean14 = fila2.vazia();
        java.lang.Class<?> wildcardClass15 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila3.enfileira((java.lang.Object) fila5);
        java.lang.Class<?> wildcardClass8 = fila3.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass8);
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila10.enfileira((java.lang.Object) fila12);
        boolean boolean15 = fila12.vazia();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        boolean boolean21 = fila16.vazia();
        java.lang.Object obj22 = fila16.desenfileira();
        boolean boolean23 = fila16.vazia();
        fila12.enfileira((java.lang.Object) fila16);
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        boolean boolean27 = fila16.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        fila2.enfileira((java.lang.Object) fila11);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) true);
        java.lang.Object obj22 = fila17.desenfileira();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        fila17.enfileira(obj25);
        java.lang.Object obj28 = fila17.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        fila29.enfileira((java.lang.Object) fila31);
        fila29.enfileira((java.lang.Object) 1.0d);
        fila29.imprime();
        boolean boolean37 = fila29.vazia();
        boolean boolean38 = fila29.vazia();
        boolean boolean39 = fila29.vazia();
        fila17.enfileira((java.lang.Object) boolean39);
        fila11.enfileira((java.lang.Object) boolean39);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean12 = fila0.vazia();
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        boolean boolean11 = fila0.vazia();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        boolean boolean6 = fila2.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) true);
        java.lang.Object obj12 = fila7.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        boolean boolean18 = fila15.vazia();
        fila7.enfileira((java.lang.Object) fila15);
        boolean boolean20 = fila15.vazia();
        boolean boolean21 = fila15.vazia();
        fila2.enfileira((java.lang.Object) boolean21);
        java.lang.Class<?> wildcardClass23 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila2.enfileira((java.lang.Object) fila15);
        boolean boolean20 = fila2.vazia();
        java.lang.Object obj21 = fila2.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila22.imprime();
        fila22.imprime();
        fila22.imprime();
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        fila30.enfileira((java.lang.Object) fila32);
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        ds.Fila fila37 = new ds.Fila();
        boolean boolean38 = fila37.vazia();
        fila35.enfileira((java.lang.Object) fila37);
        boolean boolean40 = fila35.vazia();
        java.lang.Object obj41 = fila35.desenfileira();
        fila32.enfileira(obj41);
        ds.Fila fila43 = new ds.Fila();
        boolean boolean44 = fila43.vazia();
        ds.Fila fila45 = new ds.Fila();
        boolean boolean46 = fila45.vazia();
        fila43.enfileira((java.lang.Object) fila45);
        fila45.imprime();
        fila32.enfileira((java.lang.Object) fila45);
        fila22.enfileira((java.lang.Object) fila32);
        fila22.imprime();
        java.lang.Object obj52 = fila22.desenfileira();
        fila2.enfileira(obj52);
        boolean boolean54 = fila2.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila13.enfileira((java.lang.Object) 1.0d);
        fila13.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila13.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Class<?> wildcardClass30 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.imprime();
        fila17.imprime();
        java.lang.Class<?> wildcardClass21 = fila17.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila7.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila24.enfileira((java.lang.Object) fila26);
        boolean boolean29 = fila24.vazia();
        fila24.imprime();
        boolean boolean31 = fila24.vazia();
        fila24.imprime();
        java.lang.Object obj33 = fila24.desenfileira();
        fila7.enfileira(obj33);
        java.lang.Object obj35 = fila7.desenfileira();
        java.lang.Class<?> wildcardClass36 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object obj11 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0d + "'", obj11, 1.0d);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) true);
        fila15.imprime();
        fila8.enfileira((java.lang.Object) fila15);
        fila8.imprime();
        java.lang.Object obj23 = fila8.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        fila10.enfileira(obj19);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        fila23.imprime();
        fila10.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila10);
        fila0.imprime();
        java.lang.Object obj30 = fila0.desenfileira();
        java.lang.Object obj31 = fila0.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        fila32.enfileira((java.lang.Object) fila34);
        ds.Fila fila37 = new ds.Fila();
        boolean boolean38 = fila37.vazia();
        ds.Fila fila39 = new ds.Fila();
        boolean boolean40 = fila39.vazia();
        fila37.enfileira((java.lang.Object) fila39);
        boolean boolean42 = fila37.vazia();
        java.lang.Object obj43 = fila37.desenfileira();
        fila34.enfileira(obj43);
        ds.Fila fila45 = new ds.Fila();
        boolean boolean46 = fila45.vazia();
        ds.Fila fila47 = new ds.Fila();
        boolean boolean48 = fila47.vazia();
        fila45.enfileira((java.lang.Object) fila47);
        fila47.imprime();
        fila34.enfileira((java.lang.Object) fila47);
        fila0.enfileira((java.lang.Object) fila34);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        java.lang.Object obj11 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0d + "'", obj11, 1.0d);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.enfileira((java.lang.Object) 1.0d);
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        boolean boolean16 = fila7.vazia();
        java.lang.Object obj17 = fila7.desenfileira();
        java.lang.Object obj18 = fila7.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0d + "'", obj18, 1.0d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        boolean boolean13 = fila8.vazia();
        java.lang.Object obj14 = fila8.desenfileira();
        fila0.enfileira(obj14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        fila8.enfileira((java.lang.Object) 1.0d);
        fila8.imprime();
        boolean boolean16 = fila8.vazia();
        boolean boolean17 = fila8.vazia();
        java.lang.Object obj18 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean20 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) true);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila21.imprime();
        fila21.enfileira((java.lang.Object) true);
        fila21.imprime();
        fila16.enfileira((java.lang.Object) fila21);
        java.lang.Object obj28 = fila16.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        fila29.enfileira((java.lang.Object) fila31);
        fila29.enfileira((java.lang.Object) 1.0d);
        fila29.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila38 = new ds.Fila();
        boolean boolean39 = fila38.vazia();
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        fila38.enfileira((java.lang.Object) fila40);
        fila40.imprime();
        fila29.enfileira((java.lang.Object) fila40);
        fila16.enfileira((java.lang.Object) fila29);
        java.lang.Object obj46 = fila16.desenfileira();
        fila0.enfileira(obj46);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (short) 1);
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.enfileira((java.lang.Object) 1.0d);
        fila5.imprime();
        boolean boolean13 = fila5.vazia();
        boolean boolean14 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        fila18.imprime();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila23.enfileira((java.lang.Object) fila25);
        boolean boolean28 = fila23.vazia();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila18.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila23);
        boolean boolean34 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        ds.Fila fila38 = new ds.Fila();
        boolean boolean39 = fila38.vazia();
        fila36.enfileira((java.lang.Object) fila38);
        fila38.imprime();
        fila38.imprime();
        ds.Fila fila43 = new ds.Fila();
        boolean boolean44 = fila43.vazia();
        fila43.imprime();
        fila38.enfileira((java.lang.Object) fila43);
        fila43.imprime();
        fila43.imprime();
        fila0.enfileira((java.lang.Object) fila43);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean12 = fila5.vazia();
        java.lang.Object obj13 = fila5.desenfileira();
        boolean boolean14 = fila5.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila15.enfileira((java.lang.Object) fila17);
        fila15.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj22 = fila15.desenfileira();
        java.lang.Object obj23 = fila15.desenfileira();
        java.lang.Class<?> wildcardClass24 = fila15.getClass();
        fila5.enfileira((java.lang.Object) fila15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0d + "'", obj23, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila2.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.imprime();
        fila16.imprime();
        fila6.enfileira((java.lang.Object) fila16);
        fila6.imprime();
        java.lang.Object obj25 = fila6.desenfileira();
        java.lang.Class<?> wildcardClass26 = fila6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila2.enfileira((java.lang.Object) fila4);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.enfileira((java.lang.Object) 1.0d);
        fila7.imprime();
        boolean boolean15 = fila7.vazia();
        fila2.enfileira((java.lang.Object) boolean15);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila17.enfileira((java.lang.Object) fila19);
        boolean boolean22 = fila19.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila23.enfileira((java.lang.Object) fila25);
        boolean boolean28 = fila23.vazia();
        java.lang.Object obj29 = fila23.desenfileira();
        boolean boolean30 = fila23.vazia();
        fila19.enfileira((java.lang.Object) fila23);
        fila23.imprime();
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        fila33.enfileira((java.lang.Object) fila35);
        fila33.imprime();
        fila33.imprime();
        fila23.enfileira((java.lang.Object) fila33);
        fila2.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila23);
        boolean boolean43 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila12.enfileira((java.lang.Object) fila14);
        fila12.enfileira((java.lang.Object) 1.0d);
        fila12.imprime();
        boolean boolean20 = fila12.vazia();
        boolean boolean21 = fila12.vazia();
        fila7.enfileira((java.lang.Object) fila12);
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila23.enfileira((java.lang.Object) fila25);
        fila25.imprime();
        fila25.imprime();
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        fila30.enfileira((java.lang.Object) fila32);
        boolean boolean35 = fila30.vazia();
        fila30.imprime();
        boolean boolean37 = fila30.vazia();
        fila30.imprime();
        fila25.enfileira((java.lang.Object) fila30);
        fila7.enfileira((java.lang.Object) fila30);
        fila2.enfileira((java.lang.Object) fila7);
        java.lang.Object obj42 = fila2.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        boolean boolean44 = fila43.vazia();
        ds.Fila fila45 = new ds.Fila();
        boolean boolean46 = fila45.vazia();
        fila43.enfileira((java.lang.Object) fila45);
        fila43.imprime();
        boolean boolean49 = fila43.vazia();
        ds.Fila fila50 = new ds.Fila();
        boolean boolean51 = fila50.vazia();
        ds.Fila fila52 = new ds.Fila();
        boolean boolean53 = fila52.vazia();
        fila50.enfileira((java.lang.Object) fila52);
        boolean boolean55 = fila52.vazia();
        ds.Fila fila56 = new ds.Fila();
        boolean boolean57 = fila56.vazia();
        ds.Fila fila58 = new ds.Fila();
        boolean boolean59 = fila58.vazia();
        fila56.enfileira((java.lang.Object) fila58);
        boolean boolean61 = fila56.vazia();
        java.lang.Object obj62 = fila56.desenfileira();
        boolean boolean63 = fila56.vazia();
        fila52.enfileira((java.lang.Object) fila56);
        fila56.imprime();
        ds.Fila fila66 = new ds.Fila();
        boolean boolean67 = fila66.vazia();
        ds.Fila fila68 = new ds.Fila();
        boolean boolean69 = fila68.vazia();
        fila66.enfileira((java.lang.Object) fila68);
        fila66.imprime();
        fila66.imprime();
        fila56.enfileira((java.lang.Object) fila66);
        fila56.imprime();
        fila43.enfileira((java.lang.Object) fila56);
        fila2.enfileira((java.lang.Object) fila43);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila2.enfileira((java.lang.Object) fila15);
        java.lang.Object obj20 = fila2.desenfileira();
        java.lang.Object obj21 = null;
        fila2.enfileira(obj21);
        boolean boolean23 = fila2.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.enfileira((java.lang.Object) 1.0d);
        fila16.imprime();
        boolean boolean24 = fila16.vazia();
        boolean boolean25 = fila16.vazia();
        fila11.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Class<?> wildcardClass28 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.enfileira((java.lang.Object) 1.0d);
        fila5.imprime();
        boolean boolean13 = fila5.vazia();
        boolean boolean14 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        fila18.imprime();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila23.enfileira((java.lang.Object) fila25);
        boolean boolean28 = fila23.vazia();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila18.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila23);
        boolean boolean34 = fila0.vazia();
        java.lang.Object obj35 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        java.lang.Object obj14 = fila7.desenfileira();
        fila2.enfileira(obj14);
        java.lang.Class<?> wildcardClass16 = obj14.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila20.enfileira((java.lang.Object) fila22);
        fila11.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (short) 1);
        fila0.enfileira((java.lang.Object) 0L);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) true);
        java.lang.Object obj16 = fila11.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila17.enfileira((java.lang.Object) fila19);
        boolean boolean22 = fila19.vazia();
        fila11.enfileira((java.lang.Object) fila19);
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) true);
        java.lang.Object obj29 = fila24.desenfileira();
        fila11.enfileira(obj29);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Class<?> wildcardClass33 = fila11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + true + "'", obj16, true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila2.enfileira((java.lang.Object) fila15);
        boolean boolean20 = fila15.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        fila21.enfileira((java.lang.Object) 1.0d);
        fila21.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila30.imprime();
        fila30.enfileira((java.lang.Object) true);
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        fila35.imprime();
        fila35.enfileira((java.lang.Object) true);
        fila35.imprime();
        fila30.enfileira((java.lang.Object) fila35);
        boolean boolean42 = fila30.vazia();
        java.lang.Object obj43 = fila30.desenfileira();
        fila21.enfileira((java.lang.Object) fila30);
        boolean boolean45 = fila21.vazia();
        ds.Fila fila46 = new ds.Fila();
        boolean boolean47 = fila46.vazia();
        ds.Fila fila48 = new ds.Fila();
        boolean boolean49 = fila48.vazia();
        fila46.enfileira((java.lang.Object) fila48);
        ds.Fila fila51 = new ds.Fila();
        boolean boolean52 = fila51.vazia();
        ds.Fila fila53 = new ds.Fila();
        boolean boolean54 = fila53.vazia();
        fila51.enfileira((java.lang.Object) fila53);
        boolean boolean56 = fila51.vazia();
        java.lang.Object obj57 = fila51.desenfileira();
        fila48.enfileira(obj57);
        boolean boolean59 = fila48.vazia();
        boolean boolean60 = fila48.vazia();
        boolean boolean61 = fila48.vazia();
        fila21.enfileira((java.lang.Object) boolean61);
        fila21.imprime();
        fila15.enfileira((java.lang.Object) fila21);
        java.lang.Object obj65 = fila15.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + true + "'", obj43, true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(obj65);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) true);
        java.lang.Object obj14 = fila9.desenfileira();
        boolean boolean15 = fila9.vazia();
        fila9.enfileira((java.lang.Object) (short) 1);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila19.enfileira((java.lang.Object) fila21);
        fila19.enfileira((java.lang.Object) 1.0d);
        fila19.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila28.enfileira((java.lang.Object) fila30);
        fila30.imprime();
        fila30.imprime();
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        fila35.imprime();
        fila30.enfileira((java.lang.Object) fila35);
        fila19.enfileira((java.lang.Object) fila30);
        fila9.enfileira((java.lang.Object) fila19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        java.lang.Object obj14 = fila7.desenfileira();
        fila2.enfileira(obj14);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.enfileira((java.lang.Object) 1.0d);
        fila16.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) true);
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila30.imprime();
        fila30.enfileira((java.lang.Object) true);
        fila30.imprime();
        fila25.enfileira((java.lang.Object) fila30);
        boolean boolean37 = fila25.vazia();
        java.lang.Object obj38 = fila25.desenfileira();
        fila16.enfileira((java.lang.Object) fila25);
        fila2.enfileira((java.lang.Object) fila25);
        fila2.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila10.enfileira((java.lang.Object) fila12);
        fila10.enfileira((java.lang.Object) 1.0d);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj19 = fila10.desenfileira();
        fila10.imprime();
        java.lang.Class<?> wildcardClass21 = fila10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        boolean boolean21 = fila16.vazia();
        java.lang.Object obj22 = fila16.desenfileira();
        fila13.enfileira(obj22);
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila24.enfileira((java.lang.Object) fila26);
        fila26.imprime();
        fila13.enfileira((java.lang.Object) fila26);
        boolean boolean31 = fila13.vazia();
        boolean boolean32 = fila13.vazia();
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        fila33.enfileira((java.lang.Object) fila35);
        fila33.enfileira((java.lang.Object) 1.0d);
        fila33.imprime();
        boolean boolean41 = fila33.vazia();
        boolean boolean42 = fila33.vazia();
        boolean boolean43 = fila33.vazia();
        ds.Fila fila44 = new ds.Fila();
        boolean boolean45 = fila44.vazia();
        ds.Fila fila46 = new ds.Fila();
        boolean boolean47 = fila46.vazia();
        fila44.enfileira((java.lang.Object) fila46);
        fila44.enfileira((java.lang.Object) 1.0d);
        fila44.imprime();
        boolean boolean52 = fila44.vazia();
        boolean boolean53 = fila44.vazia();
        ds.Fila fila54 = new ds.Fila();
        boolean boolean55 = fila54.vazia();
        ds.Fila fila56 = new ds.Fila();
        boolean boolean57 = fila56.vazia();
        fila54.enfileira((java.lang.Object) fila56);
        fila54.enfileira((java.lang.Object) 1.0d);
        fila54.imprime();
        fila44.enfileira((java.lang.Object) fila54);
        java.lang.Object obj63 = fila54.desenfileira();
        fila33.enfileira((java.lang.Object) fila54);
        fila54.imprime();
        fila54.imprime();
        fila13.enfileira((java.lang.Object) fila54);
        fila0.enfileira((java.lang.Object) fila13);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(obj63);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila12.enfileira((java.lang.Object) fila14);
        fila12.enfileira((java.lang.Object) 1.0d);
        fila12.imprime();
        boolean boolean20 = fila12.vazia();
        boolean boolean21 = fila12.vazia();
        fila7.enfileira((java.lang.Object) fila12);
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila23.enfileira((java.lang.Object) fila25);
        fila25.imprime();
        fila25.imprime();
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        fila30.enfileira((java.lang.Object) fila32);
        boolean boolean35 = fila30.vazia();
        fila30.imprime();
        boolean boolean37 = fila30.vazia();
        fila30.imprime();
        fila25.enfileira((java.lang.Object) fila30);
        fila7.enfileira((java.lang.Object) fila30);
        fila2.enfileira((java.lang.Object) fila7);
        java.lang.Object obj42 = fila2.desenfileira();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila13.enfileira((java.lang.Object) 1.0d);
        fila13.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila13.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila24);
        java.lang.Class<?> wildcardClass30 = fila24.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila2.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.imprime();
        fila16.imprime();
        fila6.enfileira((java.lang.Object) fila16);
        boolean boolean24 = fila6.vazia();
        fila6.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        boolean boolean13 = fila2.vazia();
        java.lang.Object obj14 = fila2.desenfileira();
        fila2.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) true);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) true);
        fila16.imprime();
        fila11.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila16);
        boolean boolean24 = fila16.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) true);
        fila15.imprime();
        fila8.enfileira((java.lang.Object) fila15);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila24.imprime();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila29.imprime();
        fila24.enfileira((java.lang.Object) fila29);
        java.lang.Class<?> wildcardClass33 = fila24.getClass();
        fila8.enfileira((java.lang.Object) fila24);
        boolean boolean35 = fila24.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        fila2.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        boolean boolean18 = fila11.vazia();
        fila11.imprime();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila20.enfileira((java.lang.Object) fila22);
        fila20.enfileira((java.lang.Object) 1.0d);
        fila20.imprime();
        fila20.imprime();
        fila20.imprime();
        fila11.enfileira((java.lang.Object) fila20);
        java.lang.Class<?> wildcardClass31 = fila20.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) true);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) true);
        fila16.imprime();
        fila11.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila16);
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) true);
        fila24.imprime();
        java.lang.Object obj30 = fila24.desenfileira();
        fila24.enfileira((java.lang.Object) (byte) -1);
        fila24.imprime();
        boolean boolean34 = fila24.vazia();
        fila16.enfileira((java.lang.Object) fila24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + true + "'", obj30, true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        fila8.enfileira((java.lang.Object) 1.0d);
        fila8.imprime();
        boolean boolean16 = fila8.vazia();
        boolean boolean17 = fila8.vazia();
        java.lang.Object obj18 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila20.enfileira((java.lang.Object) fila22);
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        fila25.enfileira((java.lang.Object) fila27);
        boolean boolean30 = fila25.vazia();
        java.lang.Object obj31 = fila25.desenfileira();
        fila22.enfileira(obj31);
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        fila33.enfileira((java.lang.Object) fila35);
        fila35.imprime();
        fila22.enfileira((java.lang.Object) fila35);
        fila0.enfileira((java.lang.Object) fila35);
        java.lang.Object obj41 = fila0.desenfileira();
        java.lang.Object obj42 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1.0d + "'", obj42, 1.0d);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        boolean boolean13 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) true);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) true);
        fila14.imprime();
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean21 = fila9.vazia();
        java.lang.Object obj22 = fila9.desenfileira();
        fila0.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        java.lang.Object obj25 = fila9.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.enfileira((java.lang.Object) 1.0d);
        fila11.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila20.enfileira((java.lang.Object) fila22);
        fila22.imprime();
        fila22.imprime();
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        fila27.imprime();
        fila22.enfileira((java.lang.Object) fila27);
        fila11.enfileira((java.lang.Object) fila22);
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        fila32.enfileira((java.lang.Object) fila34);
        boolean boolean37 = fila32.vazia();
        fila32.imprime();
        java.lang.Object obj39 = fila32.desenfileira();
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        ds.Fila fila42 = new ds.Fila();
        boolean boolean43 = fila42.vazia();
        fila40.enfileira((java.lang.Object) fila42);
        fila40.enfileira((java.lang.Object) 1.0d);
        fila40.imprime();
        boolean boolean48 = fila40.vazia();
        boolean boolean49 = fila40.vazia();
        fila40.imprime();
        fila40.imprime();
        fila32.enfileira((java.lang.Object) fila40);
        ds.Fila fila53 = new ds.Fila();
        boolean boolean54 = fila53.vazia();
        ds.Fila fila55 = new ds.Fila();
        boolean boolean56 = fila55.vazia();
        fila53.enfileira((java.lang.Object) fila55);
        ds.Fila fila58 = new ds.Fila();
        boolean boolean59 = fila58.vazia();
        ds.Fila fila60 = new ds.Fila();
        boolean boolean61 = fila60.vazia();
        fila58.enfileira((java.lang.Object) fila60);
        fila58.enfileira((java.lang.Object) 1.0d);
        fila58.imprime();
        boolean boolean66 = fila58.vazia();
        boolean boolean67 = fila58.vazia();
        fila53.enfileira((java.lang.Object) fila58);
        fila32.enfileira((java.lang.Object) fila58);
        fila22.enfileira((java.lang.Object) fila58);
        fila0.enfileira((java.lang.Object) fila58);
        java.lang.Object obj72 = fila58.desenfileira();
        fila58.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(obj72);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        fila10.enfileira(obj19);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        fila23.imprime();
        fila10.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila10);
        fila0.imprime();
        java.lang.Object obj30 = fila0.desenfileira();
        java.lang.Object obj31 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        boolean boolean15 = fila8.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila8.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.enfileira((java.lang.Object) 1.0d);
        fila5.imprime();
        boolean boolean13 = fila5.vazia();
        boolean boolean14 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        fila18.imprime();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila23.enfileira((java.lang.Object) fila25);
        boolean boolean28 = fila23.vazia();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila18.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila23);
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        fila34.enfileira((java.lang.Object) fila36);
        fila34.imprime();
        fila34.imprime();
        fila34.imprime();
        ds.Fila fila42 = new ds.Fila();
        boolean boolean43 = fila42.vazia();
        ds.Fila fila44 = new ds.Fila();
        boolean boolean45 = fila44.vazia();
        fila42.enfileira((java.lang.Object) fila44);
        ds.Fila fila47 = new ds.Fila();
        boolean boolean48 = fila47.vazia();
        ds.Fila fila49 = new ds.Fila();
        boolean boolean50 = fila49.vazia();
        fila47.enfileira((java.lang.Object) fila49);
        boolean boolean52 = fila47.vazia();
        java.lang.Object obj53 = fila47.desenfileira();
        fila44.enfileira(obj53);
        ds.Fila fila55 = new ds.Fila();
        boolean boolean56 = fila55.vazia();
        ds.Fila fila57 = new ds.Fila();
        boolean boolean58 = fila57.vazia();
        fila55.enfileira((java.lang.Object) fila57);
        fila57.imprime();
        fila44.enfileira((java.lang.Object) fila57);
        fila34.enfileira((java.lang.Object) fila44);
        fila34.imprime();
        java.lang.Object obj64 = fila34.desenfileira();
        fila0.enfileira(obj64);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(obj64);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.enfileira((java.lang.Object) 1.0d);
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        boolean boolean16 = fila7.vazia();
        fila7.imprime();
        java.lang.Object obj18 = fila7.desenfileira();
        java.lang.Object obj19 = fila7.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0d + "'", obj19, 1.0d);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        boolean boolean6 = fila2.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila12.enfileira((java.lang.Object) fila14);
        boolean boolean17 = fila12.vazia();
        java.lang.Object obj18 = fila12.desenfileira();
        fila9.enfileira(obj18);
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila20.enfileira((java.lang.Object) fila22);
        fila22.imprime();
        fila9.enfileira((java.lang.Object) fila22);
        java.lang.Object obj27 = fila9.desenfileira();
        fila9.imprime();
        fila2.enfileira((java.lang.Object) fila9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        boolean boolean13 = fila10.vazia();
        boolean boolean14 = fila10.vazia();
        fila0.enfileira((java.lang.Object) fila10);
        fila10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = fila10.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        boolean boolean21 = fila16.vazia();
        java.lang.Object obj22 = fila16.desenfileira();
        fila13.enfileira(obj22);
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila24.enfileira((java.lang.Object) fila26);
        fila26.imprime();
        fila13.enfileira((java.lang.Object) fila26);
        boolean boolean31 = fila13.vazia();
        boolean boolean32 = fila13.vazia();
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        fila33.enfileira((java.lang.Object) fila35);
        fila33.enfileira((java.lang.Object) 1.0d);
        fila33.imprime();
        boolean boolean41 = fila33.vazia();
        boolean boolean42 = fila33.vazia();
        boolean boolean43 = fila33.vazia();
        ds.Fila fila44 = new ds.Fila();
        boolean boolean45 = fila44.vazia();
        ds.Fila fila46 = new ds.Fila();
        boolean boolean47 = fila46.vazia();
        fila44.enfileira((java.lang.Object) fila46);
        fila44.enfileira((java.lang.Object) 1.0d);
        fila44.imprime();
        boolean boolean52 = fila44.vazia();
        boolean boolean53 = fila44.vazia();
        ds.Fila fila54 = new ds.Fila();
        boolean boolean55 = fila54.vazia();
        ds.Fila fila56 = new ds.Fila();
        boolean boolean57 = fila56.vazia();
        fila54.enfileira((java.lang.Object) fila56);
        fila54.enfileira((java.lang.Object) 1.0d);
        fila54.imprime();
        fila44.enfileira((java.lang.Object) fila54);
        java.lang.Object obj63 = fila54.desenfileira();
        fila33.enfileira((java.lang.Object) fila54);
        fila54.imprime();
        fila54.imprime();
        fila13.enfileira((java.lang.Object) fila54);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj69 = fila13.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(obj69);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila20.enfileira((java.lang.Object) fila22);
        fila11.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean27 = fila0.vazia();
        boolean boolean28 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila11.enfileira((java.lang.Object) fila13);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.enfileira((java.lang.Object) 1.0d);
        fila16.imprime();
        boolean boolean24 = fila16.vazia();
        boolean boolean25 = fila16.vazia();
        fila11.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila16);
        boolean boolean28 = fila16.vazia();
        boolean boolean29 = fila16.vazia();
        fila16.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila15.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        fila17.imprime();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila22.imprime();
        fila17.enfileira((java.lang.Object) fila22);
        fila8.enfileira((java.lang.Object) fila17);
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila27.enfileira((java.lang.Object) fila29);
        boolean boolean32 = fila29.vazia();
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        fila33.enfileira((java.lang.Object) fila35);
        boolean boolean38 = fila33.vazia();
        java.lang.Object obj39 = fila33.desenfileira();
        boolean boolean40 = fila33.vazia();
        fila29.enfileira((java.lang.Object) fila33);
        fila33.imprime();
        ds.Fila fila43 = new ds.Fila();
        boolean boolean44 = fila43.vazia();
        ds.Fila fila45 = new ds.Fila();
        boolean boolean46 = fila45.vazia();
        fila43.enfileira((java.lang.Object) fila45);
        boolean boolean48 = fila43.vazia();
        fila43.imprime();
        java.lang.Object obj50 = fila43.desenfileira();
        ds.Fila fila51 = new ds.Fila();
        boolean boolean52 = fila51.vazia();
        ds.Fila fila53 = new ds.Fila();
        boolean boolean54 = fila53.vazia();
        fila51.enfileira((java.lang.Object) fila53);
        fila51.enfileira((java.lang.Object) 1.0d);
        fila51.imprime();
        boolean boolean59 = fila51.vazia();
        boolean boolean60 = fila51.vazia();
        fila51.imprime();
        fila51.imprime();
        fila43.enfileira((java.lang.Object) fila51);
        ds.Fila fila64 = new ds.Fila();
        boolean boolean65 = fila64.vazia();
        ds.Fila fila66 = new ds.Fila();
        boolean boolean67 = fila66.vazia();
        fila64.enfileira((java.lang.Object) fila66);
        ds.Fila fila69 = new ds.Fila();
        boolean boolean70 = fila69.vazia();
        ds.Fila fila71 = new ds.Fila();
        boolean boolean72 = fila71.vazia();
        fila69.enfileira((java.lang.Object) fila71);
        fila69.enfileira((java.lang.Object) 1.0d);
        fila69.imprime();
        boolean boolean77 = fila69.vazia();
        boolean boolean78 = fila69.vazia();
        fila64.enfileira((java.lang.Object) fila69);
        fila43.enfileira((java.lang.Object) fila69);
        fila33.enfileira((java.lang.Object) fila43);
        fila43.imprime();
        fila17.enfileira((java.lang.Object) fila43);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila2.enfileira((java.lang.Object) fila15);
        boolean boolean20 = fila2.vazia();
        boolean boolean21 = fila2.vazia();
        java.lang.Object obj22 = fila2.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        fila2.enfileira((java.lang.Object) (byte) -1);
        boolean boolean19 = fila2.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) true);
        java.lang.Object obj16 = fila11.desenfileira();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        fila11.enfileira(obj19);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila27.enfileira((java.lang.Object) fila29);
        fila27.enfileira((java.lang.Object) 1.0d);
        fila27.imprime();
        boolean boolean35 = fila27.vazia();
        boolean boolean36 = fila27.vazia();
        fila22.enfileira((java.lang.Object) fila27);
        fila11.enfileira((java.lang.Object) fila27);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean40 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + true + "'", obj16, true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        boolean boolean13 = fila2.vazia();
        boolean boolean14 = fila2.vazia();
        fila2.imprime();
        java.lang.Class<?> wildcardClass16 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) true);
        java.lang.Object obj14 = fila9.desenfileira();
        boolean boolean15 = fila9.vazia();
        fila9.enfileira((java.lang.Object) (short) 1);
        fila0.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        boolean boolean20 = fila9.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        boolean boolean26 = fila21.vazia();
        java.lang.Object obj27 = fila21.desenfileira();
        fila18.enfileira(obj27);
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        fila29.enfileira((java.lang.Object) fila31);
        fila31.imprime();
        fila18.enfileira((java.lang.Object) fila31);
        boolean boolean36 = fila18.vazia();
        java.lang.Object obj37 = fila18.desenfileira();
        fila0.enfileira(obj37);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.imprime();
        fila17.imprime();
        java.lang.Class<?> wildcardClass21 = fila17.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila7.desenfileira();
        fila7.imprime();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        fila25.enfileira((java.lang.Object) fila27);
        boolean boolean30 = fila25.vazia();
        fila25.imprime();
        java.lang.Object obj32 = fila25.desenfileira();
        fila7.enfileira((java.lang.Object) fila25);
        boolean boolean34 = fila7.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila2.enfileira((java.lang.Object) fila15);
        boolean boolean20 = fila2.vazia();
        java.lang.Object obj21 = fila2.desenfileira();
        java.lang.Object obj22 = fila2.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila23.enfileira((java.lang.Object) fila25);
        boolean boolean28 = fila25.vazia();
        java.lang.Class<?> wildcardClass29 = fila25.getClass();
        fila2.enfileira((java.lang.Object) fila25);
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        fila31.enfileira((java.lang.Object) fila33);
        boolean boolean36 = fila31.vazia();
        fila31.imprime();
        java.lang.Object obj38 = fila31.desenfileira();
        ds.Fila fila39 = new ds.Fila();
        boolean boolean40 = fila39.vazia();
        ds.Fila fila41 = new ds.Fila();
        boolean boolean42 = fila41.vazia();
        fila39.enfileira((java.lang.Object) fila41);
        fila39.enfileira((java.lang.Object) 1.0d);
        fila39.imprime();
        boolean boolean47 = fila39.vazia();
        boolean boolean48 = fila39.vazia();
        fila39.imprime();
        fila39.imprime();
        fila31.enfileira((java.lang.Object) fila39);
        fila2.enfileira((java.lang.Object) fila31);
        fila2.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.enfileira((java.lang.Object) 1.0d);
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        boolean boolean16 = fila7.vazia();
        fila7.imprime();
        java.lang.Object obj18 = fila7.desenfileira();
        fila7.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila2.enfileira((java.lang.Object) fila15);
        boolean boolean20 = fila2.vazia();
        java.lang.Class<?> wildcardClass21 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila20.enfileira((java.lang.Object) fila22);
        fila11.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean27 = fila0.vazia();
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila28.enfileira((java.lang.Object) fila30);
        fila28.enfileira((java.lang.Object) 1.0d);
        fila28.imprime();
        boolean boolean36 = fila28.vazia();
        boolean boolean37 = fila28.vazia();
        ds.Fila fila38 = new ds.Fila();
        boolean boolean39 = fila38.vazia();
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        fila38.enfileira((java.lang.Object) fila40);
        fila38.enfileira((java.lang.Object) 1.0d);
        fila38.imprime();
        fila28.enfileira((java.lang.Object) fila38);
        java.lang.Object obj47 = fila38.desenfileira();
        fila0.enfileira((java.lang.Object) fila38);
        ds.Fila fila49 = new ds.Fila();
        boolean boolean50 = fila49.vazia();
        ds.Fila fila51 = new ds.Fila();
        boolean boolean52 = fila51.vazia();
        fila49.enfileira((java.lang.Object) fila51);
        fila51.imprime();
        fila51.imprime();
        ds.Fila fila56 = new ds.Fila();
        boolean boolean57 = fila56.vazia();
        ds.Fila fila58 = new ds.Fila();
        boolean boolean59 = fila58.vazia();
        fila56.enfileira((java.lang.Object) fila58);
        boolean boolean61 = fila56.vazia();
        fila56.imprime();
        boolean boolean63 = fila56.vazia();
        fila56.imprime();
        fila51.enfileira((java.lang.Object) fila56);
        ds.Fila fila66 = new ds.Fila();
        boolean boolean67 = fila66.vazia();
        fila66.imprime();
        fila66.imprime();
        java.lang.Class<?> wildcardClass70 = fila66.getClass();
        fila56.enfileira((java.lang.Object) wildcardClass70);
        java.lang.Object obj72 = fila56.desenfileira();
        ds.Fila fila73 = new ds.Fila();
        boolean boolean74 = fila73.vazia();
        ds.Fila fila75 = new ds.Fila();
        boolean boolean76 = fila75.vazia();
        fila73.enfileira((java.lang.Object) fila75);
        boolean boolean78 = fila73.vazia();
        fila73.imprime();
        boolean boolean80 = fila73.vazia();
        fila73.imprime();
        java.lang.Object obj82 = fila73.desenfileira();
        fila56.enfileira(obj82);
        java.lang.Object obj84 = fila56.desenfileira();
        fila38.enfileira((java.lang.Object) fila56);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertEquals(obj84.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj84), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj84), "class ds.Fila");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila2.enfileira((java.lang.Object) fila15);
        java.lang.Object obj20 = fila2.desenfileira();
        java.lang.Object obj21 = null;
        fila2.enfileira(obj21);
        java.lang.Class<?> wildcardClass23 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        boolean boolean12 = fila7.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        boolean boolean6 = fila2.vazia();
        boolean boolean7 = fila2.vazia();
        fila2.imprime();
        fila2.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        boolean boolean13 = fila2.vazia();
        boolean boolean14 = fila2.vazia();
        fila2.imprime();
        fila2.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila6.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila2.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.imprime();
        fila16.imprime();
        fila6.enfileira((java.lang.Object) fila16);
        boolean boolean24 = fila6.vazia();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        fila25.enfileira((java.lang.Object) fila27);
        fila25.enfileira((java.lang.Object) 1.0d);
        fila25.imprime();
        boolean boolean33 = fila25.vazia();
        boolean boolean34 = fila25.vazia();
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        ds.Fila fila37 = new ds.Fila();
        boolean boolean38 = fila37.vazia();
        fila35.enfileira((java.lang.Object) fila37);
        fila35.enfileira((java.lang.Object) 1.0d);
        fila35.imprime();
        fila25.enfileira((java.lang.Object) fila35);
        ds.Fila fila44 = new ds.Fila();
        boolean boolean45 = fila44.vazia();
        fila44.imprime();
        fila44.enfileira((java.lang.Object) true);
        java.lang.Object obj49 = fila44.desenfileira();
        boolean boolean50 = fila44.vazia();
        fila44.imprime();
        fila25.enfileira((java.lang.Object) fila44);
        fila6.enfileira((java.lang.Object) fila44);
        ds.Fila fila54 = new ds.Fila();
        boolean boolean55 = fila54.vazia();
        ds.Fila fila56 = new ds.Fila();
        boolean boolean57 = fila56.vazia();
        fila54.enfileira((java.lang.Object) fila56);
        fila54.enfileira((java.lang.Object) 1.0d);
        fila54.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila63 = new ds.Fila();
        boolean boolean64 = fila63.vazia();
        fila63.imprime();
        fila63.enfileira((java.lang.Object) true);
        ds.Fila fila68 = new ds.Fila();
        boolean boolean69 = fila68.vazia();
        fila68.imprime();
        fila68.enfileira((java.lang.Object) true);
        fila68.imprime();
        fila63.enfileira((java.lang.Object) fila68);
        boolean boolean75 = fila63.vazia();
        java.lang.Object obj76 = fila63.desenfileira();
        fila54.enfileira((java.lang.Object) fila63);
        boolean boolean78 = fila54.vazia();
        fila6.enfileira((java.lang.Object) boolean78);
        java.lang.Class<?> wildcardClass80 = fila6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + true + "'", obj49, true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + true + "'", obj76, true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) true);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) true);
        fila17.imprime();
        fila12.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila12.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        fila25.enfileira((java.lang.Object) fila27);
        fila25.enfileira((java.lang.Object) 1.0d);
        fila25.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        fila34.enfileira((java.lang.Object) fila36);
        fila36.imprime();
        fila25.enfileira((java.lang.Object) fila36);
        fila12.enfileira((java.lang.Object) fila25);
        fila0.enfileira((java.lang.Object) fila25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.imprime();
        fila17.imprime();
        java.lang.Class<?> wildcardClass21 = fila17.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila7.desenfileira();
        fila7.imprime();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        fila25.enfileira((java.lang.Object) fila27);
        boolean boolean30 = fila27.vazia();
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        fila31.enfileira((java.lang.Object) fila33);
        boolean boolean36 = fila31.vazia();
        java.lang.Object obj37 = fila31.desenfileira();
        boolean boolean38 = fila31.vazia();
        fila27.enfileira((java.lang.Object) fila31);
        fila7.enfileira((java.lang.Object) fila31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila10.enfileira((java.lang.Object) fila12);
        fila10.enfileira((java.lang.Object) 1.0d);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj19 = fila10.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) true);
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) true);
        fila25.imprime();
        fila20.enfileira((java.lang.Object) fila25);
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        fila32.enfileira((java.lang.Object) fila34);
        ds.Fila fila37 = new ds.Fila();
        boolean boolean38 = fila37.vazia();
        ds.Fila fila39 = new ds.Fila();
        boolean boolean40 = fila39.vazia();
        fila37.enfileira((java.lang.Object) fila39);
        boolean boolean42 = fila37.vazia();
        java.lang.Object obj43 = fila37.desenfileira();
        fila34.enfileira(obj43);
        java.lang.Object obj45 = fila34.desenfileira();
        fila20.enfileira((java.lang.Object) fila34);
        ds.Fila fila47 = new ds.Fila();
        boolean boolean48 = fila47.vazia();
        fila47.imprime();
        fila34.enfileira((java.lang.Object) fila47);
        fila10.enfileira((java.lang.Object) fila47);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila8.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila13.enfileira((java.lang.Object) fila15);
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        fila10.enfileira(obj19);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila21.enfileira((java.lang.Object) fila23);
        fila23.imprime();
        fila10.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila10);
        fila0.imprime();
        java.lang.Object obj30 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass32 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) true);
        fila5.imprime();
        boolean boolean11 = fila5.vazia();
        fila2.enfileira((java.lang.Object) fila5);
        java.lang.Object obj13 = fila5.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila9.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila20.enfileira((java.lang.Object) fila22);
        fila11.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean27 = fila0.vazia();
        java.lang.Class<?> wildcardClass28 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) true);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (short) 1);
        fila0.enfileira((java.lang.Object) 0L);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) true);
        java.lang.Object obj16 = fila11.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila17.enfileira((java.lang.Object) fila19);
        boolean boolean22 = fila19.vazia();
        fila11.enfileira((java.lang.Object) fila19);
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) true);
        java.lang.Object obj29 = fila24.desenfileira();
        fila11.enfileira(obj29);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean33 = fila0.vazia();
        java.lang.Object obj34 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + true + "'", obj16, true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 1 + "'", obj34, (short) 1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) true);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) true);
        fila14.imprime();
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean21 = fila9.vazia();
        java.lang.Object obj22 = fila9.desenfileira();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj24 = fila0.desenfileira();
        java.lang.Object obj25 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0d + "'", obj25, 1.0d);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila5.enfileira((java.lang.Object) fila7);
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila2.enfileira(obj11);
        boolean boolean13 = fila2.vazia();
        java.lang.Object obj14 = fila2.desenfileira();
        boolean boolean15 = fila2.vazia();
        fila2.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        fila2.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila7.vazia();
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.imprime();
        fila17.imprime();
        java.lang.Class<?> wildcardClass21 = fila17.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila7.desenfileira();
        java.lang.Class<?> wildcardClass24 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) true);
        java.lang.Object obj16 = fila11.desenfileira();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        fila11.enfileira(obj19);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila22.enfileira((java.lang.Object) fila24);
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila27.enfileira((java.lang.Object) fila29);
        fila27.enfileira((java.lang.Object) 1.0d);
        fila27.imprime();
        boolean boolean35 = fila27.vazia();
        boolean boolean36 = fila27.vazia();
        fila22.enfileira((java.lang.Object) fila27);
        fila11.enfileira((java.lang.Object) fila27);
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj40 = fila11.desenfileira();
        fila11.imprime();
        boolean boolean42 = fila11.vazia();
        fila11.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + true + "'", obj16, true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }
}

