package ds.seed7992;

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
        java.lang.Class<?> wildcardClass1 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100.0f);
        fila3.imprime();
        fila3.imprime();
        boolean boolean8 = fila3.vazia();
        boolean boolean9 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Class<?> wildcardClass13 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        java.lang.Object obj15 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) 1L);
        java.lang.Object obj18 = fila11.desenfileira();
        fila0.enfileira((java.lang.Object) fila11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = fila11.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1L + "'", obj18, 1L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass17 = fila10.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        java.lang.Class<?> wildcardClass8 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        boolean boolean26 = fila23.vazia();
        java.lang.Object obj27 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = fila23.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila8.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        java.lang.Object obj15 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) 1L);
        java.lang.Object obj18 = fila11.desenfileira();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj20 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1L + "'", obj18, 1L);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100.0f);
        fila3.imprime();
        fila3.imprime();
        boolean boolean8 = fila3.vazia();
        boolean boolean9 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean13 = fila3.vazia();
        java.lang.Object obj14 = fila3.desenfileira();
        fila3.enfileira((java.lang.Object) "");
        boolean boolean17 = fila3.vazia();
        java.lang.Class<?> wildcardClass18 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        fila16.imprime();
        fila16.imprime();
        java.lang.Object obj21 = fila16.desenfileira();
        fila16.imprime();
        boolean boolean23 = fila16.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 100.0f);
        fila24.imprime();
        fila24.imprime();
        fila16.enfileira((java.lang.Object) fila24);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        fila24.enfileira(obj30);
        boolean boolean33 = fila24.vazia();
        java.lang.Object obj34 = fila24.desenfileira();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        fila5.enfileira(obj34);
        java.lang.Class<?> wildcardClass37 = obj34.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        java.lang.Object obj10 = fila5.desenfileira();
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.imprime();
        fila5.enfileira((java.lang.Object) fila13);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 100.0f);
        boolean boolean23 = fila20.vazia();
        fila5.enfileira((java.lang.Object) boolean23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = null;
        fila10.enfileira(obj18);
        java.lang.Object obj20 = null;
        fila10.enfileira(obj20);
        // The following exception was thrown during execution in test generation
        try {
            fila10.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        boolean boolean26 = fila23.vazia();
        java.lang.Object obj27 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        java.lang.Class<?> wildcardClass33 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        fila15.imprime();
        boolean boolean20 = fila15.vazia();
        boolean boolean21 = fila15.vazia();
        fila15.imprime();
        fila15.imprime();
        fila12.enfileira((java.lang.Object) fila15);
        fila10.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila0.enfileira((java.lang.Object) fila15);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj37 = fila16.desenfileira();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila10.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = fila10.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        java.lang.Object obj14 = null;
        fila10.enfileira(obj14);
        java.lang.Object obj16 = fila10.desenfileira();
        java.lang.Object obj17 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = fila10.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = null;
        fila0.enfileira(obj8);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj37 = fila16.desenfileira();
        boolean boolean38 = fila16.vazia();
        boolean boolean39 = fila16.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        java.lang.Object obj13 = fila8.desenfileira();
        boolean boolean14 = fila8.vazia();
        fila0.enfileira((java.lang.Object) boolean14);
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        boolean boolean18 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = fila16.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        java.lang.Object obj6 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Class<?> wildcardClass18 = fila10.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        java.lang.Object obj17 = fila5.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila8.enfileira(obj14);
        boolean boolean17 = fila8.vazia();
        java.lang.Object obj18 = fila8.desenfileira();
        fila8.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        boolean boolean37 = fila16.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) ' ');
        fila0.imprime();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila9.imprime();
        java.lang.Object obj13 = null;
        fila9.enfileira(obj13);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        fila9.enfileira((java.lang.Object) boolean19);
        java.lang.Class<?> wildcardClass21 = fila9.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila0.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 100.0f);
        boolean boolean27 = fila24.vazia();
        java.lang.Object obj28 = fila24.desenfileira();
        fila24.imprime();
        fila24.imprime();
        boolean boolean31 = fila24.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila24.enfileira((java.lang.Object) fila32);
        fila24.imprime();
        java.lang.Object obj36 = fila24.desenfileira();
        fila0.enfileira(obj36);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Class<?> wildcardClass16 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila8.enfileira(obj14);
        boolean boolean17 = fila8.vazia();
        java.lang.Class<?> wildcardClass18 = fila8.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        boolean boolean11 = fila9.vazia();
        fila0.enfileira((java.lang.Object) boolean11);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj37 = fila16.desenfileira();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 100.0f);
        boolean boolean41 = fila38.vazia();
        java.lang.Object obj42 = fila38.desenfileira();
        fila38.imprime();
        fila38.imprime();
        fila16.enfileira((java.lang.Object) fila38);
        boolean boolean46 = fila16.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        fila15.imprime();
        boolean boolean20 = fila15.vazia();
        boolean boolean21 = fila15.vazia();
        fila15.imprime();
        fila15.imprime();
        fila12.enfileira((java.lang.Object) fila15);
        fila10.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila0.enfileira((java.lang.Object) fila15);
        boolean boolean28 = fila0.vazia();
        java.lang.Class<?> wildcardClass29 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila8.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        fila17.imprime();
        fila17.imprime();
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        boolean boolean25 = fila17.vazia();
        fila17.imprime();
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 10);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        fila32.imprime();
        boolean boolean37 = fila32.vazia();
        boolean boolean38 = fila32.vazia();
        fila32.imprime();
        fila32.imprime();
        fila29.enfileira((java.lang.Object) fila32);
        fila27.enfileira((java.lang.Object) fila32);
        fila32.imprime();
        fila17.enfileira((java.lang.Object) fila32);
        fila8.enfileira((java.lang.Object) fila17);
        java.lang.Class<?> wildcardClass46 = fila17.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (short) 0);
        java.lang.Object obj11 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 0 + "'", obj11, (short) 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj22 = fila15.desenfileira();
        boolean boolean23 = fila15.vazia();
        fila0.enfileira((java.lang.Object) boolean23);
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        boolean boolean12 = fila9.vazia();
        java.lang.Object obj13 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        boolean boolean16 = fila9.vazia();
        fila9.imprime();
        boolean boolean18 = fila9.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        fila19.imprime();
        java.lang.Object obj23 = null;
        fila19.enfileira(obj23);
        java.lang.Object obj25 = fila19.desenfileira();
        java.lang.Object obj26 = fila19.desenfileira();
        fila19.imprime();
        fila9.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass30 = fila9.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        java.lang.Object obj13 = fila8.desenfileira();
        boolean boolean14 = fila8.vazia();
        fila0.enfileira((java.lang.Object) boolean14);
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        boolean boolean18 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Class<?> wildcardClass22 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 100.0f);
        fila4.imprime();
        fila4.imprime();
        java.lang.Object obj9 = fila4.desenfileira();
        fila4.imprime();
        java.lang.Class<?> wildcardClass11 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Class<?> wildcardClass14 = fila8.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        boolean boolean6 = fila4.vazia();
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 10);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 100.0f);
        fila14.imprime();
        fila14.imprime();
        boolean boolean19 = fila14.vazia();
        boolean boolean20 = fila14.vazia();
        fila14.imprime();
        fila14.imprime();
        fila11.enfileira((java.lang.Object) fila14);
        fila9.enfileira((java.lang.Object) fila14);
        fila4.enfileira((java.lang.Object) fila14);
        java.lang.Object obj26 = fila4.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100.0f);
        boolean boolean30 = fila27.vazia();
        java.lang.Object obj31 = fila27.desenfileira();
        fila27.imprime();
        fila27.imprime();
        boolean boolean34 = fila27.vazia();
        fila27.imprime();
        fila4.enfileira((java.lang.Object) fila27);
        fila0.enfileira((java.lang.Object) fila27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = fila27.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100.0f);
        fila3.imprime();
        fila3.imprime();
        boolean boolean8 = fila3.vazia();
        boolean boolean9 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean13 = fila3.vazia();
        java.lang.Object obj14 = fila3.desenfileira();
        java.lang.Class<?> wildcardClass15 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj16 = fila7.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        boolean boolean20 = fila17.vazia();
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        java.lang.Object obj26 = fila7.desenfileira();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 100.0f);
        boolean boolean9 = fila6.vazia();
        boolean boolean10 = fila6.vazia();
        fila0.enfileira((java.lang.Object) boolean10);
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        fila11.imprime();
        java.lang.Object obj16 = fila11.desenfileira();
        fila11.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 100.0f);
        boolean boolean21 = fila18.vazia();
        java.lang.Object obj22 = fila18.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        fila23.imprime();
        fila23.imprime();
        java.lang.Object obj28 = fila23.desenfileira();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila31.imprime();
        fila31.imprime();
        fila23.enfileira((java.lang.Object) fila31);
        fila18.enfileira((java.lang.Object) fila23);
        fila11.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        java.lang.Class<?> wildcardClass40 = fila18.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj16 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        boolean boolean26 = fila23.vazia();
        java.lang.Object obj27 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 100.0f);
        fila33.imprime();
        fila33.imprime();
        java.lang.Object obj38 = fila33.desenfileira();
        fila33.imprime();
        boolean boolean40 = fila33.vazia();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 100.0f);
        fila41.imprime();
        fila41.imprime();
        fila33.enfileira((java.lang.Object) fila41);
        fila23.enfileira((java.lang.Object) fila33);
        fila23.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Class<?> wildcardClass37 = fila16.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100.0f);
        fila3.imprime();
        fila3.imprime();
        boolean boolean8 = fila3.vazia();
        boolean boolean9 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean13 = fila3.vazia();
        boolean boolean14 = fila3.vazia();
        java.lang.Object obj15 = fila3.desenfileira();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        java.lang.Object obj13 = fila8.desenfileira();
        boolean boolean14 = fila8.vazia();
        fila0.enfileira((java.lang.Object) boolean14);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        fila16.imprime();
        java.lang.Object obj20 = fila16.desenfileira();
        fila16.enfileira((java.lang.Object) 1L);
        java.lang.Object obj23 = fila16.desenfileira();
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Class<?> wildcardClass26 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1L + "'", obj23, 1L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        java.lang.Object obj10 = fila5.desenfileira();
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.imprime();
        fila5.enfileira((java.lang.Object) fila13);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj28 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean30 = fila21.vazia();
        fila21.imprime();
        fila21.imprime();
        fila0.enfileira((java.lang.Object) fila21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = fila21.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0f) + "'", obj28, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = null;
        fila10.enfileira(obj18);
        // The following exception was thrown during execution in test generation
        try {
            fila10.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        java.lang.Object obj14 = null;
        fila10.enfileira(obj14);
        java.lang.Object obj16 = fila10.desenfileira();
        java.lang.Object obj17 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass20 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100.0f);
        fila3.imprime();
        fila3.imprime();
        boolean boolean8 = fila3.vazia();
        boolean boolean9 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10 + "'", obj13, 10);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        fila16.imprime();
        java.lang.Object obj38 = fila16.desenfileira();
        java.lang.Class<?> wildcardClass39 = fila16.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila8.enfileira(obj14);
        boolean boolean17 = fila8.vazia();
        java.lang.Object obj18 = fila8.desenfileira();
        java.lang.Object obj19 = fila8.desenfileira();
        boolean boolean20 = fila8.vazia();
        java.lang.Class<?> wildcardClass21 = fila8.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila9.imprime();
        java.lang.Object obj13 = fila9.desenfileira();
        fila9.enfileira((java.lang.Object) 1L);
        java.lang.Object obj16 = fila9.desenfileira();
        fila9.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        java.lang.Class<?> wildcardClass20 = fila18.getClass();
        fila9.enfileira((java.lang.Object) fila18);
        java.lang.Object obj22 = fila9.desenfileira();
        boolean boolean23 = fila9.vazia();
        fila0.enfileira((java.lang.Object) boolean23);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1L + "'", obj16, 1L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj37 = fila16.desenfileira();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 100.0f);
        boolean boolean41 = fila38.vazia();
        java.lang.Object obj42 = fila38.desenfileira();
        fila38.imprime();
        fila38.imprime();
        fila16.enfileira((java.lang.Object) fila38);
        java.lang.Class<?> wildcardClass46 = fila38.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj16 = fila7.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        boolean boolean20 = fila17.vazia();
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila7);
        fila7.enfileira((java.lang.Object) ' ');
        boolean boolean27 = fila7.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj37 = fila16.desenfileira();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 100.0f);
        boolean boolean41 = fila38.vazia();
        java.lang.Object obj42 = fila38.desenfileira();
        fila38.imprime();
        fila38.imprime();
        fila16.enfileira((java.lang.Object) fila38);
        java.lang.Class<?> wildcardClass46 = fila16.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj16 = fila7.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        boolean boolean20 = fila17.vazia();
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        java.lang.Object obj26 = null;
        fila0.enfileira(obj26);
        java.lang.Class<?> wildcardClass28 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj16 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj16 = fila7.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        boolean boolean20 = fila17.vazia();
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 10);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        boolean boolean34 = fila29.vazia();
        boolean boolean35 = fila29.vazia();
        fila29.imprime();
        fila29.imprime();
        fila26.enfileira((java.lang.Object) fila29);
        boolean boolean39 = fila29.vazia();
        java.lang.Object obj40 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) "");
        boolean boolean43 = fila29.vazia();
        fila0.enfileira((java.lang.Object) fila29);
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) 10);
        boolean boolean48 = fila45.vazia();
        ds.Fila fila49 = new ds.Fila();
        fila49.imprime();
        boolean boolean51 = fila49.vazia();
        fila49.imprime();
        boolean boolean53 = fila49.vazia();
        ds.Fila fila54 = new ds.Fila();
        boolean boolean55 = fila54.vazia();
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) 10);
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) 100.0f);
        fila59.imprime();
        fila59.imprime();
        boolean boolean64 = fila59.vazia();
        boolean boolean65 = fila59.vazia();
        fila59.imprime();
        fila59.imprime();
        fila56.enfileira((java.lang.Object) fila59);
        fila54.enfileira((java.lang.Object) fila59);
        fila49.enfileira((java.lang.Object) fila59);
        java.lang.Object obj71 = fila49.desenfileira();
        ds.Fila fila72 = new ds.Fila();
        fila72.enfileira((java.lang.Object) 100.0f);
        boolean boolean75 = fila72.vazia();
        java.lang.Object obj76 = fila72.desenfileira();
        fila72.imprime();
        fila72.imprime();
        boolean boolean79 = fila72.vazia();
        fila72.imprime();
        fila49.enfileira((java.lang.Object) fila72);
        fila45.enfileira((java.lang.Object) fila72);
        fila0.enfileira((java.lang.Object) fila45);
        java.lang.Class<?> wildcardClass84 = fila45.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + 100.0f + "'", obj76, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj16 = fila5.desenfileira();
        boolean boolean17 = fila5.vazia();
        java.lang.Class<?> wildcardClass18 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        boolean boolean26 = fila23.vazia();
        java.lang.Object obj27 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        boolean boolean33 = fila0.vazia();
        java.lang.Class<?> wildcardClass34 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        java.lang.Object obj14 = null;
        fila10.enfileira(obj14);
        java.lang.Object obj16 = fila10.desenfileira();
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean21 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj16 = fila5.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = fila5.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (short) 100);
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 100 + "'", obj12, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj15 = fila8.desenfileira();
        boolean boolean16 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean18 = fila8.vazia();
        java.lang.Class<?> wildcardClass19 = fila8.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        boolean boolean12 = fila9.vazia();
        java.lang.Object obj13 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        boolean boolean16 = fila9.vazia();
        fila9.imprime();
        boolean boolean18 = fila9.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        fila19.imprime();
        java.lang.Object obj23 = null;
        fila19.enfileira(obj23);
        java.lang.Object obj25 = fila19.desenfileira();
        java.lang.Object obj26 = fila19.desenfileira();
        fila19.imprime();
        fila9.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj30 = fila0.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila31.imprime();
        java.lang.Object obj35 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) (-1.0f));
        fila31.imprime();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 10);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 100.0f);
        fila42.imprime();
        fila42.imprime();
        boolean boolean47 = fila42.vazia();
        boolean boolean48 = fila42.vazia();
        fila42.imprime();
        fila42.imprime();
        fila39.enfileira((java.lang.Object) fila42);
        boolean boolean52 = fila42.vazia();
        java.lang.Object obj53 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) "");
        boolean boolean56 = fila42.vazia();
        fila31.enfileira((java.lang.Object) fila42);
        fila0.enfileira((java.lang.Object) fila42);
        java.lang.Class<?> wildcardClass59 = fila42.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0d + "'", obj30, 1.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100.0f + "'", obj53, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        boolean boolean26 = fila23.vazia();
        java.lang.Object obj27 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 100.0f);
        fila33.imprime();
        fila33.imprime();
        java.lang.Object obj38 = fila33.desenfileira();
        fila33.imprime();
        boolean boolean40 = fila33.vazia();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 100.0f);
        fila41.imprime();
        fila41.imprime();
        fila33.enfileira((java.lang.Object) fila41);
        fila23.enfileira((java.lang.Object) fila33);
        boolean boolean48 = fila33.vazia();
        boolean boolean49 = fila33.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        boolean boolean26 = fila23.vazia();
        java.lang.Object obj27 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 100.0f);
        fila33.imprime();
        fila33.imprime();
        java.lang.Object obj38 = fila33.desenfileira();
        fila33.imprime();
        boolean boolean40 = fila33.vazia();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 100.0f);
        fila41.imprime();
        fila41.imprime();
        fila33.enfileira((java.lang.Object) fila41);
        fila23.enfileira((java.lang.Object) fila33);
        boolean boolean48 = fila33.vazia();
        fila33.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = fila15.desenfileira();
        fila15.imprime();
        java.lang.Class<?> wildcardClass24 = fila15.getClass();
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Class<?> wildcardClass26 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0f) + "'", obj22, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 100.0f);
        fila37.imprime();
        fila37.imprime();
        java.lang.Object obj42 = fila37.desenfileira();
        java.lang.Class<?> wildcardClass43 = fila37.getClass();
        fila0.enfileira((java.lang.Object) fila37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = fila37.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100.0f);
        fila3.imprime();
        fila3.imprime();
        boolean boolean8 = fila3.vazia();
        boolean boolean9 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean13 = fila3.vazia();
        java.lang.Object obj14 = fila3.desenfileira();
        fila3.enfileira((java.lang.Object) "");
        fila3.imprime();
        java.lang.Class<?> wildcardClass18 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj16 = fila7.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        boolean boolean20 = fila17.vazia();
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila7);
        fila7.enfileira((java.lang.Object) ' ');
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = null;
        fila10.enfileira(obj18);
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass22 = fila10.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        boolean boolean26 = fila23.vazia();
        java.lang.Object obj27 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        java.lang.Object obj33 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 100.0f);
        boolean boolean9 = fila6.vazia();
        boolean boolean10 = fila6.vazia();
        fila0.enfileira((java.lang.Object) boolean10);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 10);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        fila19.imprime();
        fila19.imprime();
        boolean boolean24 = fila19.vazia();
        boolean boolean25 = fila19.vazia();
        fila19.imprime();
        fila19.imprime();
        fila16.enfileira((java.lang.Object) fila19);
        fila14.enfileira((java.lang.Object) fila19);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 100.0f);
        boolean boolean33 = fila30.vazia();
        java.lang.Object obj34 = fila30.desenfileira();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 100.0f);
        fila35.imprime();
        fila35.imprime();
        java.lang.Object obj40 = fila35.desenfileira();
        fila35.imprime();
        boolean boolean42 = fila35.vazia();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 100.0f);
        fila43.imprime();
        fila43.imprime();
        fila35.enfileira((java.lang.Object) fila43);
        fila30.enfileira((java.lang.Object) fila35);
        fila14.enfileira((java.lang.Object) fila30);
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 100.0f);
        fila51.imprime();
        fila51.imprime();
        java.lang.Object obj56 = fila51.desenfileira();
        java.lang.Class<?> wildcardClass57 = fila51.getClass();
        fila14.enfileira((java.lang.Object) fila51);
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) 100.0f);
        boolean boolean62 = fila59.vazia();
        java.lang.Object obj63 = fila59.desenfileira();
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) 100.0f);
        fila64.imprime();
        fila64.imprime();
        java.lang.Object obj69 = fila64.desenfileira();
        fila64.imprime();
        boolean boolean71 = fila64.vazia();
        ds.Fila fila72 = new ds.Fila();
        fila72.enfileira((java.lang.Object) 100.0f);
        fila72.imprime();
        fila72.imprime();
        fila64.enfileira((java.lang.Object) fila72);
        fila59.enfileira((java.lang.Object) fila64);
        fila59.imprime();
        boolean boolean80 = fila59.vazia();
        fila51.enfileira((java.lang.Object) fila59);
        fila8.enfileira((java.lang.Object) fila51);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100.0f + "'", obj56, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0f + "'", obj63, 100.0f);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 100.0f + "'", obj69, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        java.lang.Object obj14 = null;
        fila10.enfileira(obj14);
        java.lang.Object obj16 = fila10.desenfileira();
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj28 = fila21.desenfileira();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0f) + "'", obj28, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = null;
        fila10.enfileira(obj18);
        fila10.enfileira((java.lang.Object) 'a');
        boolean boolean22 = fila10.vazia();
        java.lang.Class<?> wildcardClass23 = fila10.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        fila0.imprime();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        java.lang.Object obj3 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 10 + "'", obj3, 10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj13 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        boolean boolean26 = fila23.vazia();
        java.lang.Object obj27 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 100.0f);
        fila33.imprime();
        fila33.imprime();
        java.lang.Object obj38 = fila33.desenfileira();
        fila33.imprime();
        boolean boolean40 = fila33.vazia();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 100.0f);
        fila41.imprime();
        fila41.imprime();
        fila33.enfileira((java.lang.Object) fila41);
        fila23.enfileira((java.lang.Object) fila33);
        boolean boolean48 = fila33.vazia();
        java.lang.Class<?> wildcardClass49 = fila33.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila10.desenfileira();
        fila10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = fila10.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 100.0f);
        fila4.imprime();
        fila4.imprime();
        java.lang.Object obj9 = fila4.desenfileira();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 100.0f);
        fila12.imprime();
        java.lang.Object obj16 = fila12.desenfileira();
        fila12.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass19 = fila12.getClass();
        fila4.enfileira((java.lang.Object) fila12);
        boolean boolean21 = fila4.vazia();
        fila0.enfileira((java.lang.Object) boolean21);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        java.lang.Object obj13 = fila8.desenfileira();
        boolean boolean14 = fila8.vazia();
        fila0.enfileira((java.lang.Object) boolean14);
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        boolean boolean18 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Class<?> wildcardClass22 = fila16.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 100.0f);
        fila37.imprime();
        fila37.imprime();
        java.lang.Object obj42 = fila37.desenfileira();
        java.lang.Class<?> wildcardClass43 = fila37.getClass();
        fila0.enfileira((java.lang.Object) fila37);
        boolean boolean45 = fila37.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        boolean boolean8 = fila5.vazia();
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.imprime();
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.imprime();
        boolean boolean14 = fila5.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = null;
        fila15.enfileira(obj19);
        java.lang.Object obj21 = fila15.desenfileira();
        java.lang.Object obj22 = fila15.desenfileira();
        fila15.imprime();
        fila5.enfileira((java.lang.Object) fila15);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Class<?> wildcardClass26 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = fila15.desenfileira();
        fila15.imprime();
        java.lang.Class<?> wildcardClass24 = fila15.getClass();
        fila0.enfileira((java.lang.Object) fila15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = fila15.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0f) + "'", obj22, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj15 = fila8.desenfileira();
        boolean boolean16 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 100.0f);
        fila18.imprime();
        fila18.imprime();
        boolean boolean23 = fila18.vazia();
        boolean boolean24 = fila18.vazia();
        fila18.imprime();
        boolean boolean26 = fila18.vazia();
        fila18.imprime();
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 10);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 100.0f);
        fila33.imprime();
        fila33.imprime();
        boolean boolean38 = fila33.vazia();
        boolean boolean39 = fila33.vazia();
        fila33.imprime();
        fila33.imprime();
        fila30.enfileira((java.lang.Object) fila33);
        fila28.enfileira((java.lang.Object) fila33);
        fila33.imprime();
        fila18.enfileira((java.lang.Object) fila33);
        java.lang.Object obj46 = fila18.desenfileira();
        fila8.enfileira(obj46);
        java.lang.Class<?> wildcardClass48 = obj46.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0f + "'", obj46, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        boolean boolean10 = fila7.vazia();
        java.lang.Object obj11 = fila7.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 100.0f);
        fila12.imprime();
        fila12.imprime();
        java.lang.Object obj17 = fila12.desenfileira();
        fila12.imprime();
        boolean boolean19 = fila12.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 100.0f);
        fila20.imprime();
        fila20.imprime();
        fila12.enfileira((java.lang.Object) fila20);
        fila7.enfileira((java.lang.Object) fila12);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = null;
        fila10.enfileira(obj18);
        java.lang.Object obj20 = fila10.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 1L);
        java.lang.Object obj28 = fila21.desenfileira();
        fila21.imprime();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        java.lang.Class<?> wildcardClass32 = fila30.getClass();
        fila21.enfileira((java.lang.Object) fila30);
        java.lang.Object obj34 = fila21.desenfileira();
        boolean boolean35 = fila21.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 100.0f);
        fila36.imprime();
        java.lang.Object obj40 = fila36.desenfileira();
        fila36.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj43 = fila36.desenfileira();
        fila36.imprime();
        java.lang.Class<?> wildcardClass45 = fila36.getClass();
        fila21.enfileira((java.lang.Object) fila36);
        fila21.imprime();
        fila10.enfileira((java.lang.Object) fila21);
        java.lang.Object obj49 = fila21.desenfileira();
        boolean boolean50 = fila21.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1L + "'", obj28, 1L);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1.0f) + "'", obj43, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj12 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass22 = fila15.getClass();
        fila7.enfileira((java.lang.Object) fila15);
        java.lang.Class<?> wildcardClass24 = fila7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass24);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 100.0f);
        fila26.imprime();
        fila26.imprime();
        fila26.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj33 = fila26.desenfileira();
        boolean boolean34 = fila26.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 100.0f);
        boolean boolean38 = fila35.vazia();
        java.lang.Object obj39 = fila35.desenfileira();
        fila35.imprime();
        fila35.imprime();
        boolean boolean42 = fila35.vazia();
        fila35.imprime();
        boolean boolean44 = fila35.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) 100.0f);
        fila45.imprime();
        java.lang.Object obj49 = null;
        fila45.enfileira(obj49);
        java.lang.Object obj51 = fila45.desenfileira();
        java.lang.Object obj52 = fila45.desenfileira();
        fila45.imprime();
        fila35.enfileira((java.lang.Object) fila45);
        fila26.enfileira((java.lang.Object) fila35);
        fila0.enfileira((java.lang.Object) fila35);
        java.lang.Class<?> wildcardClass57 = fila35.getClass();
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0f + "'", obj33, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0f + "'", obj39, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0f + "'", obj51, 100.0f);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj16 = fila7.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        boolean boolean20 = fila17.vazia();
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila8.enfileira(obj14);
        java.lang.Class<?> wildcardClass17 = fila8.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        boolean boolean12 = fila9.vazia();
        java.lang.Object obj13 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        boolean boolean16 = fila9.vazia();
        fila9.imprime();
        boolean boolean18 = fila9.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        fila19.imprime();
        java.lang.Object obj23 = null;
        fila19.enfileira(obj23);
        java.lang.Object obj25 = fila19.desenfileira();
        java.lang.Object obj26 = fila19.desenfileira();
        fila19.imprime();
        fila9.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj30 = fila0.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila31.imprime();
        java.lang.Object obj35 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) (-1.0f));
        fila31.imprime();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 10);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 100.0f);
        fila42.imprime();
        fila42.imprime();
        boolean boolean47 = fila42.vazia();
        boolean boolean48 = fila42.vazia();
        fila42.imprime();
        fila42.imprime();
        fila39.enfileira((java.lang.Object) fila42);
        boolean boolean52 = fila42.vazia();
        java.lang.Object obj53 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) "");
        boolean boolean56 = fila42.vazia();
        fila31.enfileira((java.lang.Object) fila42);
        fila0.enfileira((java.lang.Object) fila42);
        boolean boolean59 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0d + "'", obj30, 1.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100.0f + "'", obj53, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = fila15.desenfileira();
        fila15.imprime();
        java.lang.Class<?> wildcardClass24 = fila15.getClass();
        fila0.enfileira((java.lang.Object) fila15);
        fila0.imprime();
        java.lang.Class<?> wildcardClass27 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0f) + "'", obj22, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = null;
        fila10.enfileira(obj18);
        java.lang.Object obj20 = fila10.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        java.lang.Class<?> wildcardClass29 = fila21.getClass();
        fila10.enfileira((java.lang.Object) wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        boolean boolean26 = fila23.vazia();
        java.lang.Object obj27 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        boolean boolean33 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 10);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 100.0f);
        fila38.imprime();
        fila38.imprime();
        boolean boolean43 = fila38.vazia();
        boolean boolean44 = fila38.vazia();
        fila38.imprime();
        fila38.imprime();
        fila35.enfileira((java.lang.Object) fila38);
        boolean boolean48 = fila38.vazia();
        java.lang.Object obj49 = fila38.desenfileira();
        fila38.enfileira((java.lang.Object) "");
        boolean boolean52 = fila38.vazia();
        fila0.enfileira((java.lang.Object) boolean52);
        boolean boolean54 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0f + "'", obj49, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        fila23.imprime();
        java.lang.Object obj27 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) (-1.0f));
        fila23.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 10);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 100.0f);
        fila34.imprime();
        fila34.imprime();
        boolean boolean39 = fila34.vazia();
        boolean boolean40 = fila34.vazia();
        fila34.imprime();
        fila34.imprime();
        fila31.enfileira((java.lang.Object) fila34);
        boolean boolean44 = fila34.vazia();
        java.lang.Object obj45 = fila34.desenfileira();
        fila34.enfileira((java.lang.Object) "");
        boolean boolean48 = fila34.vazia();
        fila23.enfileira((java.lang.Object) fila34);
        java.lang.Object obj50 = fila34.desenfileira();
        fila0.enfileira(obj50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 100.0f + "'", obj45, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "" + "'", obj50, "");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 100.0f);
        fila4.imprime();
        fila4.imprime();
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 100.0f);
        boolean boolean17 = fila14.vazia();
        java.lang.Object obj18 = fila14.desenfileira();
        fila14.imprime();
        fila4.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila14);
        boolean boolean22 = fila14.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        java.lang.Object obj14 = null;
        fila10.enfileira(obj14);
        java.lang.Object obj16 = fila10.desenfileira();
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj21 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        boolean boolean10 = fila8.vazia();
        fila8.imprime();
        boolean boolean12 = fila8.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 10);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 100.0f);
        fila18.imprime();
        fila18.imprime();
        boolean boolean23 = fila18.vazia();
        boolean boolean24 = fila18.vazia();
        fila18.imprime();
        fila18.imprime();
        fila15.enfileira((java.lang.Object) fila18);
        fila13.enfileira((java.lang.Object) fila18);
        fila8.enfileira((java.lang.Object) fila18);
        java.lang.Object obj30 = fila8.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 100.0f);
        boolean boolean34 = fila31.vazia();
        java.lang.Object obj35 = fila31.desenfileira();
        fila31.imprime();
        fila31.imprime();
        boolean boolean38 = fila31.vazia();
        fila31.imprime();
        fila8.enfileira((java.lang.Object) fila31);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 100.0f);
        fila41.imprime();
        fila41.imprime();
        java.lang.Object obj46 = fila41.desenfileira();
        fila41.imprime();
        boolean boolean48 = fila41.vazia();
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 100.0f);
        fila49.imprime();
        fila49.imprime();
        fila41.enfileira((java.lang.Object) fila49);
        fila31.enfileira((java.lang.Object) fila41);
        boolean boolean56 = fila41.vazia();
        fila0.enfileira((java.lang.Object) boolean56);
        java.lang.Class<?> wildcardClass58 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0f + "'", obj46, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        boolean boolean18 = fila16.vazia();
        fila16.imprime();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 10);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 100.0f);
        fila26.imprime();
        fila26.imprime();
        boolean boolean31 = fila26.vazia();
        boolean boolean32 = fila26.vazia();
        fila26.imprime();
        fila26.imprime();
        fila23.enfileira((java.lang.Object) fila26);
        fila21.enfileira((java.lang.Object) fila26);
        fila16.enfileira((java.lang.Object) fila26);
        java.lang.Object obj38 = fila16.desenfileira();
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = fila16.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100.0f);
        fila3.imprime();
        fila3.imprime();
        boolean boolean8 = fila3.vazia();
        boolean boolean9 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean13 = fila3.vazia();
        boolean boolean14 = fila3.vazia();
        java.lang.Class<?> wildcardClass15 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila8.enfileira(obj14);
        boolean boolean17 = fila8.vazia();
        java.lang.Object obj18 = fila8.desenfileira();
        java.lang.Object obj19 = fila8.desenfileira();
        boolean boolean20 = fila8.vazia();
        boolean boolean21 = fila8.vazia();
        fila8.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Class<?> wildcardClass7 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 10);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        fila11.imprime();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila8.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila11.vazia();
        java.lang.Object obj22 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) "");
        boolean boolean25 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Class<?> wildcardClass27 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100.0f);
        fila3.imprime();
        fila3.imprime();
        boolean boolean8 = fila3.vazia();
        boolean boolean9 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        java.lang.Object obj12 = fila8.desenfileira();
        fila8.enfileira((java.lang.Object) 1L);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        fila15.imprime();
        boolean boolean20 = fila15.vazia();
        boolean boolean21 = fila15.vazia();
        fila15.imprime();
        fila15.imprime();
        java.lang.Object obj24 = fila15.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 100.0f);
        boolean boolean28 = fila25.vazia();
        java.lang.Object obj29 = fila25.desenfileira();
        fila25.imprime();
        fila15.enfileira((java.lang.Object) fila25);
        fila8.enfileira((java.lang.Object) fila15);
        fila8.imprime();
        java.lang.Object obj34 = null;
        fila8.enfileira(obj34);
        boolean boolean36 = fila8.vazia();
        java.lang.Object obj37 = fila8.desenfileira();
        fila0.enfileira(obj37);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1L + "'", obj37, 1L);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj16 = fila0.desenfileira();
        boolean boolean17 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        java.lang.Object obj14 = null;
        fila10.enfileira(obj14);
        java.lang.Object obj16 = fila10.desenfileira();
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 100.0f);
        boolean boolean42 = fila39.vazia();
        java.lang.Object obj43 = fila39.desenfileira();
        fila39.imprime();
        fila39.imprime();
        boolean boolean46 = fila39.vazia();
        fila39.imprime();
        boolean boolean48 = fila39.vazia();
        java.lang.Class<?> wildcardClass49 = fila39.getClass();
        fila0.enfileira((java.lang.Object) fila39);
        boolean boolean51 = fila39.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0f + "'", obj43, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = fila15.desenfileira();
        fila15.imprime();
        java.lang.Class<?> wildcardClass24 = fila15.getClass();
        fila0.enfileira((java.lang.Object) fila15);
        fila0.imprime();
        boolean boolean27 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0f) + "'", obj22, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        boolean boolean26 = fila23.vazia();
        java.lang.Object obj27 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 100.0f);
        fila33.imprime();
        fila33.imprime();
        java.lang.Object obj38 = fila33.desenfileira();
        fila33.imprime();
        boolean boolean40 = fila33.vazia();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 100.0f);
        fila41.imprime();
        fila41.imprime();
        fila33.enfileira((java.lang.Object) fila41);
        fila23.enfileira((java.lang.Object) fila33);
        boolean boolean48 = fila33.vazia();
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 10);
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 100.0f);
        fila52.imprime();
        fila52.imprime();
        boolean boolean57 = fila52.vazia();
        boolean boolean58 = fila52.vazia();
        fila52.imprime();
        fila52.imprime();
        fila49.enfileira((java.lang.Object) fila52);
        fila33.enfileira((java.lang.Object) fila52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        boolean boolean18 = fila16.vazia();
        fila16.imprime();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 10);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 100.0f);
        fila26.imprime();
        fila26.imprime();
        boolean boolean31 = fila26.vazia();
        boolean boolean32 = fila26.vazia();
        fila26.imprime();
        fila26.imprime();
        fila23.enfileira((java.lang.Object) fila26);
        fila21.enfileira((java.lang.Object) fila26);
        fila16.enfileira((java.lang.Object) fila26);
        java.lang.Object obj38 = fila16.desenfileira();
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Class<?> wildcardClass41 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = fila10.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        fila15.imprime();
        boolean boolean20 = fila15.vazia();
        boolean boolean21 = fila15.vazia();
        fila15.imprime();
        fila15.imprime();
        fila12.enfileira((java.lang.Object) fila15);
        fila10.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila0.enfileira((java.lang.Object) fila15);
        boolean boolean28 = fila15.vazia();
        java.lang.Class<?> wildcardClass29 = fila15.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 10);
        boolean boolean13 = fila10.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj18 = fila10.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10 + "'", obj18, 10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Object obj7 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = fila15.desenfileira();
        fila15.imprime();
        java.lang.Class<?> wildcardClass24 = fila15.getClass();
        fila0.enfileira((java.lang.Object) fila15);
        boolean boolean26 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass28 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0f) + "'", obj22, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        boolean boolean16 = fila13.vazia();
        java.lang.Object obj17 = fila13.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 100.0f);
        fila18.imprime();
        fila18.imprime();
        java.lang.Object obj23 = fila18.desenfileira();
        fila18.imprime();
        boolean boolean25 = fila18.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 100.0f);
        fila26.imprime();
        fila26.imprime();
        fila18.enfileira((java.lang.Object) fila26);
        fila13.enfileira((java.lang.Object) fila18);
        fila13.imprime();
        java.lang.Object obj34 = fila13.desenfileira();
        fila0.enfileira(obj34);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        boolean boolean8 = fila5.vazia();
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.imprime();
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.imprime();
        boolean boolean14 = fila5.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = null;
        fila15.enfileira(obj19);
        java.lang.Object obj21 = fila15.desenfileira();
        java.lang.Object obj22 = fila15.desenfileira();
        fila15.imprime();
        fila5.enfileira((java.lang.Object) fila15);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 100.0f);
        fila26.imprime();
        boolean boolean30 = fila26.vazia();
        fila26.imprime();
        fila26.imprime();
        fila0.enfileira((java.lang.Object) fila26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila8.imprime();
        java.lang.Object obj17 = fila8.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 100.0f);
        boolean boolean21 = fila18.vazia();
        java.lang.Object obj22 = fila18.desenfileira();
        fila18.imprime();
        fila8.enfileira((java.lang.Object) fila18);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        boolean boolean27 = fila25.vazia();
        fila25.imprime();
        boolean boolean29 = fila25.vazia();
        fila18.enfileira((java.lang.Object) fila25);
        fila25.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        fila32.imprime();
        java.lang.Object obj37 = fila32.desenfileira();
        fila32.imprime();
        boolean boolean39 = fila32.vazia();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 100.0f);
        fila40.imprime();
        fila40.imprime();
        fila32.enfileira((java.lang.Object) fila40);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        fila40.enfileira(obj46);
        boolean boolean49 = fila40.vazia();
        java.lang.Object obj50 = fila40.desenfileira();
        java.lang.Object obj51 = fila40.desenfileira();
        java.lang.Class<?> wildcardClass52 = fila40.getClass();
        fila25.enfileira((java.lang.Object) fila40);
        fila0.enfileira((java.lang.Object) fila40);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) 10);
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) 100.0f);
        fila58.imprime();
        fila58.imprime();
        boolean boolean63 = fila58.vazia();
        boolean boolean64 = fila58.vazia();
        fila58.imprime();
        fila58.imprime();
        fila55.enfileira((java.lang.Object) fila58);
        boolean boolean68 = fila58.vazia();
        java.lang.Object obj69 = fila58.desenfileira();
        fila58.enfileira((java.lang.Object) "");
        boolean boolean72 = fila58.vazia();
        fila40.enfileira((java.lang.Object) fila58);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0f + "'", obj37, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0f + "'", obj50, 100.0f);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 100.0f + "'", obj69, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        boolean boolean11 = fila9.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        boolean boolean16 = fila12.vazia();
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 10);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100.0f);
        fila22.imprime();
        fila22.imprime();
        boolean boolean27 = fila22.vazia();
        boolean boolean28 = fila22.vazia();
        fila22.imprime();
        fila22.imprime();
        fila19.enfileira((java.lang.Object) fila22);
        fila17.enfileira((java.lang.Object) fila22);
        fila12.enfileira((java.lang.Object) fila22);
        java.lang.Object obj34 = fila22.desenfileira();
        fila9.enfileira(obj34);
        fila0.enfileira(obj34);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        boolean boolean12 = fila9.vazia();
        java.lang.Object obj13 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        boolean boolean16 = fila9.vazia();
        fila9.imprime();
        boolean boolean18 = fila9.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        fila19.imprime();
        java.lang.Object obj23 = null;
        fila19.enfileira(obj23);
        java.lang.Object obj25 = fila19.desenfileira();
        java.lang.Object obj26 = fila19.desenfileira();
        fila19.imprime();
        fila9.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj30 = fila0.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila31.imprime();
        java.lang.Object obj35 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) (-1.0f));
        fila31.imprime();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 10);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 100.0f);
        fila42.imprime();
        fila42.imprime();
        boolean boolean47 = fila42.vazia();
        boolean boolean48 = fila42.vazia();
        fila42.imprime();
        fila42.imprime();
        fila39.enfileira((java.lang.Object) fila42);
        boolean boolean52 = fila42.vazia();
        java.lang.Object obj53 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) "");
        boolean boolean56 = fila42.vazia();
        fila31.enfileira((java.lang.Object) fila42);
        fila0.enfileira((java.lang.Object) fila42);
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) 100.0f);
        fila59.imprime();
        fila59.enfileira((java.lang.Object) 1.0f);
        java.lang.Object obj65 = fila59.desenfileira();
        java.lang.Object obj66 = fila59.desenfileira();
        fila42.enfileira((java.lang.Object) fila59);
        java.lang.Object obj68 = fila42.desenfileira();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0d + "'", obj30, 1.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100.0f + "'", obj53, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 100.0f + "'", obj65, 100.0f);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 1.0f + "'", obj66, 1.0f);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + "" + "'", obj68, "");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj16 = fila7.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        boolean boolean20 = fila17.vazia();
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 10);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        boolean boolean34 = fila29.vazia();
        boolean boolean35 = fila29.vazia();
        fila29.imprime();
        fila29.imprime();
        fila26.enfileira((java.lang.Object) fila29);
        boolean boolean39 = fila29.vazia();
        java.lang.Object obj40 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) "");
        boolean boolean43 = fila29.vazia();
        fila0.enfileira((java.lang.Object) fila29);
        ds.Fila fila45 = new ds.Fila();
        boolean boolean46 = fila45.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 10);
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 100.0f);
        fila50.imprime();
        fila50.imprime();
        boolean boolean55 = fila50.vazia();
        boolean boolean56 = fila50.vazia();
        fila50.imprime();
        fila50.imprime();
        fila47.enfileira((java.lang.Object) fila50);
        fila45.enfileira((java.lang.Object) fila50);
        ds.Fila fila61 = new ds.Fila();
        fila61.imprime();
        boolean boolean63 = fila61.vazia();
        fila61.imprime();
        boolean boolean65 = fila61.vazia();
        ds.Fila fila66 = new ds.Fila();
        boolean boolean67 = fila66.vazia();
        ds.Fila fila68 = new ds.Fila();
        fila68.enfileira((java.lang.Object) 10);
        ds.Fila fila71 = new ds.Fila();
        fila71.enfileira((java.lang.Object) 100.0f);
        fila71.imprime();
        fila71.imprime();
        boolean boolean76 = fila71.vazia();
        boolean boolean77 = fila71.vazia();
        fila71.imprime();
        fila71.imprime();
        fila68.enfileira((java.lang.Object) fila71);
        fila66.enfileira((java.lang.Object) fila71);
        fila61.enfileira((java.lang.Object) fila71);
        java.lang.Object obj83 = fila61.desenfileira();
        fila61.imprime();
        fila45.enfileira((java.lang.Object) fila61);
        fila61.imprime();
        fila29.enfileira((java.lang.Object) fila61);
        ds.Fila fila88 = new ds.Fila();
        fila88.enfileira((java.lang.Object) 100.0f);
        fila88.imprime();
        java.lang.Object obj92 = null;
        fila88.enfileira(obj92);
        java.lang.Object obj94 = fila88.desenfileira();
        boolean boolean95 = fila88.vazia();
        java.lang.Object obj96 = fila88.desenfileira();
        boolean boolean97 = fila88.vazia();
        fila29.enfileira((java.lang.Object) boolean97);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertEquals("'" + obj94 + "' != '" + 100.0f + "'", obj94, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        java.lang.Object obj14 = null;
        fila10.enfileira(obj14);
        java.lang.Object obj16 = fila10.desenfileira();
        java.lang.Object obj17 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean20 = fila0.vazia();
        java.lang.Object obj21 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass22 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = null;
        fila10.enfileira(obj18);
        java.lang.Object obj20 = fila10.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 1L);
        java.lang.Object obj28 = fila21.desenfileira();
        fila21.imprime();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        java.lang.Class<?> wildcardClass32 = fila30.getClass();
        fila21.enfileira((java.lang.Object) fila30);
        java.lang.Object obj34 = fila21.desenfileira();
        boolean boolean35 = fila21.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 100.0f);
        fila36.imprime();
        java.lang.Object obj40 = fila36.desenfileira();
        fila36.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj43 = fila36.desenfileira();
        fila36.imprime();
        java.lang.Class<?> wildcardClass45 = fila36.getClass();
        fila21.enfileira((java.lang.Object) fila36);
        fila21.imprime();
        fila10.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        fila21.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1L + "'", obj28, 1L);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1.0f) + "'", obj43, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila8.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        fila17.imprime();
        fila17.imprime();
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        boolean boolean25 = fila17.vazia();
        fila17.imprime();
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 10);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        fila32.imprime();
        boolean boolean37 = fila32.vazia();
        boolean boolean38 = fila32.vazia();
        fila32.imprime();
        fila32.imprime();
        fila29.enfileira((java.lang.Object) fila32);
        fila27.enfileira((java.lang.Object) fila32);
        fila32.imprime();
        fila17.enfileira((java.lang.Object) fila32);
        fila8.enfileira((java.lang.Object) fila17);
        java.lang.Class<?> wildcardClass46 = fila8.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100.0f);
        fila3.imprime();
        fila3.imprime();
        boolean boolean8 = fila3.vazia();
        boolean boolean9 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean13 = fila3.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 100.0f);
        boolean boolean17 = fila14.vazia();
        java.lang.Object obj18 = fila14.desenfileira();
        fila14.imprime();
        fila14.imprime();
        boolean boolean21 = fila14.vazia();
        fila14.imprime();
        fila3.enfileira((java.lang.Object) fila14);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 100.0f);
        fila2.imprime();
        java.lang.Object obj6 = fila2.desenfileira();
        fila2.enfileira((java.lang.Object) (-1.0f));
        fila2.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 10);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        boolean boolean19 = fila13.vazia();
        fila13.imprime();
        fila13.imprime();
        fila10.enfileira((java.lang.Object) fila13);
        boolean boolean23 = fila13.vazia();
        java.lang.Object obj24 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) "");
        boolean boolean27 = fila13.vazia();
        fila2.enfileira((java.lang.Object) fila13);
        java.lang.Object obj29 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        fila10.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj17 = fila10.desenfileira();
        boolean boolean18 = fila10.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        boolean boolean22 = fila19.vazia();
        java.lang.Object obj23 = fila19.desenfileira();
        fila19.imprime();
        fila19.imprime();
        boolean boolean26 = fila19.vazia();
        fila19.imprime();
        boolean boolean28 = fila19.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        java.lang.Object obj33 = null;
        fila29.enfileira(obj33);
        java.lang.Object obj35 = fila29.desenfileira();
        java.lang.Object obj36 = fila29.desenfileira();
        fila29.imprime();
        fila19.enfileira((java.lang.Object) fila29);
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila10);
        fila0.imprime();
        java.lang.Object obj42 = fila0.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 100.0f);
        fila43.imprime();
        java.lang.Object obj47 = fila43.desenfileira();
        fila43.enfileira((java.lang.Object) 1L);
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 100.0f);
        fila50.imprime();
        fila50.imprime();
        boolean boolean55 = fila50.vazia();
        boolean boolean56 = fila50.vazia();
        fila50.imprime();
        fila50.imprime();
        java.lang.Object obj59 = fila50.desenfileira();
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) 100.0f);
        boolean boolean63 = fila60.vazia();
        java.lang.Object obj64 = fila60.desenfileira();
        fila60.imprime();
        fila50.enfileira((java.lang.Object) fila60);
        fila43.enfileira((java.lang.Object) fila50);
        fila50.imprime();
        boolean boolean69 = fila50.vazia();
        fila50.imprime();
        fila0.enfileira((java.lang.Object) fila50);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0f + "'", obj47, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 100.0f + "'", obj59, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0f + "'", obj64, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj13 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        fila15.imprime();
        java.lang.Object obj20 = fila15.desenfileira();
        fila15.imprime();
        boolean boolean22 = fila15.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        fila23.imprime();
        fila23.imprime();
        fila15.enfileira((java.lang.Object) fila23);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        fila23.enfileira(obj29);
        fila0.enfileira(obj29);
        java.lang.Class<?> wildcardClass33 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        java.lang.Object obj14 = null;
        fila10.enfileira(obj14);
        java.lang.Object obj16 = fila10.desenfileira();
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (-1.0f));
        fila21.imprime();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 10);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        fila32.imprime();
        boolean boolean37 = fila32.vazia();
        boolean boolean38 = fila32.vazia();
        fila32.imprime();
        fila32.imprime();
        fila29.enfileira((java.lang.Object) fila32);
        boolean boolean42 = fila32.vazia();
        java.lang.Object obj43 = fila32.desenfileira();
        fila32.enfileira((java.lang.Object) "");
        boolean boolean46 = fila32.vazia();
        fila21.enfileira((java.lang.Object) fila32);
        fila21.imprime();
        fila10.enfileira((java.lang.Object) fila21);
        java.lang.Object obj50 = fila21.desenfileira();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0f + "'", obj43, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1.0f) + "'", obj50, (-1.0f));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 100.0f);
        fila4.imprime();
        fila4.imprime();
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila4.imprime();
        boolean boolean12 = fila4.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        boolean boolean19 = fila13.vazia();
        fila13.imprime();
        fila13.imprime();
        java.lang.Object obj22 = fila13.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        boolean boolean26 = fila23.vazia();
        java.lang.Object obj27 = fila23.desenfileira();
        fila23.imprime();
        fila13.enfileira((java.lang.Object) fila23);
        boolean boolean30 = fila23.vazia();
        java.lang.Object obj31 = null;
        fila23.enfileira(obj31);
        boolean boolean33 = fila23.vazia();
        fila4.enfileira((java.lang.Object) boolean33);
        java.lang.Object obj35 = fila4.desenfileira();
        fila0.enfileira((java.lang.Object) fila4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        fila10.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj17 = fila10.desenfileira();
        boolean boolean18 = fila10.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        boolean boolean22 = fila19.vazia();
        java.lang.Object obj23 = fila19.desenfileira();
        fila19.imprime();
        fila19.imprime();
        boolean boolean26 = fila19.vazia();
        fila19.imprime();
        boolean boolean28 = fila19.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        java.lang.Object obj33 = null;
        fila29.enfileira(obj33);
        java.lang.Object obj35 = fila29.desenfileira();
        java.lang.Object obj36 = fila29.desenfileira();
        fila29.imprime();
        fila19.enfileira((java.lang.Object) fila29);
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 10);
        boolean boolean44 = fila41.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        fila41.enfileira((java.lang.Object) fila45);
        boolean boolean48 = fila41.vazia();
        java.lang.Object obj49 = fila41.desenfileira();
        fila0.enfileira(obj49);
        boolean boolean51 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 10 + "'", obj49, 10);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila8.enfileira(obj14);
        boolean boolean17 = fila8.vazia();
        java.lang.Object obj18 = fila8.desenfileira();
        java.lang.Object obj19 = fila8.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = fila8.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        java.lang.Object obj14 = null;
        fila10.enfileira(obj14);
        java.lang.Object obj16 = fila10.desenfileira();
        java.lang.Object obj17 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean20 = fila0.vazia();
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 1.0f);
        fila7.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 100.0f);
        fila14.imprime();
        fila14.imprime();
        java.lang.Object obj19 = fila14.desenfileira();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100.0f);
        fila22.imprime();
        java.lang.Object obj26 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass29 = fila22.getClass();
        fila14.enfileira((java.lang.Object) fila22);
        java.lang.Class<?> wildcardClass31 = fila14.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass31);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 100.0f);
        fila33.imprime();
        fila33.imprime();
        fila33.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj40 = fila33.desenfileira();
        boolean boolean41 = fila33.vazia();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 100.0f);
        boolean boolean45 = fila42.vazia();
        java.lang.Object obj46 = fila42.desenfileira();
        fila42.imprime();
        fila42.imprime();
        boolean boolean49 = fila42.vazia();
        fila42.imprime();
        boolean boolean51 = fila42.vazia();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 100.0f);
        fila52.imprime();
        java.lang.Object obj56 = null;
        fila52.enfileira(obj56);
        java.lang.Object obj58 = fila52.desenfileira();
        java.lang.Object obj59 = fila52.desenfileira();
        fila52.imprime();
        fila42.enfileira((java.lang.Object) fila52);
        fila33.enfileira((java.lang.Object) fila42);
        fila7.enfileira((java.lang.Object) fila42);
        fila0.enfileira((java.lang.Object) fila42);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0f + "'", obj46, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0f + "'", obj58, 100.0f);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        java.lang.Object obj10 = fila5.desenfileira();
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.imprime();
        fila5.enfileira((java.lang.Object) fila13);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        fila21.imprime();
        boolean boolean29 = fila21.vazia();
        fila21.imprime();
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 10);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 100.0f);
        fila36.imprime();
        fila36.imprime();
        boolean boolean41 = fila36.vazia();
        boolean boolean42 = fila36.vazia();
        fila36.imprime();
        fila36.imprime();
        fila33.enfileira((java.lang.Object) fila36);
        fila31.enfileira((java.lang.Object) fila36);
        fila36.imprime();
        fila21.enfileira((java.lang.Object) fila36);
        java.lang.Object obj49 = fila21.desenfileira();
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 100.0f);
        fila50.imprime();
        java.lang.Object obj54 = fila50.desenfileira();
        fila50.enfileira((java.lang.Object) 1L);
        java.lang.Object obj57 = fila50.desenfileira();
        fila50.imprime();
        ds.Fila fila59 = new ds.Fila();
        fila59.imprime();
        java.lang.Class<?> wildcardClass61 = fila59.getClass();
        fila50.enfileira((java.lang.Object) fila59);
        fila21.enfileira((java.lang.Object) fila59);
        fila0.enfileira((java.lang.Object) fila21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0f + "'", obj49, 100.0f);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 100.0f + "'", obj54, 100.0f);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 1L + "'", obj57, 1L);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = null;
        fila10.enfileira(obj18);
        java.lang.Object obj20 = null;
        fila10.enfileira(obj20);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100.0f);
        fila22.imprime();
        java.lang.Object obj26 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj29 = fila22.desenfileira();
        fila22.imprime();
        boolean boolean31 = fila22.vazia();
        fila10.enfileira((java.lang.Object) boolean31);
        java.lang.Class<?> wildcardClass33 = fila10.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0f) + "'", obj29, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 100.0f);
        fila6.imprime();
        java.lang.Object obj10 = fila6.desenfileira();
        fila6.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = fila6.desenfileira();
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        fila16.imprime();
        java.lang.Object obj20 = null;
        fila16.enfileira(obj20);
        java.lang.Object obj22 = fila16.desenfileira();
        boolean boolean23 = fila16.vazia();
        java.lang.Object obj24 = fila16.desenfileira();
        fila16.imprime();
        fila6.enfileira((java.lang.Object) fila16);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100.0f);
        fila27.imprime();
        java.lang.Object obj31 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) (-1.0f));
        fila27.imprime();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 10);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 100.0f);
        fila38.imprime();
        fila38.imprime();
        boolean boolean43 = fila38.vazia();
        boolean boolean44 = fila38.vazia();
        fila38.imprime();
        fila38.imprime();
        fila35.enfileira((java.lang.Object) fila38);
        boolean boolean48 = fila38.vazia();
        java.lang.Object obj49 = fila38.desenfileira();
        fila38.enfileira((java.lang.Object) "");
        boolean boolean52 = fila38.vazia();
        fila27.enfileira((java.lang.Object) fila38);
        fila27.imprime();
        fila16.enfileira((java.lang.Object) fila27);
        fila0.enfileira((java.lang.Object) fila27);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0f + "'", obj49, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100.0f);
        fila3.imprime();
        fila3.imprime();
        boolean boolean8 = fila3.vazia();
        boolean boolean9 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean13 = fila3.vazia();
        java.lang.Object obj14 = fila3.desenfileira();
        fila3.enfileira((java.lang.Object) "");
        java.lang.Class<?> wildcardClass17 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila8.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        fila17.imprime();
        fila17.imprime();
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        boolean boolean25 = fila17.vazia();
        fila17.imprime();
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 10);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        fila32.imprime();
        boolean boolean37 = fila32.vazia();
        boolean boolean38 = fila32.vazia();
        fila32.imprime();
        fila32.imprime();
        fila29.enfileira((java.lang.Object) fila32);
        fila27.enfileira((java.lang.Object) fila32);
        fila32.imprime();
        fila17.enfileira((java.lang.Object) fila32);
        fila8.enfileira((java.lang.Object) fila17);
        java.lang.Object obj46 = fila17.desenfileira();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0f + "'", obj46, 100.0f);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 10);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        fila11.imprime();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila8.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila11.vazia();
        java.lang.Object obj22 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) "");
        boolean boolean25 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        java.lang.Class<?> wildcardClass28 = fila11.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        boolean boolean8 = fila5.vazia();
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.imprime();
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.imprime();
        boolean boolean14 = fila5.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = null;
        fila15.enfileira(obj19);
        java.lang.Object obj21 = fila15.desenfileira();
        java.lang.Object obj22 = fila15.desenfileira();
        fila15.imprime();
        fila5.enfileira((java.lang.Object) fila15);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        boolean boolean27 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 0L);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 100.0f);
        fila4.imprime();
        fila4.imprime();
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 100.0f);
        boolean boolean17 = fila14.vazia();
        java.lang.Object obj18 = fila14.desenfileira();
        fila14.imprime();
        fila4.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = fila14.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        boolean boolean26 = fila23.vazia();
        java.lang.Object obj27 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        boolean boolean33 = fila0.vazia();
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        boolean boolean36 = fila34.vazia();
        fila34.imprime();
        boolean boolean38 = fila34.vazia();
        ds.Fila fila39 = new ds.Fila();
        boolean boolean40 = fila39.vazia();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 10);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 100.0f);
        fila44.imprime();
        fila44.imprime();
        boolean boolean49 = fila44.vazia();
        boolean boolean50 = fila44.vazia();
        fila44.imprime();
        fila44.imprime();
        fila41.enfileira((java.lang.Object) fila44);
        fila39.enfileira((java.lang.Object) fila44);
        fila34.enfileira((java.lang.Object) fila44);
        java.lang.Class<?> wildcardClass56 = fila44.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass56);
        java.lang.Object obj58 = fila0.desenfileira();
        boolean boolean59 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj13 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 10);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        fila11.imprime();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila8.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila11.vazia();
        java.lang.Object obj22 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) "");
        boolean boolean25 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj27 = fila11.desenfileira();
        boolean boolean28 = fila11.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = fila11.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        boolean boolean12 = fila9.vazia();
        java.lang.Object obj13 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        boolean boolean16 = fila9.vazia();
        fila9.imprime();
        boolean boolean18 = fila9.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        fila19.imprime();
        java.lang.Object obj23 = null;
        fila19.enfileira(obj23);
        java.lang.Object obj25 = fila19.desenfileira();
        java.lang.Object obj26 = fila19.desenfileira();
        fila19.imprime();
        fila9.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj30 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 1.0d);
        boolean boolean39 = fila32.vazia();
        fila0.enfileira((java.lang.Object) fila32);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 100.0f);
        fila41.imprime();
        java.lang.Object obj45 = fila41.desenfileira();
        fila41.enfileira((java.lang.Object) 1L);
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) 100.0f);
        fila48.imprime();
        fila48.imprime();
        boolean boolean53 = fila48.vazia();
        boolean boolean54 = fila48.vazia();
        fila48.imprime();
        fila48.imprime();
        java.lang.Object obj57 = fila48.desenfileira();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) 100.0f);
        boolean boolean61 = fila58.vazia();
        java.lang.Object obj62 = fila58.desenfileira();
        fila58.imprime();
        fila48.enfileira((java.lang.Object) fila58);
        fila41.enfileira((java.lang.Object) fila48);
        fila41.imprime();
        ds.Fila fila67 = new ds.Fila();
        fila67.enfileira((java.lang.Object) 10);
        ds.Fila fila70 = new ds.Fila();
        fila70.enfileira((java.lang.Object) 100.0f);
        fila70.imprime();
        fila70.imprime();
        boolean boolean75 = fila70.vazia();
        boolean boolean76 = fila70.vazia();
        fila70.imprime();
        fila70.imprime();
        fila67.enfileira((java.lang.Object) fila70);
        boolean boolean80 = fila70.vazia();
        java.lang.Object obj81 = fila70.desenfileira();
        fila70.enfileira((java.lang.Object) "");
        boolean boolean84 = fila70.vazia();
        fila41.enfileira((java.lang.Object) fila70);
        fila32.enfileira((java.lang.Object) fila41);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0d + "'", obj30, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 100.0f + "'", obj45, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0f + "'", obj57, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 100.0f + "'", obj62, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + 100.0f + "'", obj81, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        boolean boolean12 = fila9.vazia();
        java.lang.Object obj13 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        boolean boolean16 = fila9.vazia();
        fila9.imprime();
        boolean boolean18 = fila9.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        fila19.imprime();
        java.lang.Object obj23 = null;
        fila19.enfileira(obj23);
        java.lang.Object obj25 = fila19.desenfileira();
        java.lang.Object obj26 = fila19.desenfileira();
        fila19.imprime();
        fila9.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj30 = fila0.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 10);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 100.0f);
        fila34.imprime();
        fila34.imprime();
        boolean boolean39 = fila34.vazia();
        boolean boolean40 = fila34.vazia();
        fila34.imprime();
        fila34.imprime();
        fila31.enfileira((java.lang.Object) fila34);
        boolean boolean44 = fila34.vazia();
        java.lang.Object obj45 = fila34.desenfileira();
        fila0.enfileira(obj45);
        boolean boolean47 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0d + "'", obj30, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 100.0f + "'", obj45, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        fila15.imprime();
        boolean boolean20 = fila15.vazia();
        boolean boolean21 = fila15.vazia();
        fila15.imprime();
        fila15.imprime();
        fila12.enfileira((java.lang.Object) fila15);
        fila10.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila0.enfileira((java.lang.Object) fila15);
        boolean boolean28 = fila15.vazia();
        fila15.imprime();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 100.0f);
        fila30.imprime();
        fila30.imprime();
        boolean boolean35 = fila30.vazia();
        boolean boolean36 = fila30.vazia();
        fila30.imprime();
        fila30.imprime();
        java.lang.Object obj39 = fila30.desenfileira();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 100.0f);
        boolean boolean43 = fila40.vazia();
        java.lang.Object obj44 = fila40.desenfileira();
        fila40.imprime();
        fila30.enfileira((java.lang.Object) fila40);
        ds.Fila fila47 = new ds.Fila();
        fila47.imprime();
        boolean boolean49 = fila47.vazia();
        fila47.imprime();
        boolean boolean51 = fila47.vazia();
        fila40.enfileira((java.lang.Object) fila47);
        boolean boolean53 = fila40.vazia();
        java.lang.Object obj54 = fila40.desenfileira();
        fila15.enfileira((java.lang.Object) fila40);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0f + "'", obj39, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0f + "'", obj44, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = null;
        fila10.enfileira(obj18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 100.0f);
        fila20.imprime();
        fila20.imprime();
        boolean boolean25 = fila20.vazia();
        boolean boolean26 = fila20.vazia();
        fila20.imprime();
        boolean boolean28 = fila20.vazia();
        fila20.imprime();
        java.lang.Object obj30 = fila20.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila31.imprime();
        fila31.imprime();
        java.lang.Object obj36 = fila31.desenfileira();
        fila31.imprime();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 100.0f);
        boolean boolean41 = fila38.vazia();
        java.lang.Object obj42 = fila38.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 100.0f);
        fila43.imprime();
        fila43.imprime();
        java.lang.Object obj48 = fila43.desenfileira();
        fila43.imprime();
        boolean boolean50 = fila43.vazia();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 100.0f);
        fila51.imprime();
        fila51.imprime();
        fila43.enfileira((java.lang.Object) fila51);
        fila38.enfileira((java.lang.Object) fila43);
        fila31.enfileira((java.lang.Object) fila38);
        fila20.enfileira((java.lang.Object) fila38);
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) 100.0f);
        fila60.imprime();
        java.lang.Object obj64 = fila60.desenfileira();
        fila60.enfileira((java.lang.Object) 1L);
        java.lang.Object obj67 = fila60.desenfileira();
        fila60.imprime();
        ds.Fila fila69 = new ds.Fila();
        fila69.imprime();
        java.lang.Class<?> wildcardClass71 = fila69.getClass();
        fila60.enfileira((java.lang.Object) fila69);
        java.lang.Object obj73 = fila60.desenfileira();
        boolean boolean74 = fila60.vazia();
        ds.Fila fila75 = new ds.Fila();
        fila75.enfileira((java.lang.Object) 100.0f);
        fila75.imprime();
        java.lang.Object obj79 = fila75.desenfileira();
        fila75.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj82 = fila75.desenfileira();
        fila75.imprime();
        java.lang.Class<?> wildcardClass84 = fila75.getClass();
        fila60.enfileira((java.lang.Object) fila75);
        fila60.imprime();
        fila20.enfileira((java.lang.Object) fila60);
        fila10.enfileira((java.lang.Object) fila20);
        java.lang.Object obj89 = fila10.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0f + "'", obj30, 100.0f);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0f + "'", obj48, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0f + "'", obj64, 100.0f);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 1L + "'", obj67, 1L);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 100.0f + "'", obj79, 100.0f);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + (-1.0f) + "'", obj82, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNull(obj89);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        java.lang.Object obj15 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) 1L);
        java.lang.Object obj18 = fila11.desenfileira();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj20 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100.0f);
        boolean boolean25 = fila22.vazia();
        java.lang.Object obj26 = fila22.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100.0f);
        fila27.imprime();
        fila27.imprime();
        java.lang.Object obj32 = fila27.desenfileira();
        fila27.imprime();
        boolean boolean34 = fila27.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 100.0f);
        fila35.imprime();
        fila35.imprime();
        fila27.enfileira((java.lang.Object) fila35);
        fila22.enfileira((java.lang.Object) fila27);
        fila22.imprime();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 100.0f);
        fila43.imprime();
        java.lang.Object obj47 = fila43.desenfileira();
        fila43.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj50 = fila43.desenfileira();
        fila43.imprime();
        boolean boolean52 = fila43.vazia();
        fila43.imprime();
        fila43.imprime();
        fila22.enfileira((java.lang.Object) fila43);
        java.lang.Object obj56 = fila22.desenfileira();
        fila0.enfileira(obj56);
        boolean boolean58 = fila0.vazia();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) 100.0f);
        fila59.imprime();
        java.lang.Object obj63 = fila59.desenfileira();
        fila59.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass66 = fila59.getClass();
        fila0.enfileira((java.lang.Object) fila59);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1L + "'", obj18, 1L);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0f + "'", obj47, 100.0f);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1.0f) + "'", obj50, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0f + "'", obj63, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        boolean boolean6 = fila4.vazia();
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 10);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 100.0f);
        fila14.imprime();
        fila14.imprime();
        boolean boolean19 = fila14.vazia();
        boolean boolean20 = fila14.vazia();
        fila14.imprime();
        fila14.imprime();
        fila11.enfileira((java.lang.Object) fila14);
        fila9.enfileira((java.lang.Object) fila14);
        fila4.enfileira((java.lang.Object) fila14);
        java.lang.Object obj26 = fila14.desenfileira();
        fila14.imprime();
        java.lang.Class<?> wildcardClass28 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila9.imprime();
        java.lang.Object obj13 = fila9.desenfileira();
        fila9.enfileira((java.lang.Object) 1L);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        fila16.imprime();
        fila16.imprime();
        boolean boolean21 = fila16.vazia();
        boolean boolean22 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        java.lang.Object obj25 = fila16.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 100.0f);
        boolean boolean29 = fila26.vazia();
        java.lang.Object obj30 = fila26.desenfileira();
        fila26.imprime();
        fila16.enfileira((java.lang.Object) fila26);
        fila9.enfileira((java.lang.Object) fila16);
        java.lang.Object obj34 = fila9.desenfileira();
        fila0.enfileira(obj34);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0f + "'", obj30, 100.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 1L + "'", obj34, 1L);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        boolean boolean19 = fila17.vazia();
        fila17.imprime();
        boolean boolean21 = fila17.vazia();
        fila10.enfileira((java.lang.Object) fila17);
        boolean boolean23 = fila10.vazia();
        java.lang.Object obj24 = fila10.desenfileira();
        boolean boolean25 = fila10.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        java.lang.Object obj12 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100.0f);
        fila3.imprime();
        fila3.imprime();
        boolean boolean8 = fila3.vazia();
        boolean boolean9 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean13 = fila3.vazia();
        java.lang.Object obj14 = fila3.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = fila3.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj17 = fila0.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 100.0f);
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 1.0f);
        fila18.enfileira((java.lang.Object) 100.0f);
        fila18.imprime();
        fila18.imprime();
        fila0.enfileira((java.lang.Object) fila18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = null;
        fila10.enfileira(obj18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 100.0f);
        fila20.imprime();
        fila20.imprime();
        boolean boolean25 = fila20.vazia();
        boolean boolean26 = fila20.vazia();
        fila20.imprime();
        boolean boolean28 = fila20.vazia();
        fila20.imprime();
        java.lang.Object obj30 = fila20.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila31.imprime();
        fila31.imprime();
        java.lang.Object obj36 = fila31.desenfileira();
        fila31.imprime();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 100.0f);
        boolean boolean41 = fila38.vazia();
        java.lang.Object obj42 = fila38.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 100.0f);
        fila43.imprime();
        fila43.imprime();
        java.lang.Object obj48 = fila43.desenfileira();
        fila43.imprime();
        boolean boolean50 = fila43.vazia();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 100.0f);
        fila51.imprime();
        fila51.imprime();
        fila43.enfileira((java.lang.Object) fila51);
        fila38.enfileira((java.lang.Object) fila43);
        fila31.enfileira((java.lang.Object) fila38);
        fila20.enfileira((java.lang.Object) fila38);
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) 100.0f);
        fila60.imprime();
        java.lang.Object obj64 = fila60.desenfileira();
        fila60.enfileira((java.lang.Object) 1L);
        java.lang.Object obj67 = fila60.desenfileira();
        fila60.imprime();
        ds.Fila fila69 = new ds.Fila();
        fila69.imprime();
        java.lang.Class<?> wildcardClass71 = fila69.getClass();
        fila60.enfileira((java.lang.Object) fila69);
        java.lang.Object obj73 = fila60.desenfileira();
        boolean boolean74 = fila60.vazia();
        ds.Fila fila75 = new ds.Fila();
        fila75.enfileira((java.lang.Object) 100.0f);
        fila75.imprime();
        java.lang.Object obj79 = fila75.desenfileira();
        fila75.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj82 = fila75.desenfileira();
        fila75.imprime();
        java.lang.Class<?> wildcardClass84 = fila75.getClass();
        fila60.enfileira((java.lang.Object) fila75);
        fila60.imprime();
        fila20.enfileira((java.lang.Object) fila60);
        fila10.enfileira((java.lang.Object) fila20);
        // The following exception was thrown during execution in test generation
        try {
            fila10.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0f + "'", obj30, 100.0f);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0f + "'", obj48, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0f + "'", obj64, 100.0f);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 1L + "'", obj67, 1L);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 100.0f + "'", obj79, 100.0f);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + (-1.0f) + "'", obj82, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.imprime();
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj16 = fila0.desenfileira();
        java.lang.Object obj17 = null;
        fila0.enfileira(obj17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = fila15.desenfileira();
        fila15.imprime();
        java.lang.Class<?> wildcardClass24 = fila15.getClass();
        fila0.enfileira((java.lang.Object) fila15);
        boolean boolean26 = fila0.vazia();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100.0f);
        fila27.imprime();
        fila27.imprime();
        boolean boolean32 = fila27.vazia();
        boolean boolean33 = fila27.vazia();
        fila27.imprime();
        fila27.imprime();
        java.lang.Object obj36 = fila27.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 100.0f);
        boolean boolean40 = fila37.vazia();
        java.lang.Object obj41 = fila37.desenfileira();
        fila37.imprime();
        fila27.enfileira((java.lang.Object) fila37);
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        boolean boolean46 = fila44.vazia();
        fila44.imprime();
        boolean boolean48 = fila44.vazia();
        fila37.enfileira((java.lang.Object) fila44);
        fila44.imprime();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 100.0f);
        fila51.imprime();
        fila51.imprime();
        java.lang.Object obj56 = fila51.desenfileira();
        fila51.imprime();
        boolean boolean58 = fila51.vazia();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) 100.0f);
        fila59.imprime();
        fila59.imprime();
        fila51.enfileira((java.lang.Object) fila59);
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        fila59.enfileira(obj65);
        boolean boolean68 = fila59.vazia();
        java.lang.Object obj69 = fila59.desenfileira();
        java.lang.Object obj70 = fila59.desenfileira();
        java.lang.Class<?> wildcardClass71 = fila59.getClass();
        fila44.enfileira((java.lang.Object) fila59);
        fila0.enfileira((java.lang.Object) fila44);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0f) + "'", obj22, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0f + "'", obj41, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100.0f + "'", obj56, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 100.0f + "'", obj69, 100.0f);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj12 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass22 = fila15.getClass();
        fila7.enfileira((java.lang.Object) fila15);
        java.lang.Class<?> wildcardClass24 = fila7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass24);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 100.0f);
        fila26.imprime();
        fila26.imprime();
        fila26.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj33 = fila26.desenfileira();
        boolean boolean34 = fila26.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 100.0f);
        boolean boolean38 = fila35.vazia();
        java.lang.Object obj39 = fila35.desenfileira();
        fila35.imprime();
        fila35.imprime();
        boolean boolean42 = fila35.vazia();
        fila35.imprime();
        boolean boolean44 = fila35.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) 100.0f);
        fila45.imprime();
        java.lang.Object obj49 = null;
        fila45.enfileira(obj49);
        java.lang.Object obj51 = fila45.desenfileira();
        java.lang.Object obj52 = fila45.desenfileira();
        fila45.imprime();
        fila35.enfileira((java.lang.Object) fila45);
        fila26.enfileira((java.lang.Object) fila35);
        fila0.enfileira((java.lang.Object) fila35);
        java.lang.Object obj57 = null;
        fila35.enfileira(obj57);
        java.lang.Class<?> wildcardClass59 = fila35.getClass();
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0f + "'", obj33, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0f + "'", obj39, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0f + "'", obj51, 100.0f);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100.0f);
        fila3.imprime();
        fila3.imprime();
        boolean boolean8 = fila3.vazia();
        boolean boolean9 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean13 = fila3.vazia();
        java.lang.Object obj14 = fila3.desenfileira();
        boolean boolean15 = fila3.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 10);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 100.0f);
        fila14.imprime();
        fila14.imprime();
        boolean boolean19 = fila14.vazia();
        boolean boolean20 = fila14.vazia();
        fila14.imprime();
        fila14.imprime();
        fila11.enfileira((java.lang.Object) fila14);
        boolean boolean24 = fila14.vazia();
        java.lang.Object obj25 = fila14.desenfileira();
        fila0.enfileira(obj25);
        java.lang.Class<?> wildcardClass27 = obj25.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        fila15.imprime();
        boolean boolean20 = fila15.vazia();
        boolean boolean21 = fila15.vazia();
        fila15.imprime();
        fila15.imprime();
        fila12.enfileira((java.lang.Object) fila15);
        fila10.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila0.enfileira((java.lang.Object) fila15);
        boolean boolean28 = fila15.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        boolean boolean32 = fila29.vazia();
        java.lang.Object obj33 = fila29.desenfileira();
        fila29.imprime();
        fila29.imprime();
        boolean boolean36 = fila29.vazia();
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila29.enfileira((java.lang.Object) fila37);
        java.lang.Object obj40 = fila29.desenfileira();
        fila15.enfileira((java.lang.Object) fila29);
        fila15.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0f + "'", obj33, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        boolean boolean12 = fila9.vazia();
        java.lang.Object obj13 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        boolean boolean16 = fila9.vazia();
        fila9.imprime();
        boolean boolean18 = fila9.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        fila19.imprime();
        java.lang.Object obj23 = null;
        fila19.enfileira(obj23);
        java.lang.Object obj25 = fila19.desenfileira();
        java.lang.Object obj26 = fila19.desenfileira();
        fila19.imprime();
        fila9.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila9);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 1.0f);
        fila13.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 100.0f);
        fila20.imprime();
        fila20.imprime();
        java.lang.Object obj25 = fila20.desenfileira();
        fila20.imprime();
        fila20.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila28.imprime();
        java.lang.Object obj32 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass35 = fila28.getClass();
        fila20.enfileira((java.lang.Object) fila28);
        java.lang.Class<?> wildcardClass37 = fila20.getClass();
        fila13.enfileira((java.lang.Object) wildcardClass37);
        fila13.imprime();
        java.lang.Object obj40 = fila13.desenfileira();
        fila0.enfileira(obj40);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 100.0f);
        fila42.imprime();
        fila42.imprime();
        fila42.enfileira((java.lang.Object) 1.0d);
        boolean boolean49 = fila42.vazia();
        fila0.enfileira((java.lang.Object) fila42);
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 100.0f);
        fila51.imprime();
        fila51.enfileira((java.lang.Object) 1.0f);
        fila51.imprime();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) 100.0f);
        fila58.imprime();
        fila58.imprime();
        java.lang.Object obj63 = fila58.desenfileira();
        fila58.imprime();
        fila58.imprime();
        ds.Fila fila66 = new ds.Fila();
        fila66.enfileira((java.lang.Object) 100.0f);
        fila66.imprime();
        java.lang.Object obj70 = fila66.desenfileira();
        fila66.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass73 = fila66.getClass();
        fila58.enfileira((java.lang.Object) fila66);
        java.lang.Class<?> wildcardClass75 = fila58.getClass();
        fila51.enfileira((java.lang.Object) wildcardClass75);
        fila51.imprime();
        java.lang.Object obj78 = fila51.desenfileira();
        java.lang.Class<?> wildcardClass79 = fila51.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass79);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0f + "'", obj63, 100.0f);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 100.0f + "'", obj70, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 100.0f + "'", obj78, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        java.lang.Object obj15 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) 1L);
        java.lang.Object obj18 = fila11.desenfileira();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj20 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100.0f);
        boolean boolean25 = fila22.vazia();
        java.lang.Object obj26 = fila22.desenfileira();
        fila22.imprime();
        fila22.imprime();
        boolean boolean29 = fila22.vazia();
        fila22.imprime();
        boolean boolean31 = fila22.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        java.lang.Object obj36 = null;
        fila32.enfileira(obj36);
        java.lang.Object obj38 = fila32.desenfileira();
        java.lang.Object obj39 = fila32.desenfileira();
        fila32.imprime();
        fila22.enfileira((java.lang.Object) fila32);
        boolean boolean42 = fila22.vazia();
        java.lang.Object obj43 = fila22.desenfileira();
        fila0.enfileira((java.lang.Object) fila22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1L + "'", obj18, 1L);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        boolean boolean26 = fila23.vazia();
        java.lang.Object obj27 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        boolean boolean33 = fila0.vazia();
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        boolean boolean36 = fila34.vazia();
        fila34.imprime();
        boolean boolean38 = fila34.vazia();
        ds.Fila fila39 = new ds.Fila();
        boolean boolean40 = fila39.vazia();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 10);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 100.0f);
        fila44.imprime();
        fila44.imprime();
        boolean boolean49 = fila44.vazia();
        boolean boolean50 = fila44.vazia();
        fila44.imprime();
        fila44.imprime();
        fila41.enfileira((java.lang.Object) fila44);
        fila39.enfileira((java.lang.Object) fila44);
        fila34.enfileira((java.lang.Object) fila44);
        java.lang.Class<?> wildcardClass56 = fila44.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass56);
        java.lang.Object obj58 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass59 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        boolean boolean8 = fila5.vazia();
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.imprime();
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.imprime();
        boolean boolean14 = fila5.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = null;
        fila15.enfileira(obj19);
        java.lang.Object obj21 = fila15.desenfileira();
        java.lang.Object obj22 = fila15.desenfileira();
        fila15.imprime();
        fila5.enfileira((java.lang.Object) fila15);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        java.lang.Object obj27 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 1.0f);
        fila13.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 100.0f);
        fila20.imprime();
        fila20.imprime();
        java.lang.Object obj25 = fila20.desenfileira();
        fila20.imprime();
        fila20.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila28.imprime();
        java.lang.Object obj32 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass35 = fila28.getClass();
        fila20.enfileira((java.lang.Object) fila28);
        java.lang.Class<?> wildcardClass37 = fila20.getClass();
        fila13.enfileira((java.lang.Object) wildcardClass37);
        fila13.imprime();
        java.lang.Object obj40 = fila13.desenfileira();
        fila0.enfileira(obj40);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 100.0f);
        fila42.imprime();
        fila42.imprime();
        fila42.enfileira((java.lang.Object) 1.0d);
        boolean boolean49 = fila42.vazia();
        fila0.enfileira((java.lang.Object) fila42);
        boolean boolean51 = fila42.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        java.lang.Object obj15 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) 1L);
        java.lang.Object obj18 = fila11.desenfileira();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj20 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100.0f);
        boolean boolean25 = fila22.vazia();
        java.lang.Object obj26 = fila22.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100.0f);
        fila27.imprime();
        fila27.imprime();
        java.lang.Object obj32 = fila27.desenfileira();
        fila27.imprime();
        boolean boolean34 = fila27.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 100.0f);
        fila35.imprime();
        fila35.imprime();
        fila27.enfileira((java.lang.Object) fila35);
        fila22.enfileira((java.lang.Object) fila27);
        fila22.imprime();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 100.0f);
        fila43.imprime();
        java.lang.Object obj47 = fila43.desenfileira();
        fila43.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj50 = fila43.desenfileira();
        fila43.imprime();
        boolean boolean52 = fila43.vazia();
        fila43.imprime();
        fila43.imprime();
        fila22.enfileira((java.lang.Object) fila43);
        java.lang.Object obj56 = fila22.desenfileira();
        fila0.enfileira(obj56);
        boolean boolean58 = fila0.vazia();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) 100.0f);
        boolean boolean62 = fila59.vazia();
        java.lang.Object obj63 = fila59.desenfileira();
        fila59.imprime();
        fila59.imprime();
        boolean boolean66 = fila59.vazia();
        fila59.imprime();
        boolean boolean68 = fila59.vazia();
        ds.Fila fila69 = new ds.Fila();
        fila69.enfileira((java.lang.Object) 100.0f);
        fila69.imprime();
        java.lang.Object obj73 = null;
        fila69.enfileira(obj73);
        java.lang.Object obj75 = fila69.desenfileira();
        java.lang.Object obj76 = fila69.desenfileira();
        fila69.imprime();
        fila59.enfileira((java.lang.Object) fila69);
        boolean boolean79 = fila59.vazia();
        fila0.enfileira((java.lang.Object) fila59);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1L + "'", obj18, 1L);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0f + "'", obj47, 100.0f);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1.0f) + "'", obj50, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0f + "'", obj63, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + 100.0f + "'", obj75, 100.0f);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 1.0f);
        fila13.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 100.0f);
        fila20.imprime();
        fila20.imprime();
        java.lang.Object obj25 = fila20.desenfileira();
        fila20.imprime();
        fila20.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila28.imprime();
        java.lang.Object obj32 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass35 = fila28.getClass();
        fila20.enfileira((java.lang.Object) fila28);
        java.lang.Class<?> wildcardClass37 = fila20.getClass();
        fila13.enfileira((java.lang.Object) wildcardClass37);
        fila13.imprime();
        java.lang.Object obj40 = fila13.desenfileira();
        fila0.enfileira(obj40);
        fila0.imprime();
        java.lang.Class<?> wildcardClass43 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 10);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        boolean boolean19 = fila13.vazia();
        fila13.imprime();
        fila13.imprime();
        fila10.enfileira((java.lang.Object) fila13);
        fila8.enfileira((java.lang.Object) fila13);
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        boolean boolean26 = fila24.vazia();
        fila24.imprime();
        boolean boolean28 = fila24.vazia();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 10);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 100.0f);
        fila34.imprime();
        fila34.imprime();
        boolean boolean39 = fila34.vazia();
        boolean boolean40 = fila34.vazia();
        fila34.imprime();
        fila34.imprime();
        fila31.enfileira((java.lang.Object) fila34);
        fila29.enfileira((java.lang.Object) fila34);
        fila24.enfileira((java.lang.Object) fila34);
        java.lang.Object obj46 = fila24.desenfileira();
        fila24.imprime();
        fila8.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj50 = fila8.desenfileira();
        ds.Fila fila51 = new ds.Fila();
        fila51.imprime();
        boolean boolean53 = fila51.vazia();
        fila51.imprime();
        boolean boolean55 = fila51.vazia();
        ds.Fila fila56 = new ds.Fila();
        boolean boolean57 = fila56.vazia();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) 10);
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) 100.0f);
        fila61.imprime();
        fila61.imprime();
        boolean boolean66 = fila61.vazia();
        boolean boolean67 = fila61.vazia();
        fila61.imprime();
        fila61.imprime();
        fila58.enfileira((java.lang.Object) fila61);
        fila56.enfileira((java.lang.Object) fila61);
        fila51.enfileira((java.lang.Object) fila61);
        java.lang.Object obj73 = fila51.desenfileira();
        ds.Fila fila74 = new ds.Fila();
        fila74.enfileira((java.lang.Object) 100.0f);
        boolean boolean77 = fila74.vazia();
        java.lang.Object obj78 = fila74.desenfileira();
        fila74.imprime();
        fila74.imprime();
        boolean boolean81 = fila74.vazia();
        fila74.imprime();
        fila51.enfileira((java.lang.Object) fila74);
        ds.Fila fila84 = new ds.Fila();
        fila84.enfileira((java.lang.Object) 100.0f);
        fila84.imprime();
        fila84.imprime();
        java.lang.Object obj89 = fila84.desenfileira();
        fila84.imprime();
        boolean boolean91 = fila84.vazia();
        ds.Fila fila92 = new ds.Fila();
        fila92.enfileira((java.lang.Object) 100.0f);
        fila92.imprime();
        fila92.imprime();
        fila84.enfileira((java.lang.Object) fila92);
        fila74.enfileira((java.lang.Object) fila84);
        fila8.enfileira((java.lang.Object) fila74);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 100.0f + "'", obj78, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + 100.0f + "'", obj89, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        fila10.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj17 = fila10.desenfileira();
        boolean boolean18 = fila10.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        boolean boolean22 = fila19.vazia();
        java.lang.Object obj23 = fila19.desenfileira();
        fila19.imprime();
        fila19.imprime();
        boolean boolean26 = fila19.vazia();
        fila19.imprime();
        boolean boolean28 = fila19.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        java.lang.Object obj33 = null;
        fila29.enfileira(obj33);
        java.lang.Object obj35 = fila29.desenfileira();
        java.lang.Object obj36 = fila29.desenfileira();
        fila29.imprime();
        fila19.enfileira((java.lang.Object) fila29);
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 100.0f);
        fila41.imprime();
        fila41.imprime();
        boolean boolean46 = fila41.vazia();
        boolean boolean47 = fila41.vazia();
        fila41.imprime();
        fila41.imprime();
        java.lang.Object obj50 = fila41.desenfileira();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 100.0f);
        boolean boolean54 = fila51.vazia();
        java.lang.Object obj55 = fila51.desenfileira();
        fila51.imprime();
        fila41.enfileira((java.lang.Object) fila51);
        boolean boolean58 = fila51.vazia();
        java.lang.Object obj59 = null;
        fila51.enfileira(obj59);
        java.lang.Object obj61 = fila51.desenfileira();
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) 100.0f);
        fila62.imprime();
        java.lang.Object obj66 = fila62.desenfileira();
        fila62.enfileira((java.lang.Object) 1L);
        java.lang.Object obj69 = fila62.desenfileira();
        fila62.imprime();
        ds.Fila fila71 = new ds.Fila();
        fila71.imprime();
        java.lang.Class<?> wildcardClass73 = fila71.getClass();
        fila62.enfileira((java.lang.Object) fila71);
        java.lang.Object obj75 = fila62.desenfileira();
        boolean boolean76 = fila62.vazia();
        ds.Fila fila77 = new ds.Fila();
        fila77.enfileira((java.lang.Object) 100.0f);
        fila77.imprime();
        java.lang.Object obj81 = fila77.desenfileira();
        fila77.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj84 = fila77.desenfileira();
        fila77.imprime();
        java.lang.Class<?> wildcardClass86 = fila77.getClass();
        fila62.enfileira((java.lang.Object) fila77);
        fila62.imprime();
        fila51.enfileira((java.lang.Object) fila62);
        boolean boolean90 = fila51.vazia();
        fila0.enfileira((java.lang.Object) fila51);
        boolean boolean92 = fila51.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0f + "'", obj50, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0f + "'", obj55, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 100.0f + "'", obj66, 100.0f);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 1L + "'", obj69, 1L);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + 100.0f + "'", obj81, 100.0f);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + (-1.0f) + "'", obj84, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean22 = fila0.vazia();
        boolean boolean23 = fila0.vazia();
        boolean boolean24 = fila0.vazia();
        boolean boolean25 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila8.imprime();
        java.lang.Object obj17 = fila8.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 100.0f);
        boolean boolean21 = fila18.vazia();
        java.lang.Object obj22 = fila18.desenfileira();
        fila18.imprime();
        fila8.enfileira((java.lang.Object) fila18);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        boolean boolean27 = fila25.vazia();
        fila25.imprime();
        boolean boolean29 = fila25.vazia();
        fila18.enfileira((java.lang.Object) fila25);
        fila25.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        fila32.imprime();
        java.lang.Object obj37 = fila32.desenfileira();
        fila32.imprime();
        boolean boolean39 = fila32.vazia();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 100.0f);
        fila40.imprime();
        fila40.imprime();
        fila32.enfileira((java.lang.Object) fila40);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        fila40.enfileira(obj46);
        boolean boolean49 = fila40.vazia();
        java.lang.Object obj50 = fila40.desenfileira();
        java.lang.Object obj51 = fila40.desenfileira();
        java.lang.Class<?> wildcardClass52 = fila40.getClass();
        fila25.enfileira((java.lang.Object) fila40);
        fila0.enfileira((java.lang.Object) fila40);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) 100.0f);
        fila55.imprime();
        java.lang.Object obj59 = fila55.desenfileira();
        fila55.enfileira((java.lang.Object) (-1.0f));
        fila55.imprime();
        ds.Fila fila63 = new ds.Fila();
        fila63.enfileira((java.lang.Object) 10);
        ds.Fila fila66 = new ds.Fila();
        fila66.enfileira((java.lang.Object) 100.0f);
        fila66.imprime();
        fila66.imprime();
        boolean boolean71 = fila66.vazia();
        boolean boolean72 = fila66.vazia();
        fila66.imprime();
        fila66.imprime();
        fila63.enfileira((java.lang.Object) fila66);
        boolean boolean76 = fila66.vazia();
        java.lang.Object obj77 = fila66.desenfileira();
        fila66.enfileira((java.lang.Object) "");
        boolean boolean80 = fila66.vazia();
        fila55.enfileira((java.lang.Object) fila66);
        java.lang.Object obj82 = fila66.desenfileira();
        boolean boolean83 = fila66.vazia();
        fila40.enfileira((java.lang.Object) fila66);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0f + "'", obj37, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0f + "'", obj50, 100.0f);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 100.0f + "'", obj59, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 100.0f + "'", obj77, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + "" + "'", obj82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj16 = fila9.desenfileira();
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 100.0f);
        boolean boolean21 = fila18.vazia();
        java.lang.Object obj22 = fila18.desenfileira();
        fila18.imprime();
        fila18.imprime();
        boolean boolean25 = fila18.vazia();
        fila18.imprime();
        boolean boolean27 = fila18.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila28.imprime();
        java.lang.Object obj32 = null;
        fila28.enfileira(obj32);
        java.lang.Object obj34 = fila28.desenfileira();
        java.lang.Object obj35 = fila28.desenfileira();
        fila28.imprime();
        fila18.enfileira((java.lang.Object) fila28);
        fila9.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = null;
        fila10.enfileira(obj18);
        java.lang.Object obj20 = null;
        fila10.enfileira(obj20);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 10);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 100.0f);
        fila25.imprime();
        fila25.imprime();
        boolean boolean30 = fila25.vazia();
        boolean boolean31 = fila25.vazia();
        fila25.imprime();
        fila25.imprime();
        fila22.enfileira((java.lang.Object) fila25);
        boolean boolean35 = fila25.vazia();
        java.lang.Object obj36 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) "");
        fila25.imprime();
        fila10.enfileira((java.lang.Object) fila25);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 10);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        fila11.imprime();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila8.enfileira((java.lang.Object) fila11);
        fila6.enfileira((java.lang.Object) fila11);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100.0f);
        boolean boolean25 = fila22.vazia();
        java.lang.Object obj26 = fila22.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100.0f);
        fila27.imprime();
        fila27.imprime();
        java.lang.Object obj32 = fila27.desenfileira();
        fila27.imprime();
        boolean boolean34 = fila27.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 100.0f);
        fila35.imprime();
        fila35.imprime();
        fila27.enfileira((java.lang.Object) fila35);
        fila22.enfileira((java.lang.Object) fila27);
        fila6.enfileira((java.lang.Object) fila22);
        java.lang.Object obj43 = fila22.desenfileira();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 100.0f);
        boolean boolean47 = fila44.vazia();
        java.lang.Object obj48 = fila44.desenfileira();
        fila44.imprime();
        fila44.imprime();
        fila22.enfileira((java.lang.Object) fila44);
        fila0.enfileira((java.lang.Object) fila22);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0f + "'", obj48, 100.0f);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100.0f);
        fila3.imprime();
        fila3.imprime();
        boolean boolean8 = fila3.vazia();
        boolean boolean9 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean13 = fila3.vazia();
        java.lang.Object obj14 = fila3.desenfileira();
        fila3.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        fila16.imprime();
        fila16.imprime();
        boolean boolean21 = fila16.vazia();
        boolean boolean22 = fila16.vazia();
        fila16.imprime();
        boolean boolean24 = fila16.vazia();
        fila16.imprime();
        java.lang.Object obj26 = fila16.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100.0f);
        fila27.imprime();
        fila27.imprime();
        java.lang.Object obj32 = fila27.desenfileira();
        fila27.imprime();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 100.0f);
        boolean boolean37 = fila34.vazia();
        java.lang.Object obj38 = fila34.desenfileira();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 100.0f);
        fila39.imprime();
        fila39.imprime();
        java.lang.Object obj44 = fila39.desenfileira();
        fila39.imprime();
        boolean boolean46 = fila39.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 100.0f);
        fila47.imprime();
        fila47.imprime();
        fila39.enfileira((java.lang.Object) fila47);
        fila34.enfileira((java.lang.Object) fila39);
        fila27.enfileira((java.lang.Object) fila34);
        fila16.enfileira((java.lang.Object) fila34);
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) 100.0f);
        fila56.imprime();
        java.lang.Object obj60 = fila56.desenfileira();
        fila56.enfileira((java.lang.Object) 1L);
        java.lang.Object obj63 = fila56.desenfileira();
        fila56.imprime();
        ds.Fila fila65 = new ds.Fila();
        fila65.imprime();
        java.lang.Class<?> wildcardClass67 = fila65.getClass();
        fila56.enfileira((java.lang.Object) fila65);
        java.lang.Object obj69 = fila56.desenfileira();
        boolean boolean70 = fila56.vazia();
        ds.Fila fila71 = new ds.Fila();
        fila71.enfileira((java.lang.Object) 100.0f);
        fila71.imprime();
        java.lang.Object obj75 = fila71.desenfileira();
        fila71.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj78 = fila71.desenfileira();
        fila71.imprime();
        java.lang.Class<?> wildcardClass80 = fila71.getClass();
        fila56.enfileira((java.lang.Object) fila71);
        fila56.imprime();
        fila16.enfileira((java.lang.Object) fila56);
        java.lang.Object obj84 = fila56.desenfileira();
        fila3.enfileira((java.lang.Object) fila56);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0f + "'", obj44, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 100.0f + "'", obj60, 100.0f);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 1L + "'", obj63, 1L);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + 100.0f + "'", obj75, 100.0f);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + (-1.0f) + "'", obj78, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(obj84);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        boolean boolean8 = fila5.vazia();
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.imprime();
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.imprime();
        boolean boolean14 = fila5.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = null;
        fila15.enfileira(obj19);
        java.lang.Object obj21 = fila15.desenfileira();
        java.lang.Object obj22 = fila15.desenfileira();
        fila15.imprime();
        fila5.enfileira((java.lang.Object) fila15);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        java.lang.Class<?> wildcardClass27 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila9.imprime();
        java.lang.Object obj13 = null;
        fila9.enfileira(obj13);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        fila9.enfileira((java.lang.Object) boolean19);
        java.lang.Class<?> wildcardClass21 = fila9.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.imprime();
        fila0.enfileira((java.lang.Object) fila26);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        java.lang.Object obj36 = fila32.desenfileira();
        fila32.enfileira((java.lang.Object) 1L);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 100.0f);
        fila39.imprime();
        fila39.imprime();
        boolean boolean44 = fila39.vazia();
        boolean boolean45 = fila39.vazia();
        fila39.imprime();
        fila39.imprime();
        java.lang.Object obj48 = fila39.desenfileira();
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 100.0f);
        boolean boolean52 = fila49.vazia();
        java.lang.Object obj53 = fila49.desenfileira();
        fila49.imprime();
        fila39.enfileira((java.lang.Object) fila49);
        fila32.enfileira((java.lang.Object) fila39);
        fila39.imprime();
        boolean boolean58 = fila39.vazia();
        java.lang.Class<?> wildcardClass59 = fila39.getClass();
        fila26.enfileira((java.lang.Object) fila39);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0f + "'", obj48, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100.0f + "'", obj53, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        fila10.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj17 = fila10.desenfileira();
        boolean boolean18 = fila10.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        boolean boolean22 = fila19.vazia();
        java.lang.Object obj23 = fila19.desenfileira();
        fila19.imprime();
        fila19.imprime();
        boolean boolean26 = fila19.vazia();
        fila19.imprime();
        boolean boolean28 = fila19.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        java.lang.Object obj33 = null;
        fila29.enfileira(obj33);
        java.lang.Object obj35 = fila29.desenfileira();
        java.lang.Object obj36 = fila29.desenfileira();
        fila29.imprime();
        fila19.enfileira((java.lang.Object) fila29);
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila10);
        fila10.imprime();
        java.lang.Object obj42 = fila10.desenfileira();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1.0d + "'", obj42, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = new java.lang.Object();
        fila0.enfileira(obj7);
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 100.0f);
        boolean boolean42 = fila39.vazia();
        java.lang.Object obj43 = fila39.desenfileira();
        fila39.imprime();
        fila39.imprime();
        boolean boolean46 = fila39.vazia();
        fila39.imprime();
        boolean boolean48 = fila39.vazia();
        java.lang.Class<?> wildcardClass49 = fila39.getClass();
        fila0.enfileira((java.lang.Object) fila39);
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 100.0f);
        fila51.imprime();
        java.lang.Object obj55 = fila51.desenfileira();
        fila51.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj58 = fila51.desenfileira();
        fila51.imprime();
        boolean boolean60 = fila51.vazia();
        fila51.imprime();
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) 100.0f);
        fila62.imprime();
        fila62.imprime();
        boolean boolean67 = fila62.vazia();
        boolean boolean68 = fila62.vazia();
        fila62.imprime();
        fila62.imprime();
        java.lang.Object obj71 = fila62.desenfileira();
        ds.Fila fila72 = new ds.Fila();
        fila72.enfileira((java.lang.Object) 100.0f);
        boolean boolean75 = fila72.vazia();
        java.lang.Object obj76 = fila72.desenfileira();
        fila72.imprime();
        fila62.enfileira((java.lang.Object) fila72);
        boolean boolean79 = fila72.vazia();
        fila51.enfileira((java.lang.Object) boolean79);
        fila0.enfileira((java.lang.Object) fila51);
        ds.Fila fila82 = new ds.Fila();
        fila82.enfileira((java.lang.Object) 100.0f);
        boolean boolean85 = fila82.vazia();
        java.lang.Object obj86 = fila82.desenfileira();
        fila82.imprime();
        fila82.imprime();
        boolean boolean89 = fila82.vazia();
        ds.Fila fila90 = new ds.Fila();
        fila90.imprime();
        fila82.enfileira((java.lang.Object) fila90);
        boolean boolean93 = fila82.vazia();
        boolean boolean94 = fila82.vazia();
        fila51.enfileira((java.lang.Object) fila82);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0f + "'", obj43, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0f + "'", obj55, 100.0f);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1.0f) + "'", obj58, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 100.0f + "'", obj71, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + 100.0f + "'", obj76, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + 100.0f + "'", obj86, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila10.desenfileira();
        boolean boolean23 = fila10.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj16 = fila7.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        boolean boolean20 = fila17.vazia();
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        fila10.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj17 = fila10.desenfileira();
        boolean boolean18 = fila10.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        boolean boolean22 = fila19.vazia();
        java.lang.Object obj23 = fila19.desenfileira();
        fila19.imprime();
        fila19.imprime();
        boolean boolean26 = fila19.vazia();
        fila19.imprime();
        boolean boolean28 = fila19.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        java.lang.Object obj33 = null;
        fila29.enfileira(obj33);
        java.lang.Object obj35 = fila29.desenfileira();
        java.lang.Object obj36 = fila29.desenfileira();
        fila29.imprime();
        fila19.enfileira((java.lang.Object) fila29);
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 100.0f);
        fila41.imprime();
        fila41.imprime();
        boolean boolean46 = fila41.vazia();
        boolean boolean47 = fila41.vazia();
        fila41.imprime();
        fila41.imprime();
        java.lang.Object obj50 = fila41.desenfileira();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 100.0f);
        boolean boolean54 = fila51.vazia();
        java.lang.Object obj55 = fila51.desenfileira();
        fila51.imprime();
        fila41.enfileira((java.lang.Object) fila51);
        boolean boolean58 = fila51.vazia();
        java.lang.Object obj59 = null;
        fila51.enfileira(obj59);
        java.lang.Object obj61 = fila51.desenfileira();
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) 100.0f);
        fila62.imprime();
        java.lang.Object obj66 = fila62.desenfileira();
        fila62.enfileira((java.lang.Object) 1L);
        java.lang.Object obj69 = fila62.desenfileira();
        fila62.imprime();
        ds.Fila fila71 = new ds.Fila();
        fila71.imprime();
        java.lang.Class<?> wildcardClass73 = fila71.getClass();
        fila62.enfileira((java.lang.Object) fila71);
        java.lang.Object obj75 = fila62.desenfileira();
        boolean boolean76 = fila62.vazia();
        ds.Fila fila77 = new ds.Fila();
        fila77.enfileira((java.lang.Object) 100.0f);
        fila77.imprime();
        java.lang.Object obj81 = fila77.desenfileira();
        fila77.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj84 = fila77.desenfileira();
        fila77.imprime();
        java.lang.Class<?> wildcardClass86 = fila77.getClass();
        fila62.enfileira((java.lang.Object) fila77);
        fila62.imprime();
        fila51.enfileira((java.lang.Object) fila62);
        boolean boolean90 = fila51.vazia();
        fila0.enfileira((java.lang.Object) fila51);
        boolean boolean92 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0f + "'", obj50, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0f + "'", obj55, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 100.0f + "'", obj66, 100.0f);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 1L + "'", obj69, 1L);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + 100.0f + "'", obj81, 100.0f);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + (-1.0f) + "'", obj84, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean22 = fila10.vazia();
        fila10.imprime();
        java.lang.Class<?> wildcardClass24 = fila10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean22 = fila0.vazia();
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        fila0.enfileira((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj40 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj12 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass22 = fila15.getClass();
        fila7.enfileira((java.lang.Object) fila15);
        java.lang.Class<?> wildcardClass24 = fila7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass24);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 100.0f);
        fila26.imprime();
        fila26.imprime();
        fila26.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj33 = fila26.desenfileira();
        boolean boolean34 = fila26.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 100.0f);
        boolean boolean38 = fila35.vazia();
        java.lang.Object obj39 = fila35.desenfileira();
        fila35.imprime();
        fila35.imprime();
        boolean boolean42 = fila35.vazia();
        fila35.imprime();
        boolean boolean44 = fila35.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) 100.0f);
        fila45.imprime();
        java.lang.Object obj49 = null;
        fila45.enfileira(obj49);
        java.lang.Object obj51 = fila45.desenfileira();
        java.lang.Object obj52 = fila45.desenfileira();
        fila45.imprime();
        fila35.enfileira((java.lang.Object) fila45);
        fila26.enfileira((java.lang.Object) fila35);
        fila0.enfileira((java.lang.Object) fila35);
        java.lang.Object obj57 = null;
        fila35.enfileira(obj57);
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) 10);
        boolean boolean62 = fila59.vazia();
        fila35.enfileira((java.lang.Object) boolean62);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0f + "'", obj33, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0f + "'", obj39, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0f + "'", obj51, 100.0f);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj16 = fila7.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        boolean boolean20 = fila17.vazia();
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 10);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        boolean boolean34 = fila29.vazia();
        boolean boolean35 = fila29.vazia();
        fila29.imprime();
        fila29.imprime();
        fila26.enfileira((java.lang.Object) fila29);
        boolean boolean39 = fila29.vazia();
        java.lang.Object obj40 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) "");
        boolean boolean43 = fila29.vazia();
        fila0.enfileira((java.lang.Object) fila29);
        ds.Fila fila45 = new ds.Fila();
        boolean boolean46 = fila45.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 10);
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 100.0f);
        fila50.imprime();
        fila50.imprime();
        boolean boolean55 = fila50.vazia();
        boolean boolean56 = fila50.vazia();
        fila50.imprime();
        fila50.imprime();
        fila47.enfileira((java.lang.Object) fila50);
        fila45.enfileira((java.lang.Object) fila50);
        ds.Fila fila61 = new ds.Fila();
        fila61.imprime();
        boolean boolean63 = fila61.vazia();
        fila61.imprime();
        boolean boolean65 = fila61.vazia();
        ds.Fila fila66 = new ds.Fila();
        boolean boolean67 = fila66.vazia();
        ds.Fila fila68 = new ds.Fila();
        fila68.enfileira((java.lang.Object) 10);
        ds.Fila fila71 = new ds.Fila();
        fila71.enfileira((java.lang.Object) 100.0f);
        fila71.imprime();
        fila71.imprime();
        boolean boolean76 = fila71.vazia();
        boolean boolean77 = fila71.vazia();
        fila71.imprime();
        fila71.imprime();
        fila68.enfileira((java.lang.Object) fila71);
        fila66.enfileira((java.lang.Object) fila71);
        fila61.enfileira((java.lang.Object) fila71);
        java.lang.Object obj83 = fila61.desenfileira();
        fila61.imprime();
        fila45.enfileira((java.lang.Object) fila61);
        fila61.imprime();
        fila29.enfileira((java.lang.Object) fila61);
        fila29.imprime();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(obj83);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        boolean boolean19 = fila13.vazia();
        fila13.imprime();
        boolean boolean21 = fila13.vazia();
        fila13.imprime();
        java.lang.Object obj23 = fila13.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 100.0f);
        fila24.imprime();
        fila24.imprime();
        java.lang.Object obj29 = fila24.desenfileira();
        fila24.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 100.0f);
        boolean boolean34 = fila31.vazia();
        java.lang.Object obj35 = fila31.desenfileira();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 100.0f);
        fila36.imprime();
        fila36.imprime();
        java.lang.Object obj41 = fila36.desenfileira();
        fila36.imprime();
        boolean boolean43 = fila36.vazia();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 100.0f);
        fila44.imprime();
        fila44.imprime();
        fila36.enfileira((java.lang.Object) fila44);
        fila31.enfileira((java.lang.Object) fila36);
        fila24.enfileira((java.lang.Object) fila31);
        fila13.enfileira((java.lang.Object) fila31);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) 100.0f);
        fila53.imprime();
        java.lang.Object obj57 = fila53.desenfileira();
        fila53.enfileira((java.lang.Object) 1L);
        java.lang.Object obj60 = fila53.desenfileira();
        fila53.imprime();
        ds.Fila fila62 = new ds.Fila();
        fila62.imprime();
        java.lang.Class<?> wildcardClass64 = fila62.getClass();
        fila53.enfileira((java.lang.Object) fila62);
        java.lang.Object obj66 = fila53.desenfileira();
        boolean boolean67 = fila53.vazia();
        ds.Fila fila68 = new ds.Fila();
        fila68.enfileira((java.lang.Object) 100.0f);
        fila68.imprime();
        java.lang.Object obj72 = fila68.desenfileira();
        fila68.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj75 = fila68.desenfileira();
        fila68.imprime();
        java.lang.Class<?> wildcardClass77 = fila68.getClass();
        fila53.enfileira((java.lang.Object) fila68);
        fila53.imprime();
        fila13.enfileira((java.lang.Object) fila53);
        java.lang.Object obj81 = fila53.desenfileira();
        fila0.enfileira((java.lang.Object) fila53);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0f + "'", obj41, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0f + "'", obj57, 100.0f);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 1L + "'", obj60, 1L);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 100.0f + "'", obj72, 100.0f);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + (-1.0f) + "'", obj75, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(obj81);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 100.0f);
        boolean boolean42 = fila39.vazia();
        java.lang.Object obj43 = fila39.desenfileira();
        fila39.imprime();
        fila39.imprime();
        boolean boolean46 = fila39.vazia();
        fila39.imprime();
        boolean boolean48 = fila39.vazia();
        java.lang.Class<?> wildcardClass49 = fila39.getClass();
        fila0.enfileira((java.lang.Object) fila39);
        boolean boolean51 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0f + "'", obj43, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean22 = fila10.vazia();
        fila10.imprime();
        boolean boolean24 = fila10.vazia();
        java.lang.Object obj25 = fila10.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 10);
        boolean boolean29 = fila26.vazia();
        fila10.enfileira((java.lang.Object) boolean29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila9.imprime();
        fila9.imprime();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila9.imprime();
        fila9.imprime();
        java.lang.Object obj18 = fila9.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        boolean boolean22 = fila19.vazia();
        java.lang.Object obj23 = fila19.desenfileira();
        fila19.imprime();
        fila9.enfileira((java.lang.Object) fila19);
        boolean boolean26 = fila19.vazia();
        java.lang.Object obj27 = null;
        fila19.enfileira(obj27);
        boolean boolean29 = fila19.vazia();
        fila0.enfileira((java.lang.Object) boolean29);
        java.lang.Object obj31 = fila0.desenfileira();
        java.lang.Object obj32 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 10);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100.0f);
        fila22.imprime();
        fila22.imprime();
        boolean boolean27 = fila22.vazia();
        boolean boolean28 = fila22.vazia();
        fila22.imprime();
        fila22.imprime();
        fila19.enfileira((java.lang.Object) fila22);
        fila17.enfileira((java.lang.Object) fila22);
        java.lang.Class<?> wildcardClass33 = fila17.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila8.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        fila17.imprime();
        fila17.imprime();
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        boolean boolean25 = fila17.vazia();
        fila17.imprime();
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 10);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        fila32.imprime();
        boolean boolean37 = fila32.vazia();
        boolean boolean38 = fila32.vazia();
        fila32.imprime();
        fila32.imprime();
        fila29.enfileira((java.lang.Object) fila32);
        fila27.enfileira((java.lang.Object) fila32);
        fila32.imprime();
        fila17.enfileira((java.lang.Object) fila32);
        fila8.enfileira((java.lang.Object) fila17);
        java.lang.Object obj46 = fila8.desenfileira();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0f + "'", obj46, 100.0f);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        java.lang.Object obj10 = fila5.desenfileira();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        fila11.imprime();
        java.lang.Object obj16 = fila11.desenfileira();
        fila11.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 100.0f);
        boolean boolean21 = fila18.vazia();
        java.lang.Object obj22 = fila18.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100.0f);
        fila23.imprime();
        fila23.imprime();
        java.lang.Object obj28 = fila23.desenfileira();
        fila23.imprime();
        boolean boolean30 = fila23.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila31.imprime();
        fila31.imprime();
        fila23.enfileira((java.lang.Object) fila31);
        fila18.enfileira((java.lang.Object) fila23);
        fila11.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        fila15.imprime();
        boolean boolean20 = fila15.vazia();
        boolean boolean21 = fila15.vazia();
        fila15.imprime();
        fila15.imprime();
        fila12.enfileira((java.lang.Object) fila15);
        fila10.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila0.enfileira((java.lang.Object) fila15);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila28.imprime();
        fila28.imprime();
        boolean boolean33 = fila28.vazia();
        java.lang.Object obj34 = fila28.desenfileira();
        fila0.enfileira((java.lang.Object) fila28);
        boolean boolean36 = fila28.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 100.0f);
        boolean boolean17 = fila14.vazia();
        java.lang.Object obj18 = fila14.desenfileira();
        fila14.imprime();
        fila14.imprime();
        boolean boolean21 = fila14.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila14.enfileira((java.lang.Object) fila22);
        boolean boolean25 = fila14.vazia();
        java.lang.Object obj26 = fila14.desenfileira();
        fila8.enfileira(obj26);
        boolean boolean28 = fila8.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 1.0f);
        fila13.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 100.0f);
        fila20.imprime();
        fila20.imprime();
        java.lang.Object obj25 = fila20.desenfileira();
        fila20.imprime();
        fila20.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila28.imprime();
        java.lang.Object obj32 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass35 = fila28.getClass();
        fila20.enfileira((java.lang.Object) fila28);
        java.lang.Class<?> wildcardClass37 = fila20.getClass();
        fila13.enfileira((java.lang.Object) wildcardClass37);
        fila13.imprime();
        java.lang.Object obj40 = fila13.desenfileira();
        fila0.enfileira(obj40);
        java.lang.Class<?> wildcardClass42 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean22 = fila10.vazia();
        fila10.imprime();
        boolean boolean24 = fila10.vazia();
        java.lang.Object obj25 = fila10.desenfileira();
        boolean boolean26 = fila10.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = null;
        fila10.enfileira(obj18);
        java.lang.Object obj20 = null;
        fila10.enfileira(obj20);
        java.lang.Class<?> wildcardClass22 = fila10.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        java.lang.Object obj15 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) 1L);
        java.lang.Object obj18 = fila11.desenfileira();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj20 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100.0f);
        fila22.imprime();
        java.lang.Object obj26 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj29 = fila22.desenfileira();
        fila22.imprime();
        boolean boolean31 = fila22.vazia();
        fila22.imprime();
        fila22.imprime();
        fila0.enfileira((java.lang.Object) fila22);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 100.0f);
        fila35.imprime();
        fila35.imprime();
        boolean boolean40 = fila35.vazia();
        boolean boolean41 = fila35.vazia();
        fila35.imprime();
        fila35.imprime();
        java.lang.Object obj44 = fila35.desenfileira();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) 100.0f);
        boolean boolean48 = fila45.vazia();
        java.lang.Object obj49 = fila45.desenfileira();
        fila45.imprime();
        fila35.enfileira((java.lang.Object) fila45);
        ds.Fila fila52 = new ds.Fila();
        boolean boolean53 = fila52.vazia();
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) 10);
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) 100.0f);
        fila57.imprime();
        fila57.imprime();
        boolean boolean62 = fila57.vazia();
        boolean boolean63 = fila57.vazia();
        fila57.imprime();
        fila57.imprime();
        fila54.enfileira((java.lang.Object) fila57);
        fila52.enfileira((java.lang.Object) fila57);
        ds.Fila fila68 = new ds.Fila();
        fila68.enfileira((java.lang.Object) 100.0f);
        boolean boolean71 = fila68.vazia();
        java.lang.Object obj72 = fila68.desenfileira();
        ds.Fila fila73 = new ds.Fila();
        fila73.enfileira((java.lang.Object) 100.0f);
        fila73.imprime();
        fila73.imprime();
        java.lang.Object obj78 = fila73.desenfileira();
        fila73.imprime();
        boolean boolean80 = fila73.vazia();
        ds.Fila fila81 = new ds.Fila();
        fila81.enfileira((java.lang.Object) 100.0f);
        fila81.imprime();
        fila81.imprime();
        fila73.enfileira((java.lang.Object) fila81);
        fila68.enfileira((java.lang.Object) fila73);
        fila52.enfileira((java.lang.Object) fila68);
        java.lang.Object obj89 = fila68.desenfileira();
        boolean boolean90 = fila68.vazia();
        fila45.enfileira((java.lang.Object) boolean90);
        fila22.enfileira((java.lang.Object) boolean90);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1L + "'", obj18, 1L);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0f) + "'", obj29, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0f + "'", obj44, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0f + "'", obj49, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 100.0f + "'", obj72, 100.0f);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 100.0f + "'", obj78, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        java.lang.Object obj9 = null;
        fila5.enfileira(obj9);
        java.lang.Class<?> wildcardClass11 = fila5.getClass();
        fila0.enfileira((java.lang.Object) fila5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        boolean boolean8 = fila5.vazia();
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.imprime();
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.imprime();
        boolean boolean14 = fila5.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = null;
        fila15.enfileira(obj19);
        java.lang.Object obj21 = fila15.desenfileira();
        java.lang.Object obj22 = fila15.desenfileira();
        fila15.imprime();
        fila5.enfileira((java.lang.Object) fila15);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 10);
        boolean boolean29 = fila26.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        fila26.enfileira((java.lang.Object) fila30);
        boolean boolean33 = fila26.vazia();
        java.lang.Object obj34 = fila26.desenfileira();
        fila5.enfileira((java.lang.Object) fila26);
        boolean boolean36 = fila26.vazia();
        fila26.imprime();
        java.lang.Class<?> wildcardClass38 = fila26.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10 + "'", obj34, 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean17 = fila5.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 100.0f);
        fila6.imprime();
        java.lang.Object obj10 = fila6.desenfileira();
        fila6.enfileira((java.lang.Object) (-1.0f));
        fila6.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 100.0f);
        fila14.imprime();
        fila14.imprime();
        java.lang.Object obj19 = fila14.desenfileira();
        boolean boolean20 = fila14.vazia();
        fila6.enfileira((java.lang.Object) boolean20);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        boolean boolean24 = fila22.vazia();
        fila22.imprime();
        fila22.imprime();
        fila6.enfileira((java.lang.Object) fila22);
        fila0.enfileira((java.lang.Object) fila22);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 10);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        fila11.imprime();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila8.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila11.vazia();
        java.lang.Object obj22 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) "");
        boolean boolean25 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj27 = fila11.desenfileira();
        java.lang.Class<?> wildcardClass28 = fila11.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        boolean boolean12 = fila9.vazia();
        java.lang.Object obj13 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        boolean boolean16 = fila9.vazia();
        fila9.imprime();
        boolean boolean18 = fila9.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        fila19.imprime();
        java.lang.Object obj23 = null;
        fila19.enfileira(obj23);
        java.lang.Object obj25 = fila19.desenfileira();
        java.lang.Object obj26 = fila19.desenfileira();
        fila19.imprime();
        fila9.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj30 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 1.0d);
        boolean boolean39 = fila32.vazia();
        fila0.enfileira((java.lang.Object) fila32);
        boolean boolean41 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0d + "'", obj30, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj16 = fila9.desenfileira();
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 100.0f);
        boolean boolean21 = fila18.vazia();
        java.lang.Object obj22 = fila18.desenfileira();
        fila18.imprime();
        fila18.imprime();
        boolean boolean25 = fila18.vazia();
        fila18.imprime();
        boolean boolean27 = fila18.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila28.imprime();
        java.lang.Object obj32 = null;
        fila28.enfileira(obj32);
        java.lang.Object obj34 = fila28.desenfileira();
        java.lang.Object obj35 = fila28.desenfileira();
        fila28.imprime();
        fila18.enfileira((java.lang.Object) fila28);
        fila9.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        java.lang.Object obj40 = fila18.desenfileira();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        boolean boolean6 = fila4.vazia();
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 10);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 100.0f);
        fila14.imprime();
        fila14.imprime();
        boolean boolean19 = fila14.vazia();
        boolean boolean20 = fila14.vazia();
        fila14.imprime();
        fila14.imprime();
        fila11.enfileira((java.lang.Object) fila14);
        fila9.enfileira((java.lang.Object) fila14);
        fila4.enfileira((java.lang.Object) fila14);
        java.lang.Object obj26 = fila4.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100.0f);
        boolean boolean30 = fila27.vazia();
        java.lang.Object obj31 = fila27.desenfileira();
        fila27.imprime();
        fila27.imprime();
        boolean boolean34 = fila27.vazia();
        fila27.imprime();
        fila4.enfileira((java.lang.Object) fila27);
        fila0.enfileira((java.lang.Object) fila27);
        boolean boolean38 = fila27.vazia();
        boolean boolean39 = fila27.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 1.0f);
        fila13.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 100.0f);
        fila20.imprime();
        fila20.imprime();
        java.lang.Object obj25 = fila20.desenfileira();
        fila20.imprime();
        fila20.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila28.imprime();
        java.lang.Object obj32 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass35 = fila28.getClass();
        fila20.enfileira((java.lang.Object) fila28);
        java.lang.Class<?> wildcardClass37 = fila20.getClass();
        fila13.enfileira((java.lang.Object) wildcardClass37);
        fila13.imprime();
        java.lang.Object obj40 = fila13.desenfileira();
        fila0.enfileira(obj40);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 100.0f);
        fila42.imprime();
        fila42.imprime();
        fila42.enfileira((java.lang.Object) 1.0d);
        boolean boolean49 = fila42.vazia();
        fila0.enfileira((java.lang.Object) fila42);
        boolean boolean51 = fila0.vazia();
        java.lang.Object obj52 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0f + "'", obj52, 100.0f);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 10);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        fila11.imprime();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila8.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila11.vazia();
        java.lang.Object obj22 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) "");
        boolean boolean25 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila28.imprime();
        java.lang.Object obj32 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) (-1.0f));
        boolean boolean35 = fila28.vazia();
        fila11.enfileira((java.lang.Object) fila28);
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        boolean boolean39 = fila37.vazia();
        fila37.imprime();
        boolean boolean41 = fila37.vazia();
        ds.Fila fila42 = new ds.Fila();
        boolean boolean43 = fila42.vazia();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 10);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 100.0f);
        fila47.imprime();
        fila47.imprime();
        boolean boolean52 = fila47.vazia();
        boolean boolean53 = fila47.vazia();
        fila47.imprime();
        fila47.imprime();
        fila44.enfileira((java.lang.Object) fila47);
        fila42.enfileira((java.lang.Object) fila47);
        fila37.enfileira((java.lang.Object) fila47);
        java.lang.Object obj59 = fila37.desenfileira();
        fila37.imprime();
        boolean boolean61 = fila37.vazia();
        fila28.enfileira((java.lang.Object) fila37);
        fila37.imprime();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (short) 0);
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 0 + "'", obj11, (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.imprime();
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj22 = fila10.desenfileira();
        java.lang.Object obj23 = null;
        fila10.enfileira(obj23);
        java.lang.Class<?> wildcardClass25 = fila10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila8.enfileira(obj14);
        boolean boolean17 = fila8.vazia();
        java.lang.Object obj18 = fila8.desenfileira();
        boolean boolean19 = fila8.vazia();
        boolean boolean20 = fila8.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 10);
        boolean boolean13 = fila10.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean18 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        java.lang.Object obj14 = null;
        fila10.enfileira(obj14);
        java.lang.Object obj16 = fila10.desenfileira();
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (-1.0f));
        fila21.imprime();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 10);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        fila32.imprime();
        boolean boolean37 = fila32.vazia();
        boolean boolean38 = fila32.vazia();
        fila32.imprime();
        fila32.imprime();
        fila29.enfileira((java.lang.Object) fila32);
        boolean boolean42 = fila32.vazia();
        java.lang.Object obj43 = fila32.desenfileira();
        fila32.enfileira((java.lang.Object) "");
        boolean boolean46 = fila32.vazia();
        fila21.enfileira((java.lang.Object) fila32);
        fila21.imprime();
        fila10.enfileira((java.lang.Object) fila21);
        java.lang.Class<?> wildcardClass50 = fila10.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0f + "'", obj43, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj17 = fila0.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        boolean boolean20 = fila18.vazia();
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 10);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila28.imprime();
        fila28.imprime();
        boolean boolean33 = fila28.vazia();
        boolean boolean34 = fila28.vazia();
        fila28.imprime();
        fila28.imprime();
        fila25.enfileira((java.lang.Object) fila28);
        fila23.enfileira((java.lang.Object) fila28);
        fila18.enfileira((java.lang.Object) fila28);
        java.lang.Class<?> wildcardClass40 = fila28.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass40);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        boolean boolean18 = fila16.vazia();
        fila16.imprime();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 10);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 100.0f);
        fila26.imprime();
        fila26.imprime();
        boolean boolean31 = fila26.vazia();
        boolean boolean32 = fila26.vazia();
        fila26.imprime();
        fila26.imprime();
        fila23.enfileira((java.lang.Object) fila26);
        fila21.enfileira((java.lang.Object) fila26);
        fila16.enfileira((java.lang.Object) fila26);
        java.lang.Object obj38 = fila16.desenfileira();
        fila16.imprime();
        boolean boolean40 = fila16.vazia();
        boolean boolean41 = fila16.vazia();
        fila5.enfileira((java.lang.Object) fila16);
        fila16.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100.0f);
        fila3.imprime();
        fila3.imprime();
        boolean boolean8 = fila3.vazia();
        boolean boolean9 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean13 = fila3.vazia();
        java.lang.Object obj14 = fila3.desenfileira();
        fila3.enfileira((java.lang.Object) "");
        boolean boolean17 = fila3.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        boolean boolean20 = fila18.vazia();
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 10);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila28.imprime();
        fila28.imprime();
        boolean boolean33 = fila28.vazia();
        boolean boolean34 = fila28.vazia();
        fila28.imprime();
        fila28.imprime();
        fila25.enfileira((java.lang.Object) fila28);
        fila23.enfileira((java.lang.Object) fila28);
        fila18.enfileira((java.lang.Object) fila28);
        boolean boolean40 = fila18.vazia();
        boolean boolean41 = fila18.vazia();
        boolean boolean42 = fila18.vazia();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 100.0f);
        boolean boolean46 = fila43.vazia();
        boolean boolean47 = fila43.vazia();
        fila43.imprime();
        fila18.enfileira((java.lang.Object) fila43);
        boolean boolean50 = fila18.vazia();
        fila18.imprime();
        fila3.enfileira((java.lang.Object) fila18);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 100.0f);
        fila37.imprime();
        fila37.imprime();
        java.lang.Object obj42 = fila37.desenfileira();
        java.lang.Class<?> wildcardClass43 = fila37.getClass();
        fila0.enfileira((java.lang.Object) fila37);
        ds.Fila fila45 = new ds.Fila();
        boolean boolean46 = fila45.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 10);
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 100.0f);
        fila50.imprime();
        fila50.imprime();
        boolean boolean55 = fila50.vazia();
        boolean boolean56 = fila50.vazia();
        fila50.imprime();
        fila50.imprime();
        fila47.enfileira((java.lang.Object) fila50);
        fila45.enfileira((java.lang.Object) fila50);
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) 100.0f);
        boolean boolean64 = fila61.vazia();
        java.lang.Object obj65 = fila61.desenfileira();
        ds.Fila fila66 = new ds.Fila();
        fila66.enfileira((java.lang.Object) 100.0f);
        fila66.imprime();
        fila66.imprime();
        java.lang.Object obj71 = fila66.desenfileira();
        fila66.imprime();
        boolean boolean73 = fila66.vazia();
        ds.Fila fila74 = new ds.Fila();
        fila74.enfileira((java.lang.Object) 100.0f);
        fila74.imprime();
        fila74.imprime();
        fila66.enfileira((java.lang.Object) fila74);
        fila61.enfileira((java.lang.Object) fila66);
        fila45.enfileira((java.lang.Object) fila61);
        java.lang.Object obj82 = fila61.desenfileira();
        fila0.enfileira(obj82);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 100.0f + "'", obj65, 100.0f);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 100.0f + "'", obj71, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(obj82);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 1.0f);
        fila13.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 100.0f);
        fila20.imprime();
        fila20.imprime();
        java.lang.Object obj25 = fila20.desenfileira();
        fila20.imprime();
        fila20.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila28.imprime();
        java.lang.Object obj32 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass35 = fila28.getClass();
        fila20.enfileira((java.lang.Object) fila28);
        java.lang.Class<?> wildcardClass37 = fila20.getClass();
        fila13.enfileira((java.lang.Object) wildcardClass37);
        fila13.imprime();
        java.lang.Object obj40 = fila13.desenfileira();
        fila0.enfileira(obj40);
        fila0.imprime();
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        boolean boolean45 = fila43.vazia();
        fila43.imprime();
        boolean boolean47 = fila43.vazia();
        ds.Fila fila48 = new ds.Fila();
        boolean boolean49 = fila48.vazia();
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 10);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) 100.0f);
        fila53.imprime();
        fila53.imprime();
        boolean boolean58 = fila53.vazia();
        boolean boolean59 = fila53.vazia();
        fila53.imprime();
        fila53.imprime();
        fila50.enfileira((java.lang.Object) fila53);
        fila48.enfileira((java.lang.Object) fila53);
        fila43.enfileira((java.lang.Object) fila53);
        boolean boolean65 = fila53.vazia();
        fila53.imprime();
        fila0.enfileira((java.lang.Object) fila53);
        boolean boolean68 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100.0f);
        fila3.imprime();
        fila3.imprime();
        boolean boolean8 = fila3.vazia();
        boolean boolean9 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean13 = fila3.vazia();
        boolean boolean14 = fila3.vazia();
        fila3.imprime();
        java.lang.Object obj16 = fila3.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        fila17.imprime();
        fila17.imprime();
        java.lang.Object obj22 = fila17.desenfileira();
        fila17.imprime();
        boolean boolean24 = fila17.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 100.0f);
        fila25.imprime();
        fila25.imprime();
        fila17.enfileira((java.lang.Object) fila25);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        fila25.enfileira(obj31);
        boolean boolean34 = fila25.vazia();
        java.lang.Object obj35 = fila25.desenfileira();
        fila3.enfileira((java.lang.Object) fila25);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        java.lang.Object obj10 = fila5.desenfileira();
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.imprime();
        fila5.enfileira((java.lang.Object) fila13);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        java.lang.Object obj21 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        java.lang.Object obj12 = fila8.desenfileira();
        fila8.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass15 = fila8.getClass();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean17 = fila0.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 100.0f);
        fila18.imprime();
        java.lang.Object obj22 = fila18.desenfileira();
        fila18.enfileira((java.lang.Object) (-1.0f));
        fila18.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 100.0f);
        fila26.imprime();
        fila26.imprime();
        java.lang.Object obj31 = fila26.desenfileira();
        boolean boolean32 = fila26.vazia();
        fila18.enfileira((java.lang.Object) boolean32);
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        boolean boolean36 = fila34.vazia();
        fila34.imprime();
        fila34.imprime();
        fila18.enfileira((java.lang.Object) fila34);
        fila0.enfileira((java.lang.Object) fila18);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 100.0f);
        fila4.imprime();
        fila4.imprime();
        java.lang.Object obj9 = fila4.desenfileira();
        fila4.imprime();
        java.lang.Class<?> wildcardClass11 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.imprime();
        java.lang.Object obj18 = fila13.desenfileira();
        boolean boolean19 = fila13.vazia();
        fila13.imprime();
        fila13.imprime();
        fila4.enfileira((java.lang.Object) fila13);
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        boolean boolean25 = fila23.vazia();
        fila13.enfileira((java.lang.Object) boolean25);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        java.lang.Object obj14 = null;
        fila10.enfileira(obj14);
        java.lang.Object obj16 = fila10.desenfileira();
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (-1.0f));
        fila21.imprime();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 10);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        fila32.imprime();
        boolean boolean37 = fila32.vazia();
        boolean boolean38 = fila32.vazia();
        fila32.imprime();
        fila32.imprime();
        fila29.enfileira((java.lang.Object) fila32);
        boolean boolean42 = fila32.vazia();
        java.lang.Object obj43 = fila32.desenfileira();
        fila32.enfileira((java.lang.Object) "");
        boolean boolean46 = fila32.vazia();
        fila21.enfileira((java.lang.Object) fila32);
        fila21.imprime();
        fila10.enfileira((java.lang.Object) fila21);
        fila10.imprime();
        fila10.imprime();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0f + "'", obj43, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean16 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        boolean boolean12 = fila9.vazia();
        java.lang.Object obj13 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        boolean boolean16 = fila9.vazia();
        fila9.imprime();
        boolean boolean18 = fila9.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        fila19.imprime();
        java.lang.Object obj23 = null;
        fila19.enfileira(obj23);
        java.lang.Object obj25 = fila19.desenfileira();
        java.lang.Object obj26 = fila19.desenfileira();
        fila19.imprime();
        fila9.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj30 = fila0.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 10);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 100.0f);
        fila34.imprime();
        fila34.imprime();
        boolean boolean39 = fila34.vazia();
        boolean boolean40 = fila34.vazia();
        fila34.imprime();
        fila34.imprime();
        fila31.enfileira((java.lang.Object) fila34);
        boolean boolean44 = fila34.vazia();
        java.lang.Object obj45 = fila34.desenfileira();
        fila0.enfileira(obj45);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 100.0f);
        fila49.imprime();
        java.lang.Object obj53 = fila49.desenfileira();
        fila49.enfileira((java.lang.Object) (-1.0f));
        fila49.imprime();
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) 10);
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) 100.0f);
        fila60.imprime();
        fila60.imprime();
        boolean boolean65 = fila60.vazia();
        boolean boolean66 = fila60.vazia();
        fila60.imprime();
        fila60.imprime();
        fila57.enfileira((java.lang.Object) fila60);
        boolean boolean70 = fila60.vazia();
        java.lang.Object obj71 = fila60.desenfileira();
        fila60.enfileira((java.lang.Object) "");
        boolean boolean74 = fila60.vazia();
        fila49.enfileira((java.lang.Object) fila60);
        java.lang.Object obj76 = fila60.desenfileira();
        boolean boolean77 = fila60.vazia();
        fila0.enfileira((java.lang.Object) fila60);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0d + "'", obj30, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 100.0f + "'", obj45, 100.0f);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100.0f + "'", obj53, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 100.0f + "'", obj71, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + "" + "'", obj76, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        boolean boolean12 = fila9.vazia();
        java.lang.Object obj13 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        boolean boolean16 = fila9.vazia();
        fila9.imprime();
        boolean boolean18 = fila9.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        fila19.imprime();
        java.lang.Object obj23 = null;
        fila19.enfileira(obj23);
        java.lang.Object obj25 = fila19.desenfileira();
        java.lang.Object obj26 = fila19.desenfileira();
        fila19.imprime();
        fila9.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 100.0f);
        fila30.imprime();
        java.lang.Object obj34 = fila30.desenfileira();
        fila30.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj37 = fila30.desenfileira();
        fila30.imprime();
        fila30.imprime();
        fila9.enfileira((java.lang.Object) fila30);
        boolean boolean41 = fila9.vazia();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1.0f) + "'", obj37, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        boolean boolean19 = fila17.vazia();
        fila17.imprime();
        boolean boolean21 = fila17.vazia();
        fila10.enfileira((java.lang.Object) fila17);
        boolean boolean23 = fila10.vazia();
        java.lang.Object obj24 = fila10.desenfileira();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 10);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        fila11.imprime();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila8.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila11.vazia();
        java.lang.Object obj22 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) "");
        boolean boolean25 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean27 = fila11.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila9.imprime();
        fila9.imprime();
        java.lang.Object obj14 = fila9.desenfileira();
        fila9.imprime();
        boolean boolean16 = fila9.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        fila17.imprime();
        fila17.imprime();
        fila9.enfileira((java.lang.Object) fila17);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        fila17.enfileira(obj23);
        boolean boolean26 = fila17.vazia();
        java.lang.Object obj27 = fila17.desenfileira();
        java.lang.Object obj28 = fila17.desenfileira();
        fila0.enfileira((java.lang.Object) fila17);
        java.lang.Object obj30 = null;
        fila0.enfileira(obj30);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj16 = fila7.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        boolean boolean20 = fila17.vazia();
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        java.lang.Class<?> wildcardClass26 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        fila15.imprime();
        boolean boolean20 = fila15.vazia();
        boolean boolean21 = fila15.vazia();
        fila15.imprime();
        fila15.imprime();
        fila12.enfileira((java.lang.Object) fila15);
        fila10.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila0.enfileira((java.lang.Object) fila15);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila28.imprime();
        fila28.imprime();
        boolean boolean33 = fila28.vazia();
        java.lang.Object obj34 = fila28.desenfileira();
        fila0.enfileira((java.lang.Object) fila28);
        java.lang.Class<?> wildcardClass36 = fila28.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        boolean boolean19 = fila17.vazia();
        fila17.imprime();
        boolean boolean21 = fila17.vazia();
        fila10.enfileira((java.lang.Object) fila17);
        boolean boolean23 = fila10.vazia();
        java.lang.Object obj24 = fila10.desenfileira();
        fila10.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = null;
        fila10.enfileira(obj18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 100.0f);
        fila20.imprime();
        fila20.imprime();
        boolean boolean25 = fila20.vazia();
        boolean boolean26 = fila20.vazia();
        fila20.imprime();
        boolean boolean28 = fila20.vazia();
        fila20.imprime();
        java.lang.Object obj30 = fila20.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila31.imprime();
        fila31.imprime();
        java.lang.Object obj36 = fila31.desenfileira();
        fila31.imprime();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 100.0f);
        boolean boolean41 = fila38.vazia();
        java.lang.Object obj42 = fila38.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 100.0f);
        fila43.imprime();
        fila43.imprime();
        java.lang.Object obj48 = fila43.desenfileira();
        fila43.imprime();
        boolean boolean50 = fila43.vazia();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 100.0f);
        fila51.imprime();
        fila51.imprime();
        fila43.enfileira((java.lang.Object) fila51);
        fila38.enfileira((java.lang.Object) fila43);
        fila31.enfileira((java.lang.Object) fila38);
        fila20.enfileira((java.lang.Object) fila38);
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) 100.0f);
        fila60.imprime();
        java.lang.Object obj64 = fila60.desenfileira();
        fila60.enfileira((java.lang.Object) 1L);
        java.lang.Object obj67 = fila60.desenfileira();
        fila60.imprime();
        ds.Fila fila69 = new ds.Fila();
        fila69.imprime();
        java.lang.Class<?> wildcardClass71 = fila69.getClass();
        fila60.enfileira((java.lang.Object) fila69);
        java.lang.Object obj73 = fila60.desenfileira();
        boolean boolean74 = fila60.vazia();
        ds.Fila fila75 = new ds.Fila();
        fila75.enfileira((java.lang.Object) 100.0f);
        fila75.imprime();
        java.lang.Object obj79 = fila75.desenfileira();
        fila75.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj82 = fila75.desenfileira();
        fila75.imprime();
        java.lang.Class<?> wildcardClass84 = fila75.getClass();
        fila60.enfileira((java.lang.Object) fila75);
        fila60.imprime();
        fila20.enfileira((java.lang.Object) fila60);
        fila10.enfileira((java.lang.Object) fila20);
        java.lang.Class<?> wildcardClass89 = fila10.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0f + "'", obj30, 100.0f);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0f + "'", obj48, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0f + "'", obj64, 100.0f);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 1L + "'", obj67, 1L);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 100.0f + "'", obj79, 100.0f);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + (-1.0f) + "'", obj82, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0f + "'", obj9, 1.0f);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        boolean boolean18 = fila16.vazia();
        fila16.imprime();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 10);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 100.0f);
        fila26.imprime();
        fila26.imprime();
        boolean boolean31 = fila26.vazia();
        boolean boolean32 = fila26.vazia();
        fila26.imprime();
        fila26.imprime();
        fila23.enfileira((java.lang.Object) fila26);
        fila21.enfileira((java.lang.Object) fila26);
        fila16.enfileira((java.lang.Object) fila26);
        java.lang.Object obj38 = fila16.desenfileira();
        fila16.imprime();
        boolean boolean40 = fila16.vazia();
        boolean boolean41 = fila16.vazia();
        fila5.enfileira((java.lang.Object) fila16);
        boolean boolean43 = fila16.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila9.imprime();
        java.lang.Object obj13 = null;
        fila9.enfileira(obj13);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        fila9.enfileira((java.lang.Object) boolean19);
        java.lang.Class<?> wildcardClass21 = fila9.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.imprime();
        fila0.enfileira((java.lang.Object) fila26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = fila26.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        boolean boolean8 = fila5.vazia();
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.imprime();
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.imprime();
        boolean boolean14 = fila5.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = null;
        fila15.enfileira(obj19);
        java.lang.Object obj21 = fila15.desenfileira();
        java.lang.Object obj22 = fila15.desenfileira();
        fila15.imprime();
        fila5.enfileira((java.lang.Object) fila15);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100.0f);
        fila27.imprime();
        fila27.enfileira((java.lang.Object) 1.0f);
        fila27.imprime();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 100.0f);
        fila34.imprime();
        fila34.imprime();
        java.lang.Object obj39 = fila34.desenfileira();
        fila34.imprime();
        fila34.imprime();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 100.0f);
        fila42.imprime();
        java.lang.Object obj46 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass49 = fila42.getClass();
        fila34.enfileira((java.lang.Object) fila42);
        java.lang.Class<?> wildcardClass51 = fila34.getClass();
        fila27.enfileira((java.lang.Object) wildcardClass51);
        fila27.imprime();
        java.lang.Object obj54 = fila27.desenfileira();
        java.lang.Class<?> wildcardClass55 = fila27.getClass();
        fila0.enfileira((java.lang.Object) fila27);
        boolean boolean57 = fila27.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0f + "'", obj39, 100.0f);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0f + "'", obj46, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 100.0f + "'", obj54, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 10);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila8.imprime();
        java.lang.Object obj17 = fila8.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 100.0f);
        boolean boolean21 = fila18.vazia();
        java.lang.Object obj22 = fila18.desenfileira();
        fila18.imprime();
        fila8.enfileira((java.lang.Object) fila18);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        boolean boolean27 = fila25.vazia();
        fila25.imprime();
        boolean boolean29 = fila25.vazia();
        fila18.enfileira((java.lang.Object) fila25);
        fila25.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        fila32.imprime();
        java.lang.Object obj37 = fila32.desenfileira();
        fila32.imprime();
        boolean boolean39 = fila32.vazia();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 100.0f);
        fila40.imprime();
        fila40.imprime();
        fila32.enfileira((java.lang.Object) fila40);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        fila40.enfileira(obj46);
        boolean boolean49 = fila40.vazia();
        java.lang.Object obj50 = fila40.desenfileira();
        java.lang.Object obj51 = fila40.desenfileira();
        java.lang.Class<?> wildcardClass52 = fila40.getClass();
        fila25.enfileira((java.lang.Object) fila40);
        fila0.enfileira((java.lang.Object) fila40);
        boolean boolean55 = fila40.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0f + "'", obj37, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0f + "'", obj50, 100.0f);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        fila15.imprime();
        boolean boolean20 = fila15.vazia();
        boolean boolean21 = fila15.vazia();
        fila15.imprime();
        fila15.imprime();
        fila12.enfileira((java.lang.Object) fila15);
        fila10.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila0.enfileira((java.lang.Object) fila15);
        boolean boolean28 = fila15.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        boolean boolean32 = fila29.vazia();
        java.lang.Object obj33 = fila29.desenfileira();
        fila29.imprime();
        fila29.imprime();
        boolean boolean36 = fila29.vazia();
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila29.enfileira((java.lang.Object) fila37);
        java.lang.Object obj40 = fila29.desenfileira();
        fila15.enfileira((java.lang.Object) fila29);
        boolean boolean42 = fila29.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0f + "'", obj33, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 100.0f);
        fila6.imprime();
        java.lang.Object obj10 = null;
        fila6.enfileira(obj10);
        java.lang.Object obj12 = fila6.desenfileira();
        java.lang.Object obj13 = fila6.desenfileira();
        java.lang.Class<?> wildcardClass14 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj16 = fila0.desenfileira();
        boolean boolean17 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.enfileira((java.lang.Object) 1.0f);
        fila5.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj13 = fila5.desenfileira();
        fila0.enfileira(obj13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 100.0f);
        boolean boolean42 = fila39.vazia();
        java.lang.Object obj43 = fila39.desenfileira();
        fila39.imprime();
        fila39.imprime();
        boolean boolean46 = fila39.vazia();
        fila39.imprime();
        boolean boolean48 = fila39.vazia();
        java.lang.Class<?> wildcardClass49 = fila39.getClass();
        fila0.enfileira((java.lang.Object) fila39);
        fila39.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0f + "'", obj43, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj16 = fila7.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        boolean boolean20 = fila17.vazia();
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 10);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        boolean boolean34 = fila29.vazia();
        boolean boolean35 = fila29.vazia();
        fila29.imprime();
        fila29.imprime();
        fila26.enfileira((java.lang.Object) fila29);
        boolean boolean39 = fila29.vazia();
        java.lang.Object obj40 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) "");
        boolean boolean43 = fila29.vazia();
        fila0.enfileira((java.lang.Object) fila29);
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) 10);
        boolean boolean48 = fila45.vazia();
        ds.Fila fila49 = new ds.Fila();
        fila49.imprime();
        boolean boolean51 = fila49.vazia();
        fila49.imprime();
        boolean boolean53 = fila49.vazia();
        ds.Fila fila54 = new ds.Fila();
        boolean boolean55 = fila54.vazia();
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) 10);
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) 100.0f);
        fila59.imprime();
        fila59.imprime();
        boolean boolean64 = fila59.vazia();
        boolean boolean65 = fila59.vazia();
        fila59.imprime();
        fila59.imprime();
        fila56.enfileira((java.lang.Object) fila59);
        fila54.enfileira((java.lang.Object) fila59);
        fila49.enfileira((java.lang.Object) fila59);
        java.lang.Object obj71 = fila49.desenfileira();
        ds.Fila fila72 = new ds.Fila();
        fila72.enfileira((java.lang.Object) 100.0f);
        boolean boolean75 = fila72.vazia();
        java.lang.Object obj76 = fila72.desenfileira();
        fila72.imprime();
        fila72.imprime();
        boolean boolean79 = fila72.vazia();
        fila72.imprime();
        fila49.enfileira((java.lang.Object) fila72);
        fila45.enfileira((java.lang.Object) fila72);
        fila0.enfileira((java.lang.Object) fila45);
        fila45.imprime();
        boolean boolean85 = fila45.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + 100.0f + "'", obj76, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        java.lang.Object obj10 = fila5.desenfileira();
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.imprime();
        fila5.enfileira((java.lang.Object) fila13);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj20 = fila5.desenfileira();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        fila16.imprime();
        boolean boolean38 = fila16.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        java.lang.Object obj10 = fila5.desenfileira();
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila13.imprime();
        fila13.imprime();
        fila5.enfileira((java.lang.Object) fila13);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj28 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean30 = fila21.vazia();
        fila21.imprime();
        fila21.imprime();
        fila0.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0f) + "'", obj28, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = null;
        fila10.enfileira(obj18);
        java.lang.Object obj20 = fila10.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 1L);
        java.lang.Object obj28 = fila21.desenfileira();
        fila21.imprime();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        java.lang.Class<?> wildcardClass32 = fila30.getClass();
        fila21.enfileira((java.lang.Object) fila30);
        java.lang.Object obj34 = fila21.desenfileira();
        boolean boolean35 = fila21.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 100.0f);
        fila36.imprime();
        java.lang.Object obj40 = fila36.desenfileira();
        fila36.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj43 = fila36.desenfileira();
        fila36.imprime();
        java.lang.Class<?> wildcardClass45 = fila36.getClass();
        fila21.enfileira((java.lang.Object) fila36);
        fila21.imprime();
        fila10.enfileira((java.lang.Object) fila21);
        boolean boolean49 = fila10.vazia();
        fila10.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1L + "'", obj28, 1L);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1.0f) + "'", obj43, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        java.lang.Object obj14 = null;
        fila10.enfileira(obj14);
        java.lang.Object obj16 = fila10.desenfileira();
        java.lang.Object obj17 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean20 = fila0.vazia();
        java.lang.Object obj21 = fila0.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 100.0f);
        fila22.imprime();
        fila22.imprime();
        boolean boolean27 = fila22.vazia();
        boolean boolean28 = fila22.vazia();
        java.lang.Object obj29 = fila22.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 10);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 100.0f);
        fila35.imprime();
        fila35.imprime();
        boolean boolean40 = fila35.vazia();
        boolean boolean41 = fila35.vazia();
        fila35.imprime();
        fila35.imprime();
        fila32.enfileira((java.lang.Object) fila35);
        fila30.enfileira((java.lang.Object) fila35);
        ds.Fila fila46 = new ds.Fila();
        fila46.imprime();
        boolean boolean48 = fila46.vazia();
        fila46.imprime();
        boolean boolean50 = fila46.vazia();
        ds.Fila fila51 = new ds.Fila();
        boolean boolean52 = fila51.vazia();
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) 10);
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) 100.0f);
        fila56.imprime();
        fila56.imprime();
        boolean boolean61 = fila56.vazia();
        boolean boolean62 = fila56.vazia();
        fila56.imprime();
        fila56.imprime();
        fila53.enfileira((java.lang.Object) fila56);
        fila51.enfileira((java.lang.Object) fila56);
        fila46.enfileira((java.lang.Object) fila56);
        java.lang.Object obj68 = fila46.desenfileira();
        fila46.imprime();
        fila30.enfileira((java.lang.Object) fila46);
        fila22.enfileira((java.lang.Object) fila30);
        fila0.enfileira((java.lang.Object) fila22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(obj68);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj16 = fila7.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        boolean boolean20 = fila17.vazia();
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 10);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        boolean boolean34 = fila29.vazia();
        boolean boolean35 = fila29.vazia();
        fila29.imprime();
        fila29.imprime();
        fila26.enfileira((java.lang.Object) fila29);
        boolean boolean39 = fila29.vazia();
        java.lang.Object obj40 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) "");
        boolean boolean43 = fila29.vazia();
        fila0.enfileira((java.lang.Object) fila29);
        java.lang.Object obj45 = fila29.desenfileira();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "" + "'", obj45, "");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean22 = fila0.vazia();
        boolean boolean23 = fila0.vazia();
        boolean boolean24 = fila0.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 100.0f);
        boolean boolean28 = fila25.vazia();
        boolean boolean29 = fila25.vazia();
        fila25.imprime();
        fila0.enfileira((java.lang.Object) fila25);
        java.lang.Object obj32 = fila25.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass39 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj16 = fila7.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        boolean boolean20 = fila17.vazia();
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj25 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1L + "'", obj25, 1L);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 10);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 100.0f);
        fila14.imprime();
        fila14.imprime();
        boolean boolean19 = fila14.vazia();
        boolean boolean20 = fila14.vazia();
        fila14.imprime();
        fila14.imprime();
        fila11.enfileira((java.lang.Object) fila14);
        fila9.enfileira((java.lang.Object) fila14);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 100.0f);
        boolean boolean28 = fila25.vazia();
        java.lang.Object obj29 = fila25.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 100.0f);
        fila30.imprime();
        fila30.imprime();
        java.lang.Object obj35 = fila30.desenfileira();
        fila30.imprime();
        boolean boolean37 = fila30.vazia();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 100.0f);
        fila38.imprime();
        fila38.imprime();
        fila30.enfileira((java.lang.Object) fila38);
        fila25.enfileira((java.lang.Object) fila30);
        fila9.enfileira((java.lang.Object) fila25);
        java.lang.Object obj46 = fila25.desenfileira();
        boolean boolean47 = fila25.vazia();
        java.lang.Class<?> wildcardClass48 = fila25.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass48);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        boolean boolean18 = fila16.vazia();
        fila16.imprime();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 10);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 100.0f);
        fila26.imprime();
        fila26.imprime();
        boolean boolean31 = fila26.vazia();
        boolean boolean32 = fila26.vazia();
        fila26.imprime();
        fila26.imprime();
        fila23.enfileira((java.lang.Object) fila26);
        fila21.enfileira((java.lang.Object) fila26);
        fila16.enfileira((java.lang.Object) fila26);
        java.lang.Object obj38 = fila16.desenfileira();
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 10);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 100.0f);
        fila44.imprime();
        fila44.imprime();
        boolean boolean49 = fila44.vazia();
        boolean boolean50 = fila44.vazia();
        fila44.imprime();
        fila44.imprime();
        fila41.enfileira((java.lang.Object) fila44);
        boolean boolean54 = fila44.vazia();
        java.lang.Object obj55 = fila44.desenfileira();
        fila44.enfileira((java.lang.Object) "");
        boolean boolean58 = fila44.vazia();
        boolean boolean59 = fila44.vazia();
        boolean boolean60 = fila44.vazia();
        java.lang.Object obj61 = fila44.desenfileira();
        fila16.enfileira((java.lang.Object) fila44);
        fila16.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0f + "'", obj55, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + "" + "'", obj61, "");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj40 = fila0.desenfileira();
        boolean boolean41 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        java.lang.Object obj18 = null;
        fila10.enfileira(obj18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 100.0f);
        fila20.imprime();
        fila20.imprime();
        boolean boolean25 = fila20.vazia();
        boolean boolean26 = fila20.vazia();
        fila20.imprime();
        boolean boolean28 = fila20.vazia();
        fila20.imprime();
        java.lang.Object obj30 = fila20.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila31.imprime();
        fila31.imprime();
        java.lang.Object obj36 = fila31.desenfileira();
        fila31.imprime();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 100.0f);
        boolean boolean41 = fila38.vazia();
        java.lang.Object obj42 = fila38.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 100.0f);
        fila43.imprime();
        fila43.imprime();
        java.lang.Object obj48 = fila43.desenfileira();
        fila43.imprime();
        boolean boolean50 = fila43.vazia();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 100.0f);
        fila51.imprime();
        fila51.imprime();
        fila43.enfileira((java.lang.Object) fila51);
        fila38.enfileira((java.lang.Object) fila43);
        fila31.enfileira((java.lang.Object) fila38);
        fila20.enfileira((java.lang.Object) fila38);
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) 100.0f);
        fila60.imprime();
        java.lang.Object obj64 = fila60.desenfileira();
        fila60.enfileira((java.lang.Object) 1L);
        java.lang.Object obj67 = fila60.desenfileira();
        fila60.imprime();
        ds.Fila fila69 = new ds.Fila();
        fila69.imprime();
        java.lang.Class<?> wildcardClass71 = fila69.getClass();
        fila60.enfileira((java.lang.Object) fila69);
        java.lang.Object obj73 = fila60.desenfileira();
        boolean boolean74 = fila60.vazia();
        ds.Fila fila75 = new ds.Fila();
        fila75.enfileira((java.lang.Object) 100.0f);
        fila75.imprime();
        java.lang.Object obj79 = fila75.desenfileira();
        fila75.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj82 = fila75.desenfileira();
        fila75.imprime();
        java.lang.Class<?> wildcardClass84 = fila75.getClass();
        fila60.enfileira((java.lang.Object) fila75);
        fila60.imprime();
        fila20.enfileira((java.lang.Object) fila60);
        fila10.enfileira((java.lang.Object) fila20);
        fila20.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0f + "'", obj30, 100.0f);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0f + "'", obj48, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0f + "'", obj64, 100.0f);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 1L + "'", obj67, 1L);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 100.0f + "'", obj79, 100.0f);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + (-1.0f) + "'", obj82, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 100.0f);
        boolean boolean9 = fila6.vazia();
        boolean boolean10 = fila6.vazia();
        fila0.enfileira((java.lang.Object) boolean10);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 100.0f);
        boolean boolean16 = fila13.vazia();
        java.lang.Object obj17 = fila13.desenfileira();
        boolean boolean18 = fila13.vazia();
        boolean boolean19 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean19);
        java.lang.Object obj21 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        boolean boolean12 = fila9.vazia();
        java.lang.Object obj13 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        boolean boolean16 = fila9.vazia();
        fila9.imprime();
        boolean boolean18 = fila9.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        fila19.imprime();
        java.lang.Object obj23 = null;
        fila19.enfileira(obj23);
        java.lang.Object obj25 = fila19.desenfileira();
        java.lang.Object obj26 = fila19.desenfileira();
        fila19.imprime();
        fila9.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj30 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 1.0d);
        boolean boolean39 = fila32.vazia();
        fila0.enfileira((java.lang.Object) fila32);
        java.lang.Object obj41 = fila32.desenfileira();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0d + "'", obj30, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0f + "'", obj41, 100.0f);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila8.enfileira(obj14);
        boolean boolean17 = fila8.vazia();
        fila8.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 100.0f);
        fila11.imprime();
        java.lang.Object obj15 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) 1L);
        java.lang.Object obj18 = fila11.desenfileira();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj20 = fila0.desenfileira();
        boolean boolean21 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1L + "'", obj18, 1L);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 100.0f);
        boolean boolean15 = fila12.vazia();
        java.lang.Object obj16 = fila12.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        fila17.imprime();
        fila17.imprime();
        java.lang.Object obj22 = fila17.desenfileira();
        fila17.imprime();
        boolean boolean24 = fila17.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 100.0f);
        fila25.imprime();
        fila25.imprime();
        fila17.enfileira((java.lang.Object) fila25);
        fila12.enfileira((java.lang.Object) fila17);
        fila12.imprime();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 100.0f);
        fila33.imprime();
        java.lang.Object obj37 = fila33.desenfileira();
        fila33.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj40 = fila33.desenfileira();
        fila33.imprime();
        boolean boolean42 = fila33.vazia();
        fila33.imprime();
        fila33.imprime();
        fila12.enfileira((java.lang.Object) fila33);
        fila0.enfileira((java.lang.Object) fila33);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 100.0f);
        fila47.imprime();
        fila47.imprime();
        boolean boolean52 = fila47.vazia();
        boolean boolean53 = fila47.vazia();
        fila47.imprime();
        boolean boolean55 = fila47.vazia();
        fila47.imprime();
        java.lang.Object obj57 = fila47.desenfileira();
        boolean boolean58 = fila47.vazia();
        fila47.imprime();
        fila33.enfileira((java.lang.Object) fila47);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0f + "'", obj37, 100.0f);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (-1.0f) + "'", obj40, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0f + "'", obj57, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        boolean boolean12 = fila9.vazia();
        java.lang.Object obj13 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        boolean boolean16 = fila9.vazia();
        fila9.imprime();
        boolean boolean18 = fila9.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100.0f);
        fila19.imprime();
        java.lang.Object obj23 = null;
        fila19.enfileira(obj23);
        java.lang.Object obj25 = fila19.desenfileira();
        java.lang.Object obj26 = fila19.desenfileira();
        fila19.imprime();
        fila9.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 100.0f);
        fila30.imprime();
        java.lang.Object obj34 = fila30.desenfileira();
        fila30.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj37 = fila30.desenfileira();
        fila30.imprime();
        fila30.imprime();
        fila9.enfileira((java.lang.Object) fila30);
        boolean boolean41 = fila30.vazia();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1.0f) + "'", obj37, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        boolean boolean11 = fila8.vazia();
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira(obj12);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 100.0f);
        fila14.imprime();
        java.lang.Object obj18 = fila14.desenfileira();
        fila14.enfileira((java.lang.Object) (-1.0f));
        fila14.imprime();
        java.lang.Object obj22 = fila14.desenfileira();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        fila0.enfileira(obj22);
        java.lang.Object obj25 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0f) + "'", obj22, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        fila16.imprime();
        fila16.imprime();
        java.lang.Object obj21 = fila16.desenfileira();
        fila16.imprime();
        boolean boolean23 = fila16.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 100.0f);
        fila24.imprime();
        fila24.imprime();
        fila16.enfileira((java.lang.Object) fila24);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        fila24.enfileira(obj30);
        boolean boolean33 = fila24.vazia();
        java.lang.Object obj34 = fila24.desenfileira();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        fila5.enfileira(obj34);
        java.lang.Object obj37 = fila5.desenfileira();
        java.lang.Object obj38 = fila5.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0f + "'", obj37, 100.0f);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = fila15.desenfileira();
        fila15.imprime();
        java.lang.Class<?> wildcardClass24 = fila15.getClass();
        fila0.enfileira((java.lang.Object) fila15);
        boolean boolean26 = fila0.vazia();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100.0f);
        fila27.imprime();
        fila27.imprime();
        java.lang.Object obj32 = fila27.desenfileira();
        fila27.imprime();
        fila27.imprime();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 100.0f);
        fila35.imprime();
        java.lang.Object obj39 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass42 = fila35.getClass();
        fila27.enfileira((java.lang.Object) fila35);
        fila27.imprime();
        fila0.enfileira((java.lang.Object) fila27);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0f) + "'", obj22, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0f + "'", obj39, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila9.imprime();
        java.lang.Object obj13 = null;
        fila9.enfileira(obj13);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        fila9.enfileira((java.lang.Object) boolean19);
        java.lang.Class<?> wildcardClass21 = fila9.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass21);
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        boolean boolean25 = fila23.vazia();
        boolean boolean26 = fila23.vazia();
        fila0.enfileira((java.lang.Object) boolean26);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        java.lang.Object obj14 = fila5.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        boolean boolean18 = fila15.vazia();
        java.lang.Object obj19 = fila15.desenfileira();
        fila15.imprime();
        fila5.enfileira((java.lang.Object) fila15);
        boolean boolean22 = fila15.vazia();
        java.lang.Object obj23 = null;
        fila15.enfileira(obj23);
        java.lang.Object obj25 = null;
        fila15.enfileira(obj25);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100.0f);
        fila27.imprime();
        java.lang.Object obj31 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj34 = fila27.desenfileira();
        fila27.imprime();
        boolean boolean36 = fila27.vazia();
        fila15.enfileira((java.lang.Object) boolean36);
        java.lang.Object obj38 = fila15.desenfileira();
        fila0.enfileira((java.lang.Object) fila15);
        // The following exception was thrown during execution in test generation
        try {
            fila15.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1.0f) + "'", obj34, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 100.0f);
        fila14.imprime();
        fila14.imprime();
        boolean boolean19 = fila14.vazia();
        boolean boolean20 = fila14.vazia();
        fila14.imprime();
        boolean boolean22 = fila14.vazia();
        fila14.imprime();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 10);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        boolean boolean34 = fila29.vazia();
        boolean boolean35 = fila29.vazia();
        fila29.imprime();
        fila29.imprime();
        fila26.enfileira((java.lang.Object) fila29);
        fila24.enfileira((java.lang.Object) fila29);
        fila29.imprime();
        fila14.enfileira((java.lang.Object) fila29);
        java.lang.Object obj42 = fila14.desenfileira();
        java.lang.Class<?> wildcardClass43 = fila14.getClass();
        fila8.enfileira((java.lang.Object) wildcardClass43);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0f + "'", obj9, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        fila15.imprime();
        boolean boolean20 = fila15.vazia();
        boolean boolean21 = fila15.vazia();
        fila15.imprime();
        fila15.imprime();
        fila12.enfileira((java.lang.Object) fila15);
        fila10.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila0.enfileira((java.lang.Object) fila15);
        boolean boolean28 = fila0.vazia();
        boolean boolean29 = fila0.vazia();
        java.lang.Object obj30 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0f + "'", obj30, 100.0f);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        java.lang.Object obj14 = null;
        fila10.enfileira(obj14);
        java.lang.Object obj16 = fila10.desenfileira();
        java.lang.Object obj17 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 100.0f);
        fila20.imprime();
        fila20.imprime();
        java.lang.Object obj25 = fila20.desenfileira();
        fila20.imprime();
        fila20.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila28.imprime();
        java.lang.Object obj32 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass35 = fila28.getClass();
        fila20.enfileira((java.lang.Object) fila28);
        java.lang.Class<?> wildcardClass37 = fila20.getClass();
        fila10.enfileira((java.lang.Object) wildcardClass37);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 100.0f);
        boolean boolean42 = fila39.vazia();
        java.lang.Object obj43 = fila39.desenfileira();
        fila39.imprime();
        fila39.imprime();
        boolean boolean46 = fila39.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.imprime();
        fila39.enfileira((java.lang.Object) fila47);
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 100.0f);
        fila50.imprime();
        java.lang.Object obj54 = fila50.desenfileira();
        fila50.enfileira((java.lang.Object) 1L);
        java.lang.Object obj57 = fila50.desenfileira();
        fila39.enfileira((java.lang.Object) fila50);
        boolean boolean59 = fila50.vazia();
        fila10.enfileira((java.lang.Object) fila50);
        fila10.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0f + "'", obj43, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 100.0f + "'", obj54, 100.0f);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 1L + "'", obj57, 1L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj3 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        boolean boolean13 = fila10.vazia();
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean17 = fila10.vazia();
        fila10.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 100.0f);
        boolean boolean9 = fila6.vazia();
        boolean boolean10 = fila6.vazia();
        fila0.enfileira((java.lang.Object) boolean10);
        fila0.enfileira((java.lang.Object) 1L);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        boolean boolean16 = fila14.vazia();
        fila14.imprime();
        boolean boolean18 = fila14.vazia();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 10);
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 100.0f);
        fila24.imprime();
        fila24.imprime();
        boolean boolean29 = fila24.vazia();
        boolean boolean30 = fila24.vazia();
        fila24.imprime();
        fila24.imprime();
        fila21.enfileira((java.lang.Object) fila24);
        fila19.enfileira((java.lang.Object) fila24);
        fila14.enfileira((java.lang.Object) fila24);
        java.lang.Object obj36 = fila14.desenfileira();
        fila14.imprime();
        boolean boolean38 = fila14.vazia();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) 10);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 100.0f);
        fila5.imprime();
        fila5.imprime();
        boolean boolean10 = fila5.vazia();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        fila2.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 100.0f);
        boolean boolean19 = fila16.vazia();
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100.0f);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 100.0f);
        fila29.imprime();
        fila29.imprime();
        fila21.enfileira((java.lang.Object) fila29);
        fila16.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila16);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj39 = fila0.desenfileira();
        java.lang.Object obj40 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj12 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 100.0f);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass22 = fila15.getClass();
        fila7.enfileira((java.lang.Object) fila15);
        java.lang.Class<?> wildcardClass24 = fila7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass24);
        fila0.imprime();
        java.lang.Object obj27 = fila0.desenfileira();
        boolean boolean28 = fila0.vazia();
        java.lang.Object obj29 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1.0f + "'", obj29, 1.0f);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100.0f);
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila8.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        fila17.imprime();
        fila17.imprime();
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        boolean boolean25 = fila17.vazia();
        fila17.imprime();
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 10);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila32.imprime();
        fila32.imprime();
        boolean boolean37 = fila32.vazia();
        boolean boolean38 = fila32.vazia();
        fila32.imprime();
        fila32.imprime();
        fila29.enfileira((java.lang.Object) fila32);
        fila27.enfileira((java.lang.Object) fila32);
        fila32.imprime();
        fila17.enfileira((java.lang.Object) fila32);
        fila8.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        java.lang.Object obj47 = fila17.desenfileira();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0f + "'", obj47, 100.0f);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila7.imprime();
        fila7.imprime();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj16 = fila7.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 100.0f);
        boolean boolean20 = fila17.vazia();
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        boolean boolean26 = fila7.vazia();
        fila7.imprime();
        java.lang.Object obj28 = fila7.desenfileira();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 10);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 100.0f);
        fila10.imprime();
        fila10.imprime();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        fila5.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean22 = fila10.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        boolean boolean25 = fila23.vazia();
        fila23.imprime();
        boolean boolean27 = fila23.vazia();
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 10);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 100.0f);
        fila33.imprime();
        fila33.imprime();
        boolean boolean38 = fila33.vazia();
        boolean boolean39 = fila33.vazia();
        fila33.imprime();
        fila33.imprime();
        fila30.enfileira((java.lang.Object) fila33);
        fila28.enfileira((java.lang.Object) fila33);
        fila23.enfileira((java.lang.Object) fila33);
        java.lang.Object obj45 = fila23.desenfileira();
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 100.0f);
        boolean boolean49 = fila46.vazia();
        java.lang.Object obj50 = fila46.desenfileira();
        fila46.imprime();
        fila46.imprime();
        boolean boolean53 = fila46.vazia();
        fila46.imprime();
        fila23.enfileira((java.lang.Object) fila46);
        boolean boolean56 = fila23.vazia();
        ds.Fila fila57 = new ds.Fila();
        fila57.imprime();
        boolean boolean59 = fila57.vazia();
        fila57.imprime();
        boolean boolean61 = fila57.vazia();
        ds.Fila fila62 = new ds.Fila();
        boolean boolean63 = fila62.vazia();
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) 10);
        ds.Fila fila67 = new ds.Fila();
        fila67.enfileira((java.lang.Object) 100.0f);
        fila67.imprime();
        fila67.imprime();
        boolean boolean72 = fila67.vazia();
        boolean boolean73 = fila67.vazia();
        fila67.imprime();
        fila67.imprime();
        fila64.enfileira((java.lang.Object) fila67);
        fila62.enfileira((java.lang.Object) fila67);
        fila57.enfileira((java.lang.Object) fila67);
        java.lang.Class<?> wildcardClass79 = fila67.getClass();
        fila23.enfileira((java.lang.Object) wildcardClass79);
        java.lang.Object obj81 = fila23.desenfileira();
        fila10.enfileira((java.lang.Object) fila23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0f + "'", obj50, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(obj81);
    }
}

