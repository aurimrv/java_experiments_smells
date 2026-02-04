package ds.seed5838;

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
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        fila0.enfileira(obj5);
        java.lang.Class<?> wildcardClass8 = obj5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        java.lang.Object obj7 = fila2.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila2.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100 + "'", obj7, 100);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) 100);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.imprime();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila5.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        boolean boolean7 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj14 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass15 = fila9.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila1.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        boolean boolean3 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) "hi!");
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj12 = null;
        fila0.enfileira(obj12);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean14 = fila4.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        boolean boolean4 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        java.lang.Object obj7 = fila2.desenfileira();
        java.lang.Class<?> wildcardClass8 = fila2.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100 + "'", obj7, 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        ds.Fila fila10 = new ds.Fila();
        fila9.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass13 = fila9.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila8);
        fila7.enfileira((java.lang.Object) (-1));
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj18 = fila13.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        ds.Fila fila20 = new ds.Fila();
        fila19.enfileira((java.lang.Object) fila20);
        java.lang.Object obj22 = null;
        fila19.enfileira(obj22);
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        fila24.enfileira((java.lang.Object) fila26);
        fila24.imprime();
        boolean boolean30 = fila24.vazia();
        fila24.imprime();
        fila19.enfileira((java.lang.Object) fila24);
        fila13.enfileira((java.lang.Object) fila24);
        fila13.imprime();
        java.lang.Object obj35 = fila13.desenfileira();
        boolean boolean36 = fila13.vazia();
        fila7.enfileira((java.lang.Object) fila13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = fila13.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        java.lang.Object obj22 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        boolean boolean22 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        fila1.imprime();
        java.lang.Class<?> wildcardClass4 = fila1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        java.lang.Object obj7 = fila2.desenfileira();
        fila2.imprime();
        java.lang.Class<?> wildcardClass9 = fila2.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100 + "'", obj7, 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj4 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        java.lang.Object obj6 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        java.lang.Object obj7 = fila2.desenfileira();
        boolean boolean8 = fila2.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila2.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100 + "'", obj7, 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        ds.Fila fila10 = new ds.Fila();
        fila9.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila13.enfileira((java.lang.Object) fila15);
        java.lang.Object obj18 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) (short) 100);
        boolean boolean21 = fila13.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila22.enfileira((java.lang.Object) fila24);
        java.lang.Object obj27 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 100);
        fila22.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.imprime();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila22.enfileira((java.lang.Object) fila31);
        fila13.enfileira((java.lang.Object) fila31);
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila39 = new ds.Fila();
        ds.Fila fila40 = new ds.Fila();
        fila39.enfileira((java.lang.Object) fila40);
        java.lang.Object obj42 = fila39.desenfileira();
        fila0.enfileira((java.lang.Object) fila39);
        fila0.imprime();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj12 = new java.lang.Object();
        fila0.enfileira(obj12);
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila14.enfileira((java.lang.Object) fila16);
        java.lang.Object obj19 = fila14.desenfileira();
        fila14.enfileira((java.lang.Object) (short) 100);
        boolean boolean22 = fila14.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila23.enfileira((java.lang.Object) fila25);
        java.lang.Object obj28 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) (short) 100);
        fila23.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila23.enfileira((java.lang.Object) fila32);
        fila14.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        fila32.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj42 = fila32.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila8);
        fila7.enfileira((java.lang.Object) (-1));
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Class<?> wildcardClass13 = fila7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila8);
        fila7.enfileira((java.lang.Object) (-1));
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj18 = fila13.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        ds.Fila fila20 = new ds.Fila();
        fila19.enfileira((java.lang.Object) fila20);
        java.lang.Object obj22 = null;
        fila19.enfileira(obj22);
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        fila24.enfileira((java.lang.Object) fila26);
        fila24.imprime();
        boolean boolean30 = fila24.vazia();
        fila24.imprime();
        fila19.enfileira((java.lang.Object) fila24);
        fila13.enfileira((java.lang.Object) fila24);
        fila13.imprime();
        java.lang.Object obj35 = fila13.desenfileira();
        boolean boolean36 = fila13.vazia();
        fila7.enfileira((java.lang.Object) fila13);
        java.lang.Class<?> wildcardClass38 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        boolean boolean3 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) "hi!");
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        ds.Fila fila14 = new ds.Fila();
        ds.Fila fila15 = new ds.Fila();
        fila14.enfileira((java.lang.Object) fila15);
        fila9.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass18 = fila14.getClass();
        fila0.enfileira((java.lang.Object) fila14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj21 = fila11.desenfileira();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        java.lang.Object obj22 = fila0.desenfileira();
        boolean boolean23 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        java.lang.Object obj22 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean14 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        fila6.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila6.desenfileira();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila14.enfileira((java.lang.Object) false);
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila18.enfileira((java.lang.Object) fila20);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        fila18.enfileira(obj23);
        java.lang.Class<?> wildcardClass26 = fila18.getClass();
        fila14.enfileira((java.lang.Object) fila18);
        java.lang.Object obj28 = fila14.desenfileira();
        fila14.imprime();
        fila6.enfileira((java.lang.Object) fila14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila9);
        fila0.imprime();
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila8);
        fila7.enfileira((java.lang.Object) (-1));
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean13 = fila7.vazia();
        boolean boolean14 = fila7.vazia();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        ds.Fila fila14 = new ds.Fila();
        ds.Fila fila15 = new ds.Fila();
        fila14.enfileira((java.lang.Object) fila15);
        fila9.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj19 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 100 + "'", obj19, (short) 100);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila1.enfileira((java.lang.Object) fila3);
        fila1.imprime();
        boolean boolean7 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean7);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila14.enfileira((java.lang.Object) fila16);
        java.lang.Object obj19 = fila14.desenfileira();
        fila14.enfileira((java.lang.Object) (short) 100);
        boolean boolean22 = fila14.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila23.enfileira((java.lang.Object) fila25);
        java.lang.Object obj28 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) (short) 100);
        fila23.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila23.enfileira((java.lang.Object) fila32);
        fila14.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        fila32.enfileira((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass42 = fila32.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila0.enfileira((java.lang.Object) boolean7);
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        ds.Fila fila14 = new ds.Fila();
        ds.Fila fila15 = new ds.Fila();
        fila14.enfileira((java.lang.Object) fila15);
        fila9.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass19 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        fila9.enfileira((java.lang.Object) 100);
        java.lang.Object obj14 = fila9.desenfileira();
        fila0.enfileira(obj14);
        java.lang.Object obj16 = fila0.desenfileira();
        boolean boolean17 = fila0.vazia();
        java.lang.Object obj18 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100 + "'", obj14, 100);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100 + "'", obj18, 100);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Class<?> wildcardClass21 = fila11.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        fila1.imprime();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) false);
        fila4.imprime();
        fila1.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila8);
        fila7.enfileira((java.lang.Object) (-1));
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj18 = fila13.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        ds.Fila fila20 = new ds.Fila();
        fila19.enfileira((java.lang.Object) fila20);
        java.lang.Object obj22 = null;
        fila19.enfileira(obj22);
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        fila24.enfileira((java.lang.Object) fila26);
        fila24.imprime();
        boolean boolean30 = fila24.vazia();
        fila24.imprime();
        fila19.enfileira((java.lang.Object) fila24);
        fila13.enfileira((java.lang.Object) fila24);
        fila13.imprime();
        java.lang.Object obj35 = fila13.desenfileira();
        boolean boolean36 = fila13.vazia();
        fila7.enfileira((java.lang.Object) fila13);
        java.lang.Object obj38 = fila7.desenfileira();
        java.lang.Object obj39 = fila7.desenfileira();
        fila7.imprime();
        boolean boolean41 = fila7.vazia();
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1) + "'", obj39, (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        java.lang.Object obj12 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) (short) 100);
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        boolean boolean17 = fila2.vazia();
        fila2.imprime();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila8);
        fila7.enfileira((java.lang.Object) (-1));
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj18 = fila13.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        ds.Fila fila20 = new ds.Fila();
        fila19.enfileira((java.lang.Object) fila20);
        java.lang.Object obj22 = null;
        fila19.enfileira(obj22);
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        fila24.enfileira((java.lang.Object) fila26);
        fila24.imprime();
        boolean boolean30 = fila24.vazia();
        fila24.imprime();
        fila19.enfileira((java.lang.Object) fila24);
        fila13.enfileira((java.lang.Object) fila24);
        fila13.imprime();
        java.lang.Object obj35 = fila13.desenfileira();
        boolean boolean36 = fila13.vazia();
        fila7.enfileira((java.lang.Object) fila13);
        fila13.imprime();
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.imprime();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        java.lang.Object obj16 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        fila9.enfileira((java.lang.Object) 100);
        java.lang.Object obj14 = fila9.desenfileira();
        fila0.enfileira(obj14);
        java.lang.Object obj16 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100 + "'", obj14, 100);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila15.enfileira((java.lang.Object) fila17);
        fila17.enfileira((java.lang.Object) 100);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila22.enfileira((java.lang.Object) fila24);
        java.lang.Object obj27 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 100);
        fila22.imprime();
        fila17.enfileira((java.lang.Object) fila22);
        fila0.enfileira((java.lang.Object) fila22);
        java.lang.Object obj33 = fila22.desenfileira();
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 100 + "'", obj33, (short) 100);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj21 = fila11.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = fila11.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila6.enfileira((java.lang.Object) fila8);
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila6.enfileira((java.lang.Object) fila13);
        java.lang.Class<?> wildcardClass19 = fila13.getClass();
        fila0.enfileira((java.lang.Object) fila13);
        boolean boolean21 = fila13.vazia();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        fila1.imprime();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) false);
        fila4.imprime();
        fila1.enfileira((java.lang.Object) fila4);
        java.lang.Class<?> wildcardClass10 = fila1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) false);
        fila5.enfileira((java.lang.Object) fila8);
        boolean boolean13 = fila8.vazia();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila15.enfileira((java.lang.Object) fila17);
        fila17.enfileira((java.lang.Object) 100);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila22.enfileira((java.lang.Object) fila24);
        java.lang.Object obj27 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 100);
        fila22.imprime();
        fila17.enfileira((java.lang.Object) fila22);
        fila0.enfileira((java.lang.Object) fila22);
        ds.Fila fila33 = new ds.Fila();
        ds.Fila fila34 = new ds.Fila();
        fila33.enfileira((java.lang.Object) fila34);
        fila22.enfileira((java.lang.Object) fila33);
        java.lang.Class<?> wildcardClass37 = fila33.getClass();
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj14 = fila0.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila19.enfileira((java.lang.Object) fila21);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        fila19.enfileira(obj24);
        java.lang.Class<?> wildcardClass27 = fila19.getClass();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila29 = new ds.Fila();
        ds.Fila fila30 = new ds.Fila();
        fila29.enfileira((java.lang.Object) fila30);
        java.lang.Object obj32 = fila29.desenfileira();
        fila19.enfileira((java.lang.Object) fila29);
        fila0.enfileira((java.lang.Object) fila29);
        boolean boolean35 = fila29.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj21 = fila11.desenfileira();
        java.lang.Object obj22 = null;
        fila11.enfileira(obj22);
        java.lang.Class<?> wildcardClass24 = fila11.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        fila6.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila6.desenfileira();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        boolean boolean15 = fila6.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        ds.Fila fila10 = new ds.Fila();
        fila9.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        ds.Fila fila10 = new ds.Fila();
        fila9.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila13.enfileira((java.lang.Object) fila15);
        java.lang.Object obj18 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) (short) 100);
        boolean boolean21 = fila13.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila22.enfileira((java.lang.Object) fila24);
        java.lang.Object obj27 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 100);
        fila22.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.imprime();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila22.enfileira((java.lang.Object) fila31);
        fila13.enfileira((java.lang.Object) fila31);
        fila0.enfileira((java.lang.Object) fila31);
        fila0.imprime();
        java.lang.Class<?> wildcardClass40 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila8);
        java.lang.Object obj10 = null;
        fila7.enfileira(obj10);
        ds.Fila fila12 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila12);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila14.enfileira((java.lang.Object) false);
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj19 = new java.lang.Object();
        fila7.enfileira(obj19);
        fila0.enfileira((java.lang.Object) fila7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila0.vazia();
        boolean boolean22 = fila0.vazia();
        boolean boolean23 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        ds.Fila fila10 = new ds.Fila();
        fila9.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean13 = fila9.vazia();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        fila1.imprime();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) false);
        fila4.imprime();
        fila1.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        ds.Fila fila11 = new ds.Fila();
        fila10.enfileira((java.lang.Object) fila11);
        java.lang.Object obj13 = null;
        fila10.enfileira(obj13);
        ds.Fila fila15 = new ds.Fila();
        fila10.enfileira((java.lang.Object) fila15);
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj18 = fila10.desenfileira();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila6.enfileira((java.lang.Object) fila8);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        fila6.enfileira(obj11);
        java.lang.Class<?> wildcardClass14 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        java.lang.Object obj22 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        java.lang.Object obj14 = fila9.desenfileira();
        fila9.enfileira((java.lang.Object) (short) 100);
        fila9.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 100.0f);
        fila9.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        java.lang.Class<?> wildcardClass26 = fila18.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = fila4.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila4.enfileira((java.lang.Object) boolean11);
        java.lang.Object obj13 = fila4.desenfileira();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila15 = new ds.Fila();
        ds.Fila fila16 = new ds.Fila();
        fila15.enfileira((java.lang.Object) fila16);
        fila16.imprime();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila19.enfileira((java.lang.Object) false);
        fila19.imprime();
        fila16.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        ds.Fila fila26 = new ds.Fila();
        fila25.enfileira((java.lang.Object) fila26);
        java.lang.Object obj28 = null;
        fila25.enfileira(obj28);
        ds.Fila fila30 = new ds.Fila();
        fila25.enfileira((java.lang.Object) fila30);
        fila19.enfileira((java.lang.Object) fila25);
        fila0.enfileira((java.lang.Object) fila19);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        fila6.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila6.desenfileira();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        boolean boolean16 = fila14.vazia();
        fila6.enfileira((java.lang.Object) boolean16);
        fila6.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila0.enfileira((java.lang.Object) boolean7);
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj12 = new java.lang.Object();
        fila0.enfileira(obj12);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila9.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.imprime();
        fila16.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        fila23.imprime();
        fila23.enfileira((java.lang.Object) 100.0f);
        fila16.enfileira((java.lang.Object) fila23);
        fila16.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        fila31.enfileira((java.lang.Object) fila33);
        fila33.enfileira((java.lang.Object) 100);
        ds.Fila fila38 = new ds.Fila();
        fila38.imprime();
        ds.Fila fila40 = new ds.Fila();
        fila40.imprime();
        fila38.enfileira((java.lang.Object) fila40);
        java.lang.Object obj43 = fila38.desenfileira();
        fila38.enfileira((java.lang.Object) (short) 100);
        fila38.imprime();
        fila33.enfileira((java.lang.Object) fila38);
        fila16.enfileira((java.lang.Object) fila38);
        fila9.enfileira((java.lang.Object) fila38);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        fila6.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila6.desenfileira();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Class<?> wildcardClass14 = fila6.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj14 = fila0.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila19.enfileira((java.lang.Object) fila21);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        fila19.enfileira(obj24);
        java.lang.Class<?> wildcardClass27 = fila19.getClass();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila29 = new ds.Fila();
        ds.Fila fila30 = new ds.Fila();
        fila29.enfileira((java.lang.Object) fila30);
        java.lang.Object obj32 = fila29.desenfileira();
        fila19.enfileira((java.lang.Object) fila29);
        fila0.enfileira((java.lang.Object) fila29);
        java.lang.Class<?> wildcardClass35 = fila29.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila15.enfileira((java.lang.Object) fila17);
        fila17.enfileira((java.lang.Object) 100);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila22.enfileira((java.lang.Object) fila24);
        java.lang.Object obj27 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 100);
        fila22.imprime();
        fila17.enfileira((java.lang.Object) fila22);
        fila0.enfileira((java.lang.Object) fila22);
        boolean boolean33 = fila22.vazia();
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila0.enfileira((java.lang.Object) boolean7);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila0.enfileira((java.lang.Object) boolean7);
        fila0.imprime();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        fila9.enfileira((java.lang.Object) 100);
        java.lang.Object obj14 = fila9.desenfileira();
        fila0.enfileira(obj14);
        boolean boolean16 = fila0.vazia();
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100 + "'", obj14, 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila11.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila14.enfileira((java.lang.Object) fila16);
        java.lang.Object obj19 = fila14.desenfileira();
        fila14.enfileira((java.lang.Object) (short) 100);
        boolean boolean22 = fila14.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila23.enfileira((java.lang.Object) fila25);
        java.lang.Object obj28 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) (short) 100);
        fila23.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila23.enfileira((java.lang.Object) fila32);
        fila14.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        fila32.imprime();
        boolean boolean41 = fila32.vazia();
        java.lang.Object obj42 = fila32.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        boolean boolean3 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        java.lang.Object obj14 = fila9.desenfileira();
        fila9.enfileira((java.lang.Object) (short) 100);
        fila9.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 100.0f);
        fila9.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        boolean boolean25 = fila18.vazia();
        java.lang.Class<?> wildcardClass26 = fila18.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        fila5.enfileira((java.lang.Object) fila6);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        fila9.imprime();
        boolean boolean15 = fila9.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        java.lang.Object obj14 = fila9.desenfileira();
        fila9.enfileira((java.lang.Object) (short) 100);
        fila9.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 100.0f);
        fila9.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        boolean boolean25 = fila18.vazia();
        fila18.imprime();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila15.enfileira((java.lang.Object) fila17);
        fila17.enfileira((java.lang.Object) 100);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila22.enfileira((java.lang.Object) fila24);
        java.lang.Object obj27 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 100);
        fila22.imprime();
        fila17.enfileira((java.lang.Object) fila22);
        fila0.enfileira((java.lang.Object) fila22);
        java.lang.Object obj33 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass34 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila5.enfileira((java.lang.Object) fila7);
        fila7.enfileira((java.lang.Object) 100);
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila12.enfileira((java.lang.Object) fila14);
        fila12.imprime();
        fila12.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) 100.0f);
        fila12.enfileira((java.lang.Object) fila19);
        fila12.enfileira((java.lang.Object) (short) 1);
        fila7.enfileira((java.lang.Object) fila12);
        boolean boolean28 = fila12.vazia();
        fila0.enfileira((java.lang.Object) fila12);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila15.enfileira((java.lang.Object) fila17);
        fila17.enfileira((java.lang.Object) 100);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila22.enfileira((java.lang.Object) fila24);
        java.lang.Object obj27 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 100);
        fila22.imprime();
        fila17.enfileira((java.lang.Object) fila22);
        fila0.enfileira((java.lang.Object) fila22);
        ds.Fila fila33 = new ds.Fila();
        ds.Fila fila34 = new ds.Fila();
        fila33.enfileira((java.lang.Object) fila34);
        fila22.enfileira((java.lang.Object) fila33);
        java.lang.Class<?> wildcardClass37 = fila22.getClass();
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) ' ');
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + ' ' + "'", obj10, ' ');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila6.enfileira((java.lang.Object) fila8);
        java.lang.Object obj11 = null;
        fila6.enfileira(obj11);
        boolean boolean13 = fila6.vazia();
        java.lang.Object obj14 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila16 = new ds.Fila();
        ds.Fila fila17 = new ds.Fila();
        fila16.enfileira((java.lang.Object) fila17);
        java.lang.Object obj19 = null;
        fila16.enfileira(obj19);
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        fila21.enfileira((java.lang.Object) fila23);
        fila21.imprime();
        boolean boolean27 = fila21.vazia();
        fila21.imprime();
        fila16.enfileira((java.lang.Object) fila21);
        boolean boolean30 = fila16.vazia();
        java.lang.Class<?> wildcardClass31 = fila16.getClass();
        fila0.enfileira((java.lang.Object) fila16);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.imprime();
        fila7.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) 100.0f);
        fila7.enfileira((java.lang.Object) fila14);
        fila7.enfileira((java.lang.Object) (short) 1);
        fila2.enfileira((java.lang.Object) fila7);
        boolean boolean23 = fila2.vazia();
        fila2.imprime();
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila6.enfileira((java.lang.Object) fila8);
        java.lang.Object obj11 = null;
        fila6.enfileira(obj11);
        boolean boolean13 = fila6.vazia();
        java.lang.Object obj14 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean16 = fila6.vazia();
        java.lang.Class<?> wildcardClass17 = fila6.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila0.enfileira((java.lang.Object) boolean7);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        java.lang.Object obj22 = fila0.desenfileira();
        boolean boolean23 = fila0.vazia();
        fila0.imprime();
        boolean boolean25 = fila0.vazia();
        boolean boolean26 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        java.lang.Object obj12 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) (short) 100);
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        java.lang.Object obj17 = fila2.desenfileira();
        boolean boolean18 = fila2.vazia();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100 + "'", obj17, 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj21 = fila11.desenfileira();
        java.lang.Object obj22 = null;
        fila11.enfileira(obj22);
        boolean boolean24 = fila11.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        java.lang.Object obj22 = fila0.desenfileira();
        boolean boolean23 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        ds.Fila fila14 = new ds.Fila();
        ds.Fila fila15 = new ds.Fila();
        fila14.enfileira((java.lang.Object) fila15);
        fila9.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila19.enfileira((java.lang.Object) fila21);
        fila21.enfileira((java.lang.Object) 100);
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        fila9.enfileira((java.lang.Object) fila21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = fila21.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100 + "'", obj26, 100);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        ds.Fila fila14 = new ds.Fila();
        ds.Fila fila15 = new ds.Fila();
        fila14.enfileira((java.lang.Object) fila15);
        fila9.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass19 = fila9.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.imprime();
        fila7.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) 100.0f);
        fila7.enfileira((java.lang.Object) fila14);
        fila7.enfileira((java.lang.Object) (short) 1);
        fila2.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila24.enfileira((java.lang.Object) false);
        fila7.enfileira((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        fila0.enfileira(obj5);
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        fila9.imprime();
        boolean boolean15 = fila9.vazia();
        fila9.imprime();
        fila9.imprime();
        java.lang.Object obj18 = fila9.desenfileira();
        fila0.enfileira(obj18);
        java.lang.Object obj20 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        ds.Fila fila3 = new ds.Fila();
        fila2.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        boolean boolean6 = fila3.vazia();
        fila0.enfileira((java.lang.Object) boolean6);
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        fila1.imprime();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) false);
        fila4.imprime();
        fila1.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila4.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila8);
        fila7.enfileira((java.lang.Object) (-1));
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        java.lang.Class<?> wildcardClass16 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila6.enfileira((java.lang.Object) fila8);
        java.lang.Object obj11 = null;
        fila6.enfileira(obj11);
        boolean boolean13 = fila6.vazia();
        java.lang.Object obj14 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean16 = fila0.vazia();
        boolean boolean17 = fila0.vazia();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila0.vazia();
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        ds.Fila fila24 = new ds.Fila();
        fila23.enfileira((java.lang.Object) fila24);
        java.lang.Object obj26 = fila23.desenfileira();
        fila23.imprime();
        boolean boolean28 = fila23.vazia();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila6.enfileira((java.lang.Object) fila8);
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 100.0f);
        fila6.enfileira((java.lang.Object) fila13);
        java.lang.Class<?> wildcardClass19 = fila13.getClass();
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Class<?> wildcardClass21 = fila13.getClass();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean13 = fila7.vazia();
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        boolean boolean16 = fila14.vazia();
        fila7.enfileira((java.lang.Object) boolean16);
        boolean boolean18 = fila7.vazia();
        java.lang.Object obj19 = fila7.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila8.enfileira((java.lang.Object) fila10);
        fila10.enfileira((java.lang.Object) 100);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj16 = fila10.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        ds.Fila fila18 = new ds.Fila();
        fila17.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila21.enfileira((java.lang.Object) false);
        fila21.imprime();
        fila18.enfileira((java.lang.Object) fila21);
        ds.Fila fila27 = new ds.Fila();
        ds.Fila fila28 = new ds.Fila();
        fila27.enfileira((java.lang.Object) fila28);
        java.lang.Object obj30 = null;
        fila27.enfileira(obj30);
        ds.Fila fila32 = new ds.Fila();
        fila27.enfileira((java.lang.Object) fila32);
        fila21.enfileira((java.lang.Object) fila27);
        fila10.enfileira((java.lang.Object) fila27);
        boolean boolean36 = fila27.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        java.lang.Class<?> wildcardClass22 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) (short) 1);
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj13 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        fila0.imprime();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.imprime();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj20 = fila15.desenfileira();
        fila15.imprime();
        boolean boolean22 = fila15.vazia();
        fila5.enfileira((java.lang.Object) boolean22);
        java.lang.Object obj24 = fila5.desenfileira();
        java.lang.Object obj25 = fila5.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = fila5.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + true + "'", obj25, true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass7 = fila2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila0.vazia();
        java.lang.Object obj22 = fila0.desenfileira();
        boolean boolean23 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila9.desenfileira();
        fila9.imprime();
        boolean boolean17 = fila9.vazia();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila8);
        java.lang.Object obj10 = null;
        fila7.enfileira(obj10);
        ds.Fila fila12 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila12);
        ds.Fila fila14 = new ds.Fila();
        ds.Fila fila15 = new ds.Fila();
        fila14.enfileira((java.lang.Object) fila15);
        fila14.enfileira((java.lang.Object) (-1));
        fila7.enfileira((java.lang.Object) fila14);
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj25 = fila20.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        ds.Fila fila27 = new ds.Fila();
        fila26.enfileira((java.lang.Object) fila27);
        java.lang.Object obj29 = null;
        fila26.enfileira(obj29);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        fila31.enfileira((java.lang.Object) fila33);
        fila31.imprime();
        boolean boolean37 = fila31.vazia();
        fila31.imprime();
        fila26.enfileira((java.lang.Object) fila31);
        fila20.enfileira((java.lang.Object) fila31);
        fila20.imprime();
        java.lang.Object obj42 = fila20.desenfileira();
        boolean boolean43 = fila20.vazia();
        fila14.enfileira((java.lang.Object) fila20);
        java.lang.Object obj45 = fila14.desenfileira();
        fila0.enfileira(obj45);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        ds.Fila fila10 = new ds.Fila();
        fila9.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila13.enfileira((java.lang.Object) fila15);
        java.lang.Object obj18 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) (short) 100);
        boolean boolean21 = fila13.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila22.enfileira((java.lang.Object) fila24);
        java.lang.Object obj27 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 100);
        fila22.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.imprime();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila22.enfileira((java.lang.Object) fila31);
        fila13.enfileira((java.lang.Object) fila31);
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila39 = new ds.Fila();
        ds.Fila fila40 = new ds.Fila();
        fila39.enfileira((java.lang.Object) fila40);
        java.lang.Object obj42 = fila39.desenfileira();
        fila0.enfileira((java.lang.Object) fila39);
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        fila44.imprime();
        fila44.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj49 = fila44.desenfileira();
        ds.Fila fila50 = new ds.Fila();
        ds.Fila fila51 = new ds.Fila();
        fila50.enfileira((java.lang.Object) fila51);
        java.lang.Object obj53 = null;
        fila50.enfileira(obj53);
        ds.Fila fila55 = new ds.Fila();
        fila55.imprime();
        ds.Fila fila57 = new ds.Fila();
        fila57.imprime();
        fila55.enfileira((java.lang.Object) fila57);
        fila55.imprime();
        boolean boolean61 = fila55.vazia();
        fila55.imprime();
        fila50.enfileira((java.lang.Object) fila55);
        fila44.enfileira((java.lang.Object) fila55);
        fila0.enfileira((java.lang.Object) fila55);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0f + "'", obj49, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj21 = fila11.desenfileira();
        java.lang.Class<?> wildcardClass22 = fila11.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.imprime();
        fila5.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) 100.0f);
        fila5.enfileira((java.lang.Object) fila12);
        fila5.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj25 = fila20.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        ds.Fila fila27 = new ds.Fila();
        fila26.enfileira((java.lang.Object) fila27);
        java.lang.Object obj29 = null;
        fila26.enfileira(obj29);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        fila31.enfileira((java.lang.Object) fila33);
        fila31.imprime();
        boolean boolean37 = fila31.vazia();
        fila31.imprime();
        fila26.enfileira((java.lang.Object) fila31);
        fila20.enfileira((java.lang.Object) fila31);
        fila20.imprime();
        java.lang.Object obj42 = fila20.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        fila43.enfileira((java.lang.Object) fila45);
        fila43.imprime();
        fila43.imprime();
        ds.Fila fila50 = new ds.Fila();
        fila50.imprime();
        fila50.imprime();
        fila50.enfileira((java.lang.Object) 100.0f);
        fila43.enfileira((java.lang.Object) fila50);
        fila43.enfileira((java.lang.Object) (short) 1);
        fila20.enfileira((java.lang.Object) fila43);
        fila5.enfileira((java.lang.Object) fila43);
        fila2.enfileira((java.lang.Object) fila43);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        fila0.enfileira((java.lang.Object) (-1));
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) (short) 1);
        fila0.enfileira((java.lang.Object) (short) 10);
        ds.Fila fila17 = new ds.Fila();
        ds.Fila fila18 = new ds.Fila();
        fila17.enfileira((java.lang.Object) fila18);
        java.lang.Object obj20 = null;
        fila17.enfileira(obj20);
        ds.Fila fila22 = new ds.Fila();
        fila17.enfileira((java.lang.Object) fila22);
        ds.Fila fila24 = new ds.Fila();
        ds.Fila fila25 = new ds.Fila();
        fila24.enfileira((java.lang.Object) fila25);
        fila24.enfileira((java.lang.Object) (-1));
        fila17.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila24);
        fila0.imprime();
        ds.Fila fila32 = new ds.Fila();
        ds.Fila fila33 = new ds.Fila();
        fila32.enfileira((java.lang.Object) fila33);
        java.lang.Object obj35 = null;
        fila32.enfileira(obj35);
        ds.Fila fila37 = new ds.Fila();
        fila32.enfileira((java.lang.Object) fila37);
        fila32.enfileira((java.lang.Object) 10.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila8);
        fila7.enfileira((java.lang.Object) (-1));
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj18 = fila13.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        ds.Fila fila20 = new ds.Fila();
        fila19.enfileira((java.lang.Object) fila20);
        java.lang.Object obj22 = null;
        fila19.enfileira(obj22);
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        fila24.enfileira((java.lang.Object) fila26);
        fila24.imprime();
        boolean boolean30 = fila24.vazia();
        fila24.imprime();
        fila19.enfileira((java.lang.Object) fila24);
        fila13.enfileira((java.lang.Object) fila24);
        fila13.imprime();
        java.lang.Object obj35 = fila13.desenfileira();
        boolean boolean36 = fila13.vazia();
        fila7.enfileira((java.lang.Object) fila13);
        ds.Fila fila38 = new ds.Fila();
        fila38.imprime();
        ds.Fila fila40 = new ds.Fila();
        fila40.imprime();
        fila38.enfileira((java.lang.Object) fila40);
        java.lang.Object obj43 = fila38.desenfileira();
        ds.Fila fila44 = new ds.Fila();
        boolean boolean45 = fila44.vazia();
        fila38.enfileira((java.lang.Object) boolean45);
        fila38.imprime();
        fila38.enfileira((java.lang.Object) (short) 1);
        fila13.enfileira((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass51 = fila13.getClass();
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila14.enfileira((java.lang.Object) fila16);
        java.lang.Object obj19 = fila14.desenfileira();
        fila14.enfileira((java.lang.Object) (short) 100);
        boolean boolean22 = fila14.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila23.enfileira((java.lang.Object) fila25);
        java.lang.Object obj28 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) (short) 100);
        fila23.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila23.enfileira((java.lang.Object) fila32);
        fila14.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        fila32.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila42 = new ds.Fila();
        fila42.imprime();
        fila42.imprime();
        fila42.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj47 = fila42.desenfileira();
        ds.Fila fila48 = new ds.Fila();
        ds.Fila fila49 = new ds.Fila();
        fila48.enfileira((java.lang.Object) fila49);
        java.lang.Object obj51 = null;
        fila48.enfileira(obj51);
        ds.Fila fila53 = new ds.Fila();
        fila53.imprime();
        ds.Fila fila55 = new ds.Fila();
        fila55.imprime();
        fila53.enfileira((java.lang.Object) fila55);
        fila53.imprime();
        boolean boolean59 = fila53.vazia();
        fila53.imprime();
        fila48.enfileira((java.lang.Object) fila53);
        fila42.enfileira((java.lang.Object) fila53);
        fila42.imprime();
        java.lang.Object obj64 = fila42.desenfileira();
        fila32.enfileira(obj64);
        java.lang.Object obj66 = fila32.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0f + "'", obj47, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 100.0f + "'", obj66, 100.0f);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila9.imprime();
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila0.enfileira((java.lang.Object) boolean7);
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Object obj13 = null;
        fila0.enfileira(obj13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        java.lang.Object obj22 = fila0.desenfileira();
        boolean boolean23 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.imprime();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        java.lang.Object obj16 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        java.lang.Object obj14 = fila9.desenfileira();
        fila9.enfileira((java.lang.Object) (short) 100);
        fila9.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 100.0f);
        fila9.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        ds.Fila fila26 = new ds.Fila();
        ds.Fila fila27 = new ds.Fila();
        fila26.enfileira((java.lang.Object) fila27);
        java.lang.Object obj29 = null;
        fila26.enfileira(obj29);
        ds.Fila fila31 = new ds.Fila();
        fila26.enfileira((java.lang.Object) fila31);
        ds.Fila fila33 = new ds.Fila();
        ds.Fila fila34 = new ds.Fila();
        fila33.enfileira((java.lang.Object) fila34);
        fila33.enfileira((java.lang.Object) (-1));
        fila26.enfileira((java.lang.Object) fila33);
        fila33.imprime();
        fila18.enfileira((java.lang.Object) fila33);
        java.lang.Class<?> wildcardClass41 = fila33.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.imprime();
        java.lang.Class<?> wildcardClass9 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        fila9.enfileira((java.lang.Object) 100);
        java.lang.Object obj14 = fila9.desenfileira();
        fila0.enfileira(obj14);
        boolean boolean16 = fila0.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila17.enfileira((java.lang.Object) fila19);
        java.lang.Object obj22 = fila17.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila17.enfileira((java.lang.Object) boolean24);
        fila17.imprime();
        fila17.enfileira((java.lang.Object) (short) 1);
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass30 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100 + "'", obj14, 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        fila5.enfileira((java.lang.Object) fila6);
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        fila0.enfileira(obj5);
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        fila9.enfileira((java.lang.Object) 100);
        java.lang.Object obj14 = fila9.desenfileira();
        fila0.enfileira(obj14);
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila16.enfileira((java.lang.Object) fila18);
        fila16.imprime();
        fila16.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        fila23.imprime();
        fila23.enfileira((java.lang.Object) 100.0f);
        fila16.enfileira((java.lang.Object) fila23);
        boolean boolean29 = fila23.vazia();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        java.lang.Class<?> wildcardClass32 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100 + "'", obj14, 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj14 = fila0.desenfileira();
        java.lang.Object obj15 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 'a');
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.enfileira((java.lang.Object) false);
        fila10.imprime();
        fila7.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        ds.Fila fila17 = new ds.Fila();
        fila16.enfileira((java.lang.Object) fila17);
        java.lang.Object obj19 = null;
        fila16.enfileira(obj19);
        ds.Fila fila21 = new ds.Fila();
        fila16.enfileira((java.lang.Object) fila21);
        fila10.enfileira((java.lang.Object) fila16);
        java.lang.Object obj24 = fila16.desenfileira();
        java.lang.Object obj25 = null;
        fila16.enfileira(obj25);
        java.lang.Object obj27 = fila16.desenfileira();
        fila0.enfileira(obj27);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = fila4.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila4.enfileira((java.lang.Object) boolean11);
        java.lang.Object obj13 = fila4.desenfileira();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean15 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila8);
        fila7.enfileira((java.lang.Object) (-1));
        fila0.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) (short) 0);
        java.lang.Object obj15 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj14 = fila0.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila15.enfileira((java.lang.Object) fila17);
        fila17.enfileira((java.lang.Object) 100);
        fila0.enfileira((java.lang.Object) 100);
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila23.enfileira((java.lang.Object) fila25);
        fila23.imprime();
        fila23.imprime();
        fila23.enfileira((java.lang.Object) ' ');
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila14 = new ds.Fila();
        ds.Fila fila15 = new ds.Fila();
        fila14.enfileira((java.lang.Object) fila15);
        java.lang.Object obj17 = fila14.desenfileira();
        fila4.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = fila14.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj15 = fila0.desenfileira();
        java.lang.Object obj16 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.imprime();
        fila7.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) 100.0f);
        fila7.enfileira((java.lang.Object) fila14);
        fila7.enfileira((java.lang.Object) (short) 1);
        fila2.enfileira((java.lang.Object) fila7);
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        fila23.imprime();
        fila23.enfileira((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass28 = fila23.getClass();
        fila2.enfileira((java.lang.Object) fila23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.imprime();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        java.lang.Object obj15 = fila5.desenfileira();
        fila5.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila17.enfileira((java.lang.Object) fila19);
        fila17.imprime();
        fila17.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) 100.0f);
        fila17.enfileira((java.lang.Object) fila24);
        fila17.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila17.enfileira((java.lang.Object) fila31);
        fila5.enfileira((java.lang.Object) fila17);
        java.lang.Object obj34 = fila17.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        ds.Fila fila10 = new ds.Fila();
        fila9.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila13.enfileira((java.lang.Object) fila15);
        java.lang.Object obj18 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) (short) 100);
        boolean boolean21 = fila13.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila22.enfileira((java.lang.Object) fila24);
        java.lang.Object obj27 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 100);
        fila22.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.imprime();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila22.enfileira((java.lang.Object) fila31);
        fila13.enfileira((java.lang.Object) fila31);
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila39 = new ds.Fila();
        fila39.imprime();
        ds.Fila fila41 = new ds.Fila();
        fila41.imprime();
        fila39.enfileira((java.lang.Object) fila41);
        fila41.enfileira((java.lang.Object) 100);
        java.lang.Object obj46 = fila41.desenfileira();
        boolean boolean47 = fila41.vazia();
        fila31.enfileira((java.lang.Object) boolean47);
        fila31.imprime();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100 + "'", obj46, 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila15.enfileira((java.lang.Object) fila17);
        fila17.enfileira((java.lang.Object) 100);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila22.enfileira((java.lang.Object) fila24);
        java.lang.Object obj27 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 100);
        fila22.imprime();
        fila17.enfileira((java.lang.Object) fila22);
        fila0.enfileira((java.lang.Object) fila22);
        java.lang.Object obj33 = fila0.desenfileira();
        boolean boolean34 = fila0.vazia();
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        ds.Fila fila10 = new ds.Fila();
        fila9.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila13.enfileira((java.lang.Object) fila15);
        java.lang.Object obj18 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) (short) 100);
        boolean boolean21 = fila13.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila22.enfileira((java.lang.Object) fila24);
        java.lang.Object obj27 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 100);
        fila22.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.imprime();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila22.enfileira((java.lang.Object) fila31);
        fila13.enfileira((java.lang.Object) fila31);
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila39 = new ds.Fila();
        ds.Fila fila40 = new ds.Fila();
        fila39.enfileira((java.lang.Object) fila40);
        java.lang.Object obj42 = fila39.desenfileira();
        fila0.enfileira((java.lang.Object) fila39);
        java.lang.Class<?> wildcardClass44 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        boolean boolean3 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0f);
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        fila1.imprime();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) false);
        fila4.imprime();
        fila1.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.enfileira((java.lang.Object) false);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila14.enfileira((java.lang.Object) fila16);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        fila14.enfileira(obj19);
        java.lang.Class<?> wildcardClass22 = fila14.getClass();
        fila10.enfileira((java.lang.Object) fila14);
        java.lang.Object obj24 = fila10.desenfileira();
        java.lang.Object obj25 = fila10.desenfileira();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj27 = fila4.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        ds.Fila fila10 = new ds.Fila();
        fila9.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila13.enfileira((java.lang.Object) fila15);
        java.lang.Object obj18 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) (short) 100);
        boolean boolean21 = fila13.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila22.enfileira((java.lang.Object) fila24);
        java.lang.Object obj27 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 100);
        fila22.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.imprime();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila22.enfileira((java.lang.Object) fila31);
        fila13.enfileira((java.lang.Object) fila31);
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila39 = new ds.Fila();
        ds.Fila fila40 = new ds.Fila();
        fila39.enfileira((java.lang.Object) fila40);
        java.lang.Object obj42 = fila39.desenfileira();
        fila0.enfileira((java.lang.Object) fila39);
        boolean boolean44 = fila39.vazia();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj14 = fila0.desenfileira();
        java.lang.Object obj15 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila6.enfileira((java.lang.Object) fila8);
        java.lang.Object obj11 = fila6.desenfileira();
        fila6.enfileira((java.lang.Object) (short) 100);
        boolean boolean14 = fila6.vazia();
        ds.Fila fila15 = new ds.Fila();
        ds.Fila fila16 = new ds.Fila();
        fila15.enfileira((java.lang.Object) fila16);
        fila6.enfileira((java.lang.Object) fila15);
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila19.enfileira((java.lang.Object) fila21);
        java.lang.Object obj24 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) (short) 100);
        boolean boolean27 = fila19.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        fila28.enfileira((java.lang.Object) fila30);
        java.lang.Object obj33 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) (short) 100);
        fila28.imprime();
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.enfileira((java.lang.Object) 100.0f);
        fila28.enfileira((java.lang.Object) fila37);
        fila19.enfileira((java.lang.Object) fila37);
        fila6.enfileira((java.lang.Object) fila37);
        fila0.enfileira((java.lang.Object) fila37);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        ds.Fila fila10 = new ds.Fila();
        fila9.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila9.imprime();
        java.lang.Class<?> wildcardClass15 = fila9.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila14 = new ds.Fila();
        ds.Fila fila15 = new ds.Fila();
        fila14.enfileira((java.lang.Object) fila15);
        java.lang.Object obj17 = fila14.desenfileira();
        fila4.enfileira((java.lang.Object) fila14);
        ds.Fila fila19 = new ds.Fila();
        ds.Fila fila20 = new ds.Fila();
        fila19.enfileira((java.lang.Object) fila20);
        java.lang.Object obj22 = null;
        fila19.enfileira(obj22);
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        fila24.enfileira((java.lang.Object) fila26);
        fila24.imprime();
        boolean boolean30 = fila24.vazia();
        fila24.imprime();
        fila19.enfileira((java.lang.Object) fila24);
        fila24.enfileira((java.lang.Object) (short) 0);
        java.lang.Object obj35 = fila24.desenfileira();
        fila4.enfileira(obj35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila0.vazia();
        java.lang.Class<?> wildcardClass22 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        fila21.enfileira((java.lang.Object) fila23);
        java.lang.Object obj26 = fila21.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila27.enfileira((java.lang.Object) fila29);
        java.lang.Object obj32 = null;
        fila27.enfileira(obj32);
        boolean boolean34 = fila27.vazia();
        java.lang.Object obj35 = fila27.desenfileira();
        fila21.enfileira((java.lang.Object) fila27);
        fila0.enfileira((java.lang.Object) fila27);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 100);
        fila4.imprime();
        java.lang.Class<?> wildcardClass13 = fila4.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj22 = fila17.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        ds.Fila fila24 = new ds.Fila();
        fila23.enfileira((java.lang.Object) fila24);
        java.lang.Object obj26 = null;
        fila23.enfileira(obj26);
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        fila28.enfileira((java.lang.Object) fila30);
        fila28.imprime();
        boolean boolean34 = fila28.vazia();
        fila28.imprime();
        fila23.enfileira((java.lang.Object) fila28);
        fila17.enfileira((java.lang.Object) fila28);
        fila17.imprime();
        fila17.imprime();
        fila0.enfileira((java.lang.Object) fila17);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "class ds.Fila");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila7.enfileira((java.lang.Object) fila8);
        fila7.enfileira((java.lang.Object) (-1));
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj18 = fila13.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        ds.Fila fila20 = new ds.Fila();
        fila19.enfileira((java.lang.Object) fila20);
        java.lang.Object obj22 = null;
        fila19.enfileira(obj22);
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        fila24.enfileira((java.lang.Object) fila26);
        fila24.imprime();
        boolean boolean30 = fila24.vazia();
        fila24.imprime();
        fila19.enfileira((java.lang.Object) fila24);
        fila13.enfileira((java.lang.Object) fila24);
        fila13.imprime();
        java.lang.Object obj35 = fila13.desenfileira();
        boolean boolean36 = fila13.vazia();
        fila7.enfileira((java.lang.Object) fila13);
        java.lang.Object obj38 = fila7.desenfileira();
        java.lang.Object obj39 = fila7.desenfileira();
        fila7.imprime();
        java.lang.Class<?> wildcardClass41 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1) + "'", obj39, (-1));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila14.enfileira((java.lang.Object) fila16);
        java.lang.Object obj19 = fila14.desenfileira();
        fila14.enfileira((java.lang.Object) (short) 100);
        boolean boolean22 = fila14.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila23.enfileira((java.lang.Object) fila25);
        java.lang.Object obj28 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) (short) 100);
        fila23.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila23.enfileira((java.lang.Object) fila32);
        fila14.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        fila32.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila42 = new ds.Fila();
        fila42.imprime();
        fila42.imprime();
        fila42.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj47 = fila42.desenfileira();
        ds.Fila fila48 = new ds.Fila();
        ds.Fila fila49 = new ds.Fila();
        fila48.enfileira((java.lang.Object) fila49);
        java.lang.Object obj51 = null;
        fila48.enfileira(obj51);
        ds.Fila fila53 = new ds.Fila();
        fila53.imprime();
        ds.Fila fila55 = new ds.Fila();
        fila55.imprime();
        fila53.enfileira((java.lang.Object) fila55);
        fila53.imprime();
        boolean boolean59 = fila53.vazia();
        fila53.imprime();
        fila48.enfileira((java.lang.Object) fila53);
        fila42.enfileira((java.lang.Object) fila53);
        fila42.imprime();
        java.lang.Object obj64 = fila42.desenfileira();
        fila32.enfileira(obj64);
        ds.Fila fila66 = new ds.Fila();
        ds.Fila fila67 = new ds.Fila();
        fila66.enfileira((java.lang.Object) fila67);
        java.lang.Object obj69 = fila66.desenfileira();
        ds.Fila fila70 = new ds.Fila();
        fila70.imprime();
        ds.Fila fila72 = new ds.Fila();
        fila72.imprime();
        fila70.enfileira((java.lang.Object) fila72);
        java.lang.Object obj75 = fila70.desenfileira();
        fila70.enfileira((java.lang.Object) (short) 100);
        fila70.imprime();
        java.lang.Class<?> wildcardClass79 = fila70.getClass();
        fila66.enfileira((java.lang.Object) wildcardClass79);
        boolean boolean81 = fila66.vazia();
        java.lang.Class<?> wildcardClass82 = fila66.getClass();
        fila32.enfileira((java.lang.Object) wildcardClass82);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0f + "'", obj47, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = fila4.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila4.enfileira((java.lang.Object) boolean11);
        java.lang.Object obj13 = fila4.desenfileira();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Class<?> wildcardClass15 = fila4.getClass();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila0.vazia();
        java.lang.Object obj22 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean24 = fila0.vazia();
        ds.Fila fila25 = new ds.Fila();
        ds.Fila fila26 = new ds.Fila();
        fila25.enfileira((java.lang.Object) fila26);
        java.lang.Object obj28 = fila25.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila29.enfileira((java.lang.Object) fila31);
        java.lang.Object obj34 = fila29.desenfileira();
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        fila29.enfileira((java.lang.Object) boolean36);
        java.lang.Object obj38 = fila29.desenfileira();
        fila25.enfileira((java.lang.Object) fila29);
        fila0.enfileira((java.lang.Object) fila25);
        ds.Fila fila41 = new ds.Fila();
        ds.Fila fila42 = new ds.Fila();
        fila41.enfileira((java.lang.Object) fila42);
        java.lang.Object obj44 = null;
        fila41.enfileira(obj44);
        ds.Fila fila46 = new ds.Fila();
        fila41.enfileira((java.lang.Object) fila46);
        ds.Fila fila48 = new ds.Fila();
        ds.Fila fila49 = new ds.Fila();
        fila48.enfileira((java.lang.Object) fila49);
        fila48.enfileira((java.lang.Object) (-1));
        fila41.enfileira((java.lang.Object) fila48);
        fila41.enfileira((java.lang.Object) (short) 0);
        ds.Fila fila56 = new ds.Fila();
        ds.Fila fila57 = new ds.Fila();
        fila56.enfileira((java.lang.Object) fila57);
        java.lang.Object obj59 = null;
        fila56.enfileira(obj59);
        ds.Fila fila61 = new ds.Fila();
        fila56.enfileira((java.lang.Object) fila61);
        ds.Fila fila63 = new ds.Fila();
        ds.Fila fila64 = new ds.Fila();
        fila63.enfileira((java.lang.Object) fila64);
        fila63.enfileira((java.lang.Object) (-1));
        fila56.enfileira((java.lang.Object) fila63);
        boolean boolean69 = fila63.vazia();
        fila63.imprime();
        java.lang.Object obj71 = fila63.desenfileira();
        fila41.enfileira(obj71);
        fila25.enfileira(obj71);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(obj71);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        fila0.enfileira((java.lang.Object) (-1));
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        boolean boolean16 = fila9.vazia();
        fila9.imprime();
        java.lang.Object obj18 = fila9.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = fila9.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj14 = fila0.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila19.enfileira((java.lang.Object) fila21);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        fila19.enfileira(obj24);
        java.lang.Class<?> wildcardClass27 = fila19.getClass();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila29 = new ds.Fila();
        ds.Fila fila30 = new ds.Fila();
        fila29.enfileira((java.lang.Object) fila30);
        java.lang.Object obj32 = fila29.desenfileira();
        fila19.enfileira((java.lang.Object) fila29);
        fila0.enfileira((java.lang.Object) fila29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = fila29.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.imprime();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.enfileira((java.lang.Object) (short) 0);
        java.lang.Object obj16 = fila5.desenfileira();
        fila5.imprime();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        boolean boolean3 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0f + "'", obj10, 0.0f);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila14.enfileira((java.lang.Object) fila16);
        java.lang.Object obj19 = fila14.desenfileira();
        fila14.enfileira((java.lang.Object) (short) 100);
        boolean boolean22 = fila14.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila23.enfileira((java.lang.Object) fila25);
        java.lang.Object obj28 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) (short) 100);
        fila23.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila23.enfileira((java.lang.Object) fila32);
        fila14.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        fila32.imprime();
        ds.Fila fila41 = new ds.Fila();
        fila41.imprime();
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        fila41.enfileira((java.lang.Object) fila43);
        java.lang.Object obj46 = fila41.desenfileira();
        ds.Fila fila47 = new ds.Fila();
        boolean boolean48 = fila47.vazia();
        fila41.enfileira((java.lang.Object) boolean48);
        boolean boolean50 = fila41.vazia();
        java.lang.Class<?> wildcardClass51 = fila41.getClass();
        fila32.enfileira((java.lang.Object) fila41);
        java.lang.Class<?> wildcardClass53 = fila32.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila23.enfileira((java.lang.Object) fila25);
        fila23.imprime();
        fila23.imprime();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        fila30.imprime();
        fila30.enfileira((java.lang.Object) 100.0f);
        fila23.enfileira((java.lang.Object) fila30);
        fila23.enfileira((java.lang.Object) (short) 1);
        fila0.enfileira((java.lang.Object) fila23);
        java.lang.Class<?> wildcardClass39 = fila23.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj12 = new java.lang.Object();
        fila0.enfileira(obj12);
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila8.enfileira((java.lang.Object) fila10);
        fila10.enfileira((java.lang.Object) 100);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj16 = fila10.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        ds.Fila fila18 = new ds.Fila();
        fila17.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila21.enfileira((java.lang.Object) false);
        fila21.imprime();
        fila18.enfileira((java.lang.Object) fila21);
        ds.Fila fila27 = new ds.Fila();
        ds.Fila fila28 = new ds.Fila();
        fila27.enfileira((java.lang.Object) fila28);
        java.lang.Object obj30 = null;
        fila27.enfileira(obj30);
        ds.Fila fila32 = new ds.Fila();
        fila27.enfileira((java.lang.Object) fila32);
        fila21.enfileira((java.lang.Object) fila27);
        fila10.enfileira((java.lang.Object) fila27);
        fila10.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        java.lang.Object obj7 = fila2.desenfileira();
        fila2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila2.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100 + "'", obj7, 100);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila9.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        ds.Fila fila17 = new ds.Fila();
        fila16.enfileira((java.lang.Object) fila17);
        boolean boolean19 = fila16.vazia();
        ds.Fila fila20 = new ds.Fila();
        ds.Fila fila21 = new ds.Fila();
        fila20.enfileira((java.lang.Object) fila21);
        java.lang.Object obj23 = null;
        fila20.enfileira(obj23);
        java.lang.Class<?> wildcardClass25 = fila20.getClass();
        fila16.enfileira((java.lang.Object) wildcardClass25);
        fila9.enfileira((java.lang.Object) fila16);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean5 = fila2.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.imprime();
        fila7.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) 100.0f);
        fila7.enfileira((java.lang.Object) fila14);
        fila7.enfileira((java.lang.Object) (short) 1);
        fila2.enfileira((java.lang.Object) fila7);
        fila2.imprime();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        java.lang.Object obj14 = fila9.desenfileira();
        fila9.enfileira((java.lang.Object) (short) 100);
        fila9.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 100.0f);
        fila9.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        java.lang.Object obj25 = fila18.desenfileira();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean13 = fila7.vazia();
        boolean boolean14 = fila7.vazia();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        boolean boolean7 = fila2.vazia();
        boolean boolean8 = fila2.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila0.vazia();
        boolean boolean22 = fila0.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        fila23.imprime();
        fila23.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj28 = fila23.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        ds.Fila fila30 = new ds.Fila();
        fila29.enfileira((java.lang.Object) fila30);
        java.lang.Object obj32 = null;
        fila29.enfileira(obj32);
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        ds.Fila fila36 = new ds.Fila();
        fila36.imprime();
        fila34.enfileira((java.lang.Object) fila36);
        fila34.imprime();
        boolean boolean40 = fila34.vazia();
        fila34.imprime();
        fila29.enfileira((java.lang.Object) fila34);
        fila23.enfileira((java.lang.Object) fila34);
        boolean boolean44 = fila23.vazia();
        java.lang.Object obj45 = fila23.desenfileira();
        fila23.imprime();
        java.lang.Class<?> wildcardClass47 = fila23.getClass();
        fila0.enfileira((java.lang.Object) fila23);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila22.imprime();
        boolean boolean25 = fila22.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        fila26.enfileira((java.lang.Object) fila28);
        fila28.enfileira((java.lang.Object) 100);
        java.lang.Object obj33 = fila28.desenfileira();
        fila28.imprime();
        fila22.enfileira((java.lang.Object) fila28);
        ds.Fila fila36 = new ds.Fila();
        fila36.imprime();
        boolean boolean38 = fila36.vazia();
        fila28.enfileira((java.lang.Object) boolean38);
        fila11.enfileira((java.lang.Object) fila28);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100 + "'", obj33, 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila12.enfileira((java.lang.Object) fila14);
        fila12.imprime();
        boolean boolean18 = fila12.vazia();
        fila12.imprime();
        fila12.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        fila21.enfileira((java.lang.Object) fila23);
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 100);
        boolean boolean29 = fila21.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila30.enfileira((java.lang.Object) fila32);
        java.lang.Object obj35 = fila30.desenfileira();
        fila30.enfileira((java.lang.Object) (short) 100);
        fila30.imprime();
        ds.Fila fila39 = new ds.Fila();
        fila39.imprime();
        fila39.imprime();
        fila39.enfileira((java.lang.Object) 100.0f);
        fila30.enfileira((java.lang.Object) fila39);
        fila21.enfileira((java.lang.Object) fila39);
        boolean boolean46 = fila39.vazia();
        fila12.enfileira((java.lang.Object) boolean46);
        fila0.enfileira((java.lang.Object) boolean46);
        fila0.enfileira((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.imprime();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        ds.Fila fila17 = new ds.Fila();
        fila16.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.enfileira((java.lang.Object) false);
        fila20.imprime();
        fila17.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila20);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean21 = fila0.vazia();
        java.lang.Object obj22 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean24 = fila0.vazia();
        boolean boolean25 = fila0.vazia();
        java.lang.Class<?> wildcardClass26 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila14.enfileira((java.lang.Object) fila16);
        java.lang.Object obj19 = fila14.desenfileira();
        fila14.enfileira((java.lang.Object) (short) 100);
        boolean boolean22 = fila14.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila23.enfileira((java.lang.Object) fila25);
        java.lang.Object obj28 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) (short) 100);
        fila23.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila23.enfileira((java.lang.Object) fila32);
        fila14.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        java.lang.Object obj40 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        fila43.enfileira((java.lang.Object) fila45);
        ds.Fila fila48 = new ds.Fila();
        ds.Fila fila49 = new ds.Fila();
        fila48.enfileira((java.lang.Object) fila49);
        fila43.enfileira((java.lang.Object) fila48);
        fila43.enfileira((java.lang.Object) (short) 1);
        fila32.enfileira((java.lang.Object) (short) 1);
        fila32.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        ds.Fila fila5 = new ds.Fila();
        fila4.enfileira((java.lang.Object) fila5);
        java.lang.Object obj7 = null;
        fila4.enfileira(obj7);
        java.lang.Class<?> wildcardClass9 = fila4.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass9);
        ds.Fila fila11 = new ds.Fila();
        ds.Fila fila12 = new ds.Fila();
        fila11.enfileira((java.lang.Object) fila12);
        boolean boolean14 = fila11.vazia();
        fila11.enfileira((java.lang.Object) 0.0f);
        fila11.imprime();
        fila11.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj20 = fila11.desenfileira();
        fila0.enfileira((java.lang.Object) fila11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        fila9.enfileira((java.lang.Object) 100);
        java.lang.Object obj14 = fila9.desenfileira();
        fila0.enfileira(obj14);
        ds.Fila fila16 = new ds.Fila();
        ds.Fila fila17 = new ds.Fila();
        fila16.enfileira((java.lang.Object) fila17);
        java.lang.Object obj19 = null;
        fila16.enfileira(obj19);
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        fila21.enfileira((java.lang.Object) fila23);
        fila21.imprime();
        boolean boolean27 = fila21.vazia();
        fila21.imprime();
        fila16.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.imprime();
        fila31.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj36 = fila31.desenfileira();
        fila31.imprime();
        boolean boolean38 = fila31.vazia();
        fila21.enfileira((java.lang.Object) boolean38);
        java.lang.Object obj40 = fila21.desenfileira();
        fila0.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        fila43.enfileira((java.lang.Object) fila45);
        fila45.enfileira((java.lang.Object) 100);
        java.lang.Object obj50 = fila45.desenfileira();
        fila21.enfileira((java.lang.Object) fila45);
        java.lang.Class<?> wildcardClass52 = fila21.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100 + "'", obj14, 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100 + "'", obj50, 100);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        boolean boolean22 = fila11.vazia();
        java.lang.Class<?> wildcardClass23 = fila11.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila15.enfileira((java.lang.Object) fila17);
        fila17.enfileira((java.lang.Object) 100);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila22.enfileira((java.lang.Object) fila24);
        java.lang.Object obj27 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 100);
        fila22.imprime();
        fila17.enfileira((java.lang.Object) fila22);
        fila0.enfileira((java.lang.Object) fila22);
        boolean boolean33 = fila0.vazia();
        java.lang.Object obj34 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) (short) 1);
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.imprime();
        fila7.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) 100.0f);
        fila7.enfileira((java.lang.Object) fila14);
        fila7.enfileira((java.lang.Object) (short) 1);
        fila2.enfileira((java.lang.Object) fila7);
        boolean boolean23 = fila2.vazia();
        ds.Fila fila24 = new ds.Fila();
        ds.Fila fila25 = new ds.Fila();
        fila24.enfileira((java.lang.Object) fila25);
        java.lang.Object obj27 = fila24.desenfileira();
        fila2.enfileira(obj27);
        boolean boolean29 = fila2.vazia();
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila10.enfileira((java.lang.Object) fila12);
        fila10.imprime();
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila17.enfileira((java.lang.Object) fila19);
        fila19.enfileira((java.lang.Object) 100);
        java.lang.Object obj24 = fila19.desenfileira();
        fila10.enfileira(obj24);
        boolean boolean26 = fila10.vazia();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj28 = fila10.desenfileira();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100 + "'", obj24, 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila14 = new ds.Fila();
        ds.Fila fila15 = new ds.Fila();
        fila14.enfileira((java.lang.Object) fila15);
        java.lang.Object obj17 = fila14.desenfileira();
        fila4.enfileira((java.lang.Object) fila14);
        boolean boolean19 = fila14.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        boolean boolean3 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0f);
        java.lang.Object obj6 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.imprime();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        boolean boolean3 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0f);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        java.lang.Object obj7 = fila2.desenfileira();
        boolean boolean8 = fila2.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        java.lang.Object obj14 = fila9.desenfileira();
        fila9.enfileira((java.lang.Object) (short) 100);
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila18.enfileira((java.lang.Object) fila20);
        ds.Fila fila23 = new ds.Fila();
        ds.Fila fila24 = new ds.Fila();
        fila23.enfileira((java.lang.Object) fila24);
        fila18.enfileira((java.lang.Object) fila23);
        fila9.enfileira((java.lang.Object) fila18);
        fila9.imprime();
        fila2.enfileira((java.lang.Object) fila9);
        java.lang.Object obj30 = fila2.desenfileira();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100 + "'", obj7, 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        ds.Fila fila14 = new ds.Fila();
        ds.Fila fila15 = new ds.Fila();
        fila14.enfileira((java.lang.Object) fila15);
        fila9.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila19.enfileira((java.lang.Object) fila21);
        fila21.enfileira((java.lang.Object) 100);
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.imprime();
        fila9.enfileira((java.lang.Object) fila21);
        java.lang.Object obj29 = fila9.desenfileira();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100 + "'", obj26, 100);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila23.enfileira((java.lang.Object) fila25);
        fila23.imprime();
        fila23.imprime();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        fila30.imprime();
        fila30.enfileira((java.lang.Object) 100.0f);
        fila23.enfileira((java.lang.Object) fila30);
        fila23.enfileira((java.lang.Object) (short) 1);
        fila0.enfileira((java.lang.Object) fila23);
        fila23.imprime();
        ds.Fila fila40 = new ds.Fila();
        fila40.imprime();
        fila40.imprime();
        fila40.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj45 = fila40.desenfileira();
        ds.Fila fila46 = new ds.Fila();
        ds.Fila fila47 = new ds.Fila();
        fila46.enfileira((java.lang.Object) fila47);
        java.lang.Object obj49 = null;
        fila46.enfileira(obj49);
        ds.Fila fila51 = new ds.Fila();
        fila51.imprime();
        ds.Fila fila53 = new ds.Fila();
        fila53.imprime();
        fila51.enfileira((java.lang.Object) fila53);
        fila51.imprime();
        boolean boolean57 = fila51.vazia();
        fila51.imprime();
        fila46.enfileira((java.lang.Object) fila51);
        fila40.enfileira((java.lang.Object) fila51);
        boolean boolean61 = fila40.vazia();
        java.lang.Object obj62 = fila40.desenfileira();
        fila23.enfileira(obj62);
        java.lang.Class<?> wildcardClass64 = fila23.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 100.0f + "'", obj45, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        java.lang.Object obj14 = fila9.desenfileira();
        fila9.enfileira((java.lang.Object) (short) 100);
        fila9.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 100.0f);
        fila9.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        ds.Fila fila26 = new ds.Fila();
        ds.Fila fila27 = new ds.Fila();
        fila26.enfileira((java.lang.Object) fila27);
        java.lang.Object obj29 = null;
        fila26.enfileira(obj29);
        ds.Fila fila31 = new ds.Fila();
        fila26.enfileira((java.lang.Object) fila31);
        ds.Fila fila33 = new ds.Fila();
        ds.Fila fila34 = new ds.Fila();
        fila33.enfileira((java.lang.Object) fila34);
        fila33.enfileira((java.lang.Object) (-1));
        fila26.enfileira((java.lang.Object) fila33);
        fila33.imprime();
        fila18.enfileira((java.lang.Object) fila33);
        java.lang.Object obj41 = fila33.desenfileira();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        fila5.enfileira((java.lang.Object) fila6);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        java.lang.Object obj12 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) (short) 100);
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        java.lang.Class<?> wildcardClass17 = fila7.getClass();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        ds.Fila fila10 = new ds.Fila();
        fila9.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila13.enfileira((java.lang.Object) fila15);
        java.lang.Object obj18 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) (short) 100);
        boolean boolean21 = fila13.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila22.enfileira((java.lang.Object) fila24);
        java.lang.Object obj27 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 100);
        fila22.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.imprime();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila22.enfileira((java.lang.Object) fila31);
        fila13.enfileira((java.lang.Object) fila31);
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila39 = new ds.Fila();
        ds.Fila fila40 = new ds.Fila();
        fila39.enfileira((java.lang.Object) fila40);
        java.lang.Object obj42 = fila39.desenfileira();
        fila0.enfileira((java.lang.Object) fila39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = fila39.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        fila6.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila6.desenfileira();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj14 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.imprime();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        java.lang.Object obj15 = fila5.desenfileira();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        ds.Fila fila5 = new ds.Fila();
        fila4.enfileira((java.lang.Object) fila5);
        java.lang.Object obj7 = null;
        fila4.enfileira(obj7);
        java.lang.Class<?> wildcardClass9 = fila4.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass9);
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila10.enfileira((java.lang.Object) fila12);
        fila10.imprime();
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila17.enfileira((java.lang.Object) fila19);
        fila19.enfileira((java.lang.Object) 100);
        java.lang.Object obj24 = fila19.desenfileira();
        fila10.enfileira(obj24);
        boolean boolean26 = fila10.vazia();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj28 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100 + "'", obj24, 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (short) 100 + "'", obj28, (short) 100);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        fila0.enfileira(obj5);
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        fila21.enfileira((java.lang.Object) fila23);
        fila21.imprime();
        fila21.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        fila28.imprime();
        fila28.enfileira((java.lang.Object) 100.0f);
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean34 = fila28.vazia();
        fila28.imprime();
        fila28.imprime();
        fila11.enfileira((java.lang.Object) fila28);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        java.lang.Object obj14 = fila9.desenfileira();
        fila9.enfileira((java.lang.Object) (short) 100);
        fila9.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 100.0f);
        fila9.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        boolean boolean25 = fila18.vazia();
        boolean boolean26 = fila18.vazia();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.imprime();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila14.enfileira((java.lang.Object) fila16);
        fila16.enfileira((java.lang.Object) 100);
        java.lang.Object obj21 = fila16.desenfileira();
        boolean boolean22 = fila16.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila23.enfileira((java.lang.Object) fila25);
        java.lang.Object obj28 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) (short) 100);
        boolean boolean31 = fila23.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        fila32.enfileira((java.lang.Object) fila34);
        ds.Fila fila37 = new ds.Fila();
        ds.Fila fila38 = new ds.Fila();
        fila37.enfileira((java.lang.Object) fila38);
        fila32.enfileira((java.lang.Object) fila37);
        fila23.enfileira((java.lang.Object) fila32);
        fila23.imprime();
        fila16.enfileira((java.lang.Object) fila23);
        boolean boolean44 = fila23.vazia();
        fila5.enfileira((java.lang.Object) boolean44);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100 + "'", obj21, 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        ds.Fila fila10 = new ds.Fila();
        fila9.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila13.enfileira((java.lang.Object) fila15);
        java.lang.Object obj18 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) (short) 100);
        boolean boolean21 = fila13.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila22.enfileira((java.lang.Object) fila24);
        java.lang.Object obj27 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 100);
        fila22.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.imprime();
        fila31.enfileira((java.lang.Object) 100.0f);
        fila22.enfileira((java.lang.Object) fila31);
        fila13.enfileira((java.lang.Object) fila31);
        fila0.enfileira((java.lang.Object) fila31);
        java.lang.Object obj39 = fila31.desenfileira();
        ds.Fila fila40 = new ds.Fila();
        fila40.imprime();
        fila40.imprime();
        fila40.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj45 = fila40.desenfileira();
        ds.Fila fila46 = new ds.Fila();
        ds.Fila fila47 = new ds.Fila();
        fila46.enfileira((java.lang.Object) fila47);
        java.lang.Object obj49 = null;
        fila46.enfileira(obj49);
        ds.Fila fila51 = new ds.Fila();
        fila51.imprime();
        ds.Fila fila53 = new ds.Fila();
        fila53.imprime();
        fila51.enfileira((java.lang.Object) fila53);
        fila51.imprime();
        boolean boolean57 = fila51.vazia();
        fila51.imprime();
        fila46.enfileira((java.lang.Object) fila51);
        fila40.enfileira((java.lang.Object) fila51);
        boolean boolean61 = fila40.vazia();
        java.lang.Object obj62 = fila40.desenfileira();
        fila31.enfileira((java.lang.Object) fila40);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0f + "'", obj39, 100.0f);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 100.0f + "'", obj45, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        fila5.enfileira((java.lang.Object) fila6);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila5.enfileira((java.lang.Object) fila7);
        fila5.imprime();
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.enfileira((java.lang.Object) (short) 0);
        java.lang.Object obj16 = fila5.desenfileira();
        boolean boolean17 = fila5.vazia();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        java.lang.Object obj14 = fila9.desenfileira();
        fila9.enfileira((java.lang.Object) (short) 100);
        fila9.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 100.0f);
        fila9.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        java.lang.Object obj26 = fila18.desenfileira();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila12.enfileira((java.lang.Object) fila14);
        fila12.imprime();
        boolean boolean18 = fila12.vazia();
        fila12.imprime();
        fila12.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        fila21.enfileira((java.lang.Object) fila23);
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 100);
        boolean boolean29 = fila21.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila30.enfileira((java.lang.Object) fila32);
        java.lang.Object obj35 = fila30.desenfileira();
        fila30.enfileira((java.lang.Object) (short) 100);
        fila30.imprime();
        ds.Fila fila39 = new ds.Fila();
        fila39.imprime();
        fila39.imprime();
        fila39.enfileira((java.lang.Object) 100.0f);
        fila30.enfileira((java.lang.Object) fila39);
        fila21.enfileira((java.lang.Object) fila39);
        boolean boolean46 = fila39.vazia();
        fila12.enfileira((java.lang.Object) boolean46);
        fila0.enfileira((java.lang.Object) boolean46);
        ds.Fila fila49 = new ds.Fila();
        fila49.imprime();
        ds.Fila fila51 = new ds.Fila();
        fila51.imprime();
        fila49.enfileira((java.lang.Object) fila51);
        java.lang.Object obj54 = fila49.desenfileira();
        fila49.enfileira((java.lang.Object) (short) 100);
        fila49.imprime();
        ds.Fila fila58 = new ds.Fila();
        fila58.imprime();
        fila58.imprime();
        fila58.enfileira((java.lang.Object) 100.0f);
        fila49.enfileira((java.lang.Object) fila58);
        boolean boolean64 = fila58.vazia();
        fila0.enfileira((java.lang.Object) fila58);
        java.lang.Object obj66 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass67 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila14.enfileira((java.lang.Object) fila16);
        java.lang.Object obj19 = fila14.desenfileira();
        fila14.enfileira((java.lang.Object) (short) 100);
        boolean boolean22 = fila14.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila23.enfileira((java.lang.Object) fila25);
        java.lang.Object obj28 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) (short) 100);
        fila23.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila23.enfileira((java.lang.Object) fila32);
        fila14.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        java.lang.Object obj40 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        boolean boolean43 = fila32.vazia();
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        ds.Fila fila46 = new ds.Fila();
        fila46.imprime();
        fila44.enfileira((java.lang.Object) fila46);
        java.lang.Object obj49 = fila44.desenfileira();
        fila44.enfileira((java.lang.Object) (short) 100);
        boolean boolean52 = fila44.vazia();
        ds.Fila fila53 = new ds.Fila();
        fila53.imprime();
        ds.Fila fila55 = new ds.Fila();
        fila55.imprime();
        fila53.enfileira((java.lang.Object) fila55);
        java.lang.Object obj58 = fila53.desenfileira();
        fila53.enfileira((java.lang.Object) (short) 100);
        fila53.imprime();
        ds.Fila fila62 = new ds.Fila();
        fila62.imprime();
        fila62.imprime();
        fila62.enfileira((java.lang.Object) 100.0f);
        fila53.enfileira((java.lang.Object) fila62);
        fila44.enfileira((java.lang.Object) fila62);
        fila62.imprime();
        ds.Fila fila70 = new ds.Fila();
        ds.Fila fila71 = new ds.Fila();
        fila70.enfileira((java.lang.Object) fila71);
        java.lang.Object obj73 = null;
        fila70.enfileira(obj73);
        ds.Fila fila75 = new ds.Fila();
        fila70.enfileira((java.lang.Object) fila75);
        ds.Fila fila77 = new ds.Fila();
        ds.Fila fila78 = new ds.Fila();
        fila77.enfileira((java.lang.Object) fila78);
        fila77.enfileira((java.lang.Object) (-1));
        fila70.enfileira((java.lang.Object) fila77);
        fila77.imprime();
        fila62.enfileira((java.lang.Object) fila77);
        fila32.enfileira((java.lang.Object) fila77);
        java.lang.Class<?> wildcardClass86 = fila77.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.imprime();
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj21 = fila11.desenfileira();
        java.lang.Object obj22 = null;
        fila11.enfileira(obj22);
        // The following exception was thrown during execution in test generation
        try {
            fila11.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila14.enfileira((java.lang.Object) fila16);
        java.lang.Object obj19 = fila14.desenfileira();
        fila14.enfileira((java.lang.Object) (short) 100);
        boolean boolean22 = fila14.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila23.enfileira((java.lang.Object) fila25);
        java.lang.Object obj28 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) (short) 100);
        fila23.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila23.enfileira((java.lang.Object) fila32);
        fila14.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        fila32.imprime();
        ds.Fila fila41 = new ds.Fila();
        fila41.imprime();
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        fila41.enfileira((java.lang.Object) fila43);
        java.lang.Object obj46 = fila41.desenfileira();
        ds.Fila fila47 = new ds.Fila();
        boolean boolean48 = fila47.vazia();
        fila41.enfileira((java.lang.Object) boolean48);
        boolean boolean50 = fila41.vazia();
        java.lang.Class<?> wildcardClass51 = fila41.getClass();
        fila32.enfileira((java.lang.Object) fila41);
        ds.Fila fila53 = new ds.Fila();
        fila53.imprime();
        ds.Fila fila55 = new ds.Fila();
        fila55.imprime();
        fila53.enfileira((java.lang.Object) fila55);
        java.lang.Object obj58 = fila53.desenfileira();
        ds.Fila fila59 = new ds.Fila();
        fila59.imprime();
        ds.Fila fila61 = new ds.Fila();
        fila61.imprime();
        fila59.enfileira((java.lang.Object) fila61);
        java.lang.Object obj64 = null;
        fila59.enfileira(obj64);
        boolean boolean66 = fila59.vazia();
        java.lang.Object obj67 = fila59.desenfileira();
        fila53.enfileira((java.lang.Object) fila59);
        fila32.enfileira((java.lang.Object) fila53);
        java.lang.Object obj70 = fila53.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(obj70);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        java.lang.Object obj22 = fila0.desenfileira();
        boolean boolean23 = fila0.vazia();
        java.lang.Class<?> wildcardClass24 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100);
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        fila7.imprime();
        fila7.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) 100.0f);
        fila7.enfileira((java.lang.Object) fila14);
        fila7.enfileira((java.lang.Object) (short) 1);
        fila2.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        java.lang.Class<?> wildcardClass26 = fila24.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = fila7.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila14 = new ds.Fila();
        ds.Fila fila15 = new ds.Fila();
        fila14.enfileira((java.lang.Object) fila15);
        java.lang.Object obj17 = fila14.desenfileira();
        fila4.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass19 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila14.enfileira((java.lang.Object) fila16);
        java.lang.Object obj19 = fila14.desenfileira();
        fila14.enfileira((java.lang.Object) (short) 100);
        boolean boolean22 = fila14.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila23.enfileira((java.lang.Object) fila25);
        java.lang.Object obj28 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) (short) 100);
        fila23.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 100.0f);
        fila23.enfileira((java.lang.Object) fila32);
        fila14.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        java.lang.Object obj40 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        boolean boolean43 = fila32.vazia();
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        ds.Fila fila46 = new ds.Fila();
        fila46.imprime();
        fila44.enfileira((java.lang.Object) fila46);
        java.lang.Object obj49 = fila44.desenfileira();
        fila44.enfileira((java.lang.Object) (short) 100);
        boolean boolean52 = fila44.vazia();
        ds.Fila fila53 = new ds.Fila();
        fila53.imprime();
        ds.Fila fila55 = new ds.Fila();
        fila55.imprime();
        fila53.enfileira((java.lang.Object) fila55);
        java.lang.Object obj58 = fila53.desenfileira();
        fila53.enfileira((java.lang.Object) (short) 100);
        fila53.imprime();
        ds.Fila fila62 = new ds.Fila();
        fila62.imprime();
        fila62.imprime();
        fila62.enfileira((java.lang.Object) 100.0f);
        fila53.enfileira((java.lang.Object) fila62);
        fila44.enfileira((java.lang.Object) fila62);
        fila62.imprime();
        ds.Fila fila70 = new ds.Fila();
        ds.Fila fila71 = new ds.Fila();
        fila70.enfileira((java.lang.Object) fila71);
        java.lang.Object obj73 = null;
        fila70.enfileira(obj73);
        ds.Fila fila75 = new ds.Fila();
        fila70.enfileira((java.lang.Object) fila75);
        ds.Fila fila77 = new ds.Fila();
        ds.Fila fila78 = new ds.Fila();
        fila77.enfileira((java.lang.Object) fila78);
        fila77.enfileira((java.lang.Object) (-1));
        fila70.enfileira((java.lang.Object) fila77);
        fila77.imprime();
        fila62.enfileira((java.lang.Object) fila77);
        fila32.enfileira((java.lang.Object) fila77);
        java.lang.Class<?> wildcardClass86 = fila32.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = fila4.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila4.enfileira((java.lang.Object) boolean11);
        java.lang.Object obj13 = fila4.desenfileira();
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        fila1.imprime();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) false);
        fila4.imprime();
        fila1.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        ds.Fila fila11 = new ds.Fila();
        fila10.enfileira((java.lang.Object) fila11);
        java.lang.Object obj13 = null;
        fila10.enfileira(obj13);
        ds.Fila fila15 = new ds.Fila();
        fila10.enfileira((java.lang.Object) fila15);
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj18 = fila10.desenfileira();
        java.lang.Object obj19 = null;
        fila10.enfileira(obj19);
        java.lang.Object obj21 = fila10.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            fila10.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila12.enfileira((java.lang.Object) fila14);
        fila12.imprime();
        boolean boolean18 = fila12.vazia();
        fila12.imprime();
        fila12.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        fila21.enfileira((java.lang.Object) fila23);
        java.lang.Object obj26 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 100);
        boolean boolean29 = fila21.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila30.enfileira((java.lang.Object) fila32);
        java.lang.Object obj35 = fila30.desenfileira();
        fila30.enfileira((java.lang.Object) (short) 100);
        fila30.imprime();
        ds.Fila fila39 = new ds.Fila();
        fila39.imprime();
        fila39.imprime();
        fila39.enfileira((java.lang.Object) 100.0f);
        fila30.enfileira((java.lang.Object) fila39);
        fila21.enfileira((java.lang.Object) fila39);
        boolean boolean46 = fila39.vazia();
        fila12.enfileira((java.lang.Object) boolean46);
        fila0.enfileira((java.lang.Object) boolean46);
        ds.Fila fila49 = new ds.Fila();
        ds.Fila fila50 = new ds.Fila();
        fila49.enfileira((java.lang.Object) fila50);
        java.lang.Object obj52 = null;
        fila49.enfileira(obj52);
        ds.Fila fila54 = new ds.Fila();
        fila54.imprime();
        ds.Fila fila56 = new ds.Fila();
        fila56.imprime();
        fila54.enfileira((java.lang.Object) fila56);
        fila54.imprime();
        boolean boolean60 = fila54.vazia();
        fila54.imprime();
        fila49.enfileira((java.lang.Object) fila54);
        fila54.imprime();
        ds.Fila fila64 = new ds.Fila();
        fila64.imprime();
        fila64.imprime();
        fila64.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj69 = fila64.desenfileira();
        fila64.imprime();
        boolean boolean71 = fila64.vazia();
        fila54.enfileira((java.lang.Object) boolean71);
        java.lang.Object obj73 = fila54.desenfileira();
        ds.Fila fila74 = new ds.Fila();
        fila74.imprime();
        ds.Fila fila76 = new ds.Fila();
        fila76.imprime();
        fila74.enfileira((java.lang.Object) fila76);
        java.lang.Object obj79 = fila74.desenfileira();
        fila74.enfileira((java.lang.Object) (short) 100);
        fila74.imprime();
        ds.Fila fila83 = new ds.Fila();
        fila83.imprime();
        fila83.imprime();
        fila83.enfileira((java.lang.Object) 100.0f);
        fila74.enfileira((java.lang.Object) fila83);
        java.lang.Object obj89 = fila83.desenfileira();
        fila83.imprime();
        fila54.enfileira((java.lang.Object) fila83);
        boolean boolean92 = fila54.vazia();
        fila0.enfileira((java.lang.Object) fila54);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 100.0f + "'", obj69, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + 100.0f + "'", obj89, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila7);
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila11.enfileira((java.lang.Object) fila13);
        fila11.imprime();
        boolean boolean17 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila23.enfileira((java.lang.Object) fila25);
        fila23.imprime();
        fila23.imprime();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        fila30.imprime();
        fila30.enfileira((java.lang.Object) 100.0f);
        fila23.enfileira((java.lang.Object) fila30);
        fila23.enfileira((java.lang.Object) (short) 1);
        fila0.enfileira((java.lang.Object) fila23);
        ds.Fila fila39 = new ds.Fila();
        ds.Fila fila40 = new ds.Fila();
        fila39.enfileira((java.lang.Object) fila40);
        java.lang.Object obj42 = null;
        fila39.enfileira(obj42);
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        ds.Fila fila46 = new ds.Fila();
        fila46.imprime();
        fila44.enfileira((java.lang.Object) fila46);
        fila44.imprime();
        boolean boolean50 = fila44.vazia();
        fila44.imprime();
        fila39.enfileira((java.lang.Object) fila44);
        fila44.enfileira((java.lang.Object) (short) 0);
        java.lang.Object obj55 = fila44.desenfileira();
        fila23.enfileira(obj55);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        java.lang.Object obj12 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) (short) 100);
        fila7.imprime();
        java.lang.Class<?> wildcardClass16 = fila7.getClass();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila0.enfileira((java.lang.Object) boolean7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        ds.Fila fila10 = new ds.Fila();
        fila9.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 100 + "'", obj13, (short) 100);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 100.0f);
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila14);
        ds.Fila fila16 = new ds.Fila();
        ds.Fila fila17 = new ds.Fila();
        fila16.enfileira((java.lang.Object) fila17);
        java.lang.Object obj19 = null;
        fila16.enfileira(obj19);
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        fila21.enfileira((java.lang.Object) fila23);
        fila21.imprime();
        boolean boolean27 = fila21.vazia();
        fila21.imprime();
        fila16.enfileira((java.lang.Object) fila21);
        fila21.enfileira((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass32 = fila21.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass32);
        java.lang.Object obj34 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass35 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila4.enfileira((java.lang.Object) fila6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila4.enfileira(obj9);
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj14 = fila0.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila15.enfileira((java.lang.Object) fila17);
        fila17.enfileira((java.lang.Object) 100);
        fila0.enfileira((java.lang.Object) 100);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
    }
}

