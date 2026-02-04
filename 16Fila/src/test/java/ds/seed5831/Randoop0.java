package ds.seed5831;

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
        fila0.enfileira((java.lang.Object) false);
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Class<?> wildcardClass14 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila7.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj5 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass17 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
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
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 10 + "'", obj9, (short) 10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass19 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila7.imprime();
        java.lang.Object obj27 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) (byte) 100);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        java.lang.Class<?> wildcardClass26 = fila17.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        java.lang.Object obj21 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass22 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + true + "'", obj21, true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila7.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        boolean boolean23 = fila17.vazia();
        java.lang.Object obj24 = null;
        fila17.enfileira(obj24);
        java.lang.Object obj26 = fila17.desenfileira();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Class<?> wildcardClass29 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 10 + "'", obj26, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila17.vazia();
        java.lang.Class<?> wildcardClass27 = fila17.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        java.lang.Class<?> wildcardClass16 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 'a');
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        java.lang.Object obj21 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + true + "'", obj21, true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class java.lang.Object");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 10 + "'", obj13, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        boolean boolean7 = fila5.vazia();
        fila5.enfileira((java.lang.Object) false);
        boolean boolean10 = fila5.vazia();
        fila0.enfileira((java.lang.Object) boolean10);
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        fila32.enfileira(obj39);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj48 = fila42.desenfileira();
        fila42.imprime();
        fila32.enfileira((java.lang.Object) fila42);
        fila32.imprime();
        java.lang.Object obj52 = fila32.desenfileira();
        fila20.enfileira((java.lang.Object) fila32);
        fila20.imprime();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        java.lang.Object obj17 = fila7.desenfileira();
        boolean boolean18 = fila7.vazia();
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        boolean boolean23 = fila17.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) false);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.imprime();
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        java.lang.Object obj31 = fila17.desenfileira();
        fila0.enfileira(obj31);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 10 + "'", obj31, (short) 10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        boolean boolean20 = fila7.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj27 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 0L);
        fila7.enfileira((java.lang.Object) 0L);
        java.lang.Object obj31 = fila7.desenfileira();
        boolean boolean32 = fila7.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 10 + "'", obj27, (short) 10);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) "hi!");
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) false);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 10);
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        fila10.enfileira((java.lang.Object) fila17);
        fila10.imprime();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        fila10.imprime();
        java.lang.Class<?> wildcardClass28 = fila10.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        boolean boolean7 = fila5.vazia();
        fila5.enfileira((java.lang.Object) false);
        boolean boolean10 = fila5.vazia();
        fila0.enfileira((java.lang.Object) boolean10);
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila17.vazia();
        fila17.imprime();
        java.lang.Object obj28 = null;
        fila17.enfileira(obj28);
        java.lang.Class<?> wildcardClass30 = fila17.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        java.lang.Object obj4 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class java.lang.Object");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass22 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 10 + "'", obj9, (short) 10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) false);
        java.lang.Object obj11 = fila8.desenfileira();
        fila8.enfileira((java.lang.Object) (short) 10);
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) false);
        java.lang.Object obj18 = fila15.desenfileira();
        fila15.imprime();
        fila15.imprime();
        fila8.enfileira((java.lang.Object) fila15);
        fila8.imprime();
        boolean boolean23 = fila8.vazia();
        fila0.enfileira((java.lang.Object) boolean23);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        fila32.enfileira(obj39);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj48 = fila42.desenfileira();
        fila42.imprime();
        fila32.enfileira((java.lang.Object) fila42);
        fila32.imprime();
        java.lang.Object obj52 = fila32.desenfileira();
        fila20.enfileira((java.lang.Object) fila32);
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) false);
        java.lang.Object obj57 = fila54.desenfileira();
        fila54.enfileira((java.lang.Object) (short) 10);
        fila54.imprime();
        ds.Fila fila61 = new ds.Fila();
        fila61.imprime();
        fila54.enfileira((java.lang.Object) fila61);
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) false);
        java.lang.Object obj67 = fila64.desenfileira();
        fila64.enfileira((java.lang.Object) (short) 10);
        boolean boolean70 = fila64.vazia();
        ds.Fila fila71 = new ds.Fila();
        fila71.enfileira((java.lang.Object) false);
        java.lang.Object obj74 = fila71.desenfileira();
        fila71.imprime();
        fila71.imprime();
        fila64.enfileira((java.lang.Object) fila71);
        fila64.imprime();
        fila64.imprime();
        fila54.enfileira((java.lang.Object) fila64);
        fila64.imprime();
        fila20.enfileira((java.lang.Object) fila64);
        boolean boolean83 = fila20.vazia();
        boolean boolean84 = fila20.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + false + "'", obj57, false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + false + "'", obj67, false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + false + "'", obj74, false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean35);
        fila7.enfileira((java.lang.Object) fila17);
        fila7.imprime();
        java.lang.Class<?> wildcardClass39 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila17.vazia();
        fila17.imprime();
        java.lang.Class<?> wildcardClass28 = fila17.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) false);
        java.lang.Object obj26 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) (short) 10);
        boolean boolean29 = fila23.vazia();
        boolean boolean30 = fila23.vazia();
        boolean boolean31 = fila23.vazia();
        fila0.enfileira((java.lang.Object) boolean31);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class java.lang.Object");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) false);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) (short) 10);
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) false);
        java.lang.Object obj15 = fila12.desenfileira();
        fila12.imprime();
        fila12.imprime();
        fila5.enfileira((java.lang.Object) fila12);
        fila5.imprime();
        boolean boolean20 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean23 = fila5.vazia();
        java.lang.Object obj24 = null;
        fila5.enfileira(obj24);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean35);
        fila7.enfileira((java.lang.Object) fila17);
        java.lang.Object obj38 = fila17.desenfileira();
        java.lang.Class<?> wildcardClass39 = fila17.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean17 = fila7.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 10 + "'", obj13, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Class<?> wildcardClass2 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila17.vazia();
        boolean boolean27 = fila17.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj34 = fila28.desenfileira();
        boolean boolean35 = fila28.vazia();
        boolean boolean36 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean36);
        java.lang.Class<?> wildcardClass38 = fila17.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 10 + "'", obj34, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        fila32.enfileira(obj39);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj48 = fila42.desenfileira();
        fila42.imprime();
        fila32.enfileira((java.lang.Object) fila42);
        fila32.imprime();
        java.lang.Object obj52 = fila32.desenfileira();
        fila20.enfileira((java.lang.Object) fila32);
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) false);
        java.lang.Object obj57 = fila54.desenfileira();
        fila54.enfileira((java.lang.Object) (short) 10);
        fila54.imprime();
        ds.Fila fila61 = new ds.Fila();
        fila61.imprime();
        fila54.enfileira((java.lang.Object) fila61);
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) false);
        java.lang.Object obj67 = fila64.desenfileira();
        fila64.enfileira((java.lang.Object) (short) 10);
        boolean boolean70 = fila64.vazia();
        ds.Fila fila71 = new ds.Fila();
        fila71.enfileira((java.lang.Object) false);
        java.lang.Object obj74 = fila71.desenfileira();
        fila71.imprime();
        fila71.imprime();
        fila64.enfileira((java.lang.Object) fila71);
        fila64.imprime();
        fila64.imprime();
        fila54.enfileira((java.lang.Object) fila64);
        fila64.imprime();
        fila20.enfileira((java.lang.Object) fila64);
        java.lang.Object obj83 = fila64.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + false + "'", obj57, false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + false + "'", obj67, false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + false + "'", obj74, false);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + (short) 10 + "'", obj83, (short) 10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) false);
        java.lang.Object obj25 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 10);
        boolean boolean28 = fila22.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) false);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.imprime();
        fila29.imprime();
        fila22.enfileira((java.lang.Object) fila29);
        fila0.enfileira((java.lang.Object) fila22);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) false);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj11 = fila5.desenfileira();
        fila0.enfileira(obj11);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 10 + "'", obj11, (short) 10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) false);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.enfileira((java.lang.Object) (short) 10);
        boolean boolean22 = fila16.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) false);
        java.lang.Object obj26 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        fila16.enfileira((java.lang.Object) fila23);
        fila16.imprime();
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        boolean boolean33 = fila31.vazia();
        fila31.enfileira((java.lang.Object) false);
        fila16.enfileira((java.lang.Object) false);
        ds.Fila fila37 = new ds.Fila();
        boolean boolean38 = fila37.vazia();
        boolean boolean39 = fila37.vazia();
        fila37.enfileira((java.lang.Object) false);
        fila16.enfileira((java.lang.Object) false);
        fila16.imprime();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) 0);
        fila16.enfileira((java.lang.Object) 10.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj23 = null;
        fila0.enfileira(obj23);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        java.lang.Class<?> wildcardClass20 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        boolean boolean7 = fila5.vazia();
        fila0.enfileira((java.lang.Object) boolean7);
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        fila32.enfileira(obj39);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj48 = fila42.desenfileira();
        fila42.imprime();
        fila32.enfileira((java.lang.Object) fila42);
        fila32.imprime();
        java.lang.Object obj52 = fila32.desenfileira();
        fila20.enfileira((java.lang.Object) fila32);
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) false);
        java.lang.Object obj57 = fila54.desenfileira();
        fila54.enfileira((java.lang.Object) (short) 10);
        fila54.imprime();
        ds.Fila fila61 = new ds.Fila();
        fila61.imprime();
        fila54.enfileira((java.lang.Object) fila61);
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) false);
        java.lang.Object obj67 = fila64.desenfileira();
        fila64.enfileira((java.lang.Object) (short) 10);
        boolean boolean70 = fila64.vazia();
        ds.Fila fila71 = new ds.Fila();
        fila71.enfileira((java.lang.Object) false);
        java.lang.Object obj74 = fila71.desenfileira();
        fila71.imprime();
        fila71.imprime();
        fila64.enfileira((java.lang.Object) fila71);
        fila64.imprime();
        fila64.imprime();
        fila54.enfileira((java.lang.Object) fila64);
        fila64.imprime();
        fila20.enfileira((java.lang.Object) fila64);
        fila64.imprime();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + false + "'", obj57, false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + false + "'", obj67, false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + false + "'", obj74, false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 10.0d);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila17.vazia();
        boolean boolean27 = fila17.vazia();
        java.lang.Class<?> wildcardClass28 = fila17.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) "hi!");
        boolean boolean8 = fila0.vazia();
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        boolean boolean23 = fila21.vazia();
        fila21.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj27 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 10 + "'", obj27, (short) 10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        boolean boolean21 = fila0.vazia();
        java.lang.Object obj22 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj10 = fila4.desenfileira();
        boolean boolean11 = fila4.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) false);
        java.lang.Object obj15 = fila12.desenfileira();
        fila12.imprime();
        java.lang.Class<?> wildcardClass17 = fila12.getClass();
        fila4.enfileira((java.lang.Object) fila12);
        java.lang.Object obj19 = fila4.desenfileira();
        fila0.enfileira(obj19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 10 + "'", obj10, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        fila32.enfileira(obj39);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj48 = fila42.desenfileira();
        fila42.imprime();
        fila32.enfileira((java.lang.Object) fila42);
        fila32.imprime();
        java.lang.Object obj52 = fila32.desenfileira();
        fila20.enfileira((java.lang.Object) fila32);
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) false);
        java.lang.Object obj57 = fila54.desenfileira();
        fila54.enfileira((java.lang.Object) (short) 10);
        boolean boolean60 = fila54.vazia();
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) false);
        java.lang.Object obj64 = fila61.desenfileira();
        fila61.imprime();
        fila61.imprime();
        fila54.enfileira((java.lang.Object) fila61);
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Class<?> wildcardClass69 = obj68.getClass();
        fila61.enfileira(obj68);
        java.lang.Object obj71 = fila61.desenfileira();
        boolean boolean72 = fila61.vazia();
        fila32.enfileira((java.lang.Object) fila61);
        java.lang.Class<?> wildcardClass74 = fila61.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + false + "'", obj57, false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + false + "'", obj64, false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        boolean boolean17 = fila7.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila17.vazia();
        boolean boolean27 = fila17.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj34 = fila28.desenfileira();
        boolean boolean35 = fila28.vazia();
        boolean boolean36 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean36);
        boolean boolean38 = fila17.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 10 + "'", obj34, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean35);
        fila7.enfileira((java.lang.Object) fila17);
        java.lang.Object obj38 = fila17.desenfileira();
        fila17.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class java.lang.Object");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Class<?> wildcardClass20 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        java.lang.Object obj20 = fila7.desenfileira();
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 'a' + "'", obj20, 'a');
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        boolean boolean21 = fila0.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) false);
        java.lang.Object obj25 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 10);
        boolean boolean28 = fila22.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) false);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.imprime();
        fila29.imprime();
        fila22.enfileira((java.lang.Object) fila29);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        fila29.enfileira(obj36);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) false);
        java.lang.Object obj42 = fila39.desenfileira();
        fila39.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj45 = fila39.desenfileira();
        fila39.imprime();
        fila29.enfileira((java.lang.Object) fila39);
        boolean boolean48 = fila39.vazia();
        boolean boolean49 = fila39.vazia();
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) false);
        java.lang.Object obj53 = fila50.desenfileira();
        fila50.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj56 = fila50.desenfileira();
        boolean boolean57 = fila50.vazia();
        boolean boolean58 = fila50.vazia();
        fila39.enfileira((java.lang.Object) boolean58);
        fila0.enfileira((java.lang.Object) fila39);
        java.lang.Object obj61 = fila39.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + false + "'", obj42, false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) 10 + "'", obj45, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + false + "'", obj53, false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (short) 10 + "'", obj56, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + true + "'", obj61, true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        boolean boolean9 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        fila32.enfileira(obj39);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj48 = fila42.desenfileira();
        fila42.imprime();
        fila32.enfileira((java.lang.Object) fila42);
        fila32.imprime();
        java.lang.Object obj52 = fila32.desenfileira();
        fila20.enfileira((java.lang.Object) fila32);
        fila32.imprime();
        fila32.imprime();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        fila32.enfileira(obj39);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj48 = fila42.desenfileira();
        fila42.imprime();
        fila32.enfileira((java.lang.Object) fila42);
        fila32.imprime();
        java.lang.Object obj52 = fila32.desenfileira();
        fila20.enfileira((java.lang.Object) fila32);
        fila32.imprime();
        java.lang.Class<?> wildcardClass55 = fila32.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) false);
        java.lang.Object obj11 = fila8.desenfileira();
        fila8.enfileira((java.lang.Object) (short) 10);
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) false);
        java.lang.Object obj18 = fila15.desenfileira();
        fila15.imprime();
        fila15.imprime();
        fila8.enfileira((java.lang.Object) fila15);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        fila15.enfileira(obj22);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj31 = fila25.desenfileira();
        fila25.imprime();
        fila15.enfileira((java.lang.Object) fila25);
        boolean boolean34 = fila25.vazia();
        ds.Fila fila35 = new ds.Fila();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        fila35.enfileira((java.lang.Object) wildcardClass37);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) false);
        java.lang.Object obj42 = fila39.desenfileira();
        fila39.enfileira((java.lang.Object) (short) 10);
        boolean boolean45 = fila39.vazia();
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) false);
        java.lang.Object obj49 = fila46.desenfileira();
        fila46.imprime();
        fila46.imprime();
        fila39.enfileira((java.lang.Object) fila46);
        boolean boolean53 = fila46.vazia();
        fila35.enfileira((java.lang.Object) boolean53);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) false);
        fila35.enfileira((java.lang.Object) fila55);
        java.lang.Object obj59 = fila35.desenfileira();
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) false);
        java.lang.Object obj63 = fila60.desenfileira();
        fila60.enfileira((java.lang.Object) (short) 10);
        boolean boolean66 = fila60.vazia();
        ds.Fila fila67 = new ds.Fila();
        fila67.enfileira((java.lang.Object) false);
        java.lang.Object obj70 = fila67.desenfileira();
        fila67.imprime();
        fila67.imprime();
        fila60.enfileira((java.lang.Object) fila67);
        boolean boolean74 = fila67.vazia();
        fila67.enfileira((java.lang.Object) 'a');
        fila67.enfileira((java.lang.Object) (byte) 100);
        fila67.imprime();
        boolean boolean80 = fila67.vazia();
        boolean boolean81 = fila67.vazia();
        java.lang.Object obj82 = fila67.desenfileira();
        fila67.imprime();
        fila35.enfileira((java.lang.Object) fila67);
        fila25.enfileira((java.lang.Object) fila67);
        fila0.enfileira((java.lang.Object) fila67);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 10 + "'", obj31, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + false + "'", obj42, false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + false + "'", obj49, false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + false + "'", obj63, false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + false + "'", obj70, false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + 'a' + "'", obj82, 'a');
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) (short) 10);
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.imprime();
        fila26.imprime();
        fila19.enfileira((java.lang.Object) fila26);
        fila19.imprime();
        boolean boolean34 = fila19.vazia();
        fila7.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass36 = fila19.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        java.lang.Class<?> wildcardClass25 = fila17.getClass();
        fila7.enfileira((java.lang.Object) fila17);
        fila7.enfileira((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass29 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        boolean boolean20 = fila7.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj27 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 0L);
        fila7.enfileira((java.lang.Object) 0L);
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 10 + "'", obj27, (short) 10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        java.lang.Object obj17 = fila7.desenfileira();
        boolean boolean18 = fila7.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) (short) 10);
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.imprime();
        fila26.imprime();
        fila19.enfileira((java.lang.Object) fila26);
        boolean boolean33 = fila26.vazia();
        fila26.enfileira((java.lang.Object) 'a');
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        fila36.enfileira((java.lang.Object) wildcardClass38);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) false);
        java.lang.Object obj43 = fila40.desenfileira();
        fila40.enfileira((java.lang.Object) (short) 10);
        boolean boolean46 = fila40.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) false);
        java.lang.Object obj50 = fila47.desenfileira();
        fila47.imprime();
        fila47.imprime();
        fila40.enfileira((java.lang.Object) fila47);
        boolean boolean54 = fila47.vazia();
        fila36.enfileira((java.lang.Object) boolean54);
        fila26.enfileira((java.lang.Object) fila36);
        boolean boolean57 = fila36.vazia();
        boolean boolean58 = fila36.vazia();
        fila7.enfileira((java.lang.Object) fila36);
        java.lang.Class<?> wildcardClass60 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + false + "'", obj43, false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + false + "'", obj50, false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) (short) 10);
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        boolean boolean23 = fila17.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) false);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.imprime();
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        boolean boolean31 = fila24.vazia();
        fila24.enfileira((java.lang.Object) 'a');
        fila24.enfileira((java.lang.Object) (byte) 100);
        java.lang.Object obj36 = fila24.desenfileira();
        fila7.enfileira(obj36);
        java.lang.Class<?> wildcardClass38 = fila7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila17.enfileira((java.lang.Object) (short) 10);
        fila17.imprime();
        fila17.enfileira((java.lang.Object) (byte) 1);
        boolean boolean31 = fila17.vazia();
        fila17.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila17.vazia();
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        fila27.enfileira((java.lang.Object) wildcardClass29);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) false);
        java.lang.Object obj34 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) (short) 10);
        boolean boolean37 = fila31.vazia();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) false);
        java.lang.Object obj41 = fila38.desenfileira();
        fila38.imprime();
        fila38.imprime();
        fila31.enfileira((java.lang.Object) fila38);
        boolean boolean45 = fila38.vazia();
        fila27.enfileira((java.lang.Object) boolean45);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) false);
        fila27.enfileira((java.lang.Object) fila47);
        java.lang.Object obj51 = fila27.desenfileira();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) false);
        java.lang.Object obj55 = fila52.desenfileira();
        fila52.enfileira((java.lang.Object) (short) 10);
        boolean boolean58 = fila52.vazia();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) false);
        java.lang.Object obj62 = fila59.desenfileira();
        fila59.imprime();
        fila59.imprime();
        fila52.enfileira((java.lang.Object) fila59);
        boolean boolean66 = fila59.vazia();
        fila59.enfileira((java.lang.Object) 'a');
        fila59.enfileira((java.lang.Object) (byte) 100);
        fila59.imprime();
        boolean boolean72 = fila59.vazia();
        boolean boolean73 = fila59.vazia();
        java.lang.Object obj74 = fila59.desenfileira();
        fila59.imprime();
        fila27.enfileira((java.lang.Object) fila59);
        fila17.enfileira((java.lang.Object) fila59);
        boolean boolean78 = fila59.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + false + "'", obj34, false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + false + "'", obj41, false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + false + "'", obj55, false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + false + "'", obj62, false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 'a' + "'", obj74, 'a');
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        fila7.enfileira((java.lang.Object) (byte) 1);
        fila7.imprime();
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) false);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.enfileira((java.lang.Object) (short) 10);
        fila16.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) false);
        java.lang.Object obj26 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj29 = fila23.desenfileira();
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        fila16.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila23);
        boolean boolean34 = fila23.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) 10 + "'", obj29, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean35);
        fila7.enfileira((java.lang.Object) fila17);
        java.lang.Object obj38 = fila7.desenfileira();
        fila7.imprime();
        java.lang.Class<?> wildcardClass40 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 'a' + "'", obj38, 'a');
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) false);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) (short) 10);
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) false);
        java.lang.Object obj15 = fila12.desenfileira();
        fila12.imprime();
        fila12.imprime();
        fila5.enfileira((java.lang.Object) fila12);
        fila5.imprime();
        boolean boolean20 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) false);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 10);
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        fila10.enfileira((java.lang.Object) fila17);
        fila10.imprime();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean27 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        java.lang.Class<?> wildcardClass30 = fila10.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean35);
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean38 = fila7.vazia();
        boolean boolean39 = fila7.vazia();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) false);
        java.lang.Object obj43 = fila40.desenfileira();
        fila40.enfileira((java.lang.Object) (short) 10);
        boolean boolean46 = fila40.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) false);
        java.lang.Object obj50 = fila47.desenfileira();
        fila47.imprime();
        fila47.imprime();
        fila40.enfileira((java.lang.Object) fila47);
        fila40.imprime();
        ds.Fila fila55 = new ds.Fila();
        boolean boolean56 = fila55.vazia();
        boolean boolean57 = fila55.vazia();
        fila55.enfileira((java.lang.Object) false);
        fila40.enfileira((java.lang.Object) false);
        ds.Fila fila61 = new ds.Fila();
        boolean boolean62 = fila61.vazia();
        boolean boolean63 = fila61.vazia();
        fila61.enfileira((java.lang.Object) false);
        fila40.enfileira((java.lang.Object) false);
        fila40.imprime();
        ds.Fila fila68 = new ds.Fila();
        fila68.enfileira((java.lang.Object) false);
        java.lang.Object obj71 = fila68.desenfileira();
        fila68.enfileira((java.lang.Object) (short) 10);
        boolean boolean74 = fila68.vazia();
        boolean boolean75 = fila68.vazia();
        fila40.enfileira((java.lang.Object) boolean75);
        java.lang.Object obj77 = fila40.desenfileira();
        fila7.enfileira(obj77);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + false + "'", obj43, false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + false + "'", obj50, false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + false + "'", obj71, false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + (short) 10 + "'", obj77, (short) 10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) false);
        java.lang.Object obj11 = fila8.desenfileira();
        fila8.imprime();
        java.lang.Class<?> wildcardClass13 = fila8.getClass();
        fila0.enfileira((java.lang.Object) fila8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = fila8.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        boolean boolean20 = fila7.vazia();
        boolean boolean21 = fila7.vazia();
        java.lang.Object obj22 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        java.lang.Class<?> wildcardClass25 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 'a' + "'", obj22, 'a');
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        java.lang.Class<?> wildcardClass25 = fila17.getClass();
        fila7.enfileira((java.lang.Object) fila17);
        fila7.enfileira((java.lang.Object) ' ');
        java.lang.Object obj29 = fila7.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        java.lang.Class<?> wildcardClass25 = fila17.getClass();
        fila7.enfileira((java.lang.Object) fila17);
        java.lang.Class<?> wildcardClass27 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        boolean boolean20 = fila7.vazia();
        boolean boolean21 = fila7.vazia();
        fila7.imprime();
        java.lang.Object obj23 = fila7.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 'a' + "'", obj23, 'a');
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        boolean boolean7 = fila5.vazia();
        fila0.enfileira((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        boolean boolean24 = fila0.vazia();
        java.lang.Object obj25 = fila0.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.enfileira((java.lang.Object) (short) 10);
        boolean boolean32 = fila26.vazia();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) false);
        java.lang.Object obj36 = fila33.desenfileira();
        fila33.imprime();
        fila33.imprime();
        fila26.enfileira((java.lang.Object) fila33);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        fila33.enfileira(obj40);
        fila33.enfileira((java.lang.Object) (byte) 1);
        fila0.enfileira((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + false + "'", obj36, false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = fila7.desenfileira();
        java.lang.Object obj20 = fila7.desenfileira();
        boolean boolean21 = fila7.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 100 + "'", obj20, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila17.enfileira((java.lang.Object) (short) 10);
        fila17.imprime();
        fila17.enfileira((java.lang.Object) (byte) 1);
        boolean boolean31 = fila17.vazia();
        java.lang.Object obj32 = fila17.desenfileira();
        java.lang.Object obj33 = fila17.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) 10 + "'", obj32, (short) 10);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 1 + "'", obj33, (byte) 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) false);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 10);
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        fila10.enfileira((java.lang.Object) fila17);
        fila10.imprime();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean27 = fila0.vazia();
        boolean boolean28 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        boolean boolean23 = fila17.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) false);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.imprime();
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        java.lang.Object obj31 = fila17.desenfileira();
        fila0.enfileira(obj31);
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        fila33.enfileira((java.lang.Object) wildcardClass35);
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) false);
        java.lang.Object obj40 = fila37.desenfileira();
        fila37.enfileira((java.lang.Object) (short) 10);
        boolean boolean43 = fila37.vazia();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) false);
        java.lang.Object obj47 = fila44.desenfileira();
        fila44.imprime();
        fila44.imprime();
        fila37.enfileira((java.lang.Object) fila44);
        boolean boolean51 = fila44.vazia();
        fila33.enfileira((java.lang.Object) boolean51);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) false);
        fila33.enfileira((java.lang.Object) fila53);
        boolean boolean57 = fila33.vazia();
        fila0.enfileira((java.lang.Object) fila33);
        java.lang.Class<?> wildcardClass59 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 10 + "'", obj31, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + false + "'", obj40, false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + false + "'", obj47, false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.Object");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) false);
        java.lang.Object obj5 = fila2.desenfileira();
        fila2.enfileira((java.lang.Object) (short) 10);
        boolean boolean8 = fila2.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) false);
        java.lang.Object obj12 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        fila2.enfileira((java.lang.Object) fila9);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        fila9.enfileira(obj16);
        java.lang.Object obj19 = fila9.desenfileira();
        boolean boolean20 = fila9.vazia();
        fila0.enfileira((java.lang.Object) fila9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = fila9.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila7.vazia();
        boolean boolean27 = fila7.vazia();
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        boolean boolean20 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) false);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) (short) 10);
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) false);
        java.lang.Object obj15 = fila12.desenfileira();
        fila12.imprime();
        fila12.imprime();
        fila5.enfileira((java.lang.Object) fila12);
        fila5.imprime();
        boolean boolean20 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        fila5.imprime();
        fila5.imprime();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 10 + "'", obj7, (short) 10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
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
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        fila20.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        fila27.enfileira((java.lang.Object) wildcardClass29);
        boolean boolean31 = fila27.vazia();
        boolean boolean32 = fila27.vazia();
        java.lang.Object obj33 = fila27.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) false);
        java.lang.Object obj37 = fila34.desenfileira();
        fila34.enfileira((java.lang.Object) (short) 10);
        fila34.imprime();
        boolean boolean41 = fila34.vazia();
        fila34.imprime();
        fila27.enfileira((java.lang.Object) fila34);
        fila20.enfileira((java.lang.Object) fila27);
        java.lang.Class<?> wildcardClass45 = fila20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + false + "'", obj37, false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        fila20.imprime();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        boolean boolean20 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass24);
        boolean boolean26 = fila22.vazia();
        boolean boolean27 = fila22.vazia();
        fila22.enfileira((java.lang.Object) "hi!");
        boolean boolean30 = fila22.vazia();
        java.lang.Class<?> wildcardClass31 = fila22.getClass();
        fila7.enfileira((java.lang.Object) fila22);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Class<?> wildcardClass10 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        boolean boolean23 = fila17.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) false);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.imprime();
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        fila24.enfileira(obj31);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) false);
        java.lang.Object obj37 = fila34.desenfileira();
        fila34.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj40 = fila34.desenfileira();
        fila34.imprime();
        fila24.enfileira((java.lang.Object) fila34);
        fila7.enfileira((java.lang.Object) fila24);
        boolean boolean44 = fila24.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + false + "'", obj37, false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) 10 + "'", obj40, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        fila20.enfileira((java.lang.Object) 100.0f);
        boolean boolean27 = fila20.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        boolean boolean23 = fila21.vazia();
        fila21.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        fila0.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) (short) 10);
        boolean boolean34 = fila28.vazia();
        boolean boolean35 = fila28.vazia();
        fila0.enfileira((java.lang.Object) boolean35);
        java.lang.Object obj37 = fila0.desenfileira();
        boolean boolean38 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (short) 10 + "'", obj37, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj21 = fila0.desenfileira();
        java.lang.Object obj22 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 10 + "'", obj21, (short) 10);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        boolean boolean17 = fila0.vazia();
        java.lang.Object obj18 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 10 + "'", obj18, (short) 10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila17.vazia();
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        fila27.enfileira((java.lang.Object) wildcardClass29);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) false);
        java.lang.Object obj34 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) (short) 10);
        boolean boolean37 = fila31.vazia();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) false);
        java.lang.Object obj41 = fila38.desenfileira();
        fila38.imprime();
        fila38.imprime();
        fila31.enfileira((java.lang.Object) fila38);
        boolean boolean45 = fila38.vazia();
        fila27.enfileira((java.lang.Object) boolean45);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) false);
        fila27.enfileira((java.lang.Object) fila47);
        java.lang.Object obj51 = fila27.desenfileira();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) false);
        java.lang.Object obj55 = fila52.desenfileira();
        fila52.enfileira((java.lang.Object) (short) 10);
        boolean boolean58 = fila52.vazia();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) false);
        java.lang.Object obj62 = fila59.desenfileira();
        fila59.imprime();
        fila59.imprime();
        fila52.enfileira((java.lang.Object) fila59);
        boolean boolean66 = fila59.vazia();
        fila59.enfileira((java.lang.Object) 'a');
        fila59.enfileira((java.lang.Object) (byte) 100);
        fila59.imprime();
        boolean boolean72 = fila59.vazia();
        boolean boolean73 = fila59.vazia();
        java.lang.Object obj74 = fila59.desenfileira();
        fila59.imprime();
        fila27.enfileira((java.lang.Object) fila59);
        fila17.enfileira((java.lang.Object) fila59);
        java.lang.Class<?> wildcardClass78 = fila17.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + false + "'", obj34, false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + false + "'", obj41, false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + false + "'", obj55, false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + false + "'", obj62, false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 'a' + "'", obj74, 'a');
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila17.vazia();
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        fila27.enfileira((java.lang.Object) wildcardClass29);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) false);
        java.lang.Object obj34 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) (short) 10);
        boolean boolean37 = fila31.vazia();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) false);
        java.lang.Object obj41 = fila38.desenfileira();
        fila38.imprime();
        fila38.imprime();
        fila31.enfileira((java.lang.Object) fila38);
        boolean boolean45 = fila38.vazia();
        fila27.enfileira((java.lang.Object) boolean45);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) false);
        fila27.enfileira((java.lang.Object) fila47);
        java.lang.Object obj51 = fila27.desenfileira();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) false);
        java.lang.Object obj55 = fila52.desenfileira();
        fila52.enfileira((java.lang.Object) (short) 10);
        boolean boolean58 = fila52.vazia();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) false);
        java.lang.Object obj62 = fila59.desenfileira();
        fila59.imprime();
        fila59.imprime();
        fila52.enfileira((java.lang.Object) fila59);
        boolean boolean66 = fila59.vazia();
        fila59.enfileira((java.lang.Object) 'a');
        fila59.enfileira((java.lang.Object) (byte) 100);
        fila59.imprime();
        boolean boolean72 = fila59.vazia();
        boolean boolean73 = fila59.vazia();
        java.lang.Object obj74 = fila59.desenfileira();
        fila59.imprime();
        fila27.enfileira((java.lang.Object) fila59);
        fila17.enfileira((java.lang.Object) fila59);
        java.lang.Class<?> wildcardClass78 = fila59.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + false + "'", obj34, false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + false + "'", obj41, false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + false + "'", obj55, false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + false + "'", obj62, false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 'a' + "'", obj74, 'a');
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        fila10.enfileira((java.lang.Object) wildcardClass12);
        fila10.imprime();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        fila7.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) (short) 10);
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.imprime();
        fila26.imprime();
        fila19.enfileira((java.lang.Object) fila26);
        fila19.imprime();
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        boolean boolean36 = fila34.vazia();
        fila34.enfileira((java.lang.Object) false);
        fila19.enfileira((java.lang.Object) false);
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        boolean boolean42 = fila40.vazia();
        fila40.enfileira((java.lang.Object) false);
        fila19.enfileira((java.lang.Object) false);
        fila19.imprime();
        fila19.imprime();
        fila7.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass49 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        boolean boolean20 = fila7.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj27 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 0L);
        fila7.enfileira((java.lang.Object) 0L);
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        fila31.enfileira((java.lang.Object) wildcardClass33);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) false);
        java.lang.Object obj38 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) (short) 10);
        boolean boolean41 = fila35.vazia();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.imprime();
        fila42.imprime();
        fila35.enfileira((java.lang.Object) fila42);
        boolean boolean49 = fila42.vazia();
        fila31.enfileira((java.lang.Object) boolean49);
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) false);
        fila31.enfileira((java.lang.Object) fila51);
        java.lang.Object obj55 = fila51.desenfileira();
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) false);
        java.lang.Object obj59 = fila56.desenfileira();
        fila56.enfileira((java.lang.Object) (short) 10);
        boolean boolean62 = fila56.vazia();
        ds.Fila fila63 = new ds.Fila();
        fila63.enfileira((java.lang.Object) false);
        java.lang.Object obj66 = fila63.desenfileira();
        fila63.imprime();
        fila63.imprime();
        fila56.enfileira((java.lang.Object) fila63);
        java.lang.Object obj70 = new java.lang.Object();
        java.lang.Class<?> wildcardClass71 = obj70.getClass();
        fila63.enfileira(obj70);
        ds.Fila fila73 = new ds.Fila();
        fila73.enfileira((java.lang.Object) false);
        java.lang.Object obj76 = fila73.desenfileira();
        fila73.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj79 = fila73.desenfileira();
        fila73.imprime();
        fila63.enfileira((java.lang.Object) fila73);
        fila63.imprime();
        java.lang.Object obj83 = fila63.desenfileira();
        fila51.enfileira((java.lang.Object) fila63);
        fila7.enfileira((java.lang.Object) fila51);
        java.lang.Object obj86 = fila51.desenfileira();
        fila51.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 10 + "'", obj27, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + false + "'", obj38, false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + false + "'", obj55, false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + false + "'", obj59, false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + false + "'", obj66, false);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + false + "'", obj76, false);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + (short) 10 + "'", obj79, (short) 10);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertNotNull(obj86);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '#');
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        java.lang.Object obj21 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + true + "'", obj21, true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila17.vazia();
        boolean boolean27 = fila17.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj34 = fila28.desenfileira();
        boolean boolean35 = fila28.vazia();
        boolean boolean36 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean36);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) false);
        java.lang.Object obj41 = fila38.desenfileira();
        fila38.enfileira((java.lang.Object) (short) 10);
        boolean boolean44 = fila38.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) false);
        java.lang.Object obj48 = fila45.desenfileira();
        fila45.imprime();
        fila45.imprime();
        fila38.enfileira((java.lang.Object) fila45);
        fila38.imprime();
        ds.Fila fila53 = new ds.Fila();
        boolean boolean54 = fila53.vazia();
        boolean boolean55 = fila53.vazia();
        fila53.enfileira((java.lang.Object) false);
        fila38.enfileira((java.lang.Object) false);
        ds.Fila fila59 = new ds.Fila();
        boolean boolean60 = fila59.vazia();
        boolean boolean61 = fila59.vazia();
        fila59.enfileira((java.lang.Object) false);
        fila38.enfileira((java.lang.Object) false);
        ds.Fila fila65 = new ds.Fila();
        fila65.enfileira((java.lang.Object) false);
        java.lang.Object obj68 = fila65.desenfileira();
        fila65.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj71 = fila65.desenfileira();
        fila65.enfileira((java.lang.Object) 0L);
        fila65.imprime();
        fila38.enfileira((java.lang.Object) fila65);
        fila17.enfileira((java.lang.Object) fila38);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 10 + "'", obj34, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + false + "'", obj41, false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + false + "'", obj48, false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + false + "'", obj68, false);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + (short) 10 + "'", obj71, (short) 10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass8);
        boolean boolean10 = fila6.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) (short) 10);
        boolean boolean17 = fila11.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) false);
        java.lang.Object obj21 = fila18.desenfileira();
        fila18.imprime();
        fila18.imprime();
        fila11.enfileira((java.lang.Object) fila18);
        fila11.imprime();
        boolean boolean26 = fila11.vazia();
        fila11.imprime();
        fila6.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila6);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        fila32.enfileira(obj39);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj48 = fila42.desenfileira();
        fila42.imprime();
        fila32.enfileira((java.lang.Object) fila42);
        fila32.imprime();
        java.lang.Object obj52 = fila32.desenfileira();
        fila20.enfileira((java.lang.Object) fila32);
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) false);
        java.lang.Object obj57 = fila54.desenfileira();
        fila54.enfileira((java.lang.Object) (short) 10);
        fila54.imprime();
        ds.Fila fila61 = new ds.Fila();
        fila61.imprime();
        fila54.enfileira((java.lang.Object) fila61);
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) false);
        java.lang.Object obj67 = fila64.desenfileira();
        fila64.enfileira((java.lang.Object) (short) 10);
        boolean boolean70 = fila64.vazia();
        ds.Fila fila71 = new ds.Fila();
        fila71.enfileira((java.lang.Object) false);
        java.lang.Object obj74 = fila71.desenfileira();
        fila71.imprime();
        fila71.imprime();
        fila64.enfileira((java.lang.Object) fila71);
        fila64.imprime();
        fila64.imprime();
        fila54.enfileira((java.lang.Object) fila64);
        fila64.imprime();
        fila20.enfileira((java.lang.Object) fila64);
        java.lang.Class<?> wildcardClass83 = fila64.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + false + "'", obj57, false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + false + "'", obj67, false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + false + "'", obj74, false);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        fila7.imprime();
        boolean boolean21 = fila7.vazia();
        java.lang.Object obj22 = fila7.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 'a' + "'", obj22, 'a');
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) false);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 10);
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        fila10.enfileira((java.lang.Object) fila17);
        fila10.imprime();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean27 = fila10.vazia();
        fila10.imprime();
        boolean boolean29 = fila10.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila0.desenfileira();
        boolean boolean25 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        java.lang.Object obj17 = new java.lang.Object();
        fila7.enfileira(obj17);
        fila7.imprime();
        java.lang.Class<?> wildcardClass20 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        boolean boolean23 = fila17.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) false);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.imprime();
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        fila24.enfileira(obj31);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) false);
        java.lang.Object obj37 = fila34.desenfileira();
        fila34.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj40 = fila34.desenfileira();
        fila34.imprime();
        fila24.enfileira((java.lang.Object) fila34);
        fila7.enfileira((java.lang.Object) fila24);
        java.lang.Class<?> wildcardClass44 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + false + "'", obj37, false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) 10 + "'", obj40, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        boolean boolean20 = fila7.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj27 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 0L);
        fila7.enfileira((java.lang.Object) 0L);
        java.lang.Object obj31 = fila7.desenfileira();
        fila7.imprime();
        boolean boolean33 = fila7.vazia();
        java.lang.Class<?> wildcardClass34 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 10 + "'", obj27, (short) 10);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        boolean boolean24 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila0.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        boolean boolean39 = fila32.vazia();
        fila32.enfileira((java.lang.Object) 'a');
        fila32.enfileira((java.lang.Object) (byte) 100);
        fila32.imprime();
        boolean boolean45 = fila32.vazia();
        boolean boolean46 = fila32.vazia();
        java.lang.Object obj47 = fila32.desenfileira();
        fila32.imprime();
        fila0.enfileira((java.lang.Object) fila32);
        java.lang.Class<?> wildcardClass50 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 'a' + "'", obj47, 'a');
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        fila7.imprime();
        java.lang.Class<?> wildcardClass16 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) false);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 10);
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        fila10.enfileira((java.lang.Object) fila17);
        fila10.imprime();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        boolean boolean27 = fila25.vazia();
        fila25.enfileira((java.lang.Object) false);
        fila10.enfileira((java.lang.Object) false);
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        boolean boolean33 = fila31.vazia();
        fila31.enfileira((java.lang.Object) false);
        fila10.enfileira((java.lang.Object) false);
        fila10.imprime();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) false);
        java.lang.Object obj41 = fila38.desenfileira();
        fila38.enfileira((java.lang.Object) (short) 10);
        boolean boolean44 = fila38.vazia();
        boolean boolean45 = fila38.vazia();
        fila10.enfileira((java.lang.Object) boolean45);
        java.lang.Class<?> wildcardClass47 = fila10.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass47);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + false + "'", obj41, false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
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
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        boolean boolean20 = fila7.vazia();
        fila7.imprime();
        fila7.imprime();
        boolean boolean23 = fila7.vazia();
        boolean boolean24 = fila7.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        fila7.imprime();
        fila7.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = fila7.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = fila7.desenfileira();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        boolean boolean25 = fila20.vazia();
        fila20.imprime();
        fila20.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = fila20.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean35);
        fila7.enfileira((java.lang.Object) fila17);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) false);
        fila38.imprime();
        boolean boolean42 = fila38.vazia();
        fila38.imprime();
        fila7.enfileira((java.lang.Object) fila38);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean35);
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean38 = fila17.vazia();
        fila17.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass24);
        boolean boolean26 = fila22.vazia();
        boolean boolean27 = fila22.vazia();
        java.lang.Object obj28 = fila22.desenfileira();
        fila0.enfileira(obj28);
        boolean boolean30 = fila0.vazia();
        java.lang.Class<?> wildcardClass31 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "class java.lang.Object");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) false);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 10);
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        fila10.enfileira((java.lang.Object) fila17);
        fila10.imprime();
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        boolean boolean27 = fila25.vazia();
        fila25.enfileira((java.lang.Object) false);
        fila10.enfileira((java.lang.Object) false);
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        boolean boolean33 = fila31.vazia();
        fila31.enfileira((java.lang.Object) false);
        fila10.enfileira((java.lang.Object) false);
        fila10.imprime();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) false);
        java.lang.Object obj41 = fila38.desenfileira();
        fila38.enfileira((java.lang.Object) (short) 10);
        boolean boolean44 = fila38.vazia();
        boolean boolean45 = fila38.vazia();
        fila10.enfileira((java.lang.Object) boolean45);
        java.lang.Class<?> wildcardClass47 = fila10.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass47);
        java.lang.Object obj49 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + false + "'", obj41, false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "class ds.Fila");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 10 + "'", obj10, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = fila17.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        boolean boolean15 = fila7.vazia();
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        fila16.enfileira((java.lang.Object) wildcardClass18);
        boolean boolean20 = fila16.vazia();
        fila7.enfileira((java.lang.Object) fila16);
        java.lang.Class<?> wildcardClass22 = fila16.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila17.vazia();
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        fila27.enfileira((java.lang.Object) wildcardClass29);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) false);
        java.lang.Object obj34 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) (short) 10);
        boolean boolean37 = fila31.vazia();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) false);
        java.lang.Object obj41 = fila38.desenfileira();
        fila38.imprime();
        fila38.imprime();
        fila31.enfileira((java.lang.Object) fila38);
        boolean boolean45 = fila38.vazia();
        fila27.enfileira((java.lang.Object) boolean45);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) false);
        fila27.enfileira((java.lang.Object) fila47);
        java.lang.Object obj51 = fila27.desenfileira();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) false);
        java.lang.Object obj55 = fila52.desenfileira();
        fila52.enfileira((java.lang.Object) (short) 10);
        boolean boolean58 = fila52.vazia();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) false);
        java.lang.Object obj62 = fila59.desenfileira();
        fila59.imprime();
        fila59.imprime();
        fila52.enfileira((java.lang.Object) fila59);
        boolean boolean66 = fila59.vazia();
        fila59.enfileira((java.lang.Object) 'a');
        fila59.enfileira((java.lang.Object) (byte) 100);
        fila59.imprime();
        boolean boolean72 = fila59.vazia();
        boolean boolean73 = fila59.vazia();
        java.lang.Object obj74 = fila59.desenfileira();
        fila59.imprime();
        fila27.enfileira((java.lang.Object) fila59);
        fila17.enfileira((java.lang.Object) fila59);
        java.lang.Object obj78 = fila59.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + false + "'", obj34, false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + false + "'", obj41, false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + false + "'", obj55, false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + false + "'", obj62, false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 'a' + "'", obj74, 'a');
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + (byte) 100 + "'", obj78, (byte) 100);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 0L);
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        boolean boolean17 = fila0.vazia();
        boolean boolean18 = fila0.vazia();
        java.lang.Object obj19 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 10 + "'", obj19, (short) 10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
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
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) (short) 10);
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.imprime();
        fila26.imprime();
        fila19.enfileira((java.lang.Object) fila26);
        fila19.imprime();
        boolean boolean34 = fila19.vazia();
        fila7.enfileira((java.lang.Object) fila19);
        java.lang.Object obj36 = fila19.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 10 + "'", obj36, (short) 10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        java.lang.Object obj9 = null;
        fila0.enfileira(obj9);
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 10 + "'", obj11, (short) 10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) false);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 10);
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        fila10.enfileira((java.lang.Object) fila17);
        fila10.imprime();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean27 = fila10.vazia();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) false);
        java.lang.Object obj33 = fila30.desenfileira();
        fila30.enfileira((java.lang.Object) (short) 10);
        boolean boolean36 = fila30.vazia();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) false);
        java.lang.Object obj40 = fila37.desenfileira();
        fila37.imprime();
        fila37.imprime();
        fila30.enfileira((java.lang.Object) fila37);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        fila37.enfileira(obj44);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) false);
        java.lang.Object obj50 = fila47.desenfileira();
        fila47.enfileira((java.lang.Object) (short) 10);
        boolean boolean53 = fila47.vazia();
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) false);
        java.lang.Object obj57 = fila54.desenfileira();
        fila54.imprime();
        fila54.imprime();
        fila47.enfileira((java.lang.Object) fila54);
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        fila54.enfileira(obj61);
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) false);
        java.lang.Object obj67 = fila64.desenfileira();
        fila64.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj70 = fila64.desenfileira();
        fila64.imprime();
        fila54.enfileira((java.lang.Object) fila64);
        fila37.enfileira((java.lang.Object) fila54);
        fila54.imprime();
        fila10.enfileira((java.lang.Object) fila54);
        java.lang.Class<?> wildcardClass76 = fila10.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + false + "'", obj40, false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + false + "'", obj50, false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + false + "'", obj57, false);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + false + "'", obj67, false);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (short) 10 + "'", obj70, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        java.lang.Object obj17 = new java.lang.Object();
        fila7.enfileira(obj17);
        java.lang.Class<?> wildcardClass19 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj28 = fila7.desenfileira();
        java.lang.Object obj29 = fila7.desenfileira();
        java.lang.Class<?> wildcardClass30 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        java.lang.Class<?> wildcardClass25 = fila17.getClass();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean27 = fila17.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        boolean boolean3 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) "hi!");
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = fila0.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        fila15.enfileira((java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = fila15.desenfileira();
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 10 + "'", obj14, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        boolean boolean23 = fila21.vazia();
        fila21.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj33 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 10 + "'", obj33, (short) 10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) "hi!");
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila7.imprime();
        java.lang.Class<?> wildcardClass27 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        boolean boolean15 = fila7.vazia();
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        boolean boolean23 = fila21.vazia();
        fila21.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) false);
        java.lang.Object obj30 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj33 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) 0L);
        fila27.imprime();
        fila0.enfileira((java.lang.Object) fila27);
        fila27.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + false + "'", obj30, false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 10 + "'", obj33, (short) 10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila17.vazia();
        fila17.imprime();
        java.lang.Object obj28 = null;
        fila17.enfileira(obj28);
        // The following exception was thrown during execution in test generation
        try {
            fila17.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        boolean boolean23 = fila21.vazia();
        fila21.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        fila0.imprime();
        boolean boolean28 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) false);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 10);
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        fila10.enfileira((java.lang.Object) fila17);
        fila10.imprime();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        fila10.imprime();
        java.lang.Object obj28 = fila10.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (short) 10 + "'", obj28, (short) 10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 10 + "'", obj7, (short) 10);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 0L);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) (short) 10);
        boolean boolean13 = fila7.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) false);
        java.lang.Object obj17 = fila14.desenfileira();
        fila14.imprime();
        fila14.imprime();
        fila7.enfileira((java.lang.Object) fila14);
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 'a');
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) false);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.enfileira((java.lang.Object) (short) 10);
        boolean boolean30 = fila24.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) false);
        java.lang.Object obj34 = fila31.desenfileira();
        fila31.imprime();
        fila31.imprime();
        fila24.enfileira((java.lang.Object) fila31);
        java.lang.Object obj38 = fila24.desenfileira();
        fila7.enfileira(obj38);
        fila0.enfileira((java.lang.Object) fila7);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + false + "'", obj34, false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) 10 + "'", obj38, (short) 10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila17.enfileira((java.lang.Object) (short) 10);
        fila17.imprime();
        fila17.enfileira((java.lang.Object) (byte) 1);
        boolean boolean31 = fila17.vazia();
        java.lang.Object obj32 = fila17.desenfileira();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) false);
        java.lang.Object obj36 = fila33.desenfileira();
        fila33.enfileira((java.lang.Object) (short) 10);
        boolean boolean39 = fila33.vazia();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) false);
        java.lang.Object obj43 = fila40.desenfileira();
        fila40.imprime();
        fila40.imprime();
        fila33.enfileira((java.lang.Object) fila40);
        boolean boolean47 = fila40.vazia();
        fila40.enfileira((java.lang.Object) 'a');
        ds.Fila fila50 = new ds.Fila();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        fila50.enfileira((java.lang.Object) wildcardClass52);
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) false);
        java.lang.Object obj57 = fila54.desenfileira();
        fila54.enfileira((java.lang.Object) (short) 10);
        boolean boolean60 = fila54.vazia();
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) false);
        java.lang.Object obj64 = fila61.desenfileira();
        fila61.imprime();
        fila61.imprime();
        fila54.enfileira((java.lang.Object) fila61);
        boolean boolean68 = fila61.vazia();
        fila50.enfileira((java.lang.Object) boolean68);
        fila40.enfileira((java.lang.Object) fila50);
        fila17.enfileira((java.lang.Object) fila40);
        boolean boolean72 = fila17.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) 10 + "'", obj32, (short) 10);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + false + "'", obj36, false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + false + "'", obj43, false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + false + "'", obj57, false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + false + "'", obj64, false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila17.vazia();
        boolean boolean27 = fila17.vazia();
        fila17.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        boolean boolean15 = fila7.vazia();
        java.lang.Class<?> wildcardClass16 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean35);
        fila7.enfileira((java.lang.Object) fila17);
        fila7.imprime();
        boolean boolean39 = fila7.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        java.lang.Object obj17 = fila7.desenfileira();
        boolean boolean18 = fila7.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) (short) 10);
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.imprime();
        fila26.imprime();
        fila19.enfileira((java.lang.Object) fila26);
        boolean boolean33 = fila26.vazia();
        fila26.enfileira((java.lang.Object) 'a');
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        fila36.enfileira((java.lang.Object) wildcardClass38);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) false);
        java.lang.Object obj43 = fila40.desenfileira();
        fila40.enfileira((java.lang.Object) (short) 10);
        boolean boolean46 = fila40.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) false);
        java.lang.Object obj50 = fila47.desenfileira();
        fila47.imprime();
        fila47.imprime();
        fila40.enfileira((java.lang.Object) fila47);
        boolean boolean54 = fila47.vazia();
        fila36.enfileira((java.lang.Object) boolean54);
        fila26.enfileira((java.lang.Object) fila36);
        boolean boolean57 = fila36.vazia();
        boolean boolean58 = fila36.vazia();
        fila7.enfileira((java.lang.Object) fila36);
        boolean boolean60 = fila7.vazia();
        java.lang.Object obj61 = fila7.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + false + "'", obj43, false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + false + "'", obj50, false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(obj61);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        fila7.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) (short) 10);
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.imprime();
        fila26.imprime();
        fila19.enfileira((java.lang.Object) fila26);
        fila19.imprime();
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        boolean boolean36 = fila34.vazia();
        fila34.enfileira((java.lang.Object) false);
        fila19.enfileira((java.lang.Object) false);
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        boolean boolean42 = fila40.vazia();
        fila40.enfileira((java.lang.Object) false);
        fila19.enfileira((java.lang.Object) false);
        fila19.imprime();
        fila19.imprime();
        fila7.enfileira((java.lang.Object) fila19);
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        boolean boolean15 = fila7.vazia();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) false);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.enfileira((java.lang.Object) (short) 10);
        boolean boolean22 = fila16.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) false);
        java.lang.Object obj26 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        fila16.enfileira((java.lang.Object) fila23);
        boolean boolean30 = fila23.vazia();
        fila23.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        java.lang.Class<?> wildcardClass37 = fila32.getClass();
        fila23.enfileira((java.lang.Object) wildcardClass37);
        java.lang.Object obj39 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean42 = fila23.vazia();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) false);
        java.lang.Object obj46 = fila43.desenfileira();
        fila43.enfileira((java.lang.Object) (short) 10);
        fila43.imprime();
        ds.Fila fila50 = new ds.Fila();
        fila50.imprime();
        fila43.enfileira((java.lang.Object) fila50);
        fila43.imprime();
        boolean boolean54 = fila43.vazia();
        fila23.enfileira((java.lang.Object) boolean54);
        fila7.enfileira((java.lang.Object) boolean54);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "class ds.Fila");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + false + "'", obj46, false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        java.lang.Object obj17 = new java.lang.Object();
        fila7.enfileira(obj17);
        boolean boolean19 = fila7.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 10 + "'", obj8, (short) 10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        boolean boolean23 = fila17.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) false);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.imprime();
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 'a');
        boolean boolean34 = fila17.vazia();
        fila0.enfileira((java.lang.Object) fila17);
        boolean boolean36 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        fila7.imprime();
        boolean boolean21 = fila7.vazia();
        boolean boolean22 = fila7.vazia();
        java.lang.Class<?> wildcardClass23 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        boolean boolean24 = fila0.vazia();
        java.lang.Object obj25 = fila0.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        fila26.enfileira((java.lang.Object) wildcardClass28);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) false);
        java.lang.Object obj33 = fila30.desenfileira();
        fila30.enfileira((java.lang.Object) (short) 10);
        boolean boolean36 = fila30.vazia();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) false);
        java.lang.Object obj40 = fila37.desenfileira();
        fila37.imprime();
        fila37.imprime();
        fila30.enfileira((java.lang.Object) fila37);
        boolean boolean44 = fila37.vazia();
        fila26.enfileira((java.lang.Object) boolean44);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) false);
        fila26.enfileira((java.lang.Object) fila46);
        java.lang.Object obj50 = fila26.desenfileira();
        fila0.enfileira(obj50);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + false + "'", obj40, false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "class java.lang.Object");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila17.vazia();
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        fila27.enfileira((java.lang.Object) wildcardClass29);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) false);
        java.lang.Object obj34 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) (short) 10);
        boolean boolean37 = fila31.vazia();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) false);
        java.lang.Object obj41 = fila38.desenfileira();
        fila38.imprime();
        fila38.imprime();
        fila31.enfileira((java.lang.Object) fila38);
        boolean boolean45 = fila38.vazia();
        fila27.enfileira((java.lang.Object) boolean45);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) false);
        fila27.enfileira((java.lang.Object) fila47);
        java.lang.Object obj51 = fila27.desenfileira();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) false);
        java.lang.Object obj55 = fila52.desenfileira();
        fila52.enfileira((java.lang.Object) (short) 10);
        boolean boolean58 = fila52.vazia();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) false);
        java.lang.Object obj62 = fila59.desenfileira();
        fila59.imprime();
        fila59.imprime();
        fila52.enfileira((java.lang.Object) fila59);
        boolean boolean66 = fila59.vazia();
        fila59.enfileira((java.lang.Object) 'a');
        fila59.enfileira((java.lang.Object) (byte) 100);
        fila59.imprime();
        boolean boolean72 = fila59.vazia();
        boolean boolean73 = fila59.vazia();
        java.lang.Object obj74 = fila59.desenfileira();
        fila59.imprime();
        fila27.enfileira((java.lang.Object) fila59);
        fila17.enfileira((java.lang.Object) fila59);
        fila17.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + false + "'", obj34, false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + false + "'", obj41, false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + false + "'", obj55, false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + false + "'", obj62, false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 'a' + "'", obj74, 'a');
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila7.vazia();
        boolean boolean27 = fila7.vazia();
        java.lang.Object obj28 = fila7.desenfileira();
        boolean boolean29 = fila7.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) false);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.imprime();
        java.lang.Class<?> wildcardClass21 = fila16.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila7.desenfileira();
        fila7.imprime();
        boolean boolean25 = fila7.vazia();
        boolean boolean26 = fila7.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = fila7.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class ds.Fila");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        boolean boolean23 = fila17.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) false);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.imprime();
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 'a');
        boolean boolean34 = fila17.vazia();
        fila0.enfileira((java.lang.Object) fila17);
        java.lang.Object obj36 = fila17.desenfileira();
        java.lang.Object obj37 = fila17.desenfileira();
        fila17.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 10 + "'", obj36, (short) 10);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj21 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 10 + "'", obj21, (short) 10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        fila7.enfileira((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) (byte) 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila17.vazia();
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        fila27.enfileira((java.lang.Object) wildcardClass29);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) false);
        java.lang.Object obj34 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) (short) 10);
        boolean boolean37 = fila31.vazia();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) false);
        java.lang.Object obj41 = fila38.desenfileira();
        fila38.imprime();
        fila38.imprime();
        fila31.enfileira((java.lang.Object) fila38);
        boolean boolean45 = fila38.vazia();
        fila27.enfileira((java.lang.Object) boolean45);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) false);
        fila27.enfileira((java.lang.Object) fila47);
        java.lang.Object obj51 = fila27.desenfileira();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) false);
        java.lang.Object obj55 = fila52.desenfileira();
        fila52.enfileira((java.lang.Object) (short) 10);
        boolean boolean58 = fila52.vazia();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) false);
        java.lang.Object obj62 = fila59.desenfileira();
        fila59.imprime();
        fila59.imprime();
        fila52.enfileira((java.lang.Object) fila59);
        boolean boolean66 = fila59.vazia();
        fila59.enfileira((java.lang.Object) 'a');
        fila59.enfileira((java.lang.Object) (byte) 100);
        fila59.imprime();
        boolean boolean72 = fila59.vazia();
        boolean boolean73 = fila59.vazia();
        java.lang.Object obj74 = fila59.desenfileira();
        fila59.imprime();
        fila27.enfileira((java.lang.Object) fila59);
        fila17.enfileira((java.lang.Object) fila59);
        boolean boolean78 = fila17.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + false + "'", obj34, false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + false + "'", obj41, false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + false + "'", obj55, false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + false + "'", obj62, false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 'a' + "'", obj74, 'a');
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        fila32.enfileira(obj39);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj48 = fila42.desenfileira();
        fila42.imprime();
        fila32.enfileira((java.lang.Object) fila42);
        fila32.imprime();
        java.lang.Object obj52 = fila32.desenfileira();
        fila20.enfileira((java.lang.Object) fila32);
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) false);
        java.lang.Object obj57 = fila54.desenfileira();
        fila54.enfileira((java.lang.Object) (short) 10);
        fila54.imprime();
        ds.Fila fila61 = new ds.Fila();
        fila61.imprime();
        fila54.enfileira((java.lang.Object) fila61);
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) false);
        java.lang.Object obj67 = fila64.desenfileira();
        fila64.enfileira((java.lang.Object) (short) 10);
        boolean boolean70 = fila64.vazia();
        ds.Fila fila71 = new ds.Fila();
        fila71.enfileira((java.lang.Object) false);
        java.lang.Object obj74 = fila71.desenfileira();
        fila71.imprime();
        fila71.imprime();
        fila64.enfileira((java.lang.Object) fila71);
        fila64.imprime();
        fila64.imprime();
        fila54.enfileira((java.lang.Object) fila64);
        fila64.imprime();
        fila20.enfileira((java.lang.Object) fila64);
        ds.Fila fila83 = new ds.Fila();
        fila83.enfileira((java.lang.Object) false);
        java.lang.Object obj86 = fila83.desenfileira();
        fila83.enfileira((java.lang.Object) (short) 10);
        fila83.imprime();
        java.lang.Object obj90 = null;
        fila83.enfileira(obj90);
        boolean boolean92 = fila83.vazia();
        fila20.enfileira((java.lang.Object) fila83);
        boolean boolean94 = fila20.vazia();
        boolean boolean95 = fila20.vazia();
        boolean boolean96 = fila20.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + false + "'", obj57, false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + false + "'", obj67, false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + false + "'", obj74, false);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + false + "'", obj86, false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        boolean boolean15 = fila7.vazia();
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        fila16.enfileira((java.lang.Object) wildcardClass18);
        boolean boolean20 = fila16.vazia();
        fila7.enfileira((java.lang.Object) fila16);
        java.lang.Object obj22 = fila16.desenfileira();
        boolean boolean23 = fila16.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = fila7.desenfileira();
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean35);
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean38 = fila7.vazia();
        ds.Fila fila39 = new ds.Fila();
        boolean boolean40 = fila39.vazia();
        boolean boolean41 = fila39.vazia();
        fila39.enfileira((java.lang.Object) false);
        java.lang.Class<?> wildcardClass44 = fila39.getClass();
        fila7.enfileira((java.lang.Object) fila39);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        fila32.enfileira(obj39);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj48 = fila42.desenfileira();
        fila42.imprime();
        fila32.enfileira((java.lang.Object) fila42);
        fila32.imprime();
        java.lang.Object obj52 = fila32.desenfileira();
        fila20.enfileira((java.lang.Object) fila32);
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) false);
        java.lang.Object obj57 = fila54.desenfileira();
        fila54.enfileira((java.lang.Object) (short) 10);
        boolean boolean60 = fila54.vazia();
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) false);
        java.lang.Object obj64 = fila61.desenfileira();
        fila61.imprime();
        fila61.imprime();
        fila54.enfileira((java.lang.Object) fila61);
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Class<?> wildcardClass69 = obj68.getClass();
        fila61.enfileira(obj68);
        java.lang.Object obj71 = fila61.desenfileira();
        boolean boolean72 = fila61.vazia();
        fila32.enfileira((java.lang.Object) fila61);
        ds.Fila fila74 = new ds.Fila();
        java.lang.Object obj75 = new java.lang.Object();
        java.lang.Class<?> wildcardClass76 = obj75.getClass();
        fila74.enfileira((java.lang.Object) wildcardClass76);
        boolean boolean78 = fila74.vazia();
        boolean boolean79 = fila74.vazia();
        fila74.enfileira((java.lang.Object) 0L);
        fila74.enfileira((java.lang.Object) (-1.0f));
        fila32.enfileira((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass85 = fila32.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + false + "'", obj57, false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + false + "'", obj64, false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) false);
        java.lang.Object obj11 = fila8.desenfileira();
        fila8.imprime();
        java.lang.Class<?> wildcardClass13 = fila8.getClass();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj15 = fila0.desenfileira();
        boolean boolean16 = fila0.vazia();
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean35);
        java.lang.Object obj37 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        fila0.enfileira((java.lang.Object) fila17);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "class java.lang.Object");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) false);
        java.lang.Object obj5 = fila2.desenfileira();
        fila2.enfileira((java.lang.Object) (short) 10);
        boolean boolean8 = fila2.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) false);
        java.lang.Object obj12 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        fila2.enfileira((java.lang.Object) fila9);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        fila9.enfileira(obj16);
        java.lang.Object obj19 = fila9.desenfileira();
        boolean boolean20 = fila9.vazia();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj22 = fila0.desenfileira();
        boolean boolean23 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 10 + "'", obj10, (short) 10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) false);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.imprime();
        java.lang.Class<?> wildcardClass21 = fila16.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        boolean boolean26 = fila7.vazia();
        java.lang.Class<?> wildcardClass27 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class ds.Fila");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila0.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        boolean boolean39 = fila32.vazia();
        fila32.enfileira((java.lang.Object) 'a');
        fila32.enfileira((java.lang.Object) (byte) 100);
        fila32.imprime();
        boolean boolean45 = fila32.vazia();
        boolean boolean46 = fila32.vazia();
        java.lang.Object obj47 = fila32.desenfileira();
        fila32.imprime();
        fila0.enfileira((java.lang.Object) fila32);
        boolean boolean50 = fila32.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 'a' + "'", obj47, 'a');
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean35);
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean38 = fila17.vazia();
        java.lang.Object obj39 = fila17.desenfileira();
        java.lang.Object obj40 = fila17.desenfileira();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) false);
        java.lang.Object obj44 = fila41.desenfileira();
        fila41.enfileira((java.lang.Object) 0L);
        boolean boolean47 = fila41.vazia();
        fila17.enfileira((java.lang.Object) boolean47);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + true + "'", obj40, true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + false + "'", obj44, false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean35);
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean38 = fila7.vazia();
        boolean boolean39 = fila7.vazia();
        java.lang.Object obj40 = fila7.desenfileira();
        java.lang.Object obj41 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 'a' + "'", obj40, 'a');
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj21 = fila0.desenfileira();
        java.lang.Object obj22 = fila0.desenfileira();
        boolean boolean23 = fila0.vazia();
        boolean boolean24 = fila0.vazia();
        boolean boolean25 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 10 + "'", obj21, (short) 10);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) false);
        java.lang.Object obj15 = fila12.desenfileira();
        fila12.enfileira((java.lang.Object) (short) 10);
        boolean boolean18 = fila12.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.imprime();
        fila19.imprime();
        fila12.enfileira((java.lang.Object) fila19);
        boolean boolean26 = fila19.vazia();
        fila19.enfileira((java.lang.Object) 'a');
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        fila29.enfileira((java.lang.Object) wildcardClass31);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) false);
        java.lang.Object obj36 = fila33.desenfileira();
        fila33.enfileira((java.lang.Object) (short) 10);
        boolean boolean39 = fila33.vazia();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) false);
        java.lang.Object obj43 = fila40.desenfileira();
        fila40.imprime();
        fila40.imprime();
        fila33.enfileira((java.lang.Object) fila40);
        boolean boolean47 = fila40.vazia();
        fila29.enfileira((java.lang.Object) boolean47);
        fila19.enfileira((java.lang.Object) fila29);
        boolean boolean50 = fila29.vazia();
        fila0.enfileira((java.lang.Object) boolean50);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + false + "'", obj36, false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + false + "'", obj43, false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = fila0.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        fila15.enfileira((java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = fila15.desenfileira();
        fila0.enfileira((java.lang.Object) fila15);
        fila0.enfileira((java.lang.Object) 100.0d);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 10 + "'", obj14, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class java.lang.Object");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class java.lang.Object");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        fila7.enfileira((java.lang.Object) (byte) 1);
        fila7.imprime();
        java.lang.Class<?> wildcardClass20 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        boolean boolean20 = fila7.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj27 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 0L);
        fila7.enfileira((java.lang.Object) 0L);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) false);
        java.lang.Object obj34 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) (short) 10);
        boolean boolean37 = fila31.vazia();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) false);
        java.lang.Object obj41 = fila38.desenfileira();
        fila38.imprime();
        fila38.imprime();
        fila31.enfileira((java.lang.Object) fila38);
        fila38.imprime();
        fila7.enfileira((java.lang.Object) fila38);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 10 + "'", obj27, (short) 10);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + false + "'", obj34, false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + false + "'", obj41, false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) false);
        java.lang.Object obj11 = fila8.desenfileira();
        fila8.imprime();
        java.lang.Class<?> wildcardClass13 = fila8.getClass();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj15 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        fila7.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) (short) 10);
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.imprime();
        fila26.imprime();
        fila19.enfileira((java.lang.Object) fila26);
        fila19.imprime();
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        boolean boolean36 = fila34.vazia();
        fila34.enfileira((java.lang.Object) false);
        fila19.enfileira((java.lang.Object) false);
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        boolean boolean42 = fila40.vazia();
        fila40.enfileira((java.lang.Object) false);
        fila19.enfileira((java.lang.Object) false);
        fila19.imprime();
        fila19.imprime();
        fila7.enfileira((java.lang.Object) fila19);
        boolean boolean49 = fila7.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        java.lang.Object obj17 = new java.lang.Object();
        fila7.enfileira(obj17);
        fila7.imprime();
        java.lang.Object obj20 = fila7.desenfileira();
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 'a' + "'", obj20, 'a');
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean35);
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean38 = fila7.vazia();
        boolean boolean39 = fila7.vazia();
        java.lang.Object obj40 = fila7.desenfileira();
        java.lang.Object obj41 = fila7.desenfileira();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj48 = fila42.desenfileira();
        boolean boolean49 = fila42.vazia();
        boolean boolean50 = fila42.vazia();
        boolean boolean51 = fila42.vazia();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) false);
        java.lang.Object obj55 = fila52.desenfileira();
        fila52.enfileira((java.lang.Object) (short) 10);
        boolean boolean58 = fila52.vazia();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) false);
        java.lang.Object obj62 = fila59.desenfileira();
        fila59.imprime();
        fila59.imprime();
        fila52.enfileira((java.lang.Object) fila59);
        fila52.imprime();
        ds.Fila fila67 = new ds.Fila();
        boolean boolean68 = fila67.vazia();
        boolean boolean69 = fila67.vazia();
        fila67.enfileira((java.lang.Object) false);
        fila52.enfileira((java.lang.Object) false);
        ds.Fila fila73 = new ds.Fila();
        boolean boolean74 = fila73.vazia();
        boolean boolean75 = fila73.vazia();
        fila73.enfileira((java.lang.Object) false);
        fila52.enfileira((java.lang.Object) false);
        fila52.imprime();
        ds.Fila fila80 = new ds.Fila();
        fila80.enfileira((java.lang.Object) false);
        java.lang.Object obj83 = fila80.desenfileira();
        fila80.enfileira((java.lang.Object) (short) 10);
        boolean boolean86 = fila80.vazia();
        boolean boolean87 = fila80.vazia();
        fila52.enfileira((java.lang.Object) boolean87);
        java.lang.Class<?> wildcardClass89 = fila52.getClass();
        fila42.enfileira((java.lang.Object) wildcardClass89);
        fila7.enfileira((java.lang.Object) fila42);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 'a' + "'", obj40, 'a');
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + false + "'", obj55, false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + false + "'", obj62, false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + false + "'", obj83, false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        java.lang.Object obj21 = fila0.desenfileira();
        boolean boolean22 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + true + "'", obj21, true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        boolean boolean17 = fila0.vazia();
        java.lang.Object obj18 = fila0.desenfileira();
        boolean boolean19 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 10 + "'", obj18, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) (short) 10);
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.imprime();
        fila26.imprime();
        fila19.enfileira((java.lang.Object) fila26);
        boolean boolean33 = fila26.vazia();
        fila26.enfileira((java.lang.Object) 'a');
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        fila36.enfileira((java.lang.Object) wildcardClass38);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) false);
        java.lang.Object obj43 = fila40.desenfileira();
        fila40.enfileira((java.lang.Object) (short) 10);
        boolean boolean46 = fila40.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) false);
        java.lang.Object obj50 = fila47.desenfileira();
        fila47.imprime();
        fila47.imprime();
        fila40.enfileira((java.lang.Object) fila47);
        boolean boolean54 = fila47.vazia();
        fila36.enfileira((java.lang.Object) boolean54);
        fila26.enfileira((java.lang.Object) fila36);
        boolean boolean57 = fila26.vazia();
        boolean boolean58 = fila26.vazia();
        fila7.enfileira((java.lang.Object) boolean58);
        java.lang.Class<?> wildcardClass60 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + false + "'", obj43, false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + false + "'", obj50, false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj21 = fila0.desenfileira();
        java.lang.Object obj22 = fila0.desenfileira();
        java.lang.Object obj23 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 10 + "'", obj21, (short) 10);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        fila7.enfileira((java.lang.Object) (byte) 1);
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 0L);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        fila17.enfileira((java.lang.Object) (short) 10);
        fila17.imprime();
        fila17.enfileira((java.lang.Object) (byte) 1);
        boolean boolean31 = fila17.vazia();
        java.lang.Object obj32 = fila17.desenfileira();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) false);
        java.lang.Object obj36 = fila33.desenfileira();
        fila33.enfileira((java.lang.Object) (short) 10);
        boolean boolean39 = fila33.vazia();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) false);
        java.lang.Object obj43 = fila40.desenfileira();
        fila40.imprime();
        fila40.imprime();
        fila33.enfileira((java.lang.Object) fila40);
        boolean boolean47 = fila40.vazia();
        fila40.enfileira((java.lang.Object) 'a');
        ds.Fila fila50 = new ds.Fila();
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        fila50.enfileira((java.lang.Object) wildcardClass52);
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) false);
        java.lang.Object obj57 = fila54.desenfileira();
        fila54.enfileira((java.lang.Object) (short) 10);
        boolean boolean60 = fila54.vazia();
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) false);
        java.lang.Object obj64 = fila61.desenfileira();
        fila61.imprime();
        fila61.imprime();
        fila54.enfileira((java.lang.Object) fila61);
        boolean boolean68 = fila61.vazia();
        fila50.enfileira((java.lang.Object) boolean68);
        fila40.enfileira((java.lang.Object) fila50);
        fila17.enfileira((java.lang.Object) fila40);
        fila17.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) 10 + "'", obj32, (short) 10);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + false + "'", obj36, false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + false + "'", obj43, false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + false + "'", obj57, false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + false + "'", obj64, false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        fila4.imprime();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        boolean boolean21 = fila19.vazia();
        fila19.enfileira((java.lang.Object) false);
        fila4.enfileira((java.lang.Object) false);
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        boolean boolean27 = fila25.vazia();
        fila25.enfileira((java.lang.Object) false);
        fila4.enfileira((java.lang.Object) false);
        fila4.imprime();
        fila4.imprime();
        java.lang.Object obj33 = fila4.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        fila34.enfileira((java.lang.Object) wildcardClass36);
        boolean boolean38 = fila34.vazia();
        boolean boolean39 = fila34.vazia();
        java.lang.Object obj40 = fila34.desenfileira();
        fila4.enfileira(obj40);
        java.lang.Object obj42 = fila4.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        fila43.enfileira((java.lang.Object) wildcardClass45);
        fila43.imprime();
        fila43.imprime();
        java.lang.Object obj49 = fila43.desenfileira();
        ds.Fila fila50 = new ds.Fila();
        boolean boolean51 = fila50.vazia();
        boolean boolean52 = fila50.vazia();
        fila50.enfileira((java.lang.Object) false);
        java.lang.Object obj55 = fila50.desenfileira();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        fila43.enfileira(obj55);
        java.lang.Class<?> wildcardClass58 = obj55.getClass();
        fila4.enfileira((java.lang.Object) wildcardClass58);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila61 = new ds.Fila();
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        fila61.enfileira((java.lang.Object) wildcardClass63);
        ds.Fila fila65 = new ds.Fila();
        fila65.enfileira((java.lang.Object) false);
        java.lang.Object obj68 = fila65.desenfileira();
        fila65.enfileira((java.lang.Object) (short) 10);
        boolean boolean71 = fila65.vazia();
        ds.Fila fila72 = new ds.Fila();
        fila72.enfileira((java.lang.Object) false);
        java.lang.Object obj75 = fila72.desenfileira();
        fila72.imprime();
        fila72.imprime();
        fila65.enfileira((java.lang.Object) fila72);
        boolean boolean79 = fila72.vazia();
        fila61.enfileira((java.lang.Object) boolean79);
        ds.Fila fila81 = new ds.Fila();
        fila81.enfileira((java.lang.Object) false);
        fila61.enfileira((java.lang.Object) fila81);
        java.lang.Object obj85 = fila81.desenfileira();
        boolean boolean86 = fila81.vazia();
        fila0.enfileira((java.lang.Object) fila81);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 10 + "'", obj33, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + false + "'", obj55, false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + false + "'", obj68, false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + false + "'", obj75, false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + false + "'", obj85, false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        fila7.imprime();
        java.lang.Object obj21 = fila7.desenfileira();
        java.lang.Object obj22 = fila7.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) false);
        java.lang.Object obj26 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) (short) 10);
        boolean boolean29 = fila23.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) false);
        java.lang.Object obj33 = fila30.desenfileira();
        fila30.imprime();
        fila30.imprime();
        fila23.enfileira((java.lang.Object) fila30);
        fila23.imprime();
        ds.Fila fila38 = new ds.Fila();
        boolean boolean39 = fila38.vazia();
        boolean boolean40 = fila38.vazia();
        fila38.enfileira((java.lang.Object) false);
        fila23.enfileira((java.lang.Object) false);
        ds.Fila fila44 = new ds.Fila();
        boolean boolean45 = fila44.vazia();
        boolean boolean46 = fila44.vazia();
        fila44.enfileira((java.lang.Object) false);
        fila23.enfileira((java.lang.Object) false);
        fila23.imprime();
        fila23.imprime();
        fila23.enfileira((java.lang.Object) 0);
        fila23.enfileira((java.lang.Object) 10.0d);
        fila7.enfileira((java.lang.Object) fila23);
        java.lang.Class<?> wildcardClass57 = fila23.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 'a' + "'", obj21, 'a');
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 100 + "'", obj22, (byte) 100);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        fila7.imprime();
        boolean boolean21 = fila7.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) false);
        java.lang.Object obj25 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (short) 10);
        boolean boolean28 = fila22.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) false);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.imprime();
        fila29.imprime();
        fila22.enfileira((java.lang.Object) fila29);
        boolean boolean36 = fila29.vazia();
        fila29.enfileira((java.lang.Object) 'a');
        fila29.enfileira((java.lang.Object) (byte) 100);
        fila29.imprime();
        fila29.imprime();
        java.lang.Object obj43 = fila29.desenfileira();
        java.lang.Object obj44 = fila29.desenfileira();
        fila7.enfileira(obj44);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 'a' + "'", obj43, 'a');
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) 100 + "'", obj44, (byte) 100);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        fila7.imprime();
        java.lang.Class<?> wildcardClass21 = fila7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        java.lang.Object obj17 = fila7.desenfileira();
        boolean boolean18 = fila7.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) (short) 10);
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.imprime();
        fila26.imprime();
        fila19.enfileira((java.lang.Object) fila26);
        boolean boolean33 = fila26.vazia();
        fila26.enfileira((java.lang.Object) 'a');
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        fila36.enfileira((java.lang.Object) wildcardClass38);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) false);
        java.lang.Object obj43 = fila40.desenfileira();
        fila40.enfileira((java.lang.Object) (short) 10);
        boolean boolean46 = fila40.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) false);
        java.lang.Object obj50 = fila47.desenfileira();
        fila47.imprime();
        fila47.imprime();
        fila40.enfileira((java.lang.Object) fila47);
        boolean boolean54 = fila47.vazia();
        fila36.enfileira((java.lang.Object) boolean54);
        fila26.enfileira((java.lang.Object) fila36);
        boolean boolean57 = fila36.vazia();
        boolean boolean58 = fila36.vazia();
        fila7.enfileira((java.lang.Object) fila36);
        ds.Fila fila60 = new ds.Fila();
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        fila60.enfileira((java.lang.Object) wildcardClass62);
        fila36.enfileira((java.lang.Object) wildcardClass62);
        boolean boolean65 = fila36.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + false + "'", obj43, false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + false + "'", obj50, false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
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
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) false);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 10);
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        fila10.enfileira((java.lang.Object) fila17);
        fila10.imprime();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        fila0.imprime();
        boolean boolean28 = fila0.vazia();
        java.lang.Class<?> wildcardClass29 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 10 + "'", obj7, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) (short) 10);
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        boolean boolean23 = fila17.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) false);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.imprime();
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        boolean boolean31 = fila24.vazia();
        fila24.enfileira((java.lang.Object) 'a');
        fila24.enfileira((java.lang.Object) (byte) 100);
        java.lang.Object obj36 = fila24.desenfileira();
        fila7.enfileira(obj36);
        fila7.imprime();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        boolean boolean17 = fila0.vazia();
        boolean boolean18 = fila0.vazia();
        boolean boolean19 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        fila3.enfileira((java.lang.Object) wildcardClass5);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) (short) 10);
        boolean boolean13 = fila7.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) false);
        java.lang.Object obj17 = fila14.desenfileira();
        fila14.imprime();
        fila14.imprime();
        fila7.enfileira((java.lang.Object) fila14);
        boolean boolean21 = fila14.vazia();
        fila3.enfileira((java.lang.Object) boolean21);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) false);
        fila3.enfileira((java.lang.Object) fila23);
        java.lang.Object obj27 = fila23.desenfileira();
        fila0.enfileira(obj27);
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) false);
        java.lang.Object obj5 = fila2.desenfileira();
        fila2.enfileira((java.lang.Object) (short) 10);
        boolean boolean8 = fila2.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) false);
        java.lang.Object obj12 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        fila2.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass20);
        boolean boolean22 = fila18.vazia();
        fila9.enfileira((java.lang.Object) fila18);
        java.lang.Object obj24 = fila18.desenfileira();
        fila0.enfileira(obj24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class java.lang.Object");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = null;
        fila0.enfileira(obj7);
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) false);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 10);
        fila10.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila10.enfileira((java.lang.Object) fila17);
        fila10.imprime();
        boolean boolean21 = fila10.vazia();
        fila0.enfileira((java.lang.Object) fila10);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 10 + "'", obj9, (short) 10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj21 = fila0.desenfileira();
        java.lang.Object obj22 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 10 + "'", obj21, (short) 10);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) false);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) (short) 10);
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) false);
        java.lang.Object obj15 = fila12.desenfileira();
        fila12.imprime();
        fila12.imprime();
        fila5.enfileira((java.lang.Object) fila12);
        fila5.imprime();
        boolean boolean20 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean23 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila28.vazia();
        fila28.imprime();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) false);
        java.lang.Object obj40 = fila37.desenfileira();
        fila37.imprime();
        java.lang.Class<?> wildcardClass42 = fila37.getClass();
        fila28.enfileira((java.lang.Object) wildcardClass42);
        fila0.enfileira((java.lang.Object) wildcardClass42);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + false + "'", obj40, false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj32 = fila26.desenfileira();
        fila26.imprime();
        java.lang.Class<?> wildcardClass34 = fila26.getClass();
        fila17.enfileira((java.lang.Object) fila26);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) 10 + "'", obj32, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        fila32.enfileira(obj39);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj48 = fila42.desenfileira();
        fila42.imprime();
        fila32.enfileira((java.lang.Object) fila42);
        fila32.imprime();
        java.lang.Object obj52 = fila32.desenfileira();
        fila20.enfileira((java.lang.Object) fila32);
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) false);
        java.lang.Object obj57 = fila54.desenfileira();
        fila54.enfileira((java.lang.Object) (short) 10);
        boolean boolean60 = fila54.vazia();
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) false);
        java.lang.Object obj64 = fila61.desenfileira();
        fila61.imprime();
        fila61.imprime();
        fila54.enfileira((java.lang.Object) fila61);
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Class<?> wildcardClass69 = obj68.getClass();
        fila61.enfileira(obj68);
        java.lang.Object obj71 = fila61.desenfileira();
        boolean boolean72 = fila61.vazia();
        fila32.enfileira((java.lang.Object) fila61);
        java.lang.Class<?> wildcardClass74 = fila32.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + false + "'", obj57, false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + false + "'", obj64, false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class java.lang.Object");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass19);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) false);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        fila21.enfileira((java.lang.Object) fila28);
        boolean boolean35 = fila28.vazia();
        fila17.enfileira((java.lang.Object) boolean35);
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean38 = fila7.vazia();
        boolean boolean39 = fila7.vazia();
        java.lang.Object obj40 = fila7.desenfileira();
        java.lang.Object obj41 = fila7.desenfileira();
        boolean boolean42 = fila7.vazia();
        boolean boolean43 = fila7.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 'a' + "'", obj40, 'a');
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        boolean boolean7 = fila5.vazia();
        fila5.enfileira((java.lang.Object) false);
        boolean boolean10 = fila5.vazia();
        fila0.enfileira((java.lang.Object) boolean10);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) false);
        java.lang.Object obj15 = fila12.desenfileira();
        fila12.enfileira((java.lang.Object) (short) 10);
        boolean boolean18 = fila12.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.imprime();
        fila19.imprime();
        fila12.enfileira((java.lang.Object) fila19);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila19.enfileira(obj26);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) false);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj35 = fila29.desenfileira();
        fila29.imprime();
        fila19.enfileira((java.lang.Object) fila29);
        fila0.enfileira((java.lang.Object) fila29);
        fila0.imprime();
        boolean boolean40 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (short) 10 + "'", obj35, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        fila32.enfileira(obj39);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj48 = fila42.desenfileira();
        fila42.imprime();
        fila32.enfileira((java.lang.Object) fila42);
        fila32.imprime();
        java.lang.Object obj52 = fila32.desenfileira();
        fila20.enfileira((java.lang.Object) fila32);
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) false);
        java.lang.Object obj57 = fila54.desenfileira();
        fila54.enfileira((java.lang.Object) (short) 10);
        boolean boolean60 = fila54.vazia();
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) false);
        java.lang.Object obj64 = fila61.desenfileira();
        fila61.imprime();
        fila61.imprime();
        fila54.enfileira((java.lang.Object) fila61);
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Class<?> wildcardClass69 = obj68.getClass();
        fila61.enfileira(obj68);
        java.lang.Object obj71 = fila61.desenfileira();
        boolean boolean72 = fila61.vazia();
        fila32.enfileira((java.lang.Object) fila61);
        fila61.imprime();
        java.lang.Class<?> wildcardClass75 = fila61.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + false + "'", obj57, false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + false + "'", obj64, false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        boolean boolean23 = fila21.vazia();
        fila21.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass31 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) false);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.imprime();
        java.lang.Class<?> wildcardClass21 = fila16.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila7.desenfileira();
        fila7.imprime();
        boolean boolean25 = fila7.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = fila7.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class ds.Fila");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj23 = fila17.desenfileira();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean26 = fila7.vazia();
        boolean boolean27 = fila7.vazia();
        boolean boolean28 = fila7.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) false);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) (short) 10);
        fila29.imprime();
        ds.Fila fila36 = new ds.Fila();
        fila36.imprime();
        fila29.enfileira((java.lang.Object) fila36);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) false);
        java.lang.Object obj42 = fila39.desenfileira();
        fila39.enfileira((java.lang.Object) (short) 10);
        boolean boolean45 = fila39.vazia();
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) false);
        java.lang.Object obj49 = fila46.desenfileira();
        fila46.imprime();
        fila46.imprime();
        fila39.enfileira((java.lang.Object) fila46);
        fila39.imprime();
        fila39.imprime();
        fila29.enfileira((java.lang.Object) fila39);
        boolean boolean56 = fila39.vazia();
        fila7.enfileira((java.lang.Object) boolean56);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + false + "'", obj42, false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + false + "'", obj49, false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) (short) 10);
        fila19.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        fila19.enfileira((java.lang.Object) fila26);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) false);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) (short) 10);
        boolean boolean35 = fila29.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) false);
        java.lang.Object obj39 = fila36.desenfileira();
        fila36.imprime();
        fila36.imprime();
        fila29.enfileira((java.lang.Object) fila36);
        fila29.imprime();
        fila29.imprime();
        fila19.enfileira((java.lang.Object) fila29);
        java.lang.Class<?> wildcardClass46 = fila29.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass46);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + false + "'", obj39, false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        fila7.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) (short) 10);
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.imprime();
        fila26.imprime();
        fila19.enfileira((java.lang.Object) fila26);
        fila19.imprime();
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        boolean boolean36 = fila34.vazia();
        fila34.enfileira((java.lang.Object) false);
        fila19.enfileira((java.lang.Object) false);
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        boolean boolean42 = fila40.vazia();
        fila40.enfileira((java.lang.Object) false);
        fila19.enfileira((java.lang.Object) false);
        fila19.imprime();
        fila19.imprime();
        fila7.enfileira((java.lang.Object) fila19);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) false);
        java.lang.Object obj52 = fila49.desenfileira();
        fila49.enfileira((java.lang.Object) (short) 10);
        boolean boolean55 = fila49.vazia();
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) false);
        java.lang.Object obj59 = fila56.desenfileira();
        fila56.imprime();
        fila56.imprime();
        fila49.enfileira((java.lang.Object) fila56);
        boolean boolean63 = fila56.vazia();
        fila56.enfileira((java.lang.Object) 'a');
        ds.Fila fila66 = new ds.Fila();
        java.lang.Object obj67 = new java.lang.Object();
        java.lang.Class<?> wildcardClass68 = obj67.getClass();
        fila66.enfileira((java.lang.Object) wildcardClass68);
        ds.Fila fila70 = new ds.Fila();
        fila70.enfileira((java.lang.Object) false);
        java.lang.Object obj73 = fila70.desenfileira();
        fila70.enfileira((java.lang.Object) (short) 10);
        boolean boolean76 = fila70.vazia();
        ds.Fila fila77 = new ds.Fila();
        fila77.enfileira((java.lang.Object) false);
        java.lang.Object obj80 = fila77.desenfileira();
        fila77.imprime();
        fila77.imprime();
        fila70.enfileira((java.lang.Object) fila77);
        boolean boolean84 = fila77.vazia();
        fila66.enfileira((java.lang.Object) boolean84);
        fila56.enfileira((java.lang.Object) fila66);
        boolean boolean87 = fila56.vazia();
        fila7.enfileira((java.lang.Object) fila56);
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + false + "'", obj52, false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + false + "'", obj59, false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + false + "'", obj73, false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + false + "'", obj80, false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        boolean boolean20 = fila7.vazia();
        fila7.imprime();
        java.lang.Object obj22 = fila7.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 'a' + "'", obj22, 'a');
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        fila7.enfileira(obj14);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        boolean boolean23 = fila17.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) false);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.imprime();
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        fila24.enfileira(obj31);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) false);
        java.lang.Object obj37 = fila34.desenfileira();
        fila34.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj40 = fila34.desenfileira();
        fila34.imprime();
        fila24.enfileira((java.lang.Object) fila34);
        fila7.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) false);
        java.lang.Object obj48 = fila45.desenfileira();
        fila45.enfileira((java.lang.Object) 0L);
        fila24.enfileira((java.lang.Object) 0L);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + false + "'", obj37, false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) 10 + "'", obj40, (short) 10);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + false + "'", obj48, false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        boolean boolean23 = fila17.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) false);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.imprime();
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        java.lang.Object obj31 = fila17.desenfileira();
        fila0.enfileira(obj31);
        boolean boolean33 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 10 + "'", obj31, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        boolean boolean15 = fila7.vazia();
        boolean boolean16 = fila7.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = fila7.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        boolean boolean20 = fila7.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) false);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj27 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 0L);
        fila7.enfileira((java.lang.Object) 0L);
        java.lang.Object obj31 = fila7.desenfileira();
        fila7.imprime();
        java.lang.Object obj33 = fila7.desenfileira();
        boolean boolean34 = fila7.vazia();
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 10 + "'", obj27, (short) 10);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 100 + "'", obj33, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        java.lang.Object obj21 = fila0.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass24);
        boolean boolean26 = fila22.vazia();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) false);
        java.lang.Object obj30 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) (short) 10);
        boolean boolean33 = fila27.vazia();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) false);
        java.lang.Object obj37 = fila34.desenfileira();
        fila34.imprime();
        fila34.imprime();
        fila27.enfileira((java.lang.Object) fila34);
        fila27.imprime();
        boolean boolean42 = fila27.vazia();
        fila27.imprime();
        fila22.enfileira((java.lang.Object) fila27);
        fila27.imprime();
        fila27.imprime();
        boolean boolean47 = fila27.vazia();
        fila0.enfileira((java.lang.Object) boolean47);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + true + "'", obj21, true);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + false + "'", obj30, false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + false + "'", obj37, false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        boolean boolean7 = fila5.vazia();
        fila5.enfileira((java.lang.Object) false);
        boolean boolean10 = fila5.vazia();
        fila0.enfileira((java.lang.Object) boolean10);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) false);
        java.lang.Object obj15 = fila12.desenfileira();
        fila12.enfileira((java.lang.Object) (short) 10);
        boolean boolean18 = fila12.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.imprime();
        fila19.imprime();
        fila12.enfileira((java.lang.Object) fila19);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila19.enfileira(obj26);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) false);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj35 = fila29.desenfileira();
        fila29.imprime();
        fila19.enfileira((java.lang.Object) fila29);
        fila0.enfileira((java.lang.Object) fila29);
        java.lang.Object obj39 = fila0.desenfileira();
        boolean boolean40 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (short) 10 + "'", obj35, (short) 10);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) false);
        java.lang.Object obj11 = fila8.desenfileira();
        fila8.imprime();
        java.lang.Class<?> wildcardClass13 = fila8.getClass();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj15 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) false);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 10);
        boolean boolean16 = fila10.vazia();
        java.lang.Object obj17 = null;
        fila10.enfileira(obj17);
        boolean boolean19 = fila10.vazia();
        java.lang.Object obj20 = fila10.desenfileira();
        java.lang.Object obj21 = fila10.desenfileira();
        fila0.enfileira(obj21);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 10 + "'", obj20, (short) 10);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) (short) 10);
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        boolean boolean23 = fila17.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) false);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.imprime();
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        boolean boolean31 = fila24.vazia();
        fila24.enfileira((java.lang.Object) 'a');
        fila24.enfileira((java.lang.Object) (byte) 100);
        java.lang.Object obj36 = fila24.desenfileira();
        fila7.enfileira(obj36);
        boolean boolean38 = fila7.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        boolean boolean23 = fila21.vazia();
        fila21.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) false);
        java.lang.Object obj30 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj33 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) 0L);
        fila27.imprime();
        fila0.enfileira((java.lang.Object) fila27);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) false);
        java.lang.Object obj41 = fila38.desenfileira();
        fila38.enfileira((java.lang.Object) (short) 10);
        boolean boolean44 = fila38.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) false);
        java.lang.Object obj48 = fila45.desenfileira();
        fila45.imprime();
        fila45.imprime();
        fila38.enfileira((java.lang.Object) fila45);
        boolean boolean52 = fila45.vazia();
        fila45.enfileira((java.lang.Object) 'a');
        fila45.enfileira((java.lang.Object) (byte) 100);
        fila45.imprime();
        boolean boolean58 = fila45.vazia();
        boolean boolean59 = fila45.vazia();
        java.lang.Object obj60 = fila45.desenfileira();
        fila45.imprime();
        fila27.enfileira((java.lang.Object) fila45);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + false + "'", obj30, false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 10 + "'", obj33, (short) 10);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + false + "'", obj41, false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + false + "'", obj48, false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 'a' + "'", obj60, 'a');
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) false);
        java.lang.Object obj12 = fila9.desenfileira();
        fila9.enfileira((java.lang.Object) (short) 10);
        boolean boolean15 = fila9.vazia();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) false);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.imprime();
        fila16.imprime();
        fila9.enfileira((java.lang.Object) fila16);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        fila16.enfileira(obj23);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj32 = fila26.desenfileira();
        fila26.imprime();
        fila16.enfileira((java.lang.Object) fila26);
        fila16.imprime();
        java.lang.Object obj36 = fila16.desenfileira();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj38 = fila16.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) 10 + "'", obj32, (short) 10);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) false);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) (short) 10);
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) false);
        java.lang.Object obj15 = fila12.desenfileira();
        fila12.imprime();
        fila12.imprime();
        fila5.enfileira((java.lang.Object) fila12);
        boolean boolean19 = fila12.vazia();
        fila12.enfileira((java.lang.Object) 'a');
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass24);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.enfileira((java.lang.Object) (short) 10);
        boolean boolean32 = fila26.vazia();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) false);
        java.lang.Object obj36 = fila33.desenfileira();
        fila33.imprime();
        fila33.imprime();
        fila26.enfileira((java.lang.Object) fila33);
        boolean boolean40 = fila33.vazia();
        fila22.enfileira((java.lang.Object) boolean40);
        fila12.enfileira((java.lang.Object) fila22);
        fila12.imprime();
        java.lang.Object obj44 = fila12.desenfileira();
        boolean boolean45 = fila12.vazia();
        fila0.enfileira((java.lang.Object) boolean45);
        boolean boolean47 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + false + "'", obj36, false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 'a' + "'", obj44, 'a');
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        java.lang.Object obj21 = fila0.desenfileira();
        boolean boolean22 = fila0.vazia();
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        fila23.enfileira((java.lang.Object) wildcardClass25);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) false);
        java.lang.Object obj30 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) (short) 10);
        boolean boolean33 = fila27.vazia();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) false);
        java.lang.Object obj37 = fila34.desenfileira();
        fila34.imprime();
        fila34.imprime();
        fila27.enfileira((java.lang.Object) fila34);
        boolean boolean41 = fila34.vazia();
        fila23.enfileira((java.lang.Object) boolean41);
        java.lang.Object obj43 = fila23.desenfileira();
        fila23.imprime();
        ds.Fila fila45 = new ds.Fila();
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        fila45.enfileira((java.lang.Object) wildcardClass47);
        boolean boolean49 = fila45.vazia();
        boolean boolean50 = fila45.vazia();
        java.lang.Object obj51 = fila45.desenfileira();
        fila23.enfileira(obj51);
        fila0.enfileira((java.lang.Object) fila23);
        fila23.imprime();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + true + "'", obj21, true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + false + "'", obj30, false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + false + "'", obj37, false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "class java.lang.Object");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) false);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 10);
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        fila10.enfileira((java.lang.Object) fila17);
        fila10.imprime();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        fila10.imprime();
        boolean boolean28 = fila10.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Class<?> wildcardClass2 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        fila32.enfileira(obj39);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj48 = fila42.desenfileira();
        fila42.imprime();
        fila32.enfileira((java.lang.Object) fila42);
        fila32.imprime();
        java.lang.Object obj52 = fila32.desenfileira();
        fila20.enfileira((java.lang.Object) fila32);
        fila32.imprime();
        boolean boolean55 = fila32.vazia();
        fila32.imprime();
        java.lang.Object obj57 = fila32.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(obj57);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        boolean boolean25 = fila20.vazia();
        fila20.imprime();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) false);
        java.lang.Object obj30 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) (short) 10);
        boolean boolean33 = fila27.vazia();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) false);
        java.lang.Object obj37 = fila34.desenfileira();
        fila34.imprime();
        fila34.imprime();
        fila27.enfileira((java.lang.Object) fila34);
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        fila34.enfileira(obj41);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) false);
        java.lang.Object obj47 = fila44.desenfileira();
        fila44.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj50 = fila44.desenfileira();
        fila44.imprime();
        fila34.enfileira((java.lang.Object) fila44);
        ds.Fila fila53 = new ds.Fila();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        fila53.enfileira((java.lang.Object) wildcardClass55);
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) false);
        java.lang.Object obj60 = fila57.desenfileira();
        fila57.enfileira((java.lang.Object) (short) 10);
        boolean boolean63 = fila57.vazia();
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) false);
        java.lang.Object obj67 = fila64.desenfileira();
        fila64.imprime();
        fila64.imprime();
        fila57.enfileira((java.lang.Object) fila64);
        boolean boolean71 = fila64.vazia();
        fila53.enfileira((java.lang.Object) boolean71);
        ds.Fila fila73 = new ds.Fila();
        fila73.enfileira((java.lang.Object) false);
        fila53.enfileira((java.lang.Object) fila73);
        java.lang.Object obj77 = fila73.desenfileira();
        fila34.enfileira((java.lang.Object) fila73);
        fila20.enfileira((java.lang.Object) fila73);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + false + "'", obj30, false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + false + "'", obj37, false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + false + "'", obj47, false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (short) 10 + "'", obj50, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + false + "'", obj60, false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + false + "'", obj67, false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + false + "'", obj77, false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        java.lang.Object obj20 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass24);
        boolean boolean26 = fila22.vazia();
        boolean boolean27 = fila22.vazia();
        java.lang.Object obj28 = fila22.desenfileira();
        fila0.enfileira(obj28);
        java.lang.Class<?> wildcardClass30 = obj28.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        fila7.imprime();
        boolean boolean20 = fila7.vazia();
        boolean boolean21 = fila7.vazia();
        java.lang.Object obj22 = fila7.desenfileira();
        boolean boolean23 = fila7.vazia();
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 'a' + "'", obj22, 'a');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        fila0.imprime();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass9);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) (short) 10);
        boolean boolean17 = fila11.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) false);
        java.lang.Object obj21 = fila18.desenfileira();
        fila18.imprime();
        fila18.imprime();
        fila11.enfileira((java.lang.Object) fila18);
        boolean boolean25 = fila18.vazia();
        fila7.enfileira((java.lang.Object) boolean25);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) false);
        fila7.enfileira((java.lang.Object) fila27);
        boolean boolean31 = fila7.vazia();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj34 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "class java.lang.Object");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj14 = fila0.desenfileira();
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) (short) 10);
        boolean boolean23 = fila17.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) false);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.imprime();
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        fila24.enfileira(obj31);
        java.lang.Object obj34 = fila24.desenfileira();
        boolean boolean35 = fila24.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) false);
        java.lang.Object obj39 = fila36.desenfileira();
        fila36.enfileira((java.lang.Object) (short) 10);
        boolean boolean42 = fila36.vazia();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) false);
        java.lang.Object obj46 = fila43.desenfileira();
        fila43.imprime();
        fila43.imprime();
        fila36.enfileira((java.lang.Object) fila43);
        boolean boolean50 = fila43.vazia();
        fila43.enfileira((java.lang.Object) 'a');
        ds.Fila fila53 = new ds.Fila();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        fila53.enfileira((java.lang.Object) wildcardClass55);
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) false);
        java.lang.Object obj60 = fila57.desenfileira();
        fila57.enfileira((java.lang.Object) (short) 10);
        boolean boolean63 = fila57.vazia();
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) false);
        java.lang.Object obj67 = fila64.desenfileira();
        fila64.imprime();
        fila64.imprime();
        fila57.enfileira((java.lang.Object) fila64);
        boolean boolean71 = fila64.vazia();
        fila53.enfileira((java.lang.Object) boolean71);
        fila43.enfileira((java.lang.Object) fila53);
        boolean boolean74 = fila53.vazia();
        boolean boolean75 = fila53.vazia();
        fila24.enfileira((java.lang.Object) fila53);
        fila0.enfileira((java.lang.Object) fila53);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 10 + "'", obj14, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + false + "'", obj39, false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + false + "'", obj46, false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + false + "'", obj60, false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + false + "'", obj67, false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) false);
        java.lang.Object obj7 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) (short) 10);
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) false);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) false);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (short) 10);
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) false);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.imprime();
        fila32.imprime();
        fila25.enfileira((java.lang.Object) fila32);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        fila32.enfileira(obj39);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) false);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj48 = fila42.desenfileira();
        fila42.imprime();
        fila32.enfileira((java.lang.Object) fila42);
        fila32.imprime();
        java.lang.Object obj52 = fila32.desenfileira();
        fila20.enfileira((java.lang.Object) fila32);
        java.lang.Object obj54 = fila32.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + false + "'", obj45, false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) false);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) (short) 10);
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) false);
        java.lang.Object obj15 = fila12.desenfileira();
        fila12.imprime();
        fila12.imprime();
        fila5.enfileira((java.lang.Object) fila12);
        fila5.imprime();
        boolean boolean20 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        fila5.imprime();
        boolean boolean25 = fila5.vazia();
        boolean boolean26 = fila5.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.enfileira((java.lang.Object) (-1.0f));
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        fila10.enfileira((java.lang.Object) wildcardClass12);
        fila10.imprime();
        fila10.imprime();
        boolean boolean16 = fila10.vazia();
        fila0.enfileira((java.lang.Object) fila10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        boolean boolean7 = fila5.vazia();
        fila5.enfileira((java.lang.Object) false);
        boolean boolean10 = fila5.vazia();
        fila0.enfileira((java.lang.Object) boolean10);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) false);
        java.lang.Object obj15 = fila12.desenfileira();
        fila12.enfileira((java.lang.Object) (short) 10);
        boolean boolean18 = fila12.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.imprime();
        fila19.imprime();
        fila12.enfileira((java.lang.Object) fila19);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila19.enfileira(obj26);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) false);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj35 = fila29.desenfileira();
        fila29.imprime();
        fila19.enfileira((java.lang.Object) fila29);
        fila0.enfileira((java.lang.Object) fila29);
        fila29.imprime();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (short) 10 + "'", obj35, (short) 10);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) false);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) (short) 10);
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) false);
        java.lang.Object obj15 = fila12.desenfileira();
        fila12.imprime();
        fila12.imprime();
        fila5.enfileira((java.lang.Object) fila12);
        fila5.imprime();
        boolean boolean20 = fila5.vazia();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        fila5.imprime();
        java.lang.Object obj24 = fila5.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 10 + "'", obj24, (short) 10);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass2);
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) "hi!");
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) false);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 10);
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        fila10.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        fila17.enfileira(obj24);
        fila17.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) false);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) (short) 10);
        boolean boolean35 = fila29.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) false);
        java.lang.Object obj39 = fila36.desenfileira();
        fila36.imprime();
        fila36.imprime();
        fila29.enfileira((java.lang.Object) fila36);
        fila29.imprime();
        ds.Fila fila44 = new ds.Fila();
        boolean boolean45 = fila44.vazia();
        boolean boolean46 = fila44.vazia();
        fila44.enfileira((java.lang.Object) false);
        fila29.enfileira((java.lang.Object) false);
        ds.Fila fila50 = new ds.Fila();
        boolean boolean51 = fila50.vazia();
        boolean boolean52 = fila50.vazia();
        fila50.enfileira((java.lang.Object) false);
        fila29.enfileira((java.lang.Object) false);
        fila29.imprime();
        fila29.imprime();
        fila17.enfileira((java.lang.Object) fila29);
        fila0.enfileira((java.lang.Object) fila17);
        boolean boolean60 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + false + "'", obj39, false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) (short) 10);
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj17 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 10 + "'", obj13, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 10 + "'", obj17, (short) 10);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 'a');
        fila7.enfileira((java.lang.Object) (byte) 100);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) false);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) (short) 10);
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.imprime();
        fila26.imprime();
        fila19.enfileira((java.lang.Object) fila26);
        fila19.imprime();
        boolean boolean34 = fila19.vazia();
        fila7.enfileira((java.lang.Object) fila19);
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.enfileira((java.lang.Object) false);
        java.lang.Object obj5 = fila2.desenfileira();
        fila2.enfileira((java.lang.Object) (short) 10);
        boolean boolean8 = fila2.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) false);
        java.lang.Object obj12 = fila9.desenfileira();
        fila9.imprime();
        fila9.imprime();
        fila2.enfileira((java.lang.Object) fila9);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        fila9.enfileira(obj16);
        java.lang.Object obj19 = fila9.desenfileira();
        boolean boolean20 = fila9.vazia();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        fila24.enfileira((java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = fila24.desenfileira();
        boolean boolean29 = fila24.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) false);
        java.lang.Object obj33 = fila30.desenfileira();
        fila30.enfileira((java.lang.Object) (short) 10);
        boolean boolean36 = fila30.vazia();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) false);
        java.lang.Object obj40 = fila37.desenfileira();
        fila37.imprime();
        fila37.imprime();
        fila30.enfileira((java.lang.Object) fila37);
        boolean boolean44 = fila37.vazia();
        fila37.enfileira((java.lang.Object) 'a');
        ds.Fila fila47 = new ds.Fila();
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        fila47.enfileira((java.lang.Object) wildcardClass49);
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) false);
        java.lang.Object obj54 = fila51.desenfileira();
        fila51.enfileira((java.lang.Object) (short) 10);
        boolean boolean57 = fila51.vazia();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) false);
        java.lang.Object obj61 = fila58.desenfileira();
        fila58.imprime();
        fila58.imprime();
        fila51.enfileira((java.lang.Object) fila58);
        boolean boolean65 = fila58.vazia();
        fila47.enfileira((java.lang.Object) boolean65);
        fila37.enfileira((java.lang.Object) fila47);
        boolean boolean68 = fila37.vazia();
        fila24.enfileira((java.lang.Object) boolean68);
        fila22.enfileira((java.lang.Object) boolean68);
        fila9.enfileira((java.lang.Object) boolean68);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + false + "'", obj40, false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + false + "'", obj54, false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + false + "'", obj61, false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 10);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) false);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.imprime();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        boolean boolean23 = fila21.vazia();
        fila21.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) false);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj29 = fila0.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        fila30.enfileira((java.lang.Object) wildcardClass32);
        boolean boolean34 = fila30.vazia();
        boolean boolean35 = fila30.vazia();
        java.lang.Object obj36 = fila30.desenfileira();
        fila0.enfileira(obj36);
        java.lang.Object obj38 = fila0.desenfileira();
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        fila39.enfileira((java.lang.Object) wildcardClass41);
        fila39.imprime();
        fila39.imprime();
        java.lang.Object obj45 = fila39.desenfileira();
        ds.Fila fila46 = new ds.Fila();
        boolean boolean47 = fila46.vazia();
        boolean boolean48 = fila46.vazia();
        fila46.enfileira((java.lang.Object) false);
        java.lang.Object obj51 = fila46.desenfileira();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        fila39.enfileira(obj51);
        java.lang.Class<?> wildcardClass54 = obj51.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass54);
        java.lang.Object obj56 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) 10 + "'", obj29, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + false + "'", obj51, false);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + false + "'", obj56, false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass8);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) false);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 10);
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) false);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        fila10.enfileira((java.lang.Object) fila17);
        boolean boolean24 = fila17.vazia();
        fila6.enfileira((java.lang.Object) boolean24);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) false);
        fila6.enfileira((java.lang.Object) fila26);
        java.lang.Object obj30 = fila6.desenfileira();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }
}

