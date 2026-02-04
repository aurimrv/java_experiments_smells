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
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Class<?> wildcardClass2 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Class<?> wildcardClass1 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila3.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.imprime();
        java.lang.Class<?> wildcardClass10 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean12 = fila6.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.imprime();
        java.lang.Class<?> wildcardClass10 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Class<?> wildcardClass12 = fila6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Class<?> wildcardClass11 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0L + "'", obj6, 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        java.lang.Class<?> wildcardClass13 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        boolean boolean9 = fila6.vazia();
        boolean boolean10 = fila6.vazia();
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila6.enfileira((java.lang.Object) (-1.0d));
        fila0.enfileira((java.lang.Object) (-1.0d));
        boolean boolean17 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.imprime();
        java.lang.Class<?> wildcardClass10 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean12 = fila6.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass17 = fila7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        boolean boolean19 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        fila5.enfileira((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass14 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
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
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass19 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0L);
        fila5.imprime();
        boolean boolean16 = fila5.vazia();
        fila0.enfileira((java.lang.Object) boolean16);
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass16 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj18 = fila11.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10.0d + "'", obj18, 10.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        java.lang.Object obj5 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0L);
        fila5.imprime();
        boolean boolean16 = fila5.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) 0);
        boolean boolean20 = fila17.vazia();
        boolean boolean21 = fila17.vazia();
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        java.lang.Class<?> wildcardClass24 = fila17.getClass();
        fila5.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.imprime();
        java.lang.Class<?> wildcardClass10 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0L + "'", obj6, 0L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila3.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila3.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila19.imprime();
        java.lang.Object obj22 = null;
        fila19.enfileira(obj22);
        boolean boolean24 = fila19.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) 0);
        boolean boolean28 = fila25.vazia();
        boolean boolean29 = fila25.vazia();
        boolean boolean30 = fila25.vazia();
        java.lang.Object obj31 = fila25.desenfileira();
        boolean boolean32 = fila25.vazia();
        fila25.enfileira((java.lang.Object) (-1.0d));
        fila19.enfileira((java.lang.Object) (-1.0d));
        boolean boolean36 = fila19.vazia();
        fila0.enfileira((java.lang.Object) boolean36);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 0 + "'", obj31, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.imprime();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        boolean boolean17 = fila12.vazia();
        boolean boolean18 = fila12.vazia();
        java.lang.Class<?> wildcardClass19 = fila12.getClass();
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        boolean boolean18 = fila15.vazia();
        fila15.imprime();
        fila15.imprime();
        fila11.enfileira((java.lang.Object) fila15);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) 0);
        boolean boolean25 = fila22.vazia();
        fila22.imprime();
        fila22.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) 0);
        fila28.enfileira((java.lang.Object) 0L);
        fila22.enfileira((java.lang.Object) 0L);
        fila15.enfileira((java.lang.Object) fila22);
        fila0.enfileira((java.lang.Object) fila15);
        fila15.enfileira((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj11 = new java.lang.Object();
        fila6.enfileira(obj11);
        fila6.imprime();
        boolean boolean14 = fila6.vazia();
        fila6.enfileira((java.lang.Object) 'a');
        boolean boolean17 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        fila2.enfileira(obj7);
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        boolean boolean20 = fila15.vazia();
        java.lang.Object obj21 = fila15.desenfileira();
        boolean boolean22 = fila15.vazia();
        fila15.enfileira((java.lang.Object) (-1.0d));
        fila15.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        fila26.imprime();
        fila26.imprime();
        fila15.enfileira((java.lang.Object) fila26);
        boolean boolean34 = fila26.vazia();
        fila5.enfileira((java.lang.Object) fila26);
        java.lang.Class<?> wildcardClass36 = fila26.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 0 + "'", obj29, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean19 = fila0.vazia();
        java.lang.Object obj20 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        java.lang.Object obj10 = fila4.desenfileira();
        boolean boolean11 = fila4.vazia();
        boolean boolean12 = fila4.vazia();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass17 = fila7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        boolean boolean19 = fila0.vazia();
        fila0.imprime();
        boolean boolean21 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.imprime();
        java.lang.Object obj10 = fila6.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        java.lang.Object obj17 = fila11.desenfileira();
        boolean boolean18 = fila11.vazia();
        fila11.enfileira((java.lang.Object) 0L);
        fila11.imprime();
        boolean boolean22 = fila11.vazia();
        fila6.enfileira((java.lang.Object) boolean22);
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object obj12 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        fila9.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        boolean boolean18 = fila14.vazia();
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean20 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass22 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.imprime();
        java.lang.Class<?> wildcardClass10 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj19 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.enfileira((java.lang.Object) 0L);
        fila0.enfileira((java.lang.Object) 0L);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        fila12.imprime();
        fila12.imprime();
        boolean boolean18 = fila12.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        fila19.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        fila19.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        java.lang.Object obj31 = fila24.desenfileira();
        fila12.enfileira(obj31);
        java.lang.Object obj33 = fila12.desenfileira();
        fila0.enfileira(obj33);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 0 + "'", obj31, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 0 + "'", obj33, (byte) 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj12 = fila4.desenfileira();
        fila4.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        java.lang.Object obj15 = fila9.desenfileira();
        boolean boolean16 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0L);
        fila9.imprime();
        boolean boolean20 = fila9.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) 0);
        boolean boolean24 = fila21.vazia();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        java.lang.Class<?> wildcardClass28 = fila21.getClass();
        fila9.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (byte) 0);
        boolean boolean34 = fila31.vazia();
        fila31.imprime();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) 0);
        boolean boolean39 = fila36.vazia();
        boolean boolean40 = fila36.vazia();
        fila31.enfileira((java.lang.Object) fila36);
        java.lang.Object obj42 = fila31.desenfileira();
        java.lang.Object obj43 = fila31.desenfileira();
        fila31.imprime();
        fila31.imprime();
        fila0.enfileira((java.lang.Object) fila31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = fila31.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 0 + "'", obj42, (byte) 0);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (byte) 0);
        boolean boolean11 = fila8.vazia();
        boolean boolean12 = fila8.vazia();
        boolean boolean13 = fila8.vazia();
        java.lang.Object obj14 = fila8.desenfileira();
        boolean boolean15 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0L);
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = new java.lang.Object();
        fila20.enfileira(obj25);
        fila20.imprime();
        fila18.enfileira((java.lang.Object) fila20);
        java.lang.Object obj29 = fila18.desenfileira();
        fila8.enfileira(obj29);
        fila0.enfileira(obj29);
        java.lang.Class<?> wildcardClass32 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        fila4.imprime();
        java.lang.Class<?> wildcardClass14 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj13 = fila8.desenfileira();
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        boolean boolean20 = fila15.vazia();
        java.lang.Object obj21 = fila15.desenfileira();
        boolean boolean22 = fila15.vazia();
        fila15.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass25 = fila15.getClass();
        fila8.enfileira((java.lang.Object) wildcardClass25);
        fila0.enfileira((java.lang.Object) fila8);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0d + "'", obj13, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        fila3.imprime();
        java.lang.Class<?> wildcardClass8 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        java.lang.Class<?> wildcardClass7 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.imprime();
        java.lang.Class<?> wildcardClass14 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.imprime();
        java.lang.Object obj10 = fila6.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        java.lang.Object obj17 = fila11.desenfileira();
        boolean boolean18 = fila11.vazia();
        fila11.enfileira((java.lang.Object) 0L);
        fila11.imprime();
        boolean boolean22 = fila11.vazia();
        fila6.enfileira((java.lang.Object) boolean22);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        fila7.enfileira((java.lang.Object) fila12);
        fila12.imprime();
        java.lang.Object obj19 = fila12.desenfileira();
        fila0.enfileira(obj19);
        java.lang.Class<?> wildcardClass21 = obj19.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila10.enfileira((java.lang.Object) fila13);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        java.lang.Class<?> wildcardClass20 = fila16.getClass();
        fila10.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean23 = fila10.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        boolean boolean11 = fila0.vazia();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (byte) 1);
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 1 + "'", obj9, (byte) 1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        fila19.imprime();
        fila9.enfileira((java.lang.Object) fila19);
        boolean boolean24 = fila9.vazia();
        java.lang.Class<?> wildcardClass25 = fila9.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj12 = fila4.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fila4.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.imprime();
        boolean boolean14 = fila5.vazia();
        java.lang.Class<?> wildcardClass15 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.enfileira((java.lang.Object) "hi!");
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = new java.lang.Object();
        fila20.enfileira(obj25);
        fila20.imprime();
        boolean boolean28 = fila20.vazia();
        fila5.enfileira((java.lang.Object) fila20);
        java.lang.Class<?> wildcardClass30 = fila20.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean11 = fila4.vazia();
        boolean boolean12 = fila4.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        fila2.enfileira(obj7);
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) 0);
        boolean boolean19 = fila16.vazia();
        boolean boolean20 = fila16.vazia();
        fila11.enfileira((java.lang.Object) fila16);
        fila16.imprime();
        java.lang.Class<?> wildcardClass23 = fila16.getClass();
        fila0.enfileira((java.lang.Object) fila16);
        fila16.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj9 = new java.lang.Object();
        fila4.enfileira(obj9);
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.enfileira((java.lang.Object) 0L);
        fila0.enfileira((java.lang.Object) 0L);
        boolean boolean12 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass19 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass17 = fila7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        boolean boolean19 = fila0.vazia();
        java.lang.Object obj20 = fila0.desenfileira();
        boolean boolean21 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class ds.Fila");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        fila19.imprime();
        fila9.enfileira((java.lang.Object) fila19);
        fila9.imprime();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        fila14.imprime();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        boolean boolean21 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        fila7.enfileira((java.lang.Object) fila12);
        fila12.imprime();
        java.lang.Object obj19 = fila12.desenfileira();
        fila0.enfileira(obj19);
        java.lang.Object obj21 = fila0.desenfileira();
        java.lang.Object obj22 = fila0.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (byte) 0);
        fila23.enfileira((java.lang.Object) 0L);
        java.lang.Object obj28 = fila23.desenfileira();
        boolean boolean29 = fila23.vazia();
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila30.imprime();
        fila30.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj35 = fila30.desenfileira();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        fila23.enfileira(obj35);
        java.lang.Object obj38 = fila23.desenfileira();
        fila0.enfileira(obj38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 0 + "'", obj22, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 0 + "'", obj28, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10.0d + "'", obj35, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0L + "'", obj38, 0L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) (-1.0d));
        fila5.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        fila5.enfileira((java.lang.Object) fila16);
        boolean boolean24 = fila16.vazia();
        fila16.imprime();
        boolean boolean26 = fila16.vazia();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Class<?> wildcardClass28 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        boolean boolean17 = fila12.vazia();
        fila12.imprime();
        boolean boolean19 = fila12.vazia();
        java.lang.Object obj20 = fila12.desenfileira();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Object obj23 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 0 + "'", obj20, (byte) 0);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila10.enfileira((java.lang.Object) fila13);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        java.lang.Class<?> wildcardClass20 = fila16.getClass();
        fila10.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj23 = null;
        fila0.enfileira(obj23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean16 = fila5.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila10.enfileira((java.lang.Object) fila13);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        java.lang.Class<?> wildcardClass20 = fila16.getClass();
        fila10.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj23 = fila10.desenfileira();
        java.lang.Object obj24 = fila10.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila10.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        fila2.enfileira(obj7);
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        fila12.imprime();
        java.lang.Object obj16 = fila12.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila17.enfileira((java.lang.Object) boolean19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) 0);
        boolean boolean24 = fila21.vazia();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        fila17.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        fila12.enfileira((java.lang.Object) fila21);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (byte) 0);
        fila31.imprime();
        fila21.enfileira((java.lang.Object) fila31);
        fila0.enfileira((java.lang.Object) fila21);
        boolean boolean37 = fila0.vazia();
        java.lang.Class<?> wildcardClass38 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 0 + "'", obj16, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean19 = fila11.vazia();
        fila11.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) 0);
        boolean boolean24 = fila21.vazia();
        fila21.imprime();
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila26.imprime();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila26.enfileira((java.lang.Object) fila29);
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        fila32.imprime();
        fila32.imprime();
        java.lang.Class<?> wildcardClass36 = fila32.getClass();
        fila26.enfileira((java.lang.Object) fila32);
        fila21.enfileira((java.lang.Object) fila26);
        fila26.enfileira((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass41 = fila26.getClass();
        fila11.enfileira((java.lang.Object) fila26);
        fila26.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) 0);
        fila17.enfileira((java.lang.Object) 0L);
        fila11.enfileira((java.lang.Object) 0L);
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean24 = fila4.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        boolean boolean17 = fila12.vazia();
        fila12.imprime();
        boolean boolean19 = fila12.vazia();
        java.lang.Object obj20 = fila12.desenfileira();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = fila12.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 0 + "'", obj20, (byte) 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0L + "'", obj10, 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        boolean boolean20 = fila15.vazia();
        java.lang.Object obj21 = fila15.desenfileira();
        boolean boolean22 = fila15.vazia();
        fila15.enfileira((java.lang.Object) (-1.0d));
        fila15.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        fila26.imprime();
        fila26.imprime();
        fila15.enfileira((java.lang.Object) fila26);
        boolean boolean34 = fila26.vazia();
        fila5.enfileira((java.lang.Object) fila26);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) 0);
        fila36.imprime();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) 0);
        boolean boolean43 = fila40.vazia();
        boolean boolean44 = fila40.vazia();
        boolean boolean45 = fila40.vazia();
        java.lang.Object obj46 = fila40.desenfileira();
        boolean boolean47 = fila40.vazia();
        boolean boolean48 = fila40.vazia();
        fila40.imprime();
        fila36.enfileira((java.lang.Object) fila40);
        fila36.imprime();
        fila5.enfileira((java.lang.Object) fila36);
        java.lang.Class<?> wildcardClass53 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 0 + "'", obj29, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 0 + "'", obj46, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila2.imprime();
        java.lang.Object obj5 = null;
        fila2.enfileira(obj5);
        boolean boolean7 = fila2.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (byte) 0);
        boolean boolean11 = fila8.vazia();
        boolean boolean12 = fila8.vazia();
        boolean boolean13 = fila8.vazia();
        java.lang.Object obj14 = fila8.desenfileira();
        boolean boolean15 = fila8.vazia();
        fila8.enfileira((java.lang.Object) (-1.0d));
        fila2.enfileira((java.lang.Object) (-1.0d));
        boolean boolean19 = fila2.vazia();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = fila20.desenfileira();
        boolean boolean26 = fila20.vazia();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (byte) 0);
        boolean boolean30 = fila27.vazia();
        boolean boolean31 = fila27.vazia();
        boolean boolean32 = fila27.vazia();
        java.lang.Object obj33 = fila27.desenfileira();
        boolean boolean34 = fila27.vazia();
        fila27.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass37 = fila27.getClass();
        fila20.enfileira((java.lang.Object) wildcardClass37);
        boolean boolean39 = fila20.vazia();
        java.lang.Object obj40 = fila20.desenfileira();
        fila2.enfileira((java.lang.Object) fila20);
        java.lang.Class<?> wildcardClass42 = fila20.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass42);
        boolean boolean44 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 10.0d + "'", obj25, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 0 + "'", obj33, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        boolean boolean20 = fila13.vazia();
        fila13.enfileira((java.lang.Object) 0L);
        fila13.imprime();
        boolean boolean24 = fila13.vazia();
        java.lang.Class<?> wildcardClass25 = fila13.getClass();
        fila4.enfileira((java.lang.Object) fila13);
        boolean boolean27 = fila4.vazia();
        java.lang.Class<?> wildcardClass28 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        boolean boolean9 = fila6.vazia();
        boolean boolean10 = fila6.vazia();
        fila6.imprime();
        boolean boolean12 = fila6.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        boolean boolean20 = fila13.vazia();
        fila13.enfileira((java.lang.Object) (-1.0d));
        fila13.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj27 = fila24.desenfileira();
        boolean boolean28 = fila24.vazia();
        fila24.imprime();
        fila24.imprime();
        fila13.enfileira((java.lang.Object) fila24);
        boolean boolean32 = fila24.vazia();
        fila6.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean35 = fila6.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 0 + "'", obj27, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass16 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj18 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass19 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean16 = fila10.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) 0);
        fila17.enfileira((java.lang.Object) 0L);
        fila11.enfileira((java.lang.Object) 0L);
        fila4.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        java.lang.Class<?> wildcardClass25 = fila11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.enfileira((java.lang.Object) 0L);
        fila0.enfileira((java.lang.Object) 0L);
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0L + "'", obj14, 0L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.enfileira((java.lang.Object) "hi!");
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = new java.lang.Object();
        fila20.enfileira(obj25);
        fila20.imprime();
        boolean boolean28 = fila20.vazia();
        fila5.enfileira((java.lang.Object) fila20);
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila30.imprime();
        fila30.imprime();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        fila34.imprime();
        fila34.imprime();
        fila30.enfileira((java.lang.Object) fila34);
        fila34.imprime();
        fila20.enfileira((java.lang.Object) fila34);
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) (byte) 0);
        boolean boolean46 = fila43.vazia();
        fila43.imprime();
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) (byte) 0);
        boolean boolean51 = fila48.vazia();
        boolean boolean52 = fila48.vazia();
        fila43.enfileira((java.lang.Object) fila48);
        boolean boolean54 = fila43.vazia();
        fila34.enfileira((java.lang.Object) boolean54);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        boolean boolean17 = fila12.vazia();
        fila12.imprime();
        boolean boolean19 = fila12.vazia();
        java.lang.Object obj20 = fila12.desenfileira();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila23.imprime();
        java.lang.Object obj26 = null;
        fila23.enfileira(obj26);
        java.lang.Object obj28 = fila23.desenfileira();
        fila0.enfileira(obj28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 0 + "'", obj20, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        fila9.imprime();
        boolean boolean16 = fila9.vazia();
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj22 = fila17.desenfileira();
        boolean boolean23 = fila17.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        boolean boolean29 = fila24.vazia();
        java.lang.Object obj30 = fila24.desenfileira();
        boolean boolean31 = fila24.vazia();
        fila24.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass34 = fila24.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass34);
        fila9.enfileira((java.lang.Object) fila17);
        java.lang.Class<?> wildcardClass37 = fila17.getClass();
        fila0.enfileira((java.lang.Object) fila17);
        ds.Fila fila39 = new ds.Fila();
        boolean boolean40 = fila39.vazia();
        fila39.imprime();
        fila39.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj44 = new java.lang.Object();
        fila39.enfileira(obj44);
        fila39.imprime();
        boolean boolean47 = fila39.vazia();
        boolean boolean48 = fila39.vazia();
        java.lang.Object obj49 = fila39.desenfileira();
        fila39.imprime();
        fila17.enfileira((java.lang.Object) fila39);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10.0d + "'", obj22, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 0 + "'", obj30, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 10.0d + "'", obj49, 10.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila20.enfileira((java.lang.Object) boolean22);
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        boolean boolean29 = fila24.vazia();
        boolean boolean30 = fila24.vazia();
        fila20.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila15.enfileira((java.lang.Object) fila24);
        boolean boolean34 = fila15.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) (byte) 0);
        fila35.imprime();
        fila15.enfileira((java.lang.Object) fila35);
        fila5.enfileira((java.lang.Object) fila15);
        java.lang.Class<?> wildcardClass41 = fila15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        fila2.enfileira(obj7);
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) 0);
        boolean boolean19 = fila16.vazia();
        boolean boolean20 = fila16.vazia();
        fila11.enfileira((java.lang.Object) fila16);
        fila16.imprime();
        java.lang.Class<?> wildcardClass23 = fila16.getClass();
        fila0.enfileira((java.lang.Object) fila16);
        fila16.enfileira((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        fila7.imprime();
        java.lang.Object obj11 = fila7.desenfileira();
        boolean boolean12 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Class<?> wildcardClass14 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
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
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.enfileira((java.lang.Object) '#');
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean11 = fila4.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila12.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila12.enfileira((java.lang.Object) fila15);
        java.lang.Class<?> wildcardClass18 = fila12.getClass();
        fila4.enfileira((java.lang.Object) wildcardClass18);
        fila4.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        fila7.imprime();
        java.lang.Object obj11 = fila7.desenfileira();
        boolean boolean12 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        fila14.enfileira((java.lang.Object) 0L);
        java.lang.Object obj19 = fila14.desenfileira();
        boolean boolean20 = fila14.vazia();
        java.lang.Object obj21 = fila14.desenfileira();
        fila7.enfileira((java.lang.Object) fila14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean11 = fila4.vazia();
        java.lang.Object obj12 = null;
        fila4.enfileira(obj12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        java.lang.Object obj15 = fila9.desenfileira();
        boolean boolean16 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0L);
        fila9.imprime();
        boolean boolean20 = fila9.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) 0);
        boolean boolean24 = fila21.vazia();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        java.lang.Class<?> wildcardClass28 = fila21.getClass();
        fila9.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (byte) 0);
        boolean boolean34 = fila31.vazia();
        fila31.imprime();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) 0);
        boolean boolean39 = fila36.vazia();
        boolean boolean40 = fila36.vazia();
        fila31.enfileira((java.lang.Object) fila36);
        java.lang.Object obj42 = fila31.desenfileira();
        java.lang.Object obj43 = fila31.desenfileira();
        fila31.imprime();
        fila31.imprime();
        fila0.enfileira((java.lang.Object) fila31);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 0 + "'", obj42, (byte) 0);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass17 = fila7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        boolean boolean19 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj21 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "class ds.Fila");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean19 = fila0.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) 0);
        fila20.imprime();
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean19 = fila0.vazia();
        java.lang.Object obj20 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1.0d) + "'", obj20, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.enfileira((java.lang.Object) '#');
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj11 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila4.enfileira((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass14 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj11 = new java.lang.Object();
        fila6.enfileira(obj11);
        fila6.imprime();
        boolean boolean14 = fila6.vazia();
        fila6.enfileira((java.lang.Object) 'a');
        boolean boolean17 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        fila6.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean11 = fila5.vazia();
        boolean boolean12 = fila5.vazia();
        java.lang.Object obj13 = fila5.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila5.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj15 = fila5.desenfileira();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.enfileira((java.lang.Object) '#');
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (byte) 0);
        boolean boolean11 = fila8.vazia();
        boolean boolean12 = fila8.vazia();
        boolean boolean13 = fila8.vazia();
        java.lang.Object obj14 = fila8.desenfileira();
        boolean boolean15 = fila8.vazia();
        boolean boolean16 = fila8.vazia();
        boolean boolean17 = fila8.vazia();
        fila0.enfileira((java.lang.Object) boolean17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0d + "'", obj13, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        java.lang.Object obj13 = fila4.desenfileira();
        java.lang.Class<?> wildcardClass14 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        boolean boolean17 = fila12.vazia();
        boolean boolean18 = fila12.vazia();
        java.lang.Class<?> wildcardClass19 = fila12.getClass();
        fila0.enfileira((java.lang.Object) fila12);
        boolean boolean21 = fila12.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.imprime();
        java.lang.Object obj10 = fila6.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        java.lang.Object obj17 = fila11.desenfileira();
        boolean boolean18 = fila11.vazia();
        fila11.enfileira((java.lang.Object) 0L);
        fila11.imprime();
        boolean boolean22 = fila11.vazia();
        fila6.enfileira((java.lang.Object) boolean22);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj25 = fila0.desenfileira();
        boolean boolean26 = fila0.vazia();
        java.lang.Class<?> wildcardClass27 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 0 + "'", obj25, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.enfileira((java.lang.Object) 0L);
        fila0.enfileira((java.lang.Object) 0L);
        boolean boolean12 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj15 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.imprime();
        java.lang.Object obj10 = fila6.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        java.lang.Object obj17 = fila11.desenfileira();
        boolean boolean18 = fila11.vazia();
        fila11.enfileira((java.lang.Object) 0L);
        fila11.imprime();
        boolean boolean22 = fila11.vazia();
        fila6.enfileira((java.lang.Object) boolean22);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Class<?> wildcardClass25 = fila6.getClass();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj6 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj11 = new java.lang.Object();
        fila6.enfileira(obj11);
        fila6.imprime();
        boolean boolean14 = fila6.vazia();
        fila6.enfileira((java.lang.Object) 'a');
        boolean boolean17 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        boolean boolean20 = fila6.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) (-1.0d));
        fila5.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        fila5.enfileira((java.lang.Object) fila16);
        boolean boolean24 = fila16.vazia();
        fila16.imprime();
        boolean boolean26 = fila16.vazia();
        fila0.enfileira((java.lang.Object) fila16);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        fila2.enfileira(obj7);
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        fila12.imprime();
        java.lang.Object obj16 = fila12.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila17.enfileira((java.lang.Object) boolean19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) 0);
        boolean boolean24 = fila21.vazia();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        fila17.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        fila12.enfileira((java.lang.Object) fila21);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (byte) 0);
        fila31.imprime();
        fila21.enfileira((java.lang.Object) fila31);
        fila0.enfileira((java.lang.Object) fila21);
        java.lang.Object obj37 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 0 + "'", obj16, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        fila9.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        boolean boolean18 = fila14.vazia();
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean20 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        fila0.imprime();
        boolean boolean23 = fila0.vazia();
        java.lang.Class<?> wildcardClass24 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean19 = fila0.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) 0);
        boolean boolean23 = fila20.vazia();
        boolean boolean24 = fila20.vazia();
        boolean boolean25 = fila20.vazia();
        java.lang.Object obj26 = fila20.desenfileira();
        boolean boolean27 = fila20.vazia();
        fila20.enfileira((java.lang.Object) 0L);
        java.lang.Object obj30 = fila20.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        fila31.imprime();
        fila31.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj36 = fila31.desenfileira();
        boolean boolean37 = fila31.vazia();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (byte) 0);
        boolean boolean41 = fila38.vazia();
        boolean boolean42 = fila38.vazia();
        boolean boolean43 = fila38.vazia();
        java.lang.Object obj44 = fila38.desenfileira();
        boolean boolean45 = fila38.vazia();
        fila38.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass48 = fila38.getClass();
        fila31.enfileira((java.lang.Object) wildcardClass48);
        fila20.enfileira((java.lang.Object) wildcardClass48);
        fila0.enfileira((java.lang.Object) fila20);
        boolean boolean52 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 0 + "'", obj26, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0L + "'", obj30, 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 10.0d + "'", obj36, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) 0 + "'", obj44, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        boolean boolean20 = fila13.vazia();
        fila13.enfileira((java.lang.Object) 0L);
        fila13.imprime();
        boolean boolean24 = fila13.vazia();
        java.lang.Class<?> wildcardClass25 = fila13.getClass();
        fila4.enfileira((java.lang.Object) fila13);
        java.lang.Class<?> wildcardClass27 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        fila14.imprime();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        boolean boolean21 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila23.imprime();
        fila23.imprime();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (byte) 0);
        boolean boolean30 = fila27.vazia();
        fila27.imprime();
        fila27.imprime();
        fila23.enfileira((java.lang.Object) fila27);
        java.lang.Object obj34 = fila23.desenfileira();
        fila23.imprime();
        boolean boolean36 = fila23.vazia();
        fila0.enfileira((java.lang.Object) boolean36);
        java.lang.Class<?> wildcardClass38 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        boolean boolean17 = fila12.vazia();
        boolean boolean18 = fila12.vazia();
        java.lang.Class<?> wildcardClass19 = fila12.getClass();
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Object obj21 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj10 = fila5.desenfileira();
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        boolean boolean17 = fila12.vazia();
        java.lang.Object obj18 = fila12.desenfileira();
        boolean boolean19 = fila12.vazia();
        fila12.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass22 = fila12.getClass();
        fila5.enfileira((java.lang.Object) wildcardClass22);
        boolean boolean24 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        fila0.enfileira((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        fila2.enfileira(obj7);
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila16.enfileira((java.lang.Object) fila19);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila22.imprime();
        fila22.imprime();
        java.lang.Class<?> wildcardClass26 = fila22.getClass();
        fila16.enfileira((java.lang.Object) fila22);
        fila11.enfileira((java.lang.Object) fila16);
        fila16.imprime();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (byte) 0);
        boolean boolean33 = fila30.vazia();
        fila30.imprime();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) (byte) 0);
        boolean boolean38 = fila35.vazia();
        boolean boolean39 = fila35.vazia();
        fila30.enfileira((java.lang.Object) fila35);
        fila35.imprime();
        boolean boolean42 = fila35.vazia();
        fila35.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) 0);
        boolean boolean48 = fila45.vazia();
        boolean boolean49 = fila45.vazia();
        boolean boolean50 = fila45.vazia();
        java.lang.Object obj51 = fila45.desenfileira();
        boolean boolean52 = fila45.vazia();
        fila45.enfileira((java.lang.Object) (-1.0d));
        fila45.imprime();
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj59 = fila56.desenfileira();
        boolean boolean60 = fila56.vazia();
        fila56.imprime();
        fila56.imprime();
        fila45.enfileira((java.lang.Object) fila56);
        boolean boolean64 = fila56.vazia();
        fila35.enfileira((java.lang.Object) fila56);
        ds.Fila fila66 = new ds.Fila();
        fila66.enfileira((java.lang.Object) (byte) 0);
        fila66.imprime();
        ds.Fila fila70 = new ds.Fila();
        fila70.enfileira((java.lang.Object) (byte) 0);
        boolean boolean73 = fila70.vazia();
        boolean boolean74 = fila70.vazia();
        boolean boolean75 = fila70.vazia();
        java.lang.Object obj76 = fila70.desenfileira();
        boolean boolean77 = fila70.vazia();
        boolean boolean78 = fila70.vazia();
        fila70.imprime();
        fila66.enfileira((java.lang.Object) fila70);
        fila66.imprime();
        fila35.enfileira((java.lang.Object) fila66);
        fila16.enfileira((java.lang.Object) fila66);
        fila2.enfileira((java.lang.Object) fila66);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) 0 + "'", obj51, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) 0 + "'", obj59, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + (byte) 0 + "'", obj76, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        java.lang.Object obj10 = fila4.desenfileira();
        boolean boolean11 = fila4.vazia();
        boolean boolean12 = fila4.vazia();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Class<?> wildcardClass15 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj11 = new java.lang.Object();
        fila6.enfileira(obj11);
        fila6.imprime();
        boolean boolean14 = fila6.vazia();
        fila6.enfileira((java.lang.Object) 'a');
        boolean boolean17 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Class<?> wildcardClass19 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        fila7.enfileira((java.lang.Object) fila12);
        fila12.imprime();
        java.lang.Object obj19 = fila12.desenfileira();
        fila0.enfileira(obj19);
        java.lang.Object obj21 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        fila2.enfileira(obj7);
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 100L);
        fila2.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila20.enfileira((java.lang.Object) boolean22);
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        boolean boolean29 = fila24.vazia();
        boolean boolean30 = fila24.vazia();
        fila20.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila15.enfileira((java.lang.Object) fila24);
        boolean boolean34 = fila15.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) (byte) 0);
        fila35.imprime();
        fila15.enfileira((java.lang.Object) fila35);
        fila5.enfileira((java.lang.Object) fila15);
        java.lang.Object obj41 = fila15.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0d + "'", obj13, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj9 = new java.lang.Object();
        fila4.enfileira(obj9);
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj20 = new java.lang.Object();
        fila15.enfileira(obj20);
        fila15.imprime();
        fila13.enfileira((java.lang.Object) fila15);
        fila0.enfileira((java.lang.Object) fila13);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        boolean boolean20 = fila15.vazia();
        java.lang.Object obj21 = fila15.desenfileira();
        boolean boolean22 = fila15.vazia();
        fila15.enfileira((java.lang.Object) (-1.0d));
        fila15.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        fila26.imprime();
        fila26.imprime();
        fila15.enfileira((java.lang.Object) fila26);
        boolean boolean34 = fila26.vazia();
        fila5.enfileira((java.lang.Object) fila26);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) 0);
        fila36.imprime();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) 0);
        boolean boolean43 = fila40.vazia();
        boolean boolean44 = fila40.vazia();
        boolean boolean45 = fila40.vazia();
        java.lang.Object obj46 = fila40.desenfileira();
        boolean boolean47 = fila40.vazia();
        boolean boolean48 = fila40.vazia();
        fila40.imprime();
        fila36.enfileira((java.lang.Object) fila40);
        fila36.imprime();
        fila5.enfileira((java.lang.Object) fila36);
        java.lang.Object obj53 = fila36.desenfileira();
        java.lang.Object obj54 = null;
        fila36.enfileira(obj54);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 0 + "'", obj29, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 0 + "'", obj46, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 0 + "'", obj53, (byte) 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean11 = fila5.vazia();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean11 = fila4.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila12.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila12.enfileira((java.lang.Object) fila15);
        java.lang.Class<?> wildcardClass18 = fila12.getClass();
        fila4.enfileira((java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila10.enfileira((java.lang.Object) fila13);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        java.lang.Class<?> wildcardClass20 = fila16.getClass();
        fila10.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (byte) 0);
        boolean boolean26 = fila23.vazia();
        fila23.imprime();
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        fila28.imprime();
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        fila28.enfileira((java.lang.Object) fila31);
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        fila34.imprime();
        fila34.imprime();
        java.lang.Class<?> wildcardClass38 = fila34.getClass();
        fila28.enfileira((java.lang.Object) fila34);
        fila23.enfileira((java.lang.Object) fila28);
        fila10.enfileira((java.lang.Object) fila23);
        java.lang.Class<?> wildcardClass42 = fila23.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.enfileira((java.lang.Object) "hi!");
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = new java.lang.Object();
        fila20.enfileira(obj25);
        fila20.imprime();
        boolean boolean28 = fila20.vazia();
        fila5.enfileira((java.lang.Object) fila20);
        java.lang.Object obj30 = fila5.desenfileira();
        boolean boolean31 = fila5.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) (-1.0d));
        fila5.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        fila5.enfileira((java.lang.Object) fila16);
        boolean boolean24 = fila16.vazia();
        fila16.imprime();
        boolean boolean26 = fila16.vazia();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj28 = fila0.desenfileira();
        boolean boolean29 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj19 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0d) + "'", obj19, (-1.0d));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        fila19.imprime();
        fila19.imprime();
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 0);
        boolean boolean29 = fila26.vazia();
        fila26.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (byte) 0);
        boolean boolean34 = fila31.vazia();
        boolean boolean35 = fila31.vazia();
        fila26.enfileira((java.lang.Object) fila31);
        fila31.imprime();
        java.lang.Object obj38 = fila31.desenfileira();
        fila19.enfileira(obj38);
        java.lang.Object obj40 = fila19.desenfileira();
        java.lang.Object obj41 = fila19.desenfileira();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass42);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) (byte) 0);
        fila44.imprime();
        boolean boolean48 = fila44.vazia();
        fila0.enfileira((java.lang.Object) fila44);
        java.lang.Class<?> wildcardClass50 = fila44.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 0 + "'", obj38, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 0 + "'", obj41, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean19 = fila11.vazia();
        boolean boolean20 = fila11.vazia();
        java.lang.Class<?> wildcardClass21 = fila11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila5.imprime();
        boolean boolean11 = fila5.vazia();
        java.lang.Class<?> wildcardClass12 = fila5.getClass();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean14 = fila5.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj12 = fila7.desenfileira();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        fila0.enfileira(obj12);
        java.lang.Object obj15 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean17 = fila0.vazia();
        java.lang.Object obj18 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0d + "'", obj12, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0L + "'", obj15, 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10.0d + "'", obj18, 10.0d);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) (byte) 0);
        boolean boolean6 = fila3.vazia();
        boolean boolean7 = fila3.vazia();
        boolean boolean8 = fila3.vazia();
        java.lang.Object obj9 = fila3.desenfileira();
        boolean boolean10 = fila3.vazia();
        fila3.enfileira((java.lang.Object) (-1.0d));
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        boolean boolean20 = fila15.vazia();
        java.lang.Object obj21 = fila15.desenfileira();
        boolean boolean22 = fila15.vazia();
        fila15.enfileira((java.lang.Object) (-1.0d));
        fila15.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        fila26.imprime();
        fila26.imprime();
        fila15.enfileira((java.lang.Object) fila26);
        boolean boolean34 = fila26.vazia();
        fila5.enfileira((java.lang.Object) fila26);
        fila26.imprime();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj40 = fila37.desenfileira();
        boolean boolean41 = fila37.vazia();
        fila37.imprime();
        fila26.enfileira((java.lang.Object) fila37);
        java.lang.Class<?> wildcardClass44 = fila26.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 0 + "'", obj29, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean19 = fila0.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) 0);
        fila20.imprime();
        fila0.enfileira((java.lang.Object) fila20);
        boolean boolean25 = fila20.vazia();
        boolean boolean26 = fila20.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        boolean boolean20 = fila15.vazia();
        java.lang.Object obj21 = fila15.desenfileira();
        boolean boolean22 = fila15.vazia();
        fila15.enfileira((java.lang.Object) (-1.0d));
        fila15.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        fila26.imprime();
        fila26.imprime();
        fila15.enfileira((java.lang.Object) fila26);
        boolean boolean34 = fila26.vazia();
        fila5.enfileira((java.lang.Object) fila26);
        fila26.imprime();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj40 = fila37.desenfileira();
        boolean boolean41 = fila37.vazia();
        fila37.imprime();
        fila26.enfileira((java.lang.Object) fila37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = fila37.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 0 + "'", obj29, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj10 = new java.lang.Object();
        fila5.enfileira(obj10);
        fila5.imprime();
        boolean boolean13 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 'a');
        java.lang.Object obj16 = fila5.desenfileira();
        fila0.enfileira(obj16);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0d + "'", obj16, 10.0d);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.enfileira((java.lang.Object) "hi!");
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = new java.lang.Object();
        fila20.enfileira(obj25);
        fila20.imprime();
        boolean boolean28 = fila20.vazia();
        fila5.enfileira((java.lang.Object) fila20);
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila30.imprime();
        fila30.imprime();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        fila34.imprime();
        fila34.imprime();
        fila30.enfileira((java.lang.Object) fila34);
        fila34.imprime();
        fila20.enfileira((java.lang.Object) fila34);
        java.lang.Class<?> wildcardClass43 = fila20.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        fila7.enfileira((java.lang.Object) fila12);
        java.lang.Object obj18 = fila7.desenfileira();
        java.lang.Object obj19 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Class<?> wildcardClass23 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0d + "'", obj13, 10.0d);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        fila12.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) 0);
        boolean boolean20 = fila17.vazia();
        boolean boolean21 = fila17.vazia();
        fila12.enfileira((java.lang.Object) fila17);
        java.lang.Class<?> wildcardClass23 = fila12.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        fila2.enfileira(obj7);
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
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
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) (byte) 0);
        boolean boolean6 = fila3.vazia();
        boolean boolean7 = fila3.vazia();
        boolean boolean8 = fila3.vazia();
        java.lang.Object obj9 = fila3.desenfileira();
        boolean boolean10 = fila3.vazia();
        fila3.enfileira((java.lang.Object) (-1.0d));
        fila0.enfileira((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila7.enfileira((java.lang.Object) fila10);
        fila10.imprime();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) 0);
        fila16.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) 0);
        boolean boolean23 = fila20.vazia();
        boolean boolean24 = fila20.vazia();
        boolean boolean25 = fila20.vazia();
        java.lang.Object obj26 = fila20.desenfileira();
        boolean boolean27 = fila20.vazia();
        boolean boolean28 = fila20.vazia();
        fila20.imprime();
        fila16.enfileira((java.lang.Object) fila20);
        java.lang.Object obj31 = fila16.desenfileira();
        fila10.enfileira(obj31);
        fila0.enfileira(obj31);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 0 + "'", obj26, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 0 + "'", obj31, (byte) 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        java.lang.Object obj13 = fila5.desenfileira();
        fila0.enfileira(obj13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean19 = fila0.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) 0);
        fila20.imprime();
        fila0.enfileira((java.lang.Object) fila20);
        boolean boolean25 = fila20.vazia();
        java.lang.Class<?> wildcardClass26 = fila20.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        boolean boolean20 = fila15.vazia();
        java.lang.Object obj21 = fila15.desenfileira();
        boolean boolean22 = fila15.vazia();
        fila15.enfileira((java.lang.Object) (-1.0d));
        fila15.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        fila26.imprime();
        fila26.imprime();
        fila15.enfileira((java.lang.Object) fila26);
        boolean boolean34 = fila26.vazia();
        fila5.enfileira((java.lang.Object) fila26);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) 0);
        fila36.imprime();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) 0);
        boolean boolean43 = fila40.vazia();
        boolean boolean44 = fila40.vazia();
        boolean boolean45 = fila40.vazia();
        java.lang.Object obj46 = fila40.desenfileira();
        boolean boolean47 = fila40.vazia();
        boolean boolean48 = fila40.vazia();
        fila40.imprime();
        fila36.enfileira((java.lang.Object) fila40);
        fila36.imprime();
        fila5.enfileira((java.lang.Object) fila36);
        java.lang.Object obj53 = fila36.desenfileira();
        boolean boolean54 = fila36.vazia();
        boolean boolean55 = fila36.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 0 + "'", obj29, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 0 + "'", obj46, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 0 + "'", obj53, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        fila9.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        boolean boolean18 = fila14.vazia();
        fila9.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        boolean boolean21 = fila14.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) 0);
        boolean boolean25 = fila22.vazia();
        boolean boolean26 = fila22.vazia();
        boolean boolean27 = fila22.vazia();
        java.lang.Object obj28 = fila22.desenfileira();
        boolean boolean29 = fila22.vazia();
        fila14.enfileira((java.lang.Object) boolean29);
        boolean boolean31 = fila14.vazia();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 0 + "'", obj28, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        java.lang.Object obj15 = fila9.desenfileira();
        boolean boolean16 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0L);
        fila9.imprime();
        boolean boolean20 = fila9.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) 0);
        boolean boolean24 = fila21.vazia();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        java.lang.Class<?> wildcardClass28 = fila21.getClass();
        fila9.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj31 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj11 = fila0.desenfileira();
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        fila19.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        fila19.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        boolean boolean31 = fila24.vazia();
        fila24.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        boolean boolean38 = fila34.vazia();
        boolean boolean39 = fila34.vazia();
        java.lang.Object obj40 = fila34.desenfileira();
        boolean boolean41 = fila34.vazia();
        fila34.enfileira((java.lang.Object) (-1.0d));
        fila34.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = fila45.desenfileira();
        boolean boolean49 = fila45.vazia();
        fila45.imprime();
        fila45.imprime();
        fila34.enfileira((java.lang.Object) fila45);
        boolean boolean53 = fila45.vazia();
        fila24.enfileira((java.lang.Object) fila45);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (byte) 0);
        fila55.imprime();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) (byte) 0);
        boolean boolean62 = fila59.vazia();
        boolean boolean63 = fila59.vazia();
        boolean boolean64 = fila59.vazia();
        java.lang.Object obj65 = fila59.desenfileira();
        boolean boolean66 = fila59.vazia();
        boolean boolean67 = fila59.vazia();
        fila59.imprime();
        fila55.enfileira((java.lang.Object) fila59);
        fila55.imprime();
        fila24.enfileira((java.lang.Object) fila55);
        fila5.enfileira((java.lang.Object) fila55);
        java.lang.Object obj73 = fila5.desenfileira();
        ds.Fila fila74 = new ds.Fila();
        fila74.enfileira((java.lang.Object) (byte) 0);
        boolean boolean77 = fila74.vazia();
        boolean boolean78 = fila74.vazia();
        boolean boolean79 = fila74.vazia();
        java.lang.Object obj80 = fila74.desenfileira();
        boolean boolean81 = fila74.vazia();
        boolean boolean82 = fila74.vazia();
        boolean boolean83 = fila74.vazia();
        boolean boolean84 = fila74.vazia();
        fila5.enfileira((java.lang.Object) boolean84);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) 0 + "'", obj48, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) 0 + "'", obj65, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + (byte) 0 + "'", obj80, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj11 = new java.lang.Object();
        fila6.enfileira(obj11);
        fila6.imprime();
        boolean boolean14 = fila6.vazia();
        fila6.enfileira((java.lang.Object) 'a');
        boolean boolean17 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean19 = fila6.vazia();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila22.imprime();
        fila22.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj27 = new java.lang.Object();
        fila22.enfileira(obj27);
        fila22.imprime();
        fila20.enfileira((java.lang.Object) fila22);
        java.lang.Object obj31 = fila20.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (byte) 0);
        fila32.imprime();
        java.lang.Object obj36 = fila32.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        ds.Fila fila38 = new ds.Fila();
        boolean boolean39 = fila38.vazia();
        fila37.enfileira((java.lang.Object) boolean39);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) (byte) 0);
        boolean boolean44 = fila41.vazia();
        boolean boolean45 = fila41.vazia();
        boolean boolean46 = fila41.vazia();
        boolean boolean47 = fila41.vazia();
        fila37.enfileira((java.lang.Object) fila41);
        fila41.imprime();
        fila32.enfileira((java.lang.Object) fila41);
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) (byte) 0);
        fila51.imprime();
        fila41.enfileira((java.lang.Object) fila51);
        fila20.enfileira((java.lang.Object) fila41);
        fila6.enfileira((java.lang.Object) fila20);
        fila20.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 0 + "'", obj36, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) (-1.0d));
        fila7.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = fila18.desenfileira();
        boolean boolean22 = fila18.vazia();
        fila18.imprime();
        fila18.imprime();
        fila7.enfileira((java.lang.Object) fila18);
        boolean boolean26 = fila18.vazia();
        fila0.enfileira((java.lang.Object) fila18);
        java.lang.Class<?> wildcardClass28 = fila18.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        java.lang.Object obj13 = fila5.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        fila19.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        fila19.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        boolean boolean31 = fila24.vazia();
        fila24.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        boolean boolean38 = fila34.vazia();
        boolean boolean39 = fila34.vazia();
        java.lang.Object obj40 = fila34.desenfileira();
        boolean boolean41 = fila34.vazia();
        fila34.enfileira((java.lang.Object) (-1.0d));
        fila34.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = fila45.desenfileira();
        boolean boolean49 = fila45.vazia();
        fila45.imprime();
        fila45.imprime();
        fila34.enfileira((java.lang.Object) fila45);
        boolean boolean53 = fila45.vazia();
        fila24.enfileira((java.lang.Object) fila45);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (byte) 0);
        fila55.imprime();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) (byte) 0);
        boolean boolean62 = fila59.vazia();
        boolean boolean63 = fila59.vazia();
        boolean boolean64 = fila59.vazia();
        java.lang.Object obj65 = fila59.desenfileira();
        boolean boolean66 = fila59.vazia();
        boolean boolean67 = fila59.vazia();
        fila59.imprime();
        fila55.enfileira((java.lang.Object) fila59);
        fila55.imprime();
        fila24.enfileira((java.lang.Object) fila55);
        fila5.enfileira((java.lang.Object) fila55);
        java.lang.Object obj73 = fila5.desenfileira();
        ds.Fila fila74 = new ds.Fila();
        ds.Fila fila75 = new ds.Fila();
        boolean boolean76 = fila75.vazia();
        fila74.enfileira((java.lang.Object) boolean76);
        fila74.enfileira((java.lang.Object) '#');
        fila74.imprime();
        fila5.enfileira((java.lang.Object) fila74);
        java.lang.Object obj82 = fila74.desenfileira();
        fila74.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) 0 + "'", obj48, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) 0 + "'", obj65, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + true + "'", obj82, true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        boolean boolean20 = fila13.vazia();
        fila5.enfileira((java.lang.Object) boolean20);
        boolean boolean22 = fila5.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila23.imprime();
        fila23.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj28 = new java.lang.Object();
        fila23.enfileira(obj28);
        fila23.imprime();
        boolean boolean31 = fila23.vazia();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Object obj34 = fila23.desenfileira();
        fila5.enfileira((java.lang.Object) fila23);
        fila5.imprime();
        fila5.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10.0d + "'", obj34, 10.0d);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        boolean boolean20 = fila15.vazia();
        java.lang.Object obj21 = fila15.desenfileira();
        boolean boolean22 = fila15.vazia();
        fila15.enfileira((java.lang.Object) (-1.0d));
        fila15.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        fila26.imprime();
        fila26.imprime();
        fila15.enfileira((java.lang.Object) fila26);
        boolean boolean34 = fila26.vazia();
        fila5.enfileira((java.lang.Object) fila26);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) 0);
        fila36.imprime();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) 0);
        boolean boolean43 = fila40.vazia();
        boolean boolean44 = fila40.vazia();
        boolean boolean45 = fila40.vazia();
        java.lang.Object obj46 = fila40.desenfileira();
        boolean boolean47 = fila40.vazia();
        boolean boolean48 = fila40.vazia();
        fila40.imprime();
        fila36.enfileira((java.lang.Object) fila40);
        fila36.imprime();
        fila5.enfileira((java.lang.Object) fila36);
        java.lang.Class<?> wildcardClass53 = fila36.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 0 + "'", obj29, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 0 + "'", obj46, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.imprime();
        java.lang.Class<?> wildcardClass10 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila12.imprime();
        fila12.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) 0);
        boolean boolean19 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        fila12.enfileira((java.lang.Object) fila16);
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila23.imprime();
        fila23.imprime();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (byte) 0);
        boolean boolean30 = fila27.vazia();
        fila27.imprime();
        fila27.imprime();
        fila23.enfileira((java.lang.Object) fila27);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        fila34.imprime();
        fila34.imprime();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) 0);
        fila40.enfileira((java.lang.Object) 0L);
        fila34.enfileira((java.lang.Object) 0L);
        fila27.enfileira((java.lang.Object) fila34);
        fila12.enfileira((java.lang.Object) fila27);
        fila27.imprime();
        java.lang.Class<?> wildcardClass49 = fila27.getClass();
        fila6.enfileira((java.lang.Object) fila27);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        fila19.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        fila19.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        boolean boolean31 = fila24.vazia();
        fila24.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        boolean boolean38 = fila34.vazia();
        boolean boolean39 = fila34.vazia();
        java.lang.Object obj40 = fila34.desenfileira();
        boolean boolean41 = fila34.vazia();
        fila34.enfileira((java.lang.Object) (-1.0d));
        fila34.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = fila45.desenfileira();
        boolean boolean49 = fila45.vazia();
        fila45.imprime();
        fila45.imprime();
        fila34.enfileira((java.lang.Object) fila45);
        boolean boolean53 = fila45.vazia();
        fila24.enfileira((java.lang.Object) fila45);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (byte) 0);
        fila55.imprime();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) (byte) 0);
        boolean boolean62 = fila59.vazia();
        boolean boolean63 = fila59.vazia();
        boolean boolean64 = fila59.vazia();
        java.lang.Object obj65 = fila59.desenfileira();
        boolean boolean66 = fila59.vazia();
        boolean boolean67 = fila59.vazia();
        fila59.imprime();
        fila55.enfileira((java.lang.Object) fila59);
        fila55.imprime();
        fila24.enfileira((java.lang.Object) fila55);
        fila5.enfileira((java.lang.Object) fila55);
        java.lang.Object obj73 = fila5.desenfileira();
        ds.Fila fila74 = new ds.Fila();
        ds.Fila fila75 = new ds.Fila();
        boolean boolean76 = fila75.vazia();
        fila74.enfileira((java.lang.Object) boolean76);
        fila74.enfileira((java.lang.Object) '#');
        fila74.imprime();
        fila5.enfileira((java.lang.Object) fila74);
        boolean boolean82 = fila74.vazia();
        boolean boolean83 = fila74.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) 0 + "'", obj48, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) 0 + "'", obj65, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        java.lang.Object obj10 = fila4.desenfileira();
        boolean boolean11 = fila4.vazia();
        boolean boolean12 = fila4.vazia();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj15 = fila0.desenfileira();
        boolean boolean16 = fila0.vazia();
        boolean boolean17 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        boolean boolean20 = fila15.vazia();
        java.lang.Object obj21 = fila15.desenfileira();
        boolean boolean22 = fila15.vazia();
        fila15.enfileira((java.lang.Object) (-1.0d));
        fila15.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        fila26.imprime();
        fila26.imprime();
        fila15.enfileira((java.lang.Object) fila26);
        boolean boolean34 = fila26.vazia();
        fila5.enfileira((java.lang.Object) fila26);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) 0);
        fila36.imprime();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) 0);
        boolean boolean43 = fila40.vazia();
        boolean boolean44 = fila40.vazia();
        boolean boolean45 = fila40.vazia();
        java.lang.Object obj46 = fila40.desenfileira();
        boolean boolean47 = fila40.vazia();
        boolean boolean48 = fila40.vazia();
        fila40.imprime();
        fila36.enfileira((java.lang.Object) fila40);
        fila36.imprime();
        fila5.enfileira((java.lang.Object) fila36);
        java.lang.Object obj53 = fila36.desenfileira();
        java.lang.Object obj54 = fila36.desenfileira();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 0 + "'", obj29, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 0 + "'", obj46, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 0 + "'", obj53, (byte) 0);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean19 = fila11.vazia();
        boolean boolean20 = fila11.vazia();
        boolean boolean21 = fila11.vazia();
        fila11.imprime();
        boolean boolean23 = fila11.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = fila11.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        fila14.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        boolean boolean23 = fila19.vazia();
        fila14.enfileira((java.lang.Object) fila19);
        fila19.imprime();
        boolean boolean26 = fila19.vazia();
        fila19.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (byte) 0);
        boolean boolean32 = fila29.vazia();
        boolean boolean33 = fila29.vazia();
        boolean boolean34 = fila29.vazia();
        java.lang.Object obj35 = fila29.desenfileira();
        boolean boolean36 = fila29.vazia();
        fila29.enfileira((java.lang.Object) (-1.0d));
        fila29.imprime();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj43 = fila40.desenfileira();
        boolean boolean44 = fila40.vazia();
        fila40.imprime();
        fila40.imprime();
        fila29.enfileira((java.lang.Object) fila40);
        boolean boolean48 = fila40.vazia();
        fila19.enfileira((java.lang.Object) fila40);
        fila40.imprime();
        java.lang.Class<?> wildcardClass51 = fila40.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass51);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) (byte) 0);
        boolean boolean56 = fila53.vazia();
        boolean boolean57 = fila53.vazia();
        boolean boolean58 = fila53.vazia();
        java.lang.Object obj59 = fila53.desenfileira();
        boolean boolean60 = fila53.vazia();
        fila53.enfileira((java.lang.Object) (-1.0d));
        ds.Fila fila63 = new ds.Fila();
        boolean boolean64 = fila63.vazia();
        fila63.imprime();
        ds.Fila fila66 = new ds.Fila();
        boolean boolean67 = fila66.vazia();
        fila63.enfileira((java.lang.Object) fila66);
        ds.Fila fila69 = new ds.Fila();
        boolean boolean70 = fila69.vazia();
        fila69.imprime();
        fila69.imprime();
        java.lang.Class<?> wildcardClass73 = fila69.getClass();
        fila63.enfileira((java.lang.Object) fila69);
        fila53.enfileira((java.lang.Object) fila63);
        java.lang.Object obj76 = fila63.desenfileira();
        fila0.enfileira((java.lang.Object) fila63);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 0 + "'", obj35, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 0 + "'", obj43, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) 0 + "'", obj59, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(obj76);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean19 = fila11.vazia();
        boolean boolean20 = fila11.vazia();
        boolean boolean21 = fila11.vazia();
        fila11.imprime();
        java.lang.Class<?> wildcardClass23 = fila11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj9 = new java.lang.Object();
        fila4.enfileira(obj9);
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj20 = new java.lang.Object();
        fila15.enfileira(obj20);
        fila15.imprime();
        fila13.enfileira((java.lang.Object) fila15);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila20.enfileira((java.lang.Object) boolean22);
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        boolean boolean29 = fila24.vazia();
        boolean boolean30 = fila24.vazia();
        fila20.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila15.enfileira((java.lang.Object) fila24);
        boolean boolean34 = fila15.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) (byte) 0);
        fila35.imprime();
        fila15.enfileira((java.lang.Object) fila35);
        fila5.enfileira((java.lang.Object) fila15);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) (byte) 0);
        boolean boolean44 = fila41.vazia();
        boolean boolean45 = fila41.vazia();
        boolean boolean46 = fila41.vazia();
        java.lang.Object obj47 = fila41.desenfileira();
        boolean boolean48 = fila41.vazia();
        fila41.enfileira((java.lang.Object) (-1.0d));
        fila41.imprime();
        java.lang.Object obj52 = fila41.desenfileira();
        fila15.enfileira(obj52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (byte) 0 + "'", obj47, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (-1.0d) + "'", obj52, (-1.0d));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        fila2.enfileira(obj7);
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        fila12.imprime();
        java.lang.Object obj16 = fila12.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila17.enfileira((java.lang.Object) boolean19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) 0);
        boolean boolean24 = fila21.vazia();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        fila17.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        fila12.enfileira((java.lang.Object) fila21);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (byte) 0);
        fila31.imprime();
        fila21.enfileira((java.lang.Object) fila31);
        fila0.enfileira((java.lang.Object) fila21);
        java.lang.Class<?> wildcardClass37 = fila21.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 0 + "'", obj16, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila6.enfileira((java.lang.Object) boolean8);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 0);
        boolean boolean13 = fila10.vazia();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila6.enfileira((java.lang.Object) fila10);
        fila10.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        boolean boolean23 = fila19.vazia();
        boolean boolean24 = fila19.vazia();
        java.lang.Object obj25 = fila19.desenfileira();
        boolean boolean26 = fila19.vazia();
        fila19.enfileira((java.lang.Object) 0L);
        fila19.imprime();
        boolean boolean30 = fila19.vazia();
        java.lang.Class<?> wildcardClass31 = fila19.getClass();
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 0 + "'", obj25, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass16 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj18 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj20 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        fila5.imprime();
        java.lang.Object obj20 = fila5.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        java.lang.Object obj15 = fila9.desenfileira();
        boolean boolean16 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0L);
        fila9.imprime();
        boolean boolean20 = fila9.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) 0);
        boolean boolean24 = fila21.vazia();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        java.lang.Class<?> wildcardClass28 = fila21.getClass();
        fila9.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass31 = fila9.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        fila9.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        boolean boolean18 = fila14.vazia();
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean20 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        fila0.imprime();
        java.lang.Object obj23 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean11 = fila5.vazia();
        boolean boolean12 = fila5.vazia();
        java.lang.Object obj13 = fila5.desenfileira();
        boolean boolean14 = fila5.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean19 = fila11.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) 0);
        fila20.enfileira((java.lang.Object) 0L);
        java.lang.Object obj25 = fila20.desenfileira();
        boolean boolean26 = fila20.vazia();
        java.lang.Object obj27 = fila20.desenfileira();
        boolean boolean28 = fila20.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (byte) 0);
        boolean boolean32 = fila29.vazia();
        boolean boolean33 = fila29.vazia();
        boolean boolean34 = fila29.vazia();
        java.lang.Object obj35 = fila29.desenfileira();
        boolean boolean36 = fila29.vazia();
        fila29.enfileira((java.lang.Object) 0L);
        fila29.imprime();
        boolean boolean40 = fila29.vazia();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) (byte) 0);
        boolean boolean44 = fila41.vazia();
        boolean boolean45 = fila41.vazia();
        boolean boolean46 = fila41.vazia();
        boolean boolean47 = fila41.vazia();
        java.lang.Class<?> wildcardClass48 = fila41.getClass();
        fila29.enfileira((java.lang.Object) fila41);
        fila20.enfileira((java.lang.Object) fila29);
        java.lang.Object obj51 = fila29.desenfileira();
        fila11.enfileira((java.lang.Object) fila29);
        java.lang.Object obj53 = fila29.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = fila29.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 0 + "'", obj25, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0L + "'", obj27, 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 0 + "'", obj35, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0L + "'", obj51, 0L);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.enfileira((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) (-1.0d));
        fila7.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = fila18.desenfileira();
        boolean boolean22 = fila18.vazia();
        fila18.imprime();
        fila18.imprime();
        fila7.enfileira((java.lang.Object) fila18);
        boolean boolean26 = fila18.vazia();
        fila0.enfileira((java.lang.Object) fila18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = fila18.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        java.lang.Object obj10 = fila4.desenfileira();
        boolean boolean11 = fila4.vazia();
        boolean boolean12 = fila4.vazia();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj15 = fila0.desenfileira();
        java.lang.Object obj16 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.enfileira((java.lang.Object) "hi!");
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = new java.lang.Object();
        fila20.enfileira(obj25);
        fila20.imprime();
        boolean boolean28 = fila20.vazia();
        fila5.enfileira((java.lang.Object) fila20);
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila30.imprime();
        fila30.imprime();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        fila34.imprime();
        fila34.imprime();
        fila30.enfileira((java.lang.Object) fila34);
        fila34.imprime();
        fila20.enfileira((java.lang.Object) fila34);
        fila20.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = fila8.desenfileira();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        fila14.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        boolean boolean23 = fila19.vazia();
        fila14.enfileira((java.lang.Object) fila19);
        fila19.imprime();
        boolean boolean26 = fila19.vazia();
        fila19.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (byte) 0);
        boolean boolean32 = fila29.vazia();
        boolean boolean33 = fila29.vazia();
        boolean boolean34 = fila29.vazia();
        java.lang.Object obj35 = fila29.desenfileira();
        boolean boolean36 = fila29.vazia();
        fila29.enfileira((java.lang.Object) (-1.0d));
        fila29.imprime();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj43 = fila40.desenfileira();
        boolean boolean44 = fila40.vazia();
        fila40.imprime();
        fila40.imprime();
        fila29.enfileira((java.lang.Object) fila40);
        boolean boolean48 = fila40.vazia();
        fila19.enfileira((java.lang.Object) fila40);
        fila40.imprime();
        fila0.enfileira((java.lang.Object) fila40);
        java.lang.Class<?> wildcardClass52 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 0 + "'", obj35, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 0 + "'", obj43, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.imprime();
        java.lang.Object obj10 = fila6.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        java.lang.Object obj17 = fila11.desenfileira();
        boolean boolean18 = fila11.vazia();
        fila11.enfileira((java.lang.Object) 0L);
        fila11.imprime();
        boolean boolean22 = fila11.vazia();
        fila6.enfileira((java.lang.Object) boolean22);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj25 = fila0.desenfileira();
        boolean boolean26 = fila0.vazia();
        fila0.imprime();
        boolean boolean28 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 0 + "'", obj25, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        fila11.imprime();
        java.lang.Object obj15 = fila11.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila16.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) 0);
        boolean boolean23 = fila20.vazia();
        boolean boolean24 = fila20.vazia();
        boolean boolean25 = fila20.vazia();
        boolean boolean26 = fila20.vazia();
        fila16.enfileira((java.lang.Object) fila20);
        fila20.imprime();
        fila11.enfileira((java.lang.Object) fila20);
        boolean boolean30 = fila11.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (byte) 0);
        fila31.imprime();
        fila11.enfileira((java.lang.Object) fila31);
        boolean boolean36 = fila31.vazia();
        fila0.enfileira((java.lang.Object) boolean36);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0d + "'", obj13, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) 0);
        fila17.enfileira((java.lang.Object) 0L);
        fila11.enfileira((java.lang.Object) 0L);
        fila4.enfileira((java.lang.Object) fila11);
        java.lang.Object obj24 = fila11.desenfileira();
        fila11.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 0);
        boolean boolean29 = fila26.vazia();
        boolean boolean30 = fila26.vazia();
        boolean boolean31 = fila26.vazia();
        java.lang.Object obj32 = fila26.desenfileira();
        boolean boolean33 = fila26.vazia();
        fila26.enfileira((java.lang.Object) (-1.0d));
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        fila36.imprime();
        ds.Fila fila39 = new ds.Fila();
        boolean boolean40 = fila39.vazia();
        fila36.enfileira((java.lang.Object) fila39);
        ds.Fila fila42 = new ds.Fila();
        boolean boolean43 = fila42.vazia();
        fila42.imprime();
        fila42.imprime();
        java.lang.Class<?> wildcardClass46 = fila42.getClass();
        fila36.enfileira((java.lang.Object) fila42);
        fila26.enfileira((java.lang.Object) fila36);
        java.lang.Object obj49 = fila26.desenfileira();
        fila11.enfileira(obj49);
        boolean boolean51 = fila11.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 0 + "'", obj24, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 0 + "'", obj32, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1.0d) + "'", obj49, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj12 = fila7.desenfileira();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        fila0.enfileira(obj12);
        java.lang.Object obj15 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0d + "'", obj12, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0L + "'", obj15, 0L);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        boolean boolean20 = fila13.vazia();
        fila5.enfileira((java.lang.Object) boolean20);
        boolean boolean22 = fila5.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila23.imprime();
        fila23.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj28 = new java.lang.Object();
        fila23.enfileira(obj28);
        fila23.imprime();
        boolean boolean31 = fila23.vazia();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Object obj34 = fila23.desenfileira();
        fila5.enfileira((java.lang.Object) fila23);
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        fila36.imprime();
        fila36.imprime();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) 0);
        boolean boolean43 = fila40.vazia();
        fila40.imprime();
        fila40.imprime();
        fila36.enfileira((java.lang.Object) fila40);
        boolean boolean47 = fila40.vazia();
        fila5.enfileira((java.lang.Object) boolean47);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) (byte) 0);
        boolean boolean52 = fila49.vazia();
        fila49.imprime();
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) (byte) 0);
        boolean boolean57 = fila54.vazia();
        boolean boolean58 = fila54.vazia();
        fila49.enfileira((java.lang.Object) fila54);
        fila54.imprime();
        boolean boolean61 = fila54.vazia();
        fila54.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj64 = fila54.desenfileira();
        fila54.imprime();
        fila5.enfileira((java.lang.Object) fila54);
        java.lang.Object obj67 = fila5.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10.0d + "'", obj34, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (byte) 0 + "'", obj64, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (byte) 0 + "'", obj67, (byte) 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        boolean boolean17 = fila12.vazia();
        boolean boolean18 = fila12.vazia();
        java.lang.Class<?> wildcardClass19 = fila12.getClass();
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Object obj21 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass22 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj19 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        fila2.enfileira(obj7);
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        fila12.imprime();
        java.lang.Object obj16 = fila12.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila17.enfileira((java.lang.Object) boolean19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) 0);
        boolean boolean24 = fila21.vazia();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        fila17.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        fila12.enfileira((java.lang.Object) fila21);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (byte) 0);
        fila31.imprime();
        fila21.enfileira((java.lang.Object) fila31);
        fila0.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 0 + "'", obj16, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean11 = fila4.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila12.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila12.enfileira((java.lang.Object) fila15);
        java.lang.Class<?> wildcardClass18 = fila12.getClass();
        fila4.enfileira((java.lang.Object) wildcardClass18);
        fila4.enfileira((java.lang.Object) (-1));
        boolean boolean22 = fila4.vazia();
        java.lang.Class<?> wildcardClass23 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (byte) 0);
        boolean boolean11 = fila8.vazia();
        boolean boolean12 = fila8.vazia();
        boolean boolean13 = fila8.vazia();
        java.lang.Object obj14 = fila8.desenfileira();
        boolean boolean15 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0L);
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = new java.lang.Object();
        fila20.enfileira(obj25);
        fila20.imprime();
        fila18.enfileira((java.lang.Object) fila20);
        java.lang.Object obj29 = fila18.desenfileira();
        fila8.enfileira(obj29);
        fila0.enfileira(obj29);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        java.lang.Object obj12 = fila5.desenfileira();
        java.lang.Class<?> wildcardClass13 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        boolean boolean9 = fila6.vazia();
        boolean boolean10 = fila6.vazia();
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila6.enfileira((java.lang.Object) 0L);
        fila6.imprime();
        boolean boolean17 = fila6.vazia();
        java.lang.Class<?> wildcardClass18 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        fila19.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        fila19.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        boolean boolean31 = fila24.vazia();
        fila24.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        boolean boolean38 = fila34.vazia();
        boolean boolean39 = fila34.vazia();
        java.lang.Object obj40 = fila34.desenfileira();
        boolean boolean41 = fila34.vazia();
        fila34.enfileira((java.lang.Object) (-1.0d));
        fila34.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = fila45.desenfileira();
        boolean boolean49 = fila45.vazia();
        fila45.imprime();
        fila45.imprime();
        fila34.enfileira((java.lang.Object) fila45);
        boolean boolean53 = fila45.vazia();
        fila24.enfileira((java.lang.Object) fila45);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (byte) 0);
        fila55.imprime();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) (byte) 0);
        boolean boolean62 = fila59.vazia();
        boolean boolean63 = fila59.vazia();
        boolean boolean64 = fila59.vazia();
        java.lang.Object obj65 = fila59.desenfileira();
        boolean boolean66 = fila59.vazia();
        boolean boolean67 = fila59.vazia();
        fila59.imprime();
        fila55.enfileira((java.lang.Object) fila59);
        fila55.imprime();
        fila24.enfileira((java.lang.Object) fila55);
        fila5.enfileira((java.lang.Object) fila55);
        java.lang.Object obj73 = fila5.desenfileira();
        java.lang.Object obj74 = fila5.desenfileira();
        java.lang.Class<?> wildcardClass75 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) 0 + "'", obj48, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) 0 + "'", obj65, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean19 = fila0.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) 0);
        boolean boolean23 = fila20.vazia();
        boolean boolean24 = fila20.vazia();
        boolean boolean25 = fila20.vazia();
        java.lang.Object obj26 = fila20.desenfileira();
        boolean boolean27 = fila20.vazia();
        fila20.enfileira((java.lang.Object) 0L);
        java.lang.Object obj30 = fila20.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        fila31.imprime();
        fila31.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj36 = fila31.desenfileira();
        boolean boolean37 = fila31.vazia();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (byte) 0);
        boolean boolean41 = fila38.vazia();
        boolean boolean42 = fila38.vazia();
        boolean boolean43 = fila38.vazia();
        java.lang.Object obj44 = fila38.desenfileira();
        boolean boolean45 = fila38.vazia();
        fila38.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass48 = fila38.getClass();
        fila31.enfileira((java.lang.Object) wildcardClass48);
        fila20.enfileira((java.lang.Object) wildcardClass48);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj52 = fila20.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 0 + "'", obj26, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0L + "'", obj30, 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 10.0d + "'", obj36, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) 0 + "'", obj44, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "class ds.Fila");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        fila9.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        boolean boolean18 = fila14.vazia();
        fila9.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        boolean boolean21 = fila14.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) 0);
        boolean boolean25 = fila22.vazia();
        boolean boolean26 = fila22.vazia();
        boolean boolean27 = fila22.vazia();
        java.lang.Object obj28 = fila22.desenfileira();
        boolean boolean29 = fila22.vazia();
        fila14.enfileira((java.lang.Object) boolean29);
        boolean boolean31 = fila14.vazia();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        fila34.imprime();
        ds.Fila fila37 = new ds.Fila();
        boolean boolean38 = fila37.vazia();
        fila34.enfileira((java.lang.Object) fila37);
        boolean boolean40 = fila34.vazia();
        fila34.imprime();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.imprime();
        fila34.enfileira((java.lang.Object) fila42);
        fila0.enfileira((java.lang.Object) fila34);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) (byte) 0);
        boolean boolean52 = fila49.vazia();
        boolean boolean53 = fila49.vazia();
        boolean boolean54 = fila49.vazia();
        boolean boolean55 = fila49.vazia();
        fila49.imprime();
        fila49.imprime();
        fila34.enfileira((java.lang.Object) fila49);
        java.lang.Class<?> wildcardClass59 = fila34.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 0 + "'", obj28, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 0 + "'", obj45, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj13 = fila8.desenfileira();
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        boolean boolean20 = fila15.vazia();
        java.lang.Object obj21 = fila15.desenfileira();
        boolean boolean22 = fila15.vazia();
        fila15.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass25 = fila15.getClass();
        fila8.enfileira((java.lang.Object) wildcardClass25);
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean28 = fila8.vazia();
        java.lang.Class<?> wildcardClass29 = fila8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0d + "'", obj13, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) (-1.0d));
        fila5.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        fila5.enfileira((java.lang.Object) fila16);
        boolean boolean24 = fila16.vazia();
        fila16.imprime();
        boolean boolean26 = fila16.vazia();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj28 = fila0.desenfileira();
        java.lang.Object obj29 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0L + "'", obj13, 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj18 = new java.lang.Object();
        fila13.enfileira(obj18);
        fila0.enfileira(obj18);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean18 = fila0.vazia();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj24 = fila19.desenfileira();
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 0);
        fila26.imprime();
        java.lang.Object obj30 = fila26.desenfileira();
        boolean boolean31 = fila26.vazia();
        fila19.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = fila26.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10.0d + "'", obj24, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 0 + "'", obj30, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj13 = new java.lang.Object();
        fila8.enfileira(obj13);
        fila8.imprime();
        boolean boolean16 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 'a');
        boolean boolean19 = fila8.vazia();
        fila8.imprime();
        java.lang.Object obj21 = fila8.desenfileira();
        boolean boolean22 = fila8.vazia();
        java.lang.Object obj23 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj25 = fila8.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 10.0d + "'", obj21, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 'a' + "'", obj25, 'a');
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.enfileira((java.lang.Object) '#');
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        fila9.enfileira((java.lang.Object) 0L);
        java.lang.Object obj14 = fila9.desenfileira();
        fila0.enfileira((java.lang.Object) fila9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + '#' + "'", obj8, '#');
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean19 = fila11.vazia();
        fila11.imprime();
        boolean boolean21 = fila11.vazia();
        java.lang.Class<?> wildcardClass22 = fila11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.imprime();
        boolean boolean14 = fila5.vazia();
        java.lang.Object obj15 = fila5.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        boolean boolean9 = fila6.vazia();
        boolean boolean10 = fila6.vazia();
        fila6.imprime();
        boolean boolean12 = fila6.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        boolean boolean20 = fila13.vazia();
        fila13.enfileira((java.lang.Object) (-1.0d));
        fila13.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj27 = fila24.desenfileira();
        boolean boolean28 = fila24.vazia();
        fila24.imprime();
        fila24.imprime();
        fila13.enfileira((java.lang.Object) fila24);
        boolean boolean32 = fila24.vazia();
        fila6.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean35 = fila0.vazia();
        boolean boolean36 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila38 = new ds.Fila();
        boolean boolean39 = fila38.vazia();
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        fila40.imprime();
        fila40.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj45 = new java.lang.Object();
        fila40.enfileira(obj45);
        fila40.imprime();
        fila38.enfileira((java.lang.Object) fila40);
        fila0.enfileira((java.lang.Object) fila40);
        boolean boolean50 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 0 + "'", obj27, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        boolean boolean9 = fila6.vazia();
        boolean boolean10 = fila6.vazia();
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila6.enfileira((java.lang.Object) 0L);
        fila6.imprime();
        boolean boolean17 = fila6.vazia();
        java.lang.Class<?> wildcardClass18 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = fila8.desenfileira();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila8.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.enfileira((java.lang.Object) "hi!");
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = new java.lang.Object();
        fila20.enfileira(obj25);
        fila20.imprime();
        boolean boolean28 = fila20.vazia();
        fila5.enfileira((java.lang.Object) fila20);
        java.lang.Object obj30 = fila5.desenfileira();
        java.lang.Object obj31 = fila5.desenfileira();
        fila5.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass17 = fila7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj24 = new java.lang.Object();
        fila19.enfileira(obj24);
        fila19.imprime();
        boolean boolean27 = fila19.vazia();
        fila19.enfileira((java.lang.Object) 'a');
        boolean boolean30 = fila19.vazia();
        fila0.enfileira((java.lang.Object) fila19);
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        fila32.imprime();
        fila19.enfileira((java.lang.Object) fila32);
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        fila36.imprime();
        ds.Fila fila39 = new ds.Fila();
        boolean boolean40 = fila39.vazia();
        fila36.enfileira((java.lang.Object) fila39);
        java.lang.Object obj42 = fila36.desenfileira();
        fila32.enfileira(obj42);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj9 = new java.lang.Object();
        fila4.enfileira(obj9);
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj20 = new java.lang.Object();
        fila15.enfileira(obj20);
        fila15.imprime();
        fila13.enfileira((java.lang.Object) fila15);
        fila0.enfileira((java.lang.Object) fila13);
        fila0.imprime();
        java.lang.Class<?> wildcardClass26 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        java.lang.Object obj9 = null;
        fila0.enfileira(obj9);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        java.lang.Object obj15 = fila9.desenfileira();
        boolean boolean16 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0L);
        fila9.imprime();
        boolean boolean20 = fila9.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) 0);
        boolean boolean24 = fila21.vazia();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        java.lang.Class<?> wildcardClass28 = fila21.getClass();
        fila9.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj31 = fila0.desenfileira();
        boolean boolean32 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (short) 100);
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass17 = fila7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        boolean boolean19 = fila0.vazia();
        boolean boolean20 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.imprime();
        java.lang.Class<?> wildcardClass10 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        boolean boolean14 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.enfileira((java.lang.Object) 0L);
        fila0.enfileira((java.lang.Object) 0L);
        boolean boolean12 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        fila19.imprime();
        fila19.imprime();
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 0);
        boolean boolean29 = fila26.vazia();
        fila26.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (byte) 0);
        boolean boolean34 = fila31.vazia();
        boolean boolean35 = fila31.vazia();
        fila26.enfileira((java.lang.Object) fila31);
        fila31.imprime();
        java.lang.Object obj38 = fila31.desenfileira();
        fila19.enfileira(obj38);
        java.lang.Object obj40 = fila19.desenfileira();
        java.lang.Object obj41 = fila19.desenfileira();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass42);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 0 + "'", obj38, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 0 + "'", obj41, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        fila9.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        boolean boolean18 = fila14.vazia();
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean20 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        boolean boolean22 = fila14.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj18 = fila5.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila19.imprime();
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila19.enfileira((java.lang.Object) fila22);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) 0);
        boolean boolean28 = fila25.vazia();
        boolean boolean29 = fila25.vazia();
        fila25.imprime();
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (byte) 0);
        boolean boolean35 = fila32.vazia();
        boolean boolean36 = fila32.vazia();
        boolean boolean37 = fila32.vazia();
        java.lang.Object obj38 = fila32.desenfileira();
        boolean boolean39 = fila32.vazia();
        fila32.enfileira((java.lang.Object) (-1.0d));
        fila32.imprime();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj46 = fila43.desenfileira();
        boolean boolean47 = fila43.vazia();
        fila43.imprime();
        fila43.imprime();
        fila32.enfileira((java.lang.Object) fila43);
        boolean boolean51 = fila43.vazia();
        fila25.enfileira((java.lang.Object) fila43);
        fila19.enfileira((java.lang.Object) fila25);
        fila5.enfileira((java.lang.Object) fila25);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 0 + "'", obj38, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 0 + "'", obj46, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass16 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        java.lang.Class<?> wildcardClass19 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass17 = fila7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        boolean boolean19 = fila0.vazia();
        java.lang.Object obj20 = fila0.desenfileira();
        java.lang.Object obj21 = null;
        fila0.enfileira(obj21);
        java.lang.Object obj23 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class ds.Fila");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        fila7.enfileira((java.lang.Object) fila12);
        fila12.imprime();
        java.lang.Object obj19 = fila12.desenfileira();
        fila0.enfileira(obj19);
        fila0.imprime();
        java.lang.Object obj22 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 0 + "'", obj22, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean11 = fila5.vazia();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        fila13.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) 0);
        boolean boolean21 = fila18.vazia();
        boolean boolean22 = fila18.vazia();
        fila13.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        boolean boolean25 = fila18.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 0);
        boolean boolean29 = fila26.vazia();
        boolean boolean30 = fila26.vazia();
        boolean boolean31 = fila26.vazia();
        java.lang.Object obj32 = fila26.desenfileira();
        boolean boolean33 = fila26.vazia();
        fila18.enfileira((java.lang.Object) boolean33);
        boolean boolean35 = fila18.vazia();
        fila18.imprime();
        fila5.enfileira((java.lang.Object) fila18);
        java.lang.Object obj38 = fila18.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 0 + "'", obj32, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 0 + "'", obj38, (byte) 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        java.lang.Object obj15 = fila9.desenfileira();
        boolean boolean16 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0L);
        fila9.imprime();
        boolean boolean20 = fila9.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) 0);
        boolean boolean24 = fila21.vazia();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        java.lang.Class<?> wildcardClass28 = fila21.getClass();
        fila9.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj31 = fila9.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (byte) 0);
        boolean boolean35 = fila32.vazia();
        boolean boolean36 = fila32.vazia();
        boolean boolean37 = fila32.vazia();
        boolean boolean38 = fila32.vazia();
        fila32.imprime();
        fila32.imprime();
        fila9.enfileira((java.lang.Object) fila32);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        fila7.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        java.lang.Object obj17 = fila11.desenfileira();
        boolean boolean18 = fila11.vazia();
        boolean boolean19 = fila11.vazia();
        fila11.imprime();
        fila7.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass16 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj18 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj20 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila7.enfileira((java.lang.Object) fila10);
        boolean boolean13 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj18 = fila15.desenfileira();
        fila15.imprime();
        fila7.enfileira((java.lang.Object) fila15);
        fila0.enfileira((java.lang.Object) fila15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = fila15.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        boolean boolean17 = fila12.vazia();
        fila12.imprime();
        boolean boolean19 = fila12.vazia();
        java.lang.Object obj20 = fila12.desenfileira();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        fila12.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 0 + "'", obj20, (byte) 0);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        fila9.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        boolean boolean18 = fila14.vazia();
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean20 = fila9.vazia();
        java.lang.Object obj21 = fila9.desenfileira();
        java.lang.Object obj22 = fila9.desenfileira();
        fila0.enfileira((java.lang.Object) fila9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        boolean boolean20 = fila11.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.imprime();
        fila13.imprime();
        boolean boolean17 = fila13.vazia();
        ds.Fila fila18 = new ds.Fila();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila18.enfileira((java.lang.Object) boolean20);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) 0);
        boolean boolean25 = fila22.vazia();
        boolean boolean26 = fila22.vazia();
        boolean boolean27 = fila22.vazia();
        boolean boolean28 = fila22.vazia();
        fila18.enfileira((java.lang.Object) fila22);
        fila22.imprime();
        fila13.enfileira((java.lang.Object) fila22);
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        fila32.imprime();
        java.lang.Object obj35 = null;
        fila32.enfileira(obj35);
        boolean boolean37 = fila32.vazia();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (byte) 0);
        boolean boolean41 = fila38.vazia();
        boolean boolean42 = fila38.vazia();
        boolean boolean43 = fila38.vazia();
        java.lang.Object obj44 = fila38.desenfileira();
        boolean boolean45 = fila38.vazia();
        fila38.enfileira((java.lang.Object) (-1.0d));
        fila32.enfileira((java.lang.Object) (-1.0d));
        fila13.enfileira((java.lang.Object) (-1.0d));
        java.lang.Object obj50 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) 0 + "'", obj44, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.imprime();
        java.lang.Object obj10 = fila6.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        java.lang.Object obj17 = fila11.desenfileira();
        boolean boolean18 = fila11.vazia();
        fila11.enfileira((java.lang.Object) 0L);
        fila11.imprime();
        boolean boolean22 = fila11.vazia();
        fila6.enfileira((java.lang.Object) boolean22);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj25 = fila6.desenfileira();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) 0);
        fila17.enfileira((java.lang.Object) 0L);
        fila11.enfileira((java.lang.Object) 0L);
        fila4.enfileira((java.lang.Object) fila11);
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila24.imprime();
        fila24.imprime();
        boolean boolean28 = fila24.vazia();
        ds.Fila fila29 = new ds.Fila();
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila29.enfileira((java.lang.Object) boolean31);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) (byte) 0);
        boolean boolean36 = fila33.vazia();
        boolean boolean37 = fila33.vazia();
        boolean boolean38 = fila33.vazia();
        boolean boolean39 = fila33.vazia();
        fila29.enfileira((java.lang.Object) fila33);
        fila33.imprime();
        fila24.enfileira((java.lang.Object) fila33);
        java.lang.Object obj43 = fila24.desenfileira();
        boolean boolean44 = fila24.vazia();
        fila4.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        boolean boolean17 = fila12.vazia();
        fila12.imprime();
        boolean boolean19 = fila12.vazia();
        java.lang.Object obj20 = fila12.desenfileira();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (byte) 0);
        boolean boolean26 = fila23.vazia();
        boolean boolean27 = fila23.vazia();
        boolean boolean28 = fila23.vazia();
        java.lang.Object obj29 = fila23.desenfileira();
        boolean boolean30 = fila23.vazia();
        fila23.enfileira((java.lang.Object) 0L);
        fila23.imprime();
        boolean boolean34 = fila23.vazia();
        fila0.enfileira((java.lang.Object) fila23);
        java.lang.Object obj36 = fila23.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 0 + "'", obj20, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 0 + "'", obj29, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0L + "'", obj36, 0L);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        java.lang.Object obj10 = fila4.desenfileira();
        boolean boolean11 = fila4.vazia();
        boolean boolean12 = fila4.vazia();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean15 = fila4.vazia();
        java.lang.Class<?> wildcardClass16 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj11 = new java.lang.Object();
        fila6.enfileira(obj11);
        fila6.imprime();
        boolean boolean14 = fila6.vazia();
        fila6.enfileira((java.lang.Object) 'a');
        boolean boolean17 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj19 = fila6.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0d + "'", obj19, 10.0d);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj13 = new java.lang.Object();
        fila8.enfileira(obj13);
        fila8.imprime();
        fila6.enfileira((java.lang.Object) fila8);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) 0);
        fila17.imprime();
        java.lang.Object obj21 = fila17.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila22.enfileira((java.lang.Object) boolean24);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 0);
        boolean boolean29 = fila26.vazia();
        boolean boolean30 = fila26.vazia();
        boolean boolean31 = fila26.vazia();
        boolean boolean32 = fila26.vazia();
        fila22.enfileira((java.lang.Object) fila26);
        fila26.imprime();
        fila17.enfileira((java.lang.Object) fila26);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) 0);
        fila36.imprime();
        fila26.enfileira((java.lang.Object) fila36);
        java.lang.Object obj41 = fila26.desenfileira();
        boolean boolean42 = fila26.vazia();
        java.lang.Class<?> wildcardClass43 = fila26.getClass();
        fila6.enfileira((java.lang.Object) fila26);
        java.lang.Object obj45 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean47 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 0 + "'", obj41, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj15 = fila5.desenfileira();
        java.lang.Object obj16 = fila5.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        fila19.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        fila19.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        boolean boolean31 = fila24.vazia();
        fila24.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        boolean boolean38 = fila34.vazia();
        boolean boolean39 = fila34.vazia();
        java.lang.Object obj40 = fila34.desenfileira();
        boolean boolean41 = fila34.vazia();
        fila34.enfileira((java.lang.Object) (-1.0d));
        fila34.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = fila45.desenfileira();
        boolean boolean49 = fila45.vazia();
        fila45.imprime();
        fila45.imprime();
        fila34.enfileira((java.lang.Object) fila45);
        boolean boolean53 = fila45.vazia();
        fila24.enfileira((java.lang.Object) fila45);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (byte) 0);
        fila55.imprime();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) (byte) 0);
        boolean boolean62 = fila59.vazia();
        boolean boolean63 = fila59.vazia();
        boolean boolean64 = fila59.vazia();
        java.lang.Object obj65 = fila59.desenfileira();
        boolean boolean66 = fila59.vazia();
        boolean boolean67 = fila59.vazia();
        fila59.imprime();
        fila55.enfileira((java.lang.Object) fila59);
        fila55.imprime();
        fila24.enfileira((java.lang.Object) fila55);
        fila5.enfileira((java.lang.Object) fila55);
        boolean boolean73 = fila5.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) 0 + "'", obj48, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) 0 + "'", obj65, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        fila10.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        boolean boolean20 = fila13.vazia();
        fila5.enfileira((java.lang.Object) boolean20);
        boolean boolean22 = fila5.vazia();
        java.lang.Object obj23 = fila5.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        fila24.imprime();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila29.imprime();
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        fila29.enfileira((java.lang.Object) fila32);
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        fila35.imprime();
        fila35.imprime();
        java.lang.Class<?> wildcardClass39 = fila35.getClass();
        fila29.enfileira((java.lang.Object) fila35);
        fila24.enfileira((java.lang.Object) fila29);
        fila29.enfileira((java.lang.Object) "hi!");
        ds.Fila fila44 = new ds.Fila();
        boolean boolean45 = fila44.vazia();
        fila44.imprime();
        fila44.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj49 = new java.lang.Object();
        fila44.enfileira(obj49);
        fila44.imprime();
        boolean boolean52 = fila44.vazia();
        fila29.enfileira((java.lang.Object) fila44);
        ds.Fila fila54 = new ds.Fila();
        boolean boolean55 = fila54.vazia();
        fila54.imprime();
        fila54.imprime();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) (byte) 0);
        boolean boolean61 = fila58.vazia();
        fila58.imprime();
        fila58.imprime();
        fila54.enfileira((java.lang.Object) fila58);
        fila58.imprime();
        fila44.enfileira((java.lang.Object) fila58);
        fila5.enfileira((java.lang.Object) fila58);
        java.lang.Class<?> wildcardClass68 = fila58.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (byte) 1);
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        java.lang.Object obj10 = fila4.desenfileira();
        boolean boolean11 = fila4.vazia();
        boolean boolean12 = fila4.vazia();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        boolean boolean9 = fila6.vazia();
        boolean boolean10 = fila6.vazia();
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        java.lang.Class<?> wildcardClass14 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.enfileira((java.lang.Object) 0L);
        fila0.enfileira((java.lang.Object) 0L);
        boolean boolean12 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila10.enfileira((java.lang.Object) fila13);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        java.lang.Class<?> wildcardClass20 = fila16.getClass();
        fila10.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (byte) 0);
        boolean boolean26 = fila23.vazia();
        fila23.imprime();
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        fila28.imprime();
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        fila28.enfileira((java.lang.Object) fila31);
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        fila34.imprime();
        fila34.imprime();
        java.lang.Class<?> wildcardClass38 = fila34.getClass();
        fila28.enfileira((java.lang.Object) fila34);
        fila23.enfileira((java.lang.Object) fila28);
        fila10.enfileira((java.lang.Object) fila23);
        fila23.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        java.lang.Object obj10 = fila4.desenfileira();
        boolean boolean11 = fila4.vazia();
        boolean boolean12 = fila4.vazia();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean15 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila20.enfileira((java.lang.Object) boolean22);
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        boolean boolean29 = fila24.vazia();
        boolean boolean30 = fila24.vazia();
        fila20.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila15.enfileira((java.lang.Object) fila24);
        boolean boolean34 = fila15.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) (byte) 0);
        fila35.imprime();
        fila15.enfileira((java.lang.Object) fila35);
        fila5.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass16 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        boolean boolean19 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        fila7.enfileira((java.lang.Object) fila12);
        java.lang.Object obj18 = fila7.desenfileira();
        java.lang.Object obj19 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj23 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        fila15.imprime();
        java.lang.Object obj19 = fila15.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila20.enfileira((java.lang.Object) boolean22);
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        boolean boolean29 = fila24.vazia();
        boolean boolean30 = fila24.vazia();
        fila20.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        fila15.enfileira((java.lang.Object) fila24);
        boolean boolean34 = fila15.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) (byte) 0);
        fila35.imprime();
        fila15.enfileira((java.lang.Object) fila35);
        fila5.enfileira((java.lang.Object) fila15);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) (byte) 0);
        fila41.imprime();
        java.lang.Object obj45 = fila41.desenfileira();
        ds.Fila fila46 = new ds.Fila();
        ds.Fila fila47 = new ds.Fila();
        boolean boolean48 = fila47.vazia();
        fila46.enfileira((java.lang.Object) boolean48);
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) (byte) 0);
        boolean boolean53 = fila50.vazia();
        boolean boolean54 = fila50.vazia();
        boolean boolean55 = fila50.vazia();
        boolean boolean56 = fila50.vazia();
        fila46.enfileira((java.lang.Object) fila50);
        fila50.imprime();
        fila41.enfileira((java.lang.Object) fila50);
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) (byte) 0);
        boolean boolean63 = fila60.vazia();
        boolean boolean64 = fila60.vazia();
        boolean boolean65 = fila60.vazia();
        java.lang.Object obj66 = fila60.desenfileira();
        boolean boolean67 = fila60.vazia();
        java.lang.Class<?> wildcardClass68 = fila60.getClass();
        fila41.enfileira((java.lang.Object) wildcardClass68);
        fila15.enfileira((java.lang.Object) wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 0 + "'", obj45, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (byte) 0 + "'", obj66, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 0);
        boolean boolean13 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila6.enfileira((java.lang.Object) fila10);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) 0);
        boolean boolean20 = fila17.vazia();
        fila17.imprime();
        fila17.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (byte) 0);
        fila23.enfileira((java.lang.Object) 0L);
        fila17.enfileira((java.lang.Object) 0L);
        fila10.enfileira((java.lang.Object) fila17);
        java.lang.Class<?> wildcardClass30 = fila17.getClass();
        fila0.enfileira((java.lang.Object) fila17);
        boolean boolean32 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        boolean boolean20 = fila13.vazia();
        fila5.enfileira((java.lang.Object) boolean20);
        boolean boolean22 = fila5.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila23.imprime();
        fila23.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj28 = new java.lang.Object();
        fila23.enfileira(obj28);
        fila23.imprime();
        boolean boolean31 = fila23.vazia();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Object obj34 = fila23.desenfileira();
        fila5.enfileira((java.lang.Object) fila23);
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        fila36.imprime();
        fila36.imprime();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) 0);
        boolean boolean43 = fila40.vazia();
        fila40.imprime();
        fila40.imprime();
        fila36.enfileira((java.lang.Object) fila40);
        boolean boolean47 = fila40.vazia();
        fila5.enfileira((java.lang.Object) boolean47);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) (byte) 0);
        boolean boolean52 = fila49.vazia();
        fila49.imprime();
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) (byte) 0);
        boolean boolean57 = fila54.vazia();
        boolean boolean58 = fila54.vazia();
        fila49.enfileira((java.lang.Object) fila54);
        fila54.imprime();
        boolean boolean61 = fila54.vazia();
        fila54.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj64 = fila54.desenfileira();
        fila54.imprime();
        fila5.enfileira((java.lang.Object) fila54);
        fila5.imprime();
        java.lang.Class<?> wildcardClass68 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10.0d + "'", obj34, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (byte) 0 + "'", obj64, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.enfileira((java.lang.Object) 0L);
        fila0.enfileira((java.lang.Object) 0L);
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        fila13.imprime();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila18.imprime();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila18.enfileira((java.lang.Object) fila21);
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila24.imprime();
        fila24.imprime();
        java.lang.Class<?> wildcardClass28 = fila24.getClass();
        fila18.enfileira((java.lang.Object) fila24);
        fila13.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        java.lang.Object obj9 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj19 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        fila19.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        fila19.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        boolean boolean31 = fila24.vazia();
        fila24.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        boolean boolean38 = fila34.vazia();
        boolean boolean39 = fila34.vazia();
        java.lang.Object obj40 = fila34.desenfileira();
        boolean boolean41 = fila34.vazia();
        fila34.enfileira((java.lang.Object) (-1.0d));
        fila34.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = fila45.desenfileira();
        boolean boolean49 = fila45.vazia();
        fila45.imprime();
        fila45.imprime();
        fila34.enfileira((java.lang.Object) fila45);
        boolean boolean53 = fila45.vazia();
        fila24.enfileira((java.lang.Object) fila45);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (byte) 0);
        fila55.imprime();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) (byte) 0);
        boolean boolean62 = fila59.vazia();
        boolean boolean63 = fila59.vazia();
        boolean boolean64 = fila59.vazia();
        java.lang.Object obj65 = fila59.desenfileira();
        boolean boolean66 = fila59.vazia();
        boolean boolean67 = fila59.vazia();
        fila59.imprime();
        fila55.enfileira((java.lang.Object) fila59);
        fila55.imprime();
        fila24.enfileira((java.lang.Object) fila55);
        fila5.enfileira((java.lang.Object) fila55);
        boolean boolean73 = fila55.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) 0 + "'", obj48, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) 0 + "'", obj65, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (byte) 1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        boolean boolean20 = fila13.vazia();
        fila5.enfileira((java.lang.Object) boolean20);
        boolean boolean22 = fila5.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila23.imprime();
        fila23.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj28 = new java.lang.Object();
        fila23.enfileira(obj28);
        fila23.imprime();
        boolean boolean31 = fila23.vazia();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Object obj34 = fila23.desenfileira();
        fila5.enfileira((java.lang.Object) fila23);
        boolean boolean36 = fila5.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10.0d + "'", obj34, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = new java.lang.Object();
        fila0.enfileira(obj5);
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        java.lang.Object obj13 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) (byte) 0);
        boolean boolean6 = fila3.vazia();
        boolean boolean7 = fila3.vazia();
        boolean boolean8 = fila3.vazia();
        java.lang.Object obj9 = fila3.desenfileira();
        boolean boolean10 = fila3.vazia();
        fila3.enfileira((java.lang.Object) (-1.0d));
        fila0.enfileira((java.lang.Object) (-1.0d));
        java.lang.Object obj14 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        boolean boolean9 = fila6.vazia();
        boolean boolean10 = fila6.vazia();
        boolean boolean11 = fila6.vazia();
        fila6.imprime();
        boolean boolean13 = fila6.vazia();
        java.lang.Object obj14 = fila6.desenfileira();
        boolean boolean15 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean17 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        boolean boolean9 = fila6.vazia();
        boolean boolean10 = fila6.vazia();
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila6.enfileira((java.lang.Object) (-1.0d));
        fila0.enfileira((java.lang.Object) (-1.0d));
        boolean boolean17 = fila0.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj23 = fila18.desenfileira();
        boolean boolean24 = fila18.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) 0);
        boolean boolean28 = fila25.vazia();
        boolean boolean29 = fila25.vazia();
        boolean boolean30 = fila25.vazia();
        java.lang.Object obj31 = fila25.desenfileira();
        boolean boolean32 = fila25.vazia();
        fila25.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass35 = fila25.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass35);
        boolean boolean37 = fila18.vazia();
        java.lang.Object obj38 = fila18.desenfileira();
        fila0.enfileira((java.lang.Object) fila18);
        java.lang.Object obj40 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 10.0d + "'", obj23, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 0 + "'", obj31, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class ds.Fila");
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        boolean boolean20 = fila13.vazia();
        fila5.enfileira((java.lang.Object) boolean20);
        boolean boolean22 = fila5.vazia();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila23.imprime();
        fila23.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj28 = new java.lang.Object();
        fila23.enfileira(obj28);
        fila23.imprime();
        boolean boolean31 = fila23.vazia();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Object obj34 = fila23.desenfileira();
        fila5.enfileira((java.lang.Object) fila23);
        boolean boolean36 = fila23.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10.0d + "'", obj34, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        java.lang.Object obj19 = null;
        fila16.enfileira(obj19);
        boolean boolean21 = fila16.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) 0);
        boolean boolean25 = fila22.vazia();
        boolean boolean26 = fila22.vazia();
        boolean boolean27 = fila22.vazia();
        java.lang.Object obj28 = fila22.desenfileira();
        boolean boolean29 = fila22.vazia();
        fila22.enfileira((java.lang.Object) (-1.0d));
        fila16.enfileira((java.lang.Object) (-1.0d));
        boolean boolean33 = fila16.vazia();
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        fila34.imprime();
        fila34.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj39 = fila34.desenfileira();
        boolean boolean40 = fila34.vazia();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) (byte) 0);
        boolean boolean44 = fila41.vazia();
        boolean boolean45 = fila41.vazia();
        boolean boolean46 = fila41.vazia();
        java.lang.Object obj47 = fila41.desenfileira();
        boolean boolean48 = fila41.vazia();
        fila41.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass51 = fila41.getClass();
        fila34.enfileira((java.lang.Object) wildcardClass51);
        boolean boolean53 = fila34.vazia();
        java.lang.Object obj54 = fila34.desenfileira();
        fila16.enfileira((java.lang.Object) fila34);
        java.lang.Class<?> wildcardClass56 = fila34.getClass();
        fila10.enfileira((java.lang.Object) fila34);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 0 + "'", obj28, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 10.0d + "'", obj39, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (byte) 0 + "'", obj47, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj24 = new java.lang.Object();
        fila19.enfileira(obj24);
        fila19.imprime();
        boolean boolean27 = fila19.vazia();
        fila19.enfileira((java.lang.Object) 'a');
        java.lang.Object obj30 = fila19.desenfileira();
        fila19.imprime();
        boolean boolean32 = fila19.vazia();
        fila5.enfileira((java.lang.Object) fila19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 10.0d + "'", obj30, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0L + "'", obj13, 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean19 = fila0.vazia();
        java.lang.Object obj20 = fila0.desenfileira();
        boolean boolean21 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1.0d) + "'", obj20, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        fila19.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        fila19.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        boolean boolean31 = fila24.vazia();
        fila24.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        boolean boolean38 = fila34.vazia();
        boolean boolean39 = fila34.vazia();
        java.lang.Object obj40 = fila34.desenfileira();
        boolean boolean41 = fila34.vazia();
        fila34.enfileira((java.lang.Object) (-1.0d));
        fila34.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = fila45.desenfileira();
        boolean boolean49 = fila45.vazia();
        fila45.imprime();
        fila45.imprime();
        fila34.enfileira((java.lang.Object) fila45);
        boolean boolean53 = fila45.vazia();
        fila24.enfileira((java.lang.Object) fila45);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (byte) 0);
        fila55.imprime();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) (byte) 0);
        boolean boolean62 = fila59.vazia();
        boolean boolean63 = fila59.vazia();
        boolean boolean64 = fila59.vazia();
        java.lang.Object obj65 = fila59.desenfileira();
        boolean boolean66 = fila59.vazia();
        boolean boolean67 = fila59.vazia();
        fila59.imprime();
        fila55.enfileira((java.lang.Object) fila59);
        fila55.imprime();
        fila24.enfileira((java.lang.Object) fila55);
        fila5.enfileira((java.lang.Object) fila55);
        fila5.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) 0 + "'", obj48, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) 0 + "'", obj65, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = fila8.desenfileira();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean19 = fila11.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = fila11.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass16 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        java.lang.Object obj19 = fila0.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = new java.lang.Object();
        fila20.enfileira(obj25);
        fila20.imprime();
        boolean boolean28 = fila20.vazia();
        fila20.enfileira((java.lang.Object) 'a');
        boolean boolean31 = fila20.vazia();
        fila20.imprime();
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        fila33.imprime();
        fila33.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj38 = new java.lang.Object();
        fila33.enfileira(obj38);
        fila20.enfileira(obj38);
        fila0.enfileira((java.lang.Object) fila20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0d) + "'", obj19, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        fila7.enfileira((java.lang.Object) fila12);
        fila12.imprime();
        java.lang.Object obj19 = fila12.desenfileira();
        fila0.enfileira(obj19);
        fila0.imprime();
        java.lang.Object obj22 = fila0.desenfileira();
        java.lang.Object obj23 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 0 + "'", obj22, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        java.lang.Object obj20 = fila15.desenfileira();
        boolean boolean21 = fila15.vazia();
        java.lang.Class<?> wildcardClass22 = fila15.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 0 + "'", obj20, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        java.lang.Object obj10 = fila4.desenfileira();
        boolean boolean11 = fila4.vazia();
        boolean boolean12 = fila4.vazia();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = new java.lang.Object();
        fila20.enfileira(obj25);
        fila20.imprime();
        fila16.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila20);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        fila12.imprime();
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.imprime();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila17.enfileira((java.lang.Object) fila20);
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila23.imprime();
        fila23.imprime();
        java.lang.Class<?> wildcardClass27 = fila23.getClass();
        fila17.enfileira((java.lang.Object) fila23);
        fila12.enfileira((java.lang.Object) fila17);
        java.lang.Object obj30 = fila17.desenfileira();
        fila0.enfileira((java.lang.Object) fila17);
        java.lang.Class<?> wildcardClass32 = fila17.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) (-1.0d));
        fila7.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = fila18.desenfileira();
        boolean boolean22 = fila18.vazia();
        fila18.imprime();
        fila18.imprime();
        fila7.enfileira((java.lang.Object) fila18);
        boolean boolean26 = fila18.vazia();
        fila0.enfileira((java.lang.Object) fila18);
        java.lang.Object obj28 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 0 + "'", obj28, (byte) 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.enfileira((java.lang.Object) "hi!");
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = new java.lang.Object();
        fila20.enfileira(obj25);
        fila20.imprime();
        boolean boolean28 = fila20.vazia();
        fila5.enfileira((java.lang.Object) fila20);
        java.lang.Object obj30 = fila5.desenfileira();
        java.lang.Object obj31 = fila5.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        fila32.imprime();
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        fila32.enfileira((java.lang.Object) fila35);
        fila35.imprime();
        fila5.enfileira((java.lang.Object) fila35);
        java.lang.Class<?> wildcardClass40 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        fila9.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        boolean boolean18 = fila14.vazia();
        fila9.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        boolean boolean21 = fila14.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) 0);
        boolean boolean25 = fila22.vazia();
        boolean boolean26 = fila22.vazia();
        boolean boolean27 = fila22.vazia();
        java.lang.Object obj28 = fila22.desenfileira();
        boolean boolean29 = fila22.vazia();
        fila14.enfileira((java.lang.Object) boolean29);
        boolean boolean31 = fila14.vazia();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        fila34.imprime();
        ds.Fila fila37 = new ds.Fila();
        boolean boolean38 = fila37.vazia();
        fila34.enfileira((java.lang.Object) fila37);
        boolean boolean40 = fila34.vazia();
        fila34.imprime();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.imprime();
        fila34.enfileira((java.lang.Object) fila42);
        fila0.enfileira((java.lang.Object) fila34);
        fila34.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 0 + "'", obj28, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 0 + "'", obj45, (byte) 0);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        fila3.imprime();
        fila3.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        fila9.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        boolean boolean20 = fila13.vazia();
        boolean boolean21 = fila13.vazia();
        fila13.imprime();
        fila9.enfileira((java.lang.Object) fila13);
        java.lang.Object obj24 = fila9.desenfileira();
        fila3.enfileira(obj24);
        fila3.imprime();
        java.lang.Object obj27 = fila3.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 0 + "'", obj24, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 0 + "'", obj27, (byte) 0);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        fila2.enfileira(obj7);
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        boolean boolean20 = fila13.vazia();
        fila5.enfileira((java.lang.Object) boolean20);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) 0);
        fila22.enfileira((java.lang.Object) 0L);
        java.lang.Object obj27 = fila22.desenfileira();
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        fila28.imprime();
        fila28.imprime();
        java.lang.Class<?> wildcardClass32 = fila28.getClass();
        fila22.enfileira((java.lang.Object) fila28);
        fila5.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila5.vazia();
        java.lang.Class<?> wildcardClass36 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 0 + "'", obj27, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        fila5.imprime();
        boolean boolean14 = fila5.vazia();
        boolean boolean15 = fila5.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj9 = new java.lang.Object();
        fila4.enfileira(obj9);
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj20 = new java.lang.Object();
        fila15.enfileira(obj20);
        fila15.imprime();
        fila13.enfileira((java.lang.Object) fila15);
        fila0.enfileira((java.lang.Object) fila13);
        fila0.imprime();
        java.lang.Object obj26 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        fila7.imprime();
        java.lang.Object obj11 = fila7.desenfileira();
        boolean boolean12 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.enfileira((java.lang.Object) '#');
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) (byte) 0);
        boolean boolean6 = fila3.vazia();
        boolean boolean7 = fila3.vazia();
        boolean boolean8 = fila3.vazia();
        java.lang.Object obj9 = fila3.desenfileira();
        boolean boolean10 = fila3.vazia();
        boolean boolean11 = fila3.vazia();
        boolean boolean12 = fila3.vazia();
        boolean boolean13 = fila3.vazia();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass17 = fila7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        boolean boolean19 = fila0.vazia();
        java.lang.Object obj20 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        fila19.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        fila19.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        boolean boolean31 = fila24.vazia();
        fila24.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        boolean boolean38 = fila34.vazia();
        boolean boolean39 = fila34.vazia();
        java.lang.Object obj40 = fila34.desenfileira();
        boolean boolean41 = fila34.vazia();
        fila34.enfileira((java.lang.Object) (-1.0d));
        fila34.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = fila45.desenfileira();
        boolean boolean49 = fila45.vazia();
        fila45.imprime();
        fila45.imprime();
        fila34.enfileira((java.lang.Object) fila45);
        boolean boolean53 = fila45.vazia();
        fila24.enfileira((java.lang.Object) fila45);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (byte) 0);
        fila55.imprime();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) (byte) 0);
        boolean boolean62 = fila59.vazia();
        boolean boolean63 = fila59.vazia();
        boolean boolean64 = fila59.vazia();
        java.lang.Object obj65 = fila59.desenfileira();
        boolean boolean66 = fila59.vazia();
        boolean boolean67 = fila59.vazia();
        fila59.imprime();
        fila55.enfileira((java.lang.Object) fila59);
        fila55.imprime();
        fila24.enfileira((java.lang.Object) fila55);
        fila5.enfileira((java.lang.Object) fila55);
        java.lang.Object obj73 = fila5.desenfileira();
        ds.Fila fila74 = new ds.Fila();
        ds.Fila fila75 = new ds.Fila();
        boolean boolean76 = fila75.vazia();
        fila74.enfileira((java.lang.Object) boolean76);
        fila74.enfileira((java.lang.Object) '#');
        fila74.imprime();
        fila5.enfileira((java.lang.Object) fila74);
        boolean boolean82 = fila74.vazia();
        ds.Fila fila83 = new ds.Fila();
        fila83.enfileira((java.lang.Object) (byte) 0);
        fila83.enfileira((java.lang.Object) 0L);
        java.lang.Object obj88 = fila83.desenfileira();
        boolean boolean89 = fila83.vazia();
        ds.Fila fila90 = new ds.Fila();
        boolean boolean91 = fila90.vazia();
        fila90.imprime();
        fila90.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj95 = fila90.desenfileira();
        java.lang.Class<?> wildcardClass96 = obj95.getClass();
        fila83.enfileira(obj95);
        fila74.enfileira((java.lang.Object) fila83);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) 0 + "'", obj48, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) 0 + "'", obj65, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + obj88 + "' != '" + (byte) 0 + "'", obj88, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertEquals("'" + obj95 + "' != '" + 10.0d + "'", obj95, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj16 = fila11.desenfileira();
        boolean boolean17 = fila11.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) 0);
        boolean boolean21 = fila18.vazia();
        boolean boolean22 = fila18.vazia();
        boolean boolean23 = fila18.vazia();
        java.lang.Object obj24 = fila18.desenfileira();
        boolean boolean25 = fila18.vazia();
        fila18.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass28 = fila18.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass28);
        fila0.enfileira((java.lang.Object) wildcardClass28);
        java.lang.Object obj31 = fila0.desenfileira();
        boolean boolean32 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0L + "'", obj10, 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0d + "'", obj16, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 0 + "'", obj24, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class ds.Fila");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        boolean boolean9 = fila6.vazia();
        boolean boolean10 = fila6.vazia();
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila6.enfileira((java.lang.Object) (-1.0d));
        fila0.enfileira((java.lang.Object) (-1.0d));
        boolean boolean17 = fila0.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj23 = fila18.desenfileira();
        boolean boolean24 = fila18.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) 0);
        boolean boolean28 = fila25.vazia();
        boolean boolean29 = fila25.vazia();
        boolean boolean30 = fila25.vazia();
        java.lang.Object obj31 = fila25.desenfileira();
        boolean boolean32 = fila25.vazia();
        fila25.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass35 = fila25.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass35);
        boolean boolean37 = fila18.vazia();
        java.lang.Object obj38 = fila18.desenfileira();
        fila0.enfileira((java.lang.Object) fila18);
        java.lang.Object obj40 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass41 = obj40.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 10.0d + "'", obj23, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 0 + "'", obj31, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class ds.Fila");
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass17 = fila7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj24 = new java.lang.Object();
        fila19.enfileira(obj24);
        fila19.imprime();
        boolean boolean27 = fila19.vazia();
        fila19.enfileira((java.lang.Object) 'a');
        boolean boolean30 = fila19.vazia();
        fila0.enfileira((java.lang.Object) fila19);
        java.lang.Object obj32 = null;
        fila0.enfileira(obj32);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        boolean boolean38 = fila34.vazia();
        boolean boolean39 = fila34.vazia();
        java.lang.Object obj40 = fila34.desenfileira();
        boolean boolean41 = fila34.vazia();
        fila34.enfileira((java.lang.Object) 0L);
        fila34.imprime();
        boolean boolean45 = fila34.vazia();
        boolean boolean46 = fila34.vazia();
        java.lang.Class<?> wildcardClass47 = fila34.getClass();
        fila0.enfileira((java.lang.Object) fila34);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        fila19.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        fila19.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        boolean boolean31 = fila24.vazia();
        fila24.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        boolean boolean38 = fila34.vazia();
        boolean boolean39 = fila34.vazia();
        java.lang.Object obj40 = fila34.desenfileira();
        boolean boolean41 = fila34.vazia();
        fila34.enfileira((java.lang.Object) (-1.0d));
        fila34.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = fila45.desenfileira();
        boolean boolean49 = fila45.vazia();
        fila45.imprime();
        fila45.imprime();
        fila34.enfileira((java.lang.Object) fila45);
        boolean boolean53 = fila45.vazia();
        fila24.enfileira((java.lang.Object) fila45);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (byte) 0);
        fila55.imprime();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) (byte) 0);
        boolean boolean62 = fila59.vazia();
        boolean boolean63 = fila59.vazia();
        boolean boolean64 = fila59.vazia();
        java.lang.Object obj65 = fila59.desenfileira();
        boolean boolean66 = fila59.vazia();
        boolean boolean67 = fila59.vazia();
        fila59.imprime();
        fila55.enfileira((java.lang.Object) fila59);
        fila55.imprime();
        fila24.enfileira((java.lang.Object) fila55);
        fila5.enfileira((java.lang.Object) fila55);
        java.lang.Object obj73 = fila5.desenfileira();
        java.lang.Object obj74 = fila5.desenfileira();
        boolean boolean75 = fila5.vazia();
        ds.Fila fila76 = new ds.Fila();
        fila76.enfileira((java.lang.Object) (byte) 0);
        boolean boolean79 = fila76.vazia();
        fila76.imprime();
        ds.Fila fila81 = new ds.Fila();
        fila81.enfileira((java.lang.Object) (byte) 0);
        boolean boolean84 = fila81.vazia();
        boolean boolean85 = fila81.vazia();
        fila76.enfileira((java.lang.Object) fila81);
        java.lang.Object obj87 = fila76.desenfileira();
        java.lang.Object obj88 = fila76.desenfileira();
        java.lang.Class<?> wildcardClass89 = fila76.getClass();
        fila5.enfileira((java.lang.Object) fila76);
        java.lang.Class<?> wildcardClass91 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) 0 + "'", obj48, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) 0 + "'", obj65, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + (byte) 0 + "'", obj87, (byte) 0);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean11 = fila5.vazia();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        fila13.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) 0);
        boolean boolean21 = fila18.vazia();
        boolean boolean22 = fila18.vazia();
        fila13.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        boolean boolean25 = fila18.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 0);
        boolean boolean29 = fila26.vazia();
        boolean boolean30 = fila26.vazia();
        boolean boolean31 = fila26.vazia();
        java.lang.Object obj32 = fila26.desenfileira();
        boolean boolean33 = fila26.vazia();
        fila18.enfileira((java.lang.Object) boolean33);
        boolean boolean35 = fila18.vazia();
        fila18.imprime();
        fila5.enfileira((java.lang.Object) fila18);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (byte) 0);
        boolean boolean41 = fila38.vazia();
        boolean boolean42 = fila38.vazia();
        fila38.imprime();
        fila18.enfileira((java.lang.Object) fila38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 0 + "'", obj32, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj19 = fila0.desenfileira();
        java.lang.Object obj20 = null;
        fila0.enfileira(obj20);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        java.lang.Object obj5 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        fila14.imprime();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        boolean boolean21 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass23 = fila14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean18 = fila0.vazia();
        java.lang.Object obj19 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) 0);
        boolean boolean19 = fila16.vazia();
        fila16.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) 0);
        boolean boolean24 = fila21.vazia();
        boolean boolean25 = fila21.vazia();
        fila16.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj29 = fila21.desenfileira();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        fila0.enfileira(obj29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 0 + "'", obj29, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Object obj13 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        fila7.enfileira((java.lang.Object) fila12);
        fila12.imprime();
        java.lang.Object obj19 = fila12.desenfileira();
        fila0.enfileira(obj19);
        fila0.imprime();
        boolean boolean22 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean19 = fila0.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) 0);
        fila20.imprime();
        fila0.enfileira((java.lang.Object) fila20);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.enfileira((java.lang.Object) 0L);
        fila0.enfileira((java.lang.Object) 0L);
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        boolean boolean14 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) 0);
        boolean boolean19 = fila16.vazia();
        boolean boolean20 = fila16.vazia();
        java.lang.Object obj21 = fila16.desenfileira();
        fila0.enfileira((java.lang.Object) fila16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass16 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj18 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj20 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean11 = fila4.vazia();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila12.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila12.enfileira((java.lang.Object) fila15);
        java.lang.Class<?> wildcardClass18 = fila12.getClass();
        fila4.enfileira((java.lang.Object) wildcardClass18);
        fila4.enfileira((java.lang.Object) (-1));
        java.lang.Object obj22 = fila4.desenfileira();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 0 + "'", obj22, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        fila7.enfileira((java.lang.Object) fila12);
        java.lang.Object obj18 = fila7.desenfileira();
        java.lang.Object obj19 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean23 = fila7.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean6 = fila3.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj14 = new java.lang.Object();
        fila9.enfileira(obj14);
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        fila9.enfileira((java.lang.Object) 100L);
        fila3.enfileira((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.enfileira((java.lang.Object) '#');
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) (-1.0d));
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.imprime();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila17.enfileira((java.lang.Object) fila20);
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila23.imprime();
        fila23.imprime();
        java.lang.Class<?> wildcardClass27 = fila23.getClass();
        fila17.enfileira((java.lang.Object) fila23);
        fila7.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        boolean boolean4 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.imprime();
        java.lang.Class<?> wildcardClass10 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean12 = fila0.vazia();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        java.lang.Object obj15 = fila9.desenfileira();
        boolean boolean16 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0L);
        fila9.imprime();
        boolean boolean20 = fila9.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) 0);
        boolean boolean24 = fila21.vazia();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        java.lang.Class<?> wildcardClass28 = fila21.getClass();
        fila9.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila31 = new ds.Fila();
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        fila31.enfileira((java.lang.Object) boolean33);
        fila31.enfileira((java.lang.Object) '#');
        fila31.imprime();
        fila9.enfileira((java.lang.Object) fila31);
        boolean boolean39 = fila31.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        boolean boolean9 = fila6.vazia();
        boolean boolean10 = fila6.vazia();
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila6.enfileira((java.lang.Object) 0L);
        fila6.imprime();
        boolean boolean17 = fila6.vazia();
        fila6.enfileira((java.lang.Object) (-1L));
        fila0.enfileira((java.lang.Object) (-1L));
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.imprime();
        java.lang.Object obj10 = fila6.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        java.lang.Object obj17 = fila11.desenfileira();
        boolean boolean18 = fila11.vazia();
        fila11.enfileira((java.lang.Object) 0L);
        fila11.imprime();
        boolean boolean22 = fila11.vazia();
        fila6.enfileira((java.lang.Object) boolean22);
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila25.imprime();
        fila25.imprime();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (byte) 0);
        boolean boolean32 = fila29.vazia();
        fila29.imprime();
        fila29.imprime();
        fila25.enfileira((java.lang.Object) fila29);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) 0);
        boolean boolean39 = fila36.vazia();
        fila36.imprime();
        fila36.imprime();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) (byte) 0);
        fila42.enfileira((java.lang.Object) 0L);
        fila36.enfileira((java.lang.Object) 0L);
        fila29.enfileira((java.lang.Object) fila36);
        java.lang.Class<?> wildcardClass49 = fila36.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass49);
        java.lang.Object obj51 = fila0.desenfileira();
        java.lang.Object obj52 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) 0 + "'", obj51, (byte) 0);
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        boolean boolean15 = fila12.vazia();
        boolean boolean16 = fila12.vazia();
        boolean boolean17 = fila12.vazia();
        boolean boolean18 = fila12.vazia();
        java.lang.Class<?> wildcardClass19 = fila12.getClass();
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Class<?> wildcardClass21 = fila12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        boolean boolean23 = fila19.vazia();
        boolean boolean24 = fila19.vazia();
        java.lang.Object obj25 = fila19.desenfileira();
        boolean boolean26 = fila19.vazia();
        java.lang.Class<?> wildcardClass27 = fila19.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = fila0.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila30.imprime();
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        fila30.enfileira((java.lang.Object) fila33);
        boolean boolean36 = fila30.vazia();
        java.lang.Object obj37 = fila30.desenfileira();
        boolean boolean38 = fila30.vazia();
        boolean boolean39 = fila30.vazia();
        fila0.enfileira((java.lang.Object) fila30);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 0 + "'", obj25, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj16 = new java.lang.Object();
        fila11.enfileira(obj16);
        fila11.imprime();
        boolean boolean19 = fila11.vazia();
        fila11.enfileira((java.lang.Object) 'a');
        boolean boolean22 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj29 = new java.lang.Object();
        fila24.enfileira(obj29);
        fila24.imprime();
        boolean boolean32 = fila24.vazia();
        boolean boolean33 = fila24.vazia();
        java.lang.Object obj34 = fila24.desenfileira();
        fila24.imprime();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) 0);
        boolean boolean39 = fila36.vazia();
        boolean boolean40 = fila36.vazia();
        boolean boolean41 = fila36.vazia();
        fila36.imprime();
        boolean boolean43 = fila36.vazia();
        java.lang.Object obj44 = fila36.desenfileira();
        fila36.imprime();
        fila24.enfileira((java.lang.Object) fila36);
        boolean boolean47 = fila24.vazia();
        java.lang.Class<?> wildcardClass48 = fila24.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10.0d + "'", obj34, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) 0 + "'", obj44, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 0);
        boolean boolean13 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        fila6.enfileira((java.lang.Object) fila10);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) 0);
        boolean boolean20 = fila17.vazia();
        fila17.imprime();
        fila17.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (byte) 0);
        fila23.enfileira((java.lang.Object) 0L);
        fila17.enfileira((java.lang.Object) 0L);
        fila10.enfileira((java.lang.Object) fila17);
        java.lang.Class<?> wildcardClass30 = fila17.getClass();
        fila0.enfileira((java.lang.Object) fila17);
        java.lang.Class<?> wildcardClass32 = fila17.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj18 = fila5.desenfileira();
        fila5.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.imprime();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.enfileira((java.lang.Object) '#');
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        boolean boolean8 = fila4.vazia();
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        java.lang.Object obj13 = fila4.desenfileira();
        boolean boolean14 = fila4.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        fila14.imprime();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        boolean boolean21 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Object obj23 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.enfileira((java.lang.Object) "hi!");
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = new java.lang.Object();
        fila20.enfileira(obj25);
        fila20.imprime();
        boolean boolean28 = fila20.vazia();
        fila5.enfileira((java.lang.Object) fila20);
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        fila30.imprime();
        fila30.imprime();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        fila34.imprime();
        fila34.imprime();
        fila30.enfileira((java.lang.Object) fila34);
        fila34.imprime();
        fila20.enfileira((java.lang.Object) fila34);
        java.lang.Class<?> wildcardClass43 = fila34.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        fila14.imprime();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        boolean boolean21 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        boolean boolean23 = fila0.vazia();
        boolean boolean24 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        fila2.imprime();
        fila2.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        fila2.enfileira(obj7);
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 0);
        fila12.imprime();
        java.lang.Object obj16 = fila12.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila17.enfileira((java.lang.Object) boolean19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) 0);
        boolean boolean24 = fila21.vazia();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        fila17.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        fila12.enfileira((java.lang.Object) fila21);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (byte) 0);
        fila31.imprime();
        fila21.enfileira((java.lang.Object) fila31);
        fila0.enfileira((java.lang.Object) fila21);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 0 + "'", obj16, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        fila6.imprime();
        java.lang.Class<?> wildcardClass10 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.imprime();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila6.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass12 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Class<?> wildcardClass14 = fila6.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila12.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila12.enfileira((java.lang.Object) fila15);
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) 0);
        boolean boolean7 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        boolean boolean12 = fila4.vazia();
        java.lang.Class<?> wildcardClass13 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        boolean boolean20 = fila13.vazia();
        fila5.enfileira((java.lang.Object) boolean20);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) 0);
        fila22.enfileira((java.lang.Object) 0L);
        java.lang.Object obj27 = fila22.desenfileira();
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        fila28.imprime();
        fila28.imprime();
        java.lang.Class<?> wildcardClass32 = fila28.getClass();
        fila22.enfileira((java.lang.Object) fila28);
        fila5.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila5.vazia();
        boolean boolean36 = fila5.vazia();
        boolean boolean37 = fila5.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 0 + "'", obj27, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        boolean boolean20 = fila13.vazia();
        fila5.enfileira((java.lang.Object) boolean20);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) 0);
        fila22.enfileira((java.lang.Object) 0L);
        java.lang.Object obj27 = fila22.desenfileira();
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        fila28.imprime();
        fila28.imprime();
        java.lang.Class<?> wildcardClass32 = fila28.getClass();
        fila22.enfileira((java.lang.Object) fila28);
        fila5.enfileira((java.lang.Object) fila28);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) (byte) 0);
        boolean boolean38 = fila35.vazia();
        fila35.imprime();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) 0);
        boolean boolean43 = fila40.vazia();
        boolean boolean44 = fila40.vazia();
        fila35.enfileira((java.lang.Object) fila40);
        fila40.imprime();
        boolean boolean47 = fila40.vazia();
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) (byte) 0);
        boolean boolean51 = fila48.vazia();
        boolean boolean52 = fila48.vazia();
        boolean boolean53 = fila48.vazia();
        java.lang.Object obj54 = fila48.desenfileira();
        boolean boolean55 = fila48.vazia();
        fila40.enfileira((java.lang.Object) boolean55);
        boolean boolean57 = fila40.vazia();
        fila5.enfileira((java.lang.Object) boolean57);
        fila5.enfileira((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 0 + "'", obj27, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) 0 + "'", obj54, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        java.lang.Class<?> wildcardClass13 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean2);
        fila0.enfileira((java.lang.Object) '#');
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        fila9.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        boolean boolean18 = fila14.vazia();
        fila9.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        boolean boolean21 = fila14.vazia();
        fila14.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        boolean boolean29 = fila24.vazia();
        java.lang.Object obj30 = fila24.desenfileira();
        boolean boolean31 = fila24.vazia();
        fila24.enfileira((java.lang.Object) (-1.0d));
        fila24.imprime();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj38 = fila35.desenfileira();
        boolean boolean39 = fila35.vazia();
        fila35.imprime();
        fila35.imprime();
        fila24.enfileira((java.lang.Object) fila35);
        boolean boolean43 = fila35.vazia();
        fila14.enfileira((java.lang.Object) fila35);
        fila35.imprime();
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj49 = fila46.desenfileira();
        boolean boolean50 = fila46.vazia();
        fila46.imprime();
        fila35.enfileira((java.lang.Object) fila46);
        fila0.enfileira((java.lang.Object) fila46);
        fila0.imprime();
        boolean boolean55 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 0 + "'", obj30, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 0 + "'", obj38, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) 0 + "'", obj49, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj13 = fila8.desenfileira();
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 0);
        boolean boolean18 = fila15.vazia();
        boolean boolean19 = fila15.vazia();
        boolean boolean20 = fila15.vazia();
        java.lang.Object obj21 = fila15.desenfileira();
        boolean boolean22 = fila15.vazia();
        fila15.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass25 = fila15.getClass();
        fila8.enfileira((java.lang.Object) wildcardClass25);
        fila0.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (byte) 0);
        boolean boolean32 = fila29.vazia();
        fila29.imprime();
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        fila34.imprime();
        ds.Fila fila37 = new ds.Fila();
        boolean boolean38 = fila37.vazia();
        fila34.enfileira((java.lang.Object) fila37);
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        fila40.imprime();
        fila40.imprime();
        java.lang.Class<?> wildcardClass44 = fila40.getClass();
        fila34.enfileira((java.lang.Object) fila40);
        fila29.enfileira((java.lang.Object) fila34);
        fila8.enfileira((java.lang.Object) fila34);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0d + "'", obj13, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 0);
        boolean boolean10 = fila7.vazia();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass17 = fila7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        boolean boolean19 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj21 = fila0.desenfileira();
        boolean boolean22 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "class ds.Fila");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        boolean boolean17 = fila13.vazia();
        boolean boolean18 = fila13.vazia();
        java.lang.Object obj19 = fila13.desenfileira();
        boolean boolean20 = fila13.vazia();
        fila5.enfileira((java.lang.Object) boolean20);
        boolean boolean22 = fila5.vazia();
        java.lang.Object obj23 = fila5.desenfileira();
        fila5.imprime();
        java.lang.Object obj25 = fila5.desenfileira();
        fila5.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + true + "'", obj25, true);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 0);
        boolean boolean17 = fila14.vazia();
        fila14.imprime();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        boolean boolean21 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        boolean boolean23 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) 0);
        boolean boolean8 = fila5.vazia();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean11 = fila5.vazia();
        boolean boolean12 = fila5.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 0);
        boolean boolean16 = fila13.vazia();
        fila13.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) 0);
        boolean boolean21 = fila18.vazia();
        boolean boolean22 = fila18.vazia();
        fila13.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        boolean boolean25 = fila18.vazia();
        fila18.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj28 = fila18.desenfileira();
        fila5.enfileira((java.lang.Object) fila18);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (byte) 0);
        boolean boolean33 = fila30.vazia();
        fila30.imprime();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) (byte) 0);
        boolean boolean38 = fila35.vazia();
        boolean boolean39 = fila35.vazia();
        fila30.enfileira((java.lang.Object) fila35);
        boolean boolean41 = fila30.vazia();
        java.lang.Object obj42 = fila30.desenfileira();
        java.lang.Object obj43 = fila30.desenfileira();
        fila18.enfileira(obj43);
        fila18.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 0 + "'", obj28, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 0 + "'", obj42, (byte) 0);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 0);
        boolean boolean22 = fila19.vazia();
        fila19.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) 0);
        boolean boolean27 = fila24.vazia();
        boolean boolean28 = fila24.vazia();
        fila19.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        boolean boolean31 = fila24.vazia();
        fila24.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) 0);
        boolean boolean37 = fila34.vazia();
        boolean boolean38 = fila34.vazia();
        boolean boolean39 = fila34.vazia();
        java.lang.Object obj40 = fila34.desenfileira();
        boolean boolean41 = fila34.vazia();
        fila34.enfileira((java.lang.Object) (-1.0d));
        fila34.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = fila45.desenfileira();
        boolean boolean49 = fila45.vazia();
        fila45.imprime();
        fila45.imprime();
        fila34.enfileira((java.lang.Object) fila45);
        boolean boolean53 = fila45.vazia();
        fila24.enfileira((java.lang.Object) fila45);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (byte) 0);
        fila55.imprime();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) (byte) 0);
        boolean boolean62 = fila59.vazia();
        boolean boolean63 = fila59.vazia();
        boolean boolean64 = fila59.vazia();
        java.lang.Object obj65 = fila59.desenfileira();
        boolean boolean66 = fila59.vazia();
        boolean boolean67 = fila59.vazia();
        fila59.imprime();
        fila55.enfileira((java.lang.Object) fila59);
        fila55.imprime();
        fila24.enfileira((java.lang.Object) fila55);
        fila5.enfileira((java.lang.Object) fila55);
        java.lang.Object obj73 = fila5.desenfileira();
        java.lang.Class<?> wildcardClass74 = fila5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) 0 + "'", obj48, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) 0 + "'", obj65, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.imprime();
        java.lang.Object obj10 = fila6.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) 0);
        boolean boolean14 = fila11.vazia();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        java.lang.Object obj17 = fila11.desenfileira();
        boolean boolean18 = fila11.vazia();
        fila11.enfileira((java.lang.Object) 0L);
        fila11.imprime();
        boolean boolean22 = fila11.vazia();
        fila6.enfileira((java.lang.Object) boolean22);
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) 0);
        boolean boolean28 = fila25.vazia();
        boolean boolean29 = fila25.vazia();
        boolean boolean30 = fila25.vazia();
        fila25.imprime();
        boolean boolean32 = fila25.vazia();
        java.lang.Object obj33 = fila25.desenfileira();
        boolean boolean34 = fila25.vazia();
        fila25.imprime();
        java.lang.Object obj36 = null;
        fila25.enfileira(obj36);
        fila6.enfileira(obj36);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 0 + "'", obj33, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila5.enfileira((java.lang.Object) fila8);
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Class<?> wildcardClass15 = fila11.getClass();
        fila5.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila18 = new ds.Fila();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila18.enfileira((java.lang.Object) boolean20);
        fila0.enfileira((java.lang.Object) boolean20);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila5.enfileira((java.lang.Object) boolean7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 0);
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean19 = fila0.vazia();
        boolean boolean20 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }
}

